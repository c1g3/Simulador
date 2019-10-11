/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso.model;

/**
 *
 * @author Juan
 */
public class Procesador {
    private Proceso procesoEnEjecucion;
    private int timer;
    
    public Procesador(){
        procesoEnEjecucion = null;
        timer = 0;
    }
    
    public void setProceso(Proceso proceso){
        this.procesoEnEjecucion = proceso;
    }
    
    public Proceso getProceso(){
        return procesoEnEjecucion;
    }
    
     public Boolean procesoIsNull(){
        if(this.procesoEnEjecucion==null){
            return true;
        }else{return false;}
    }
    
    public Boolean procesoIsNotNull(){
        if(this.procesoEnEjecucion==null){
            return false;
        }else{return true;}
    }
    
    public void setTimer(int tiempo){
        this.timer = tiempo;
    }
    
    public Boolean timeout(){
        if (this.timer == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void removeProceso(){
        this.procesoEnEjecucion = null;
    }
    
    public void ejecutar(){
        timer--;
    }
}
