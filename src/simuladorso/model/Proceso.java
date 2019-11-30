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
    private int tamProceso; //Tamaño del proceso.
    private int tiempoArribo; 
    private List<Integer> rafaga;
    private int indice; //Indice para saber en que lugar de la rafaga estamos.
    private String prioridad;
    enum Prioridad implements Comparable<Prioridad>{
        ALTA,MEDIA,BAJA;
    }
    private Prioridad prioridadd;
    private int seleccionado;
    private int tiempoActual;
    private int tiempoEspera;
    private int tiempoRetorno;
    private boolean primeraEjecucion; //Guarda Falso si el proceso ya se ejecuto una vez. Se utiliza para calcular el tiempo de espera.
    
    //Un proceso necesita tamaño, tiempo de arribo, rafaga y prioridad como entrada.
    public Proceso(int idProceso, int tamProceso, int tiempoArribo, Integer[] rafaga, String prioridad){
        teclado = new Scanner(System.in);
        this.idProceso = idProceso;
        this.tamProceso = tamProceso;
        this.tiempoArribo = tiempoArribo;
        this.rafaga = new ArrayList<Integer>(Arrays.asList(rafaga));
        this.indice = 0;
        System.out.println("Ingrese la prioridad: ");
        this.prioridad = prioridad;
        switch(prioridad){
            case "BAJA": this.prioridadd = Prioridad.BAJA;
                         break;
            case "MEDIA": this.prioridadd = Prioridad.MEDIA;
                         break;
            case "ALTA": this.prioridadd = Prioridad.ALTA;
                         break;           
        }
        this.tiempoActual = this.rafaga.get(indice);
        this.seleccionado = 0;
        primeraEjecucion = true;
        tiempoEspera = 0;
        tiempoRetorno = 0;
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

    public Integer getNombreProceso() {
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
    
    public boolean getPrimeraEjecucion(){
        return this.primeraEjecucion;
    }
    
    public void setPrimeraEjecucion(){
        this.primeraEjecucion = false;
    }
    
    public int getTiempoEspera(){
        return this.tiempoEspera;
    }
    
    public int getTiempoRetorno(){
        return this.tiempoRetorno;
    }
     
    //Incrementa el tiempo de espera
    public void incTiempoEspera(){
        this.tiempoEspera++; 
    }
    
    //Incrementa el tiempo de retorno
    public void incTiempoRetorno(){
        this.tiempoRetorno++; 
    }
    
    public void setSeleccionado(int seleccionado){
        this.seleccionado = seleccionado;
    }
    
    public Integer getSeleccionado(){
        return this.seleccionado;
    }
}
