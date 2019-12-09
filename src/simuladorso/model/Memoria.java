/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private final int tamMinimo = 100;
    private final int tamanoSo;
            
    //La memoria necesita tamaño, tipo de particionamiento y algortimo de intercambio.
    public Memoria(){
        teclado=new Scanner(System.in);
        System.out.print("ingrese tamanio de la memoria: ");
        tamMemoria = teclado.nextInt();
        if (tamMemoria > this.tamMaximo){
            this.tamMemoria = this.tamMaximo;
        }
        if (tamMemoria < this.tamMinimo){
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
    
    //Metodos Necesarios para la coneccion de las pantallas
       public Memoria(int tamMemoriaEntrada){
         
        if (tamMemoriaEntrada > this.tamMaximo){
            this.tamMemoria = this.tamMaximo;
        }
        if (tamMemoriaEntrada < this.tamMinimo){
            this.tamMemoria = this.tamMinimo;
        }     
        this.tamMemoria = tamMemoriaEntrada;
        this.tamanoSo = (int) (tamMemoriaEntrada * 0.1);
        this.listParticion = new ArrayList<Particion>();
        this.listProceso = new ArrayList<Proceso>();
    }

    public void setTamMemoria(int tamMemoria) {
        this.tamMemoria = tamMemoria;
    }

    public void setTipoParticion(boolean tipoParticion) {
        this.tipoParticion = tipoParticion;
    }

    public void setMetodo_Intercambio(int metodo_Intercambio) {
        this.metodo_Intercambio = metodo_Intercambio;
    }

    public int getTamMemoria() {
        return tamMemoria;
    }

    public Integer getTamanoSo() {
        return tamanoSo;
    }
    //==================================
    //Añade una particion fija a memoria.
    public void addParticion(Particion particion) {
        if (particion.getTamParticion() > calcularMemoriaLibre() && calcularMemoriaLibre() != 0) {
            particion.setTamParticion(calcularMemoriaLibre());
        }
        this.listParticion.add(particion);
    }

    //Calcula la memoria libre para añadir particiones
    public int calcularMemoriaLibre() { 
        int cantidadMemoriaLibre = 0;
        int acumuladorTamañoParticiones = 0;
        if (this.listParticion.isEmpty()) {
            cantidadMemoriaLibre += this.tamMemoria - this.tamanoSo;
        } else {
            acumuladorTamañoParticiones = this.listParticion.stream().map((p) -> p.getTamParticion()).reduce(acumuladorTamañoParticiones, Integer::sum);
            cantidadMemoriaLibre += (this.tamMemoria - acumuladorTamañoParticiones - tamanoSo);
        }
        return cantidadMemoriaLibre;
    }
    
    //Ejecuta el algoritmo de intercambio best-fit.
    public void BestFit(List<Proceso> colaNuevo,List<Proceso> colaListo){
        List<Particion> listaPart = this.listParticion; 
        Collections.sort(listaPart);
        for (Iterator<Proceso> itr = colaNuevo.iterator(); itr.hasNext();){
            Proceso proceso = itr.next();
            for (Particion particion : listaPart){
                if (particion.getEstado()==false && particion.getTamParticion() >= proceso.getTamProceso() ){
                    particion.addProceso(proceso);
                    particion.setEstado(true);
                    colaListo.add(proceso);
                    listParticion.remove(proceso);
                    itr.remove();
                    break;
                }
            }   
        }
    }
    
    //Ejecuta el algoritmo de intercambio first-fit para particiones fijas.
    public void FirstFit(List<Proceso> colaNuevo, List<Proceso> colaListo){
        for (Iterator<Proceso> itr = colaNuevo.iterator(); itr.hasNext();){
            Proceso proceso = itr.next();
            for (Particion particion : listParticion){
                if (particion.getEstado()==false && particion.getTamParticion() >= proceso.getTamProceso() ){
                    particion.addProceso(proceso);
                    particion.setEstado(true);
                    colaListo.add(proceso);
                    itr.remove();
                    break;
                }
            }   
        }   
    }
    
    //Ejecuta el algoritmo de intercambio worst-fit.
    public void WorstFit(List<Proceso> colaNuevo,List<Proceso> colaListo){
        List<Particion> listaPart = this.listParticion; 
        for (Iterator<Proceso> itr = colaNuevo.iterator(); itr.hasNext();){
            Proceso proceso = itr.next();
            Collections.sort(listaPart);
            Collections.reverse(listaPart);
            //System.out.println("Lista Particiones: " + this.listParticion);
            for (Particion particion : listaPart){
                if (particion.getEstado()==false && particion.getTamParticion() >= proceso.getTamProceso() ){
                    crearParticionVariable(particion, proceso);
                    colaListo.add(proceso);
                    listParticion.remove(proceso);
                    itr.remove();
                    break;
                }
            }   
        }   
    }
    
    //Ejecuta el algoritmo de intercambio first-fit variable.
    public void FirstFitVariable(List<Proceso> colaNuevo,List<Proceso> colaListo){
        for (Iterator<Proceso> itr = colaNuevo.iterator(); itr.hasNext();){
            Proceso proceso = itr.next();
            //System.out.println("Lista Particiones: " + this.listParticion);
            for (Particion particion : listParticion){
                if (particion.getEstado()==false && particion.getTamParticion() >= proceso.getTamProceso() ){
                    crearParticionVariable(particion, proceso);
                    colaListo.add(proceso);
                    itr.remove();
                    break;
                }
            }   
        }   
    }
    
    
    public void crearParticion(int tamParticion, int direccionInicial){
        this.listParticion.add(new Particion(tamParticion, direccionInicial));
    }
    
    public void eliminarParticion(int idParticion){
        for(Iterator<Particion> itr = this.listParticion.iterator(); itr.hasNext();){
            Particion particion = itr.next();
            if (particion.getIdParticion() == idParticion){
                itr.remove();
                break;
            }
        }
    }
    
    //Crea particiones variables.
    public void crearParticionVariable(Particion particion,Proceso proceso){
        int indice = listParticion.indexOf(particion);
        int tamParticion;
        int dirComienzo;
        tamParticion = proceso.getTamProceso();
        dirComienzo = particion.getTamParticion() - tamParticion;
        particion.setTamParticion(particion.getTamParticion()-tamParticion);
        listParticion.add(indice+1, new Particion(tamParticion,dirComienzo));
        Particion nuevaParticion = listParticion.get(indice+1);
        nuevaParticion.addProceso(proceso);
        nuevaParticion.setEstado(true);
    }
    
    //Calcula de direccion de comienzo de una particion.
    public int calcularDirComienzo(){
        int dirComienzo = 0;
        int acumuladorTamañoParticiones = 0;
        if (this.listParticion.isEmpty()) {
            dirComienzo += this.tamanoSo;
        } else {
            acumuladorTamañoParticiones = this.listParticion.stream().map((p) -> p.getTamParticion()).reduce(acumuladorTamañoParticiones, Integer::sum);
            dirComienzo += (acumuladorTamañoParticiones + tamanoSo);
        }
        return dirComienzo;
    }
    
    public int getMetodoIntercambio(){
        return this.metodo_Intercambio;
    }
    
    public List<Particion> getListParticion(){
        return this.listParticion;
    }
    
    public boolean getTipoParticion(){
        return tipoParticion;
    }
    
    public void imprimirProcesoPorConsola() {
        this.listParticion.forEach((particion) -> {
            if (particion.procesoIsNull()) {
                System.out.println(particion.getTamParticion() + " = [ ]");
            } else {
                System.out.println(particion.getTamParticion() + " = " + " " + particion.getProceso().getTamProceso());
  
            }
        });
    }
    
    //Remueve los procesos de memoria.
    public void liberarMemoria(Proceso proceso){
        for (Particion particion : listParticion){
            if (particion.getProceso() == proceso){
                particion.removeProceso();
                particion.setEstado(false);
                break;
            }
        }
        if (this.tipoParticion == false){
           juntarParticionesVariables();
        }
    }
    
    //Junta dos particiones variables si estan contiguas.
    public void juntarParticionesVariables(){
        int index = 0;
        int acumulador = 0;
        Collections.reverse(this.listParticion);
        for (Iterator<Particion> itr = listParticion.iterator(); itr.hasNext();){
            Particion particion = itr.next();
            particion.setTamParticion(particion.getTamParticion()+acumulador);
            if (particion.procesoIsNull() && index+1 < listParticion.size() && listParticion.get(index+1).procesoIsNull()){
                acumulador = 0;
                acumulador = acumulador + particion.getTamParticion();
                itr.remove();
                index--;
            }
            else{
                acumulador = 0;
            }
            index++;
        }
        Collections.reverse(this.listParticion);
    }
    
    public int maximoTamaño(){
        int tam = 0;
        for (Particion particion : listParticion){
            if(tam<particion.getTamParticion()){
                tam = particion.getTamParticion();
            }    
        }
        return tam;
    }
    
}
