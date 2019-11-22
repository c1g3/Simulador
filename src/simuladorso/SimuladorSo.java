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
import javax.swing.JOptionPane;
import pantallas.DatosPantallaMemoria;
import pantallas.DatosPantallaProcesos;
import pantallas.Principal_Amadeo;

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
    public static DatosPantallaMemoria datosPantallaMemoria = new DatosPantallaMemoria();
    public static DatosPantallaProcesos datosPantallaProcesos = new DatosPantallaProcesos();
    

    private static void initialProcesses() {
        pro1 = new Proceso();
        pro2 = new Proceso();
        pro3 = new Proceso();
    }

    private static void crearParticionesFijas() {
           int tamanio;
        int dirComienzo;
        
        while(memoria.calcularMemoriaLibre() > 0 && datosPantallaMemoria.isBtnRUN()){
            
            tamanio = datosPantallaMemoria.getTamParticion();//Tamaño de la particion
        
            if (tamanio > memoria.calcularMemoriaLibre()){
                JOptionPane.showMessageDialog(null, "Error el valor Ingresado Supera el tamanio de la memoria libre ", "Cuidado!", JOptionPane.PLAIN_MESSAGE);
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
        memoria = new Memoria(datosPantallaMemoria.getTamMemoria());
        memoria.setTipoParticion(true);
                
    }

    public static void main(String[] args) {
        //Instanciamos la Pantalla principal
        Principal_Amadeo principal_Amadeo = new Principal_Amadeo();
        principal_Amadeo.setVisible(true);
        setUpMemoria();
        //Tipo Particion
        if (datosPantallaMemoria.isPartFija()) {
            memoria.setTipoParticion(true);
            crearParticionesFijas();
        } else {
            memoria.setTipoParticion(false
            );
            crearParticionesVariables();
        }
        
        //++++++++++++++++
        
if (memoria.getTipoParticion()){
    if (memoria.getMetodoIntercambio() == 1){
        memoria.BestFit(datosPantallaProcesos.getColaListo());
    }else{
            memoria.FirstFit(datosPantallaProcesos.getColaListo());
        }
}else{
       if (memoria.getMetodoIntercambio() == 2){
            memoria.FirstFitVariable(datosPantallaProcesos.getColaListo());
        }else{
                memoria.WorstFit(datosPantallaProcesos.getColaListo());
            }
    }
memoria.imprimirProcesoPorConsola();
System.out.println("Lista Particion " + memoria.getListParticion());
        
    }
}
