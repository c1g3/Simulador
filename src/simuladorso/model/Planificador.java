/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso.model;

import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
/**
 *
 * @author Juan
 */
public class Planificador {
    private int algoritmoPlanificacion;
    private int quantum;
    private List<Proceso> colaAlta;
    private List<Proceso> colaMedia;
    private List<Proceso> colaBaja;
    private int quantumAlta;
    private int quantumMedia;
    //private Scanner teclado;
    
    //El planificador necesita el algoritmo de planificacion. Y opcionalmente los quantums.
    public Planificador(){
        //teclado = new Scanner(System.in);
        //System.out.println("[1] FCFS [2] Round Robin [3] Prioridades [4] SJF [5] Colas Multinivel");
        //this.algoritmoPlanificacion = teclado.nextInt();
        if (this.algoritmoPlanificacion == 2){
            //System.out.println("Ingrese el quantum: ");
            //this.quantum = teclado.nextInt();
        }
        colaAlta = new ArrayList<Proceso>();
        colaMedia = new ArrayList<Proceso>();
        colaBaja = new ArrayList<Proceso>();
    }
    
    //Ejecuta el algoritmo FCFS cargando un proceso de la cola de listo a procesador.
    public void FCFS(List<Proceso> colaListo, Procesador procesador){
        Proceso proceso;
        int tiempo;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        tiempo = proceso.getRafaga().get(proceso.getIndice());
        procesador.setTimer(tiempo);
        procesador.getProceso().setPrimeraEjecucion();
        colaListo.remove(procesador.getProceso());
    }
    
    //Ejecuta el algoritmo Round Robin cargando un proceso de la cola de listo a procesador.
    public void roundRobin(List<Proceso> colaListo, Procesador procesador, int quantum ){
        Proceso proceso;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        procesador.setTimer(quantum);
        procesador.getProceso().setPrimeraEjecucion();
        colaListo.remove(procesador.getProceso());
    }
    
    //Ejecuta el algoritmo de Prioridades cargando el proceso de mayor prioridad de la cola de listo a procesador.
    public void prioridades(List<Proceso> colaListo, Procesador procesador){
        Collections.sort(colaListo); //Ordenamos por prioridad.
        Proceso proceso;
        int tiempo;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        tiempo = proceso.getRafaga().get(proceso.getIndice());
        procesador.setTimer(tiempo);
        procesador.getProceso().setPrimeraEjecucion();
        colaListo.remove(procesador.getProceso());
    }
    
    //Ejecuta el algoritmo SJF cargando el proceso con menor tiempo de ejecucion de la cola de listo a procesador.
    public void SJF(List<Proceso> colaListo, Procesador procesador){
        colaListo.sort(Comparator.comparing(Proceso::getTiempoActual)); //Ordenamos por tiempo de ejecucion.
        Proceso proceso;
        int tiempo;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        tiempo = proceso.getRafaga().get(proceso.getIndice());
        procesador.setTimer(tiempo);
        procesador.getProceso().setPrimeraEjecucion();
        colaListo.remove(procesador.getProceso());
    }
    
    //Ejecuta el algoritmo de colar multinivel.
    public void colasMultinivel(List<Proceso> colaListo, Procesador procesador){
        colaAlta.clear();
        colaMedia.clear();
        colaBaja.clear();
        for (Proceso proceso : colaListo){
            switch(proceso.getPrioridad()){
                case "ALTA": colaAlta.add(proceso);
                             break;
                case "MEDIA": colaMedia.add(proceso);
                              break;
                case "BAJA": colaBaja.add(proceso);
                             break;
            }
        }
        System.out.println("COLA ALTA " +colaAlta);
        System.out.println("COLA MEDIA " +colaMedia);
        System.out.println("COLA BAJA " +colaBaja);
        Proceso proceso;
        if (colaAlta.isEmpty()==false){
            proceso = colaAlta.get(0);
            roundRobin(colaAlta, procesador, quantumAlta);            
            colaListo.remove(proceso);
        }
        else if (colaMedia.isEmpty()==false){
            proceso = colaMedia.get(0);
            roundRobin(colaMedia, procesador, quantumMedia);
            colaListo.remove(proceso);
        }
        else{
            proceso = colaBaja.get(0);
            FCFS(colaBaja, procesador);
            colaListo.remove(proceso);
        }
    }
    
    public void setAlgoritmoPlanificacion(int algoritmoPlanificacion){
        this.algoritmoPlanificacion = algoritmoPlanificacion;
    }
    
    public void setQuantum(int q){
        this.quantum = q;
    }
    
    public void setQuantumAlta(int q){
        this.quantumAlta = q;
    }
    
    public void setQuantumMedia(int q){
        this.quantumMedia = q;
    }
    
    public int getAlgoritmoPlanificacion(){
        return this.algoritmoPlanificacion;
    }
    
    public int getQuantum(){
        return this.quantum;
    }
}
