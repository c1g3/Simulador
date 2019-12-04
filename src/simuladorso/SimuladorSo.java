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
import simuladorso.model.Connector;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
/**
 *
 * @author Amadeo
 */
public class SimuladorSo {
//    private static int clock;
//    private static List<Proceso> colaProcesos;
//    private static List<Proceso> colaNuevo;
//    private static List<Proceso> colaListo;
//    private static List<Proceso> colaBloqueado;
//    private static List<Proceso> colaTerminado;
//    private static Procesador procesador;
//    private static EntradaSalida es;
//    private static Memoria memoria;
//    private static Scanner teclado;
//    private static Planificador planificador;
//    private static Integer cantProcesos;
//    private static int tiempoEsperaPromedio;
//    private static int tiempoRetornoPromedio;
//    private static Connector db;
//    
//    //Inicializa los procesos.
//    private static void initialProcedures() {
//        db.getProcesos(colaProcesos);
//        teclado = new Scanner(System.in);
//        String idProceso;
//        String tamProceso;
//        String tiempoArribo;
//        for(Iterator<Proceso> itr = colaProcesos.iterator();itr.hasNext();){
//            Proceso proceso = itr.next();
//            idProceso = proceso.getNombreProceso().toString();
//            tamProceso = proceso.getTamProceso().toString();
//            tiempoArribo = proceso.getTiempoArribo().toString();
//            System.out.println(idProceso+" "+tamProceso+" "+tiempoArribo+" "+proceso.getRafaga().toString()+" "+" "+proceso.getPrioridad());   
//            System.out.println("Utilizar[1]");
//            if (teclado.nextInt() != 1){
//                itr.remove();
//            }
//        }
//        cantProcesos = colaProcesos.size();
//    }
//    
//    //Crea las particiones fijas.
//    private static void crearParticionesFijas() {
//        int tamanio;
//        int dirComienzo;
//        teclado = new Scanner(System.in);
//        while(memoria.calcularMemoriaLibre() > 0){
//            System.out.println("Ingrese el tamaño de la siguiente particion: ");
//            System.out.println("Memoria libre: " + memoria.calcularMemoriaLibre());
//            tamanio = teclado.nextInt();
//            if (tamanio > memoria.calcularMemoriaLibre()){
//                do {
//                    System.out.println("Ingrese el tamaño de la siguiente particion: ");
//                    System.out.println("Memoria libre: " + memoria.calcularMemoriaLibre());
//                    tamanio = teclado.nextInt();
//                }while (tamanio > memoria.calcularMemoriaLibre());
//            }
//            dirComienzo = memoria.calcularDirComienzo();
//            memoria.crearParticion(tamanio,dirComienzo);
//        }
//    }
//    
//    //Crea la primera particion.
//    private static void crearParticionesVariables(){
//        int tamanio = memoria.calcularMemoriaLibre();
//        int dirComienzo = memoria.calcularDirComienzo();
//        memoria.crearParticion(tamanio,dirComienzo);
//    }
//    
//    //Crea las colas.
//    private static void setUpColas() {
//        colaProcesos = new ArrayList<Proceso>();
//        colaNuevo = new ArrayList<Proceso>();
//        colaListo = new ArrayList<Proceso>();
//        colaBloqueado = new ArrayList<Proceso>();
//        colaTerminado = new ArrayList<Proceso>();
//        procesador = new Procesador();
//        es = new EntradaSalida();
//        planificador = new Planificador();
//    }
//    
//    //Carga la cola de nuevo con los procesos que arriban.
//    private static void cargarColaNuevo(){
//        for(Iterator<Proceso> itr = colaProcesos.iterator(); itr.hasNext();){
//            Proceso proceso = itr.next();
//            if (proceso.getTiempoArribo() == clock){
//                colaNuevo.add(proceso);
//                itr.remove();
//            }
//        }
//    }
//    
//    //Crea la memoria.
//    private static void setUpMemoria() {
//        memoria = new Memoria();
//    }
//    
//    //Carga un proceso en entrada/salida.
//    private static void cargarES(){
//        Proceso proceso;
//        int tiempo;
//        proceso = colaBloqueado.get(0);
//        es.setProceso(proceso);
//        tiempo = proceso.getRafaga().get(proceso.getIndice());
//        es.setTimer(tiempo);
//        colaBloqueado.remove(es.getProceso());
//    }
//    
//    private static void imprimir(){
//        System.out.println("Clock: "+clock);
//        memoria.imprimirProcesoPorConsola();
//        System.out.println("Procesador" + procesador.getProceso());
//        System.out.println("E/S" + es.getProceso());
//        System.out.println("COLA NUEVO: "+colaNuevo);
//        System.out.println("COLA LISTO: "+colaListo);
//        System.out.println("COLA BLOQUEADOS: "+colaBloqueado);
//        System.out.println("COLA TERMINADOS: "+colaTerminado);
//    }
//    
//    //Selecciona el algoritmo de intercambio a ejecutar.
//    private static void intercambio(){
//        if (memoria.getTipoParticion())
//        {
//            if (memoria.getMetodoIntercambio() == 1){
//                memoria.BestFit(colaNuevo,colaListo);
//            }
//            else{
//                memoria.FirstFit(colaNuevo,colaListo);
//            }
//        }
//        else{
//            if (memoria.getMetodoIntercambio() == 2){
//                memoria.FirstFitVariable(colaNuevo,colaListo);
//            }
//            else{
//                memoria.WorstFit(colaNuevo,colaListo);
//            }
//        }
//    }
//    
//    //Controla si termino el proceso en entrada/salida.
//    private static void controlES(){
//        if (es.procesoIsNotNull()){
//            es.ejecutar();
//            if (es.timeout() && clock != 0){
//                es.getProceso().setIndice(es.getProceso().getIndice()+1);
//                es.getProceso().setTiempoActual(es.getProceso().getRafaga().get(es.getProceso().getIndice()));
//                colaListo.add(es.getProceso());
//                es.removeProceso();
//            }
//        }
//    }
//    
//    //Revisa cuando el proceso termina una rafaga y decide que hacer..
//    private static void procesoTermino(){
//        procesador.getProceso().setIndice(procesador.getProceso().getIndice() + 1);
//        if (procesador.getProceso().getRafaga().size() > procesador.getProceso().getIndice()){
//            colaBloqueado.add(procesador.getProceso());
//        }
//        else{
//            memoria.liberarMemoria(procesador.getProceso());
//            colaTerminado.add(procesador.getProceso());
//        }
//        procesador.removeProceso();    
//    }
//    
//    //Revisa cuando el proceso no termino de ejecutarse por un limite de tiempo maximo establecido.
//    private static void procesoNoTermino(int comparativa){
//        procesador.getProceso().setRafaga(procesador.getProceso().getIndice(),comparativa);
//        colaListo.add(procesador.getProceso());
//        procesador.removeProceso();
//    }
//    
//    //Controla si un proceso termino de ejecutarse.
//    public static void controlProcesador(){
//        int comparativa;
//        if (procesador.procesoIsNotNull()){
//            procesador.ejecutar();
//            if (clock != 0){
//                comparativa = procesador.getProceso().getRafaga().get(procesador.getProceso().getIndice()) - procesador.getOriginalTimer();
//                procesador.getProceso().setTiempoActual(procesador.getProceso().getRafaga().get(procesador.getProceso().getIndice()));
//                if (comparativa == 0 && procesador.timeout()){
//                    procesoTermino();
//                }
//                else{
//                    if (procesador.timeout()){
//                        procesoNoTermino(comparativa);
//                    }
//                    if (comparativa == 0){
//                        procesoTermino();
//                    }
//                }
//            }
//        }
//    }
//    
//    //Inicializa las particiones.
//    private static void setUpParticiones(){
//        if (memoria.getTipoParticion())
//        {
//           crearParticionesFijas();
//        }
//        else
//        {
//            crearParticionesVariables();
//        }
//    }
//    
//    //Selecciona el algoritmo de planificacion a ejecutar.
//    public static void planificacion(){
//        if (procesador.procesoIsNull() && colaListo.size()!=0){
//            switch (planificador.getAlgoritmoPlanificacion()){
//                case 1: planificador.FCFS(colaListo,procesador); 
//                        break;
//                case 2: planificador.roundRobin(colaListo, procesador, planificador.getQuantum());
//                        break;
//                case 3: planificador.prioridades(colaListo, procesador);
//                        break;
//                case 4: planificador.SJF(colaListo, procesador);
//                        break;
//                case 5: planificador.colasMultinivel(colaListo, procesador);
//                        break;
//            }              
//        }
//    }
//    
//    //Incrementa el tiempo de retorno y espera de los procesos en estado listo.
//    public static void tiempoColaListo(){
//        for (Proceso proceso : colaListo){
//            proceso.incTiempoRetorno();
//            if (proceso.getPrimeraEjecucion()){
//                proceso.incTiempoEspera();  
//            }
//        }
//    }
//    
//    //Incrementa el tiempo de retorno de los procesos en estado bloqueado.
//    public static void tiempoColaBloqueado(){
//        for (Proceso proceso : colaBloqueado){
//            proceso.incTiempoRetorno();
//        }
//    }
//    
//    public static void main(String[] args) {
//        db = new Connector();
//        db.crearTabla();
//        clock = 0;
//        setUpMemoria();
//        setUpParticiones();
//        setUpColas();
//        initialProcedures();
//        db.closeConnection();
//        tiempoEsperaPromedio = 0;
//        tiempoRetornoPromedio = 0;
//        while (colaTerminado.size() != cantProcesos){
//            cargarColaNuevo(); 
//            intercambio();
//            controlES();
//            controlProcesador();
//            planificacion();
//            if (es.procesoIsNull() && colaBloqueado.size()!=0){
//               cargarES(); 
//            }
//            tiempoColaListo();
//            tiempoColaBloqueado();
//            imprimir();
//            clock++;
//        }
//        for (Proceso proceso : colaTerminado){
//            System.out.println("TE:  "+proceso.getTiempoEspera()+" TR:  "+proceso.getTiempoRetorno());
//            tiempoEsperaPromedio += proceso.getTiempoEspera();
//            tiempoRetornoPromedio += proceso.getTiempoRetorno();
//        }
//        tiempoEsperaPromedio /= cantProcesos;
//        tiempoRetornoPromedio /= cantProcesos;
//        System.out.println("TEP: "+tiempoEsperaPromedio+" TRP: "+tiempoRetornoPromedio);
//    }
}
