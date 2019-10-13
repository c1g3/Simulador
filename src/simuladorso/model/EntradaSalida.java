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
public class EntradaSalida {
    private Proceso proceso;
    private int timer;
    
    public EntradaSalida(){
        proceso = null;
        timer = 0;
    }
    
    public void setProceso(Proceso proceso){
        this.proceso = proceso;
    }
    
    public Proceso getProceso(){
        return proceso;
    }
    
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
        this.proceso = null;
    }
    
    public void ejecutar(){
        timer--;
    }
}
