/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso;

import simuladorso.model.Proceso;
import simuladorso.model.ColaListo;
import simuladorso.model.Memoria;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Amadeo
 */
public class SimuladorSo {
    private int reloj = 0;

    private static Proceso pro1;
    private static Proceso pro2;
    private static Proceso pro3;
    private static ColaListo colaListo;
    private static Memoria memoria;
    private static Scanner teclado;

    private static void initialProcesses() {
        pro1 = new Proceso();
        pro2 = new Proceso();
        pro3 = new Proceso();
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
    
    private static void setUpColaListo() {
        colaListo = new ColaListo();
        colaListo.addProceso(pro1);
        colaListo.addProceso(pro2);
        colaListo.addProceso(pro3);
    }

    private static void setUpMemoria() {
        memoria = new Memoria();
    }

    public static void main(String[] args) {
        setUpMemoria();
        if (memoria.getTipoParticion())
        {
            crearParticionesFijas();
        }
        else
        {
            crearParticionesVariables();
        }
        initialProcesses();
        System.out.println("Lista Particion " + memoria.getListParticion());
        setUpColaListo();
        if (memoria.getTipoParticion())
        {
            if (memoria.getMetodoIntercambio() == 1){
                memoria.BestFit(colaListo);
            }
            else{
                memoria.FirstFit(colaListo);
            }
        }
        else{
            if (memoria.getMetodoIntercambio() == 2){
                memoria.FirstFitVariable(colaListo);
            }
            else{
                memoria.WorstFit(colaListo);
            }
        }
        memoria.imprimirProcesoPorConsola();
        System.out.println("Lista Particion " + memoria.getListParticion());
    }
}
