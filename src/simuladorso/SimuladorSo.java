/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso;

import simuladorso.model.Proceso;
import simuladorso.model.Memoria;
import simuladorso.model.Procesador;
import simuladorso.model.EntradaSalida;
import simuladorso.model.Planificador;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author Amadeo
 */
public class SimuladorSo {
    private static int clock;

    private static Proceso pro1;
    private static Proceso pro2;
    private static Proceso pro3;
    private static Proceso pro4;
    private static Proceso pro5;
    private static Proceso pro6;
    private static Proceso pro7;
    private static List<Proceso> colaProcesos;
    private static List<Proceso> colaNuevo;
    private static List<Proceso> colaListo;
    private static List<Proceso> colaBloqueado;
    private static List<Proceso> colaTerminado;
    private static Procesador procesador;
    private static EntradaSalida es;
    private static Memoria memoria;
    private static Scanner teclado;
    private static Planificador planificador;
    private static int cantProcesos;

    private static void initialProcedures() {
        Integer[] a1 = {2 ,1 ,2};
        Integer[] a2 = {1, 1, 1};
        Integer[] a3 = {3, 2, 1}; 
        Integer[] a4 = {1, 2, 1};
        Integer[] a5 = {2, 1, 1};
        Integer[] a6 = {1, 2, 3};
        Integer[] a7 = {1, 1, 1};
        pro1 = new Proceso(10,0, a1);
        pro2 = new Proceso(5,0,a2);
        pro3 = new Proceso(60,1,a3);
        pro4 = new Proceso(15,1,a4);
        pro5 = new Proceso(3,1,a5);
        pro6 = new Proceso(30,2,a6);
        pro7 = new Proceso(21,2,a7);
        System.out.println(pro1);
        System.out.println(pro2);
        System.out.println(pro3);
        System.out.println(pro4);
        System.out.println(pro5);
        System.out.println(pro6);
        System.out.println(pro7);
        colaProcesos.add(pro1);
        colaProcesos.add(pro2);
        colaProcesos.add(pro3);
        colaProcesos.add(pro4);
        colaProcesos.add(pro5);
        colaProcesos.add(pro6);
        colaProcesos.add(pro7);
        cantProcesos = colaProcesos.size();
    }

    private static void crearParticionesFijas() {
        int tamanio;
        int dirComienzo;
        teclado = new Scanner(System.in);
        while(memoria.calcularMemoriaLibre() > 0){
            System.out.println("Ingrese el tamaño de la siguiente particion: ");
            System.out.println("Memoria libre: " + memoria.calcularMemoriaLibre());
            tamanio = teclado.nextInt();
            if (tamanio > memoria.calcularMemoriaLibre()){
                do {
                    System.out.println("Ingrese el tamaño de la siguiente particion: ");
                    System.out.println("Memoria libre: " + memoria.calcularMemoriaLibre());
                    tamanio = teclado.nextInt();
                }while (tamanio > memoria.calcularMemoriaLibre());
            }
            dirComienzo = memoria.calcularDirComienzo();
            memoria.crearParticion(tamanio,dirComienzo);
        }
    }
    
    private static void crearParticionesVariables(){
        int tamanio = memoria.calcularMemoriaLibre();
        int dirComienzo = memoria.calcularDirComienzo();
        memoria.crearParticion(tamanio,dirComienzo);
    }
    
    private static void setUpColas() {
        colaProcesos = new ArrayList<Proceso>();
        colaNuevo = new ArrayList<Proceso>();
        colaListo = new ArrayList<Proceso>();
        colaBloqueado = new ArrayList<Proceso>();
        colaTerminado = new ArrayList<Proceso>();
        procesador = new Procesador();
        es = new EntradaSalida();
        planificador = new Planificador();
    }
    
    private static void cargarColaNuevo(){
        for(Iterator<Proceso> itr = colaProcesos.iterator(); itr.hasNext();){
            Proceso proceso = itr.next();
            if (proceso.getTiempoArribo() == clock){
                colaNuevo.add(proceso);
                itr.remove();
            }
        }
    }
    
    private static void setUpMemoria() {
        memoria = new Memoria();
    }
    
