package pantallas;

import simuladorso.model.ColaListo;
import simuladorso.model.Proceso;

public class DatosPantallaProcesos {
    
    private int tamProceso=0;
    private int tiempoArribo=0;
    private String cicloDeVida = "";
    private String prioridad = "baja";
    private ColaListo colaListo = new ColaListo();
    
    
    public DatosPantallaProcesos(){}

    public int getTamProceso() {
        return tamProceso;
    }

    public void setTamProceso() {
        this.tamProceso = Integer.parseInt(Principal_Amadeo.tamanioProceso.getText());
    }

    public int getTiempoArribo() {
        return tiempoArribo;
    }

    public void setTiempoArribo() {
        this.tiempoArribo =  Integer.parseInt(Principal_Amadeo.tiempoArribo.getText());
    }

    public String getCicloDeVida() {
        return cicloDeVida;
    }

    public void setCicloDeVida() {
        this.cicloDeVida = Principal_Amadeo.cicloDeVida.getText();
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad() {
        this.prioridad = Principal_Amadeo.prioridad.getText();
    }
    
    public void addProcesoColaListo(){
        Proceso proceso = new Proceso(getTamProceso(), getTiempoArribo(),getPrioridad());
        this.colaListo.addProceso(proceso);
    }
    
    public ColaListo getColaListo(){
        return this.colaListo;
    }
    
    
    
    
    
}
