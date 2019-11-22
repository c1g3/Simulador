package pantallas;

import javax.swing.JOptionPane;

public class DatosPantallaMemoria {

    private int tamMemoria = 0;
    private int tamParticion = 0;
    private boolean partVariable = false;
    private boolean partFija = false;
    private boolean firstFit = false;
    private boolean worstFit = false;
    private boolean bestFit = false;
    private boolean btnRUN = true; // me indica que ya no se pueden ingresar mas particiones a la memoria

    public DatosPantallaMemoria() {

    }

    public boolean isBtnRUN() {
        return btnRUN;
    }

    public void setBtnRUN() {
        this.btnRUN = false;
    }

    public void setTamMemoria() {
        //Realizar control Memoria o inicialización de la memoria
        this.tamMemoria = Integer.parseInt(Principal_Amadeo.tamMemoria.getText());
    }

    public int getTamMemoria() {
        return tamMemoria;
    }

    public boolean isPartFija() {
        return partFija;
    }
    

    public void setTamParticion() {
        this.tamParticion = Integer.parseInt(Principal_Amadeo.tamParticion.getText());
    }

    public int getTamParticion() {
        return tamParticion;
    }
    

    public void setTipoParticion() {
        if (Principal_Amadeo.radiobtn_variables.isSelected()) {
            this.partVariable = true;
        }
        if (Principal_Amadeo.radiobtn_fijas.isSelected()) {
            this.partFija = true;
        }

    }
    
    public void setAlgoritmoDeIntercambio() {
        if (Principal_Amadeo.radiobtn_firstfit.isSelected()) {
            this.firstFit = true;
        }
        if (Principal_Amadeo.radiobtn_bestfit.isSelected()) {
            this.bestFit = true;
        }
        if (Principal_Amadeo.radiobtn_worstfit.isSelected()) {
            this.worstFit = true;
        }
        
    }

    public boolean isFirstFit() {
        return firstFit;
    }

    public boolean isWorstFit() {
        return worstFit;
    }

    public boolean isBestFit() {
        return bestFit;
    }
    
    

    public void mostrarDatos() {

        JOptionPane.showMessageDialog(null, "Tamaño memoria " + tamMemoria, "mensaje", JOptionPane.PLAIN_MESSAGE);
    }
}
