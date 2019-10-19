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
    private int tamParticion;
    private int direccionInicial;
    private boolean estado;//false=libre true=asignada
    private Proceso proceso;
    private int fragmentacionInterna;
    static int cont = 1;
 
 //-----------constructores

    public Particion(int tamParticion, int direccionInicial){
        teclado = new Scanner(System.in);
        this.idParticion = cont;
        cont = cont + 1;
        this.tamParticion = tamParticion;
        this.direccionInicial = direccionInicial;
        this.estado = false;
        this.proceso = null;       
    }
    public Particion(Integer tamParticion, Integer direccionInicial) {
        this.estado = true;
        this.tamParticion = tamParticion;
        this.direccionInicial = direccionInicial;
    }

    public Particion(Integer tamParticion) {
        this.tamParticion = tamParticion;
        this.estado = true;
        this.proceso=null;
    }

//******************************    
    
    public Boolean procesoIsNull(){
        if(this.proceso==null){
            return true;
        }else{return false;}
    }
    
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
    
     public void addProceso(Proceso proceso) {
        this.proceso = proceso;
        this.estado = true;
    }

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
