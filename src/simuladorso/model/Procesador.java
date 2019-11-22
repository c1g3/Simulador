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
    private int timer; //Descontador que sirve calcular el tiempo remanente del proceso en ejecucion
    private int originalTimer; //Contador que cuenta el tiempo de ejecucion de un proceso. Se necesita en otra parte.
    
    public Procesador(){
        procesoEnEjecucion = null;
        timer = 0;
        originalTimer = 0;
    }
    
    public void setProceso(Proceso proceso){
        this.procesoEnEjecucion = proceso;
    }
    
    public Proceso getProceso(){
        return procesoEnEjecucion;
    }
    
    //retorna Verdadero si no hay proceso en ejecucion. Falso en caso contrario.
    public Boolean procesoIsNull(){ 
        return this.procesoEnEjecucion==null;
    }
    
    //retorna Falso si no hay proceso en ejecucion. Verdadero en caso contrario.
    public Boolean procesoIsNotNull(){
        if(this.procesoEnEjecucion==null){
            return false;
        }else{return true;}
    }
    
    //Inicializamos el timer con el quantum/rafaga de cpu.
    public void setTimer(int tiempo){
        this.timer = tiempo;
        this.originalTimer = 0;
    }
    
    public int getTimer(){
        return this.timer;
    }
    
    //Retorna Verdadero si el proceso termino su ejecucion. Falso en caso contrario.
    public Boolean timeout(){
        return this.timer == 0;
    }
    
    //Remueve el proceso en ejecucion.
    public void removeProceso(){
        this.procesoEnEjecucion = null;
    }
    
    //"Ejecuta" el proceso decrementando su tiempo de ejecucion. 
    public void ejecutar(){
        timer--;
        originalTimer++;
        //Incrementa el tiempo de retorno.
        procesoEnEjecucion.incTiempoRetorno(); 
    }
    
    public int getOriginalTimer(){
        return this.originalTimer;
    }
}
