package simuladorso.model;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

/**
 *
 * @author Amadeo
 */
public class Memoria {

    private Scanner teclado;
    private int tamMemoria;
    private boolean tipoParticion;//true=fijas, false=variables
    private int metodo_Intercambio;
    private List<Particion> listParticion;
    private List<Proceso> listProceso;
    private final int tamMaximo = 1000;
    private final int tamMinimo = 50;
    private final int tamanoSo;

    //---------CONTSTRUCTORES       
    public Memoria() {
        teclado = new Scanner(System.in);
        System.out.print("ingrese tamanio de la memoria: ");
        tamMemoria = teclado.nextInt();
        if (tamMemoria > this.tamMaximo) {
            this.tamMemoria = this.tamMaximo;
        }
        if (tamMemoria < this.tamMinimo) {
            this.tamMemoria = this.tamMinimo;
        }
        System.out.print("ingrese el tipo de particion: ");
        tipoParticion = teclado.nextBoolean();
        System.out.print("Ingrese el metodo de Intercambio: ");
        metodo_Intercambio = teclado.nextInt();
        this.tamanoSo = (int) (this.tamMemoria * 0.1);
        this.listParticion = new ArrayList<Particion>();
        this.listProceso = new ArrayList<Proceso>();
    }

    public Memoria(Integer tamMemoria) {

        if (tamMemoria > this.tamMaximo) {
            this.tamMemoria = this.tamMaximo;
        }

        if (tamMemoria < this.tamMinimo) {
            this.tamMemoria = this.tamMinimo;
        }

        this.tamMemoria = tamMemoria;

        this.tamanoSo = (int) (this.tamMemoria * 0.10);

        this.listParticion = new ArrayList<>();
        this.listProceso = new ArrayList<>();
    }
//***************************************************************

    public void cargarParticion(int tamaParticion) {
        int tamParticionn;
        if (tamaParticion > calcularMemoriaLibre() && calcularMemoriaLibre() != 0) {
            tamParticionn = calcularMemoriaLibre();
            Particion particion = new Particion(tamaParticion);
            this.listParticion.add(particion);
        } else {
            if (tamaParticion < calcularMemoriaLibre()) {
                tamParticionn = tamaParticion;
                Particion particion = new Particion(tamaParticion);
                this.listParticion.add(particion);
            }
        }
    }

    public void addParticion(Particion particion) {
        if (particion.getTamParticion() > calcularMemoriaLibre() && calcularMemoriaLibre() != 0) {
            particion.setTamParticion(calcularMemoriaLibre());
        }
        this.listParticion.add(particion);
    }

    public int calcularMemoriaLibre() {
        int cantidadMemoriaLibre = 0;
        int acumuladorTamParticiones = 0;
        if (this.listParticion.isEmpty()) {
            cantidadMemoriaLibre += this.tamMemoria - this.tamanoSo;
        } else {
            acumuladorTamParticiones = this.listParticion.stream().map((p) -> p.getTamParticion()).reduce(acumuladorTamParticiones, Integer::sum);
            cantidadMemoriaLibre += (this.tamMemoria - acumuladorTamParticiones - tamanoSo);
        }
        return cantidadMemoriaLibre;
    }

    public void imprimir() {
        System.out.println(this.tamMemoria);
        if (tipoParticion == true) {
            System.out.println("Particiones Fijas");
        } else {
            System.out.println("Particiones Variables");
        }
        if (metodo_Intercambio == 1) {
            System.out.println("Best-Fit");
        }
        if (metodo_Intercambio == 2) {
            System.out.println("First-Fit");
        }
        if (metodo_Intercambio == 3) {
            System.out.println("Worst-Fit");
        }
    }

    public List<Proceso> getListProceso() {
        return this.listProceso;
    }

    public void BestFit(ColaListo colaNuevo) {
        Collections.sort(listParticion);
        for (Iterator<Proceso> itr = colaNuevo.getListProceso().iterator(); itr.hasNext();) {
            Proceso proceso = itr.next();
            for (Particion particion : listParticion) {
                if (particion.getEstado() == false && particion.getTamParticion() >= proceso.getTamProceso()) {
                    particion.addProceso(proceso);
                    particion.setEstado(true);
                    itr.remove();
                    break;
                }
            }
        }
    }

    public void FirstFit(ColaListo colaNuevo) {
        for (Iterator<Proceso> itr = colaNuevo.getListProceso().iterator(); itr.hasNext();) {
            Proceso proceso = itr.next();
            for (Particion particion : listParticion) {
                if (particion.getEstado() == false && particion.getTamParticion() >= proceso.getTamProceso()) {
                    particion.addProceso(proceso);
                    particion.setEstado(true);
                    itr.remove();
                    break;
                }
            }
        }
    }

