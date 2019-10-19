/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso.model;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author Amadeo
 */
public class Proceso {
    private Scanner teclado;
    private int idProceso;
    private int tamProceso;
    private int tiempoArribo;
    private String prioridad;
    static int cont = 1;
    private String estadoProceso;
    private String nombreProceso;
    
    public Proceso(){
        teclado = new Scanner(System.in);
        idProceso = cont;
        cont++;
        System.out.println("Ingrese tamanio: ");
        tamProceso = teclado.nextInt();
        System.out.println("Ingrese TA: ");
        tiempoArribo = teclado.nextInt();
        System.out.println("Ingrese prioridad: ");
        prioridad = teclado.next();
        this.estadoProceso = "nuevo";
    }
        public Proceso(Integer tamProceso, Integer tiempoArribo, String prioridad) {
        this.tamProceso = tamProceso;
        this.tiempoArribo = tiempoArribo;
        this.prioridad = prioridad;
        this.estadoProceso = "listo";
    }

    public Proceso(String nombreProceso, Integer tiempoArribo, Integer tamProceso) {
        this.nombreProceso = nombreProceso;
        this.tamProceso = tamProceso;
        this.tiempoArribo = tiempoArribo;
        this.estadoProceso = "listo";
    }
//******************************************************************************
    public String getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(String estadoProceso) {
        this.estadoProceso = estadoProceso;
    }

    public Integer getTiempoArribo() {
        return tiempoArribo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setTamProceso(Integer tamaño) {
        this.tamProceso = tamaño;
    }

    public void setTiempoArribo(Integer tiempoArribo) {
        this.tiempoArribo = tiempoArribo;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public int getNombreProceso() {
        return this.idProceso;
    }

    public Integer getTamProceso() {
        return this.tamProceso;
    }
    
      public void upgradeTiempoArribo() {
        if (this.tiempoArribo != 0) {
            this.tiempoArribo -= 1;
        }
    }

}
