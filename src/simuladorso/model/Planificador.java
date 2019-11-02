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
    private Scanner teclado;
    
    public Planificador(){
        teclado = new Scanner(System.in);
        System.out.println("[1] FCFS [2] Round Robin [3] Prioridades [4] SJF [5] Colas Multinivel");
        this.algoritmoPlanificacion = teclado.nextInt();
        if (this.algoritmoPlanificacion == 2){
            System.out.println("Ingrese el quantum: ");
            this.quantum = teclado.nextInt();
        }
        else{
            this.quantum = 0;
        }
        if (this.algoritmoPlanificacion == 5){
            colaAlta = new ArrayList<Proceso>();
            colaMedia = new ArrayList<Proceso>();
            colaBaja = new ArrayList<Proceso>();
            System.out.println("Ingrese el quantum de la cola de alta prioridad: ");
            this.quantumAlta = teclado.nextInt();
            do{
                System.out.println("Ingrese el quantum de la cola de media prioridad: ");
                this.quantumMedia = teclado.nextInt();
            }while(this.quantumAlta < this.quantumMedia);
        }
    }
    
    public void FCFS(List<Proceso> colaListo, Procesador procesador){
        Proceso proceso;
        int tiempo;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        tiempo = proceso.getRafaga().get(proceso.getIndice());
        procesador.setTimer(tiempo);
        colaListo.remove(procesador.getProceso());
    }
    
    public void roundRobin(List<Proceso> colaListo, Procesador procesador, int quantum ){
        Proceso proceso;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        procesador.setTimer(quantum);
        colaListo.remove(procesador.getProceso());
    }
    
    public void prioridades(List<Proceso> colaListo, Procesador procesador){
        Collections.sort(colaListo);
        Proceso proceso;
        int tiempo;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        tiempo = proceso.getRafaga().get(proceso.getIndice());
        procesador.setTimer(tiempo);
        colaListo.remove(procesador.getProceso());
    }
    
    public void SJF(List<Proceso> colaListo, Procesador procesador){
        colaListo.sort(Comparator.comparing(Proceso::getTiempoActual));
        Proceso proceso;
        int tiempo;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        tiempo = proceso.getRafaga().get(proceso.getIndice());
        procesador.setTimer(tiempo);
        colaListo.remove(procesador.getProceso());
    }
    
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
    
    public int getAlgoritmoPlanificacion(){
        return this.algoritmoPlanificacion;
    }
    
    public int getQuantum(){
        return this.quantum;
    }
}