    public void WorstFit(ColaListo colaNuevo) {
        for (Iterator<Proceso> itr = colaNuevo.getListProceso().iterator(); itr.hasNext();) {
            Proceso proceso = itr.next();
            Collections.reverse(listParticion);
            System.out.println("Lista Particiones: " + this.listParticion);
            for (Particion particion : listParticion) {
                if (particion.getEstado() == false && particion.getTamParticion() >= proceso.getTamProceso()) {
                    crearParticionVariable(particion, proceso);
                    itr.remove();
                    break;
                }
            }
        }
    }

    public void FirstFitVariable(ColaListo colaNuevo) {
        for (Iterator<Proceso> itr = colaNuevo.getListProceso().iterator(); itr.hasNext();) {
            Proceso proceso = itr.next();
            System.out.println("Lista Particiones: " + this.listParticion);
            for (Particion particion : listParticion) {
                if (particion.getEstado() == false && particion.getTamParticion() >= proceso.getTamProceso()) {
                    crearParticionVariable(particion, proceso);
                    itr.remove();
                    break;
                }
            }
        }
    }

    public void runBestFit(List<Proceso> colaNuevo) {

        ordenarListaParticiones();
        int clock = 0;
        Iterator<Proceso> itProceso = colaNuevo.iterator();
        while (!colaNuevo.isEmpty()) {
            while (itProceso.hasNext()) {
                imprimirProcesoPorConsola();
                Proceso proceso = itProceso.next();
                int tamEfectivoLibre = 99999;
                int resguardoIndexParticion = 0;
                Boolean particionValida = false;

                for (Particion particion : this.listParticion) {
                    if (particion.getEstado()) {
                        final int calculoTamParticion = particion.getTamParticion() - proceso.getTamProceso();
                        if (calculoTamParticion >= 0 && calculoTamParticion <= tamEfectivoLibre) {
                            tamEfectivoLibre = calculoTamParticion;
                            resguardoIndexParticion = this.listParticion.indexOf(particion);
                            particionValida = true;
                        }
                    }
                }

                if (particionValida) {
                    this.listParticion.get(resguardoIndexParticion).addProceso(proceso);
                    itProceso.remove();

                }

                clock += 1;
                liberarMemoria(clock);

            }
        }
        imprimirProcesoPorConsola();
    }

    public void crearParticion(int tamParticion, int direccionInicial) {
        this.listParticion.add(new Particion(tamParticion, direccionInicial));
    }

    public void crearParticionVariable(Particion particion, Proceso proceso) {
        int indice = listParticion.indexOf(particion);
        int tamParticion;
        int dirComienzo;
        tamParticion = proceso.getTamProceso();
        dirComienzo = particion.getTamParticion() - tamParticion;
        particion.setTamParticion(particion.getTamParticion() - tamParticion);
        listParticion.add(indice + 1, new Particion(tamParticion, dirComienzo));
        Particion nuevaParticion = listParticion.get(indice + 1);
        nuevaParticion.addProceso(proceso);
        nuevaParticion.setEstado(true);
    }

    public int calcularDirComienzo() {
        int dirComienzo = 0;
        int acumuladorTamParticiones = 0;
        if (this.listParticion.isEmpty()) {
            dirComienzo += this.tamanoSo;
        } else {
            acumuladorTamParticiones = this.listParticion.stream().map((p) -> p.getTamParticion()).reduce(acumuladorTamParticiones, Integer::sum);
            dirComienzo += (acumuladorTamParticiones + tamanoSo);
        }
        return dirComienzo;
    }

    public void addProceso(Proceso proceso) {
        this.listProceso.add(proceso);
    }

    public int getMetodoIntercambio() {
        return this.metodo_Intercambio;
    }

    public List<Particion> getListParticion() {
        return this.listParticion;
    }

    public boolean getTipoParticion() {
        return tipoParticion;
    }

    public void setTipoParticion(boolean tipoParticion) {
        this.tipoParticion = tipoParticion;
    }
    public void ordenarListaParticiones() {
        Collections.sort(listParticion);
    }

    public void liberarMemoria(int clock) {
        for (Particion particion : this.listParticion) {
            if (particion.getEstado() == false) {
                if (particion.getProceso().getTamProceso() == clock) {
                    particion.setEstado(true);
                }
            }
        }
    }

    public void imprimirProcesoPorConsola() {
        this.listParticion.forEach((particion) -> {
            if (particion.procesoIsNull()) {
                System.out.println(particion.getTamParticion() + " = [ ]");
            } else {
                System.out.println(particion.getTamParticion() + " = " + " " + particion.getProceso().getTamProceso());

            }
        });
        System.out.println("=====================");
    }
}
