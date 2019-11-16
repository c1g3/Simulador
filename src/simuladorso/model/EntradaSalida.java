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
    private int timer; //tiempo para controlar la ejecucion de entrada/salida.
    
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
    
    //retorna Verdadero si no hay proceso en la entrada/salida. Falso en caso contrario.
    public Boolean procesoIsNull(){
        return this.proceso==null;
    }
    
    //retorna Falso si no hay proceso en la entrada/salida. Verdadero en caso contrario.
    public Boolean procesoIsNotNull(){
        if(this.proceso==null){
            return false;
        }else{return true;}
    }
    
    public void setTimer(int tiempo){
        this.timer = tiempo;
    }
    
    //Retorna Verdadero si el proceso termino su entrada/saldia. Falso en caso contrario.
    public Boolean timeout(){
        return this.timer == 0;
    }
    
    //Remueve el proceso de entrada/salida.
    public void removeProceso(){
        this.proceso = null;
    }
    
    //"Ejecuta" la entrada salida de un proceso.
    public void ejecutar(){
        timer--;
        proceso.incTiempoRetorno(); //Incrementa el tiempo de retorno.
    }
}
