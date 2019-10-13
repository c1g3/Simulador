/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso.model;

import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Planificador {
    private int algoritmoPlanificacion;
    private int quantum;
    private Scanner teclado;
    
    public Planificador(){
        teclado = new Scanner(System.in);
        System.out.println("[1] FCFS [2] Round Robin ");
        this.algoritmoPlanificacion = teclado.nextInt();
        if (this.algoritmoPlanificacion == 2){
            System.out.println("Ingrese el quantum: ");
            this.quantum = teclado.nextInt();
        }
        else{
            this.quantum = 0;
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
    
    public void roundRobin(List<Proceso> colaListo, Procesador procesador){
        Proceso proceso;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        procesador.setTimer(quantum);
        colaListo.remove(procesador.getProceso());
    }
    
    public int getAlgoritmoPlanificacion(){
        return this.algoritmoPlanificacion;
    }
    
    public int getQuantum(){
        return this.quantum;
    }
}
