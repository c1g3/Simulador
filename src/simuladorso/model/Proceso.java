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
    private int tamProceso;
    private int tiempoArribo;
    private List<Integer> rafaga;
    private int indice;
    enum Prioridad implements Comparable<Prioridad>{
        ALTA,MEDIA,BAJA;
    }
    private String prioridad;
    private Prioridad prioridadd;
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
        System.out.println("Ingrese la prioridad: ");
        this.prioridad = teclado.next();
        switch(prioridad){
            case "BAJA": this.prioridadd = Prioridad.BAJA;
                         break;
            case "MEDIA": this.prioridadd = Prioridad.MEDIA;
                         break;
            case "ALTA": this.prioridadd = Prioridad.ALTA;
                         break;           
        }
        this.estadoProceso = "nuevo";
    }
    
    public String getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(String estadoProceso) {
        this.estadoProceso = estadoProceso;
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
        Proceso pro1,pro2,pro3,pro4,pro5;
        List<Proceso> lista;
        Integer[] a1 = {2 ,1 ,2};
        Integer[] a2 = {1, 1, 1};
        Integer[] a3 = {3, 2, 1}; 
        pro1 = new Proceso(10,0, a1);
        pro2 = new Proceso(5,1,a2);
        pro3 = new Proceso(60,3,a3);
        pro4 = new Proceso (23,3,a2);
        pro5 = new Proceso (45,2,a3);
        lista = new ArrayList<Proceso>();
        lista.add(pro1);
        lista.add(pro2);
        lista.add(pro3);
        lista.add(pro4);
        lista.add(pro5);
        System.out.println(lista);
        //System.out.println("P1 :"+pro1.getPrioridadd());
        Collections.sort(lista);
        System.out.println(lista);
    }
        
}
