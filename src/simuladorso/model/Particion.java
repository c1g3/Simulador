 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso.model;
import java.util.Scanner;
//import java.util.Comparator;
/**
 *
 * @author Amadeo
 */
public class Particion implements Comparable<Particion>{
    private Scanner teclado;
    private int idParticion;
    private int tamParticion; //Tamaño de la particion.
    private int direccionInicial;
    private boolean estado; //false=libre true=asignada
    private Proceso proceso;
    private int fragmentacionInterna;
    static int cont = 1;
    
    //La particion necesita tamaño y direccion inicial.
    public Particion(int tamParticion, int direccionInicial){
        teclado = new Scanner(System.in);
        this.idParticion = cont;
        cont = cont + 1;
        this.tamParticion = tamParticion;
        this.direccionInicial = direccionInicial;
        this.estado = false;
        this.proceso = null;    
        this.fragmentacionInterna = 0;
    }
    
    //Metodos Necesarios para la coneccion de las pantallas
    public int getDireccionInicial(){    
        return direccionInicial;
    }

    
    //=================================
    //retorna Verdadero si no hay proceso en la particion. Falso en caso contrario.
    public Boolean procesoIsNull() {
        return this.proceso==null;
    }
    
    //retorna Falso si no hay proceso en la particion. Verdadero en caso contrario.
    public Boolean procesoIsNotNull(){
        if(this.proceso==null){
            return false;
        }else{return true;}
    }
    
    @Override
    public int compareTo(Particion particion) {
        if (tamParticion < particion.tamParticion) {
            return -1;
        }
        if (tamParticion > particion.tamParticion) {
            return 1;
        }
        return 0;
    }  
    
    //Carga el proceso en la particion.
    public void addProceso(Proceso proceso) {
        this.proceso = proceso;
        this.calcularFragmentacion(proceso);
    }

    //Calcula la fragmentacion interna.
    public void calcularFragmentacion(Proceso proceso){
        this.fragmentacionInterna = this.tamParticion - proceso.getTamProceso();
    }
    
    //Remueve el proceso de la particion.
    public void removeProceso() {
        this.proceso = null;
    }

    public Proceso getProceso() {
        return this.proceso;
    }

    public Integer getIdParticion() {
        return idParticion;
    }

    public Integer getTamParticion() {
        return tamParticion;
    }

    public void setIdParticion(Integer idParticion) {
        this.idParticion = idParticion;
    }

    public void setTamParticion(Integer tamParticion) {
        this.tamParticion = tamParticion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
