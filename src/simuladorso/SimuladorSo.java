/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso;

import simuladorso.model.Proceso;
import simuladorso.model.Memoria;
import simuladorso.model.Procesador;
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
    private static List<Proceso> colaProcesos;
    private static List<Proceso> colaNuevo;
    private static List<Proceso> colaListo;
    private static List<Proceso> colaBloqueado;
    private static List<Proceso> colaTerminado;
    private static Procesador procesador;
    private static Memoria memoria;
    private static Scanner teclado;
    private static int cantProcesos;

    private static void initialProcedures() {
        pro1 = new Proceso(10,0,3);
        pro2 = new Proceso(5,1,2);
        pro3 = new Proceso(60,3,1);
        colaProcesos.add(pro1);
        colaProcesos.add(pro2);
        colaProcesos.add(pro3);
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
    
    private static void FCFS(){
        Proceso proceso;
        int tiempo;
        proceso = colaListo.get(0);
        procesador.setProceso(proceso);
        tiempo = proceso.getRafaga();
        procesador.setTimer(tiempo);
    }
    
    public static void main(String[] args) {
        clock = 0;
        setUpMemoria();
        if (memoria.getTipoParticion())
        {
            crearParticionesFijas();
        }
        else
        {
            crearParticionesVariables();
        }
        setUpColas();
        initialProcedures();
        while (colaTerminado.size() != cantProcesos){
            cargarColaNuevo();
            //System.out.println("COLA NUEVO: "+colaNuevo);
            //System.out.println("COLA LISTO: "+colaListo);
            //System.out.println("Lista Particion " + memoria.getListParticion());     
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
            if (procesador.timeout() && clock != 0){
                colaListo.remove(procesador.getProceso());
                memoria.liberarMemoria(procesador.getProceso());
                colaTerminado.add(procesador.getProceso());
                procesador.removeProceso();
            }
            else
            {
                procesador.ejecutar();
            }
            if (procesador.procesoIsNull() && colaListo.size()!=0){
               FCFS(); 
            }
            System.out.println("Clock: "+clock);
            memoria.imprimirProcesoPorConsola();
            System.out.println(procesador.getProceso());
            //System.out.println("COLA NUEVO: "+colaNuevo);
            //System.out.println("COLA LISTO: "+colaListo);
            //System.out.println("Lista Particion " + memoria.getListParticion());
            clock++;
        }
        System.out.println("Cant Procesos: " +cantProcesos);
    }
}
