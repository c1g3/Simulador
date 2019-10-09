/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorso.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Juan
 */
public class ColaListo {
    private List<Proceso> listProceso;

    public ColaListo() {
        this.listProceso = new ArrayList<Proceso>();
    }

    public void cargarProceso(int idProceso, Integer tamProceso, Integer tiempoArribo) {
        Proceso proceso = new Proceso();
        this.listProceso.add(proceso);
    }

    public void addProceso(Proceso proceso) {
        this.listProceso.add(proceso);
    }
    
    public List<Proceso> getListProceso() {
        return listProceso;
    }
    
    
    public Proceso getProceso(int index) {
        if(index>this.listProceso.size()){
            return this.listProceso.get(this.listProceso.size()-1);
        }else{
        return this.listProceso.get(index);
        }
    }
    
    public Boolean isEmpty() {
        return this.listProceso.isEmpty();
    }
    
    public int cantidadProcesos(){
        return this.listProceso.size();
    }
}