    private static void cargarES(){
        Proceso proceso;
        int tiempo;
        proceso = colaBloqueado.get(0);
        es.setProceso(proceso);
        tiempo = proceso.getRafaga().get(proceso.getIndice());
        es.setTimer(tiempo);
        colaBloqueado.remove(es.getProceso());
    }
    
    private static void imprimir(){
        System.out.println("Clock: "+clock);
        memoria.imprimirProcesoPorConsola();
        System.out.println("Procesador" + procesador.getProceso());
        System.out.println("E/S" + es.getProceso());
        System.out.println("COLA NUEVO: "+colaNuevo);
        System.out.println("COLA LISTO: "+colaListo);
        System.out.println("COLA BLOQUEADOS: "+colaBloqueado);
        System.out.println("COLA TERMINADOS: "+colaTerminado);
    }
    
    private static void intercambio(){
        if (memoria.getTipoParticion())
        {
            if (memoria.getMetodoIntercambio() == 1){
                memoria.BestFit(colaNuevo,colaListo);
            }
            else{
                memoria.FirstFit(colaNuevo,colaListo);
            }
        }
        else{
            if (memoria.getMetodoIntercambio() == 2){
                memoria.FirstFitVariable(colaNuevo,colaListo);
            }
            else{
                memoria.WorstFit(colaNuevo,colaListo);
            }
        }
    }
    
    private static void controlES(){
        if (es.procesoIsNotNull()){
            es.ejecutar();
            if (es.timeout() && clock != 0){
                es.getProceso().setIndice(es.getProceso().getIndice()+1);
                es.getProceso().setTiempoActual(es.getProceso().getRafaga().get(es.getProceso().getIndice()));
                colaListo.add(es.getProceso());
                es.removeProceso();
            }
        }
    }
    
    private static void procesoTermino(){
        procesador.getProceso().setIndice(procesador.getProceso().getIndice() + 1);
        if (procesador.getProceso().getRafaga().size() > procesador.getProceso().getIndice()){
            colaBloqueado.add(procesador.getProceso());
        }
        else{
            memoria.liberarMemoria(procesador.getProceso());
            colaTerminado.add(procesador.getProceso());
        }
        procesador.removeProceso();    
    }
    
    private static void procesoNoTermino(int comparativa){
        procesador.getProceso().setRafaga(procesador.getProceso().getIndice(),comparativa);
        colaListo.add(procesador.getProceso());
        procesador.removeProceso();
    }
    
    public static void controlProcesador(){
        int comparativa;
        if (procesador.procesoIsNotNull()){
            procesador.ejecutar();
            if (clock != 0){
                comparativa = procesador.getProceso().getRafaga().get(procesador.getProceso().getIndice()) - procesador.getOriginalTimer();
                procesador.getProceso().setTiempoActual(procesador.getProceso().getRafaga().get(procesador.getProceso().getIndice()));
                if (comparativa == 0 && procesador.timeout()){
                    procesoTermino();
                }
                else{
                    if (procesador.timeout()){
                        procesoNoTermino(comparativa);
                    }
                    if (comparativa == 0){
                        procesoTermino();
                    }
                }
            }
        }
    }
    
    private static void setUpParticiones(){
        if (memoria.getTipoParticion())
        {
           crearParticionesFijas();
        }
        else
        {
            crearParticionesVariables();
        }
    }
    
    public static void planificacion(){
        if (procesador.procesoIsNull() && colaListo.size()!=0){
            switch (planificador.getAlgoritmoPlanificacion()){
                case 1: planificador.FCFS(colaListo,procesador); 
                        break;
                case 2: planificador.roundRobin(colaListo, procesador, planificador.getQuantum());
                        break;
                case 3: planificador.prioridades(colaListo, procesador);
                        break;
                case 4: planificador.SJF(colaListo, procesador);
                        break;
                case 5: planificador.colasMultinivel(colaListo, procesador);
                        break;
            }              
        }
    }
    
    public static void main(String[] args) {
        clock = 0;
        setUpMemoria();
        setUpParticiones();
        setUpColas();
        initialProcedures();
        while (colaTerminado.size() != cantProcesos){
            cargarColaNuevo(); 
            intercambio();
            controlES();
            controlProcesador();
            planificacion();
            if (es.procesoIsNull() && colaBloqueado.size()!=0){
               cargarES(); 
            }
            imprimir();
            clock++;
        }
    }
}
