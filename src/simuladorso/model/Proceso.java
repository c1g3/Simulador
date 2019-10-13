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
/**
 *
 * @author Amadeo
 */
public class Proceso {
    private Scanner teclado;
    private int idProceso;
    private int tamProceso;
    private int tiempoArribo;
    private List<Integer> rafaga;
    private int indice;
    private String prioridad;
    static int cont = 1;
    private String estadoProceso;
    
    public Proceso(int tamProceso, int tiempoArribo, Integer[] rafaga){
        teclado = new Scanner(System.in);
        idProceso = cont;
        cont++;
        this.tamProceso = tamProceso;
        this.tiempoArribo = tiempoArribo;
        this.rafaga = new ArrayList<Integer>(Arrays.asList(rafaga));
        this.indice = 0;
        this.prioridad = "baja";
        this.estadoProceso = "nuevo";
    }
    
    public String getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(String estadoProceso) {
        this.estadoProceso = estadoProceso;
    }

    public Integer getTiempoArribo() {
        return tiempoArribo;
    }

    public String getPrioridad() {
        return prioridad;
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
    
    public static void main(String[] args){

    }
        
}
