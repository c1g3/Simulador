package pantallas;

import java.awt.event.KeyEvent;
import simuladorso.model.Memoria;

public class Memory extends javax.swing.JFrame {

    private Memoria memoria;

    public Memory() {       
        initComponents();
        botones_part.add(btnMemoriaFijas);
        botones_part.add(btnMVariable);
        botones_algo.add(btnFirstFit);
        botones_algo.add(btnBestFit);
        botones_algo.add(btnWorstFit);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones_part = new javax.swing.ButtonGroup();
        botones_algo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        boton_procesos = new javax.swing.JButton();
        boton_algoritmos = new javax.swing.JButton();
        boton_memoria = new javax.swing.JButton();
        boton_simular = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        inputTamMemoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMemoriaFijas = new javax.swing.JRadioButton();
        btnMVariable = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnFirstFit = new javax.swing.JRadioButton();
        btnBestFit = new javax.swing.JRadioButton();
        btnWorstFit = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        panel_particiones = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_TamParticion = new javax.swing.JLabel();
        inputTamParticion = new javax.swing.JTextField();
        jButton_agregarParticion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_procesos.setText("PROCESOS");

        boton_algoritmos.setText("ALGORITMOS");
        boton_algoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_algoritmosActionPerformed(evt);
            }
        });

        boton_memoria.setText("MEMORIA");

        boton_simular.setText("SIMULAR");

        jLabel1.setText("Tamaño de memoria:");

        inputTamMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTamMemoriaActionPerformed(evt);
            }
        });
        inputTamMemoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputTamMemoriaKeyTyped(evt);
            }
        });

        jLabel2.setText("KB");

        jLabel3.setText("Tipo de particionamiento:");

        btnMemoriaFijas.setText("Fijas");
        btnMemoriaFijas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoriaFijasActionPerformed(evt);
            }
        });

        btnMVariable.setText("Variables");
        btnMVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMVariableActionPerformed(evt);
            }
        });

        jLabel4.setText("Algoritmo de Intercambio:");

        btnFirstFit.setText("First-Fit");
        btnFirstFit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstFitActionPerformed(evt);
            }
        });

        btnBestFit.setText("Best-Fit");

        btnWorstFit.setText("Worst-Fit");

        jLabel6.setText("PARTICIONES");

        javax.swing.GroupLayout panel_particionesLayout = new javax.swing.GroupLayout(panel_particiones);
        panel_particiones.setLayout(panel_particionesLayout);
        panel_particionesLayout.setHorizontalGroup(
            panel_particionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_particionesLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel6)
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_particionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_particionesLayout.setVerticalGroup(
            panel_particionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_particionesLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("MEMORIA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jLabel_TamParticion.setText("Tamaño de particion:");

        inputTamParticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTamParticionActionPerformed(evt);
            }
        });
        inputTamParticion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputTamParticionKeyTyped(evt);
            }
        });

        jButton_agregarParticion.setText("Agregar");
        jButton_agregarParticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarParticionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnFirstFit)
                            .addComponent(btnBestFit)
                            .addComponent(btnWorstFit)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputTamMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMVariable)
                                .addGap(18, 18, 18)
                                .addComponent(btnMemoriaFijas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_TamParticion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputTamParticion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_agregarParticion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_particiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_memoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_procesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_algoritmos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_simular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_procesos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_algoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_simular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(inputTamMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_TamParticion)
                            .addComponent(inputTamParticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_agregarParticion))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMVariable)
                            .addComponent(btnMemoriaFijas))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFirstFit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBestFit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnWorstFit))
                    .addComponent(panel_particiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //cabecera***********************************************************
    private void boton_algoritmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_algoritmosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_algoritmosActionPerformed

    private void inputTamMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamMemoriaActionPerformed
        
    }//GEN-LAST:event_inputTamMemoriaActionPerformed

    private void btnMemoriaFijasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoriaFijasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMemoriaFijasActionPerformed

    private void btnMVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMVariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMVariableActionPerformed

    private void btnFirstFitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstFitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstFitActionPerformed

    private void inputTamMemoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTamMemoriaKeyTyped
        this.memoria = new Memoria (Integer.parseInt(evt.paramString()));
       
    }//GEN-LAST:event_inputTamMemoriaKeyTyped

    private void inputTamParticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamParticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTamParticionActionPerformed

    private void inputTamParticionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTamParticionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTamParticionKeyTyped

    private void jButton_agregarParticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarParticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_agregarParticionActionPerformed
//*********************************************************************
    
    private int setTamMemoria(int tamMemoria){
        return tamMemoria;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memory().setVisible(true);
            }
        });
    }
    
    //Variables definidas por los desarrolladores
    
    private int tamMemoria;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_algoritmos;
    private javax.swing.JButton boton_memoria;
    private javax.swing.JButton boton_procesos;
    private javax.swing.JButton boton_simular;
    private javax.swing.ButtonGroup botones_algo;
    private javax.swing.ButtonGroup botones_part;
    private javax.swing.JRadioButton btnBestFit;
    private javax.swing.JRadioButton btnFirstFit;
    private javax.swing.JRadioButton btnMVariable;
    private javax.swing.JRadioButton btnMemoriaFijas;
    private javax.swing.JRadioButton btnWorstFit;
    private javax.swing.JTextField inputTamMemoria;
    private javax.swing.JTextField inputTamParticion;
    private javax.swing.JButton jButton_agregarParticion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_TamParticion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panel_particiones;
    // End of variables declaration//GEN-END:variables
}
