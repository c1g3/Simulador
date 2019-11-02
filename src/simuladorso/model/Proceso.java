/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso.model;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Amadeo
 */
public class Proceso implements Comparable<Proceso>{
    private Scanner teclado;
    private int idProceso;
    private int tamProceso;
    private int tiempoArribo;
    private List<Integer> rafaga;
    private int indice;
    enum Prioridad implements Comparable<Prioridad>{
        ALTA,MEDIA,BAJA;
    }
    private String prioridad;
    private Prioridad prioridadd;
    static int cont = 1;
    private String estadoProceso;
    private int tiempoActual;
    
    public Proceso(int tamProceso, int tiempoArribo, Integer[] rafaga){
        teclado = new Scanner(System.in);
        idProceso = cont;
        cont++;
        this.tamProceso = tamProceso;
        this.tiempoArribo = tiempoArribo;
        this.rafaga = new ArrayList<Integer>(Arrays.asList(rafaga));
        this.indice = 0;
        System.out.println("Ingrese la prioridad: ");
        this.prioridad = teclado.next();
        switch(prioridad){
            case "BAJA": this.prioridadd = Prioridad.BAJA;
                         break;
            case "MEDIA": this.prioridadd = Prioridad.MEDIA;
                         break;
            case "ALTA": this.prioridadd = Prioridad.ALTA;
                         break;           
        }
        this.tiempoActual = this.rafaga.get(indice);
        this.estadoProceso = "nuevo";
    }
    
    public String getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(String estadoProceso) {
        this.estadoProceso = estadoProceso;
    }
    
    @Override
    public int compareTo(Proceso proceso) {
        return (this.getPrioridadd()).compareTo(proceso.getPrioridadd());
    }
   
    public Prioridad getPrioridadd(){
        return this.prioridadd;
    }
    
    public Integer getTiempoArribo() {
        return tiempoArribo;
    }

    public String getPrioridad() {
        return this.prioridad;
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
    
    public List<Integer> getRafaga(){
        return this.rafaga;
    }
    
    public void setRafaga(int index,int number){
        this.rafaga.set(index, number);
    }
    
    public void setIndice(int indice){
        this.indice = indice;
    }
    
    public int getIndice(){
        return this.indice;
    }
    
    public void setTiempoActual(int tiempo){
        this.tiempoActual = tiempo;
    }
    
    public int getTiempoActual(){
        return this.tiempoActual;
    }
    
    public static void main(String[] args){

    }
        
}
