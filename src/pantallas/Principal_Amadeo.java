package pantallas;

import simuladorso.model.Memoria;

/**
 *
 * @author erick
 */
public class Principal_Amadeo extends javax.swing.JFrame {

    private Memoria memoria;
    DatosPantallaMemoria datosPantallaMemoria = new DatosPantallaMemoria();
    DatosPantallaProcesos datosPantallaProcesos = new DatosPantallaProcesos();
    
    
    
    public Principal_Amadeo() {
        initComponents();
        setTitle("Simulador SO");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanelTabs = new javax.swing.JTabbedPane();
        jPanelMemoria = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panel_particiones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_configuracionMemoria = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tamMemoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_tamparticion = new javax.swing.JLabel();
        tamParticion = new javax.swing.JTextField();
        btn_addParticion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        radiobtn_variables = new javax.swing.JRadioButton();
        radiobtn_fijas = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        radiobtn_firstfit = new javax.swing.JRadioButton();
        radiobtn_bestfit = new javax.swing.JRadioButton();
        radiobtn_worstfit = new javax.swing.JRadioButton();
        okTamMemoria = new javax.swing.JButton();
        btnRUN = new javax.swing.JButton();
        panej_gantt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelAlgoritmos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        radioBtn_fcfs = new javax.swing.JRadioButton();
        radioBtn_roundRobin = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        radioBtn_Prioridades = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textField_QuantumColaBaja = new javax.swing.JTextField();
        textField_QuantumColaMedia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textField_QuantumColaAlta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        radioBtn_colasMultinivel = new javax.swing.JRadioButton();
        jRadioBtn_SJF = new javax.swing.JRadioButton();
        jPanelProcesos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tamanioProceso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tiempoArribo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cicloDeVida = new javax.swing.JTextField();
        prioridad = new javax.swing.JTextField();
        addProceso = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_file = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(876, 567));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel6.setFont(new java.awt.Font("Garuda", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Particiones");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panel_particionesLayout = new javax.swing.GroupLayout(panel_particiones);
        panel_particiones.setLayout(panel_particionesLayout);
        panel_particionesLayout.setHorizontalGroup(
            panel_particionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
            .addGroup(panel_particionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_particionesLayout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        panel_particionesLayout.setVerticalGroup(
            panel_particionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panel_particionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_particionesLayout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_particiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_particiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_configuracionMemoria.setBackground(new java.awt.Color(102, 102, 102));
        panel_configuracionMemoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Tamaño de memoria:");

        tamMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamMemoriaActionPerformed(evt);
            }
        });
        tamMemoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tamMemoriaKeyTyped(evt);
            }
        });

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("KB");

        jLabel_tamparticion.setForeground(java.awt.Color.white);
        jLabel_tamparticion.setText("Tamaño de particion:");

        tamParticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamParticionActionPerformed(evt);
            }
        });
        tamParticion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tamParticionKeyTyped(evt);
            }
        });

        btn_addParticion.setForeground(java.awt.Color.black);
        btn_addParticion.setText("Agregar");
        btn_addParticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addParticionActionPerformed(evt);
            }
        });

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Tipo de particionamiento:");

        buttonGroup1.add(radiobtn_variables);
        radiobtn_variables.setForeground(java.awt.Color.white);
        radiobtn_variables.setText("Variables");
        radiobtn_variables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_variablesActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobtn_fijas);
        radiobtn_fijas.setForeground(new java.awt.Color(255, 255, 255));
        radiobtn_fijas.setText("Fijas");
        radiobtn_fijas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radiobtn_fijas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_fijasActionPerformed(evt);
            }
        });

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Algoritmo de Intercambio:");

        buttonGroup2.add(radiobtn_firstfit);
        radiobtn_firstfit.setForeground(java.awt.Color.white);
        radiobtn_firstfit.setText("First-Fit");
        radiobtn_firstfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_firstfitActionPerformed(evt);
            }
        });

        buttonGroup2.add(radiobtn_bestfit);
        radiobtn_bestfit.setForeground(java.awt.Color.white);
        radiobtn_bestfit.setText("Best-Fit");

        buttonGroup2.add(radiobtn_worstfit);
        radiobtn_worstfit.setForeground(java.awt.Color.white);
        radiobtn_worstfit.setText("Worst-Fit");

        okTamMemoria.setText("OK");
        okTamMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okTamMemoriaActionPerformed(evt);
            }
        });

        btnRUN.setText("RUN");
        btnRUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRUNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_configuracionMemoriaLayout = new javax.swing.GroupLayout(panel_configuracionMemoria);
        panel_configuracionMemoria.setLayout(panel_configuracionMemoriaLayout);
        panel_configuracionMemoriaLayout.setHorizontalGroup(
            panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                        .addComponent(radiobtn_variables)
                        .addGap(18, 18, 18)
                        .addComponent(radiobtn_fijas))
                    .addComponent(radiobtn_worstfit)
                    .addComponent(jLabel5)
                    .addComponent(radiobtn_firstfit)
                    .addComponent(radiobtn_bestfit)
                    .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                        .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_tamparticion)
                            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tamMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(tamParticion))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(okTamMemoria))
                            .addComponent(btn_addParticion))))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_configuracionMemoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRUN)
                .addGap(57, 57, 57))
        );
        panel_configuracionMemoriaLayout.setVerticalGroup(
            panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tamMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(okTamMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addParticion)
                    .addComponent(jLabel_tamparticion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tamParticion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtn_variables)
                    .addComponent(radiobtn_fijas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobtn_firstfit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobtn_bestfit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobtn_worstfit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRUN)
                .addGap(30, 30, 30))
        );

        panej_gantt.setBackground(new java.awt.Color(102, 102, 102));
        panej_gantt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        javax.swing.GroupLayout panej_ganttLayout = new javax.swing.GroupLayout(panej_gantt);
        panej_gantt.setLayout(panej_ganttLayout);
        panej_ganttLayout.setHorizontalGroup(
            panej_ganttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panej_ganttLayout.setVerticalGroup(
            panej_ganttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel1.setText("Diagrama de Gantt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_configuracionMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panej_gantt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_configuracionMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panej_gantt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMemoriaLayout = new javax.swing.GroupLayout(jPanelMemoria);
        jPanelMemoria.setLayout(jPanelMemoriaLayout);
        jPanelMemoriaLayout.setHorizontalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMemoriaLayout.setVerticalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTabs.addTab("Memoria", jPanelMemoria);

        jLabel7.setText("Algoritmos de planificacion");

        buttonGroup1.add(radioBtn_fcfs);
        radioBtn_fcfs.setText("First-Come,First-Served (FCFS)");
        radioBtn_fcfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn_fcfsActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtn_roundRobin);
        radioBtn_roundRobin.setText("Round Robin");

        jLabel8.setText("Quantum");

        buttonGroup1.add(radioBtn_Prioridades);
        radioBtn_Prioridades.setText("Prioridades");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel11.setText("Quantum:");

        textField_QuantumColaBaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_QuantumColaBajaKeyTyped(evt);
            }
        });

        textField_QuantumColaMedia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_QuantumColaMediaKeyTyped(evt);
            }
        });

        jLabel12.setText("Quantum:");

        jLabel13.setText("Cola de prioridad baja:");

        jLabel14.setText("Quantum:");

        textField_QuantumColaAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_QuantumColaAltaKeyTyped(evt);
            }
        });

        jLabel15.setText("Cola de prioridad media:");

        jLabel16.setText("Cola de prioridad alta:");

        buttonGroup1.add(radioBtn_colasMultinivel);
        radioBtn_colasMultinivel.setText("Colas multinivel");

        buttonGroup1.add(jRadioBtn_SJF);
        jRadioBtn_SJF.setText("SJF");

        javax.swing.GroupLayout jPanelAlgoritmosLayout = new javax.swing.GroupLayout(jPanelAlgoritmos);
        jPanelAlgoritmos.setLayout(jPanelAlgoritmosLayout);
        jPanelAlgoritmosLayout.setHorizontalGroup(
            jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                .addComponent(radioBtn_roundRobin)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radioBtn_fcfs)
                            .addComponent(radioBtn_Prioridades)
                            .addComponent(radioBtn_colasMultinivel)
                            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel13))
                                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField_QuantumColaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField_QuantumColaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textField_QuantumColaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jRadioBtn_SJF)))
                    .addComponent(jLabel7))
                .addContainerGap(823, Short.MAX_VALUE))
        );
        jPanelAlgoritmosLayout.setVerticalGroup(
            jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtn_fcfs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtn_roundRobin)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtn_Prioridades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtn_colasMultinivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(textField_QuantumColaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(textField_QuantumColaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(textField_QuantumColaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jRadioBtn_SJF)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jPanelTabs.addTab("Algoritmos", jPanelAlgoritmos);

        jLabel9.setText("Tamaño de Proceso: ");

        tamanioProceso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tamanioProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanioProcesoActionPerformed(evt);
            }
        });
        tamanioProceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tamanioProcesoKeyTyped(evt);
            }
        });

        jLabel10.setText("Tiempo de Arribo:");

        tiempoArribo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tiempoArribo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoArriboActionPerformed(evt);
            }
        });
        tiempoArribo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tiempoArriboKeyTyped(evt);
            }
        });

        jLabel17.setText("Ciclo de vida:");

        jLabel18.setText("Prioridad:");

        cicloDeVida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cicloDeVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cicloDeVidaActionPerformed(evt);
            }
        });
        cicloDeVida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cicloDeVidaKeyTyped(evt);
            }
        });

        prioridad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadActionPerformed(evt);
            }
        });
        prioridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prioridadKeyTyped(evt);
            }
        });

        addProceso.setText("AGREGAR PROCESO");
        addProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProcesoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procesos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DialogInput", 1, 14))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelProcesosLayout = new javax.swing.GroupLayout(jPanelProcesos);
        jPanelProcesos.setLayout(jPanelProcesosLayout);
        jPanelProcesosLayout.setHorizontalGroup(
            jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addGroup(jPanelProcesosLayout.createSequentialGroup()
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cicloDeVida)
                            .addComponent(tamanioProceso)
                            .addComponent(tiempoArribo)
                            .addComponent(prioridad))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProcesosLayout.setVerticalGroup(
            jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProcesosLayout.createSequentialGroup()
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tamanioProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tiempoArribo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cicloDeVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addProceso))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanelTabs.addTab("Procesos", jPanelProcesos);

        jMenuBar1.setToolTipText("");

        jMenu_file.setText("Archivo");
        jMenuBar1.add(jMenu_file);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tamMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamMemoriaActionPerformed

    }//GEN-LAST:event_tamMemoriaActionPerformed
    
    private void btn_addParticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addParticionActionPerformed
         
    }//GEN-LAST:event_btn_addParticionActionPerformed

    private void radiobtn_variablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_variablesActionPerformed
        
    }//GEN-LAST:event_radiobtn_variablesActionPerformed

    private void radiobtn_fijasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_fijasActionPerformed
        ;
    }//GEN-LAST:event_radiobtn_fijasActionPerformed

    private void radiobtn_firstfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_firstfitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtn_firstfitActionPerformed

    private void tamParticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamParticionActionPerformed
        
    }//GEN-LAST:event_tamParticionActionPerformed

    private void radioBtn_fcfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn_fcfsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtn_fcfsActionPerformed

    private void tamMemoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamMemoriaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
        
    }//GEN-LAST:event_tamMemoriaKeyTyped

    private void tamParticionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamParticionKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_tamParticionKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void textField_QuantumColaAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_QuantumColaAltaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textField_QuantumColaAltaKeyTyped

    private void textField_QuantumColaMediaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_QuantumColaMediaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textField_QuantumColaMediaKeyTyped

    private void textField_QuantumColaBajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_QuantumColaBajaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textField_QuantumColaBajaKeyTyped

    private void tamanioProcesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamanioProcesoKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_tamanioProcesoKeyTyped

    private void tiempoArriboKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempoArriboKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_tiempoArriboKeyTyped

    private void cicloDeVidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cicloDeVidaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cicloDeVidaKeyTyped

    private void prioridadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prioridadKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_prioridadKeyTyped

    private void okTamMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okTamMemoriaActionPerformed
        datosPantallaMemoria.setTamMemoria();
        datosPantallaMemoria.mostrarDatos();
    }//GEN-LAST:event_okTamMemoriaActionPerformed

    private void btnRUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRUNActionPerformed
        datosPantallaMemoria.setBtnRUN();
        
    }//GEN-LAST:event_btnRUNActionPerformed

    private void tamanioProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanioProcesoActionPerformed
        
    }//GEN-LAST:event_tamanioProcesoActionPerformed

    private void addProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProcesoActionPerformed
       datosPantallaProcesos.setTamProceso();
       datosPantallaProcesos.setTiempoArribo();
        datosPantallaProcesos.setCicloDeVida();
         datosPantallaProcesos.setPrioridad();
         datosPantallaProcesos.addProcesoColaListo();
         
    }//GEN-LAST:event_addProcesoActionPerformed

    private void tiempoArriboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoArriboActionPerformed
        
    }//GEN-LAST:event_tiempoArriboActionPerformed

    private void cicloDeVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cicloDeVidaActionPerformed
       
    }//GEN-LAST:event_cicloDeVidaActionPerformed

    private void prioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadActionPerformed
       
    }//GEN-LAST:event_prioridadActionPerformed


    
//*************************************************************************    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton addProceso;
    private javax.swing.JButton btnRUN;
    public static javax.swing.JButton btn_addParticion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    public static javax.swing.JTextField cicloDeVida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_tamparticion;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_file;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAlgoritmos;
    private javax.swing.JPanel jPanelMemoria;
    private javax.swing.JPanel jPanelProcesos;
    private javax.swing.JTabbedPane jPanelTabs;
    private javax.swing.JRadioButton jRadioBtn_SJF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JButton okTamMemoria;
    private javax.swing.JPanel panej_gantt;
    private javax.swing.JPanel panel_configuracionMemoria;
    private javax.swing.JPanel panel_particiones;
    public static javax.swing.JTextField prioridad;
    private javax.swing.JRadioButton radioBtn_Prioridades;
    private javax.swing.JRadioButton radioBtn_colasMultinivel;
    private javax.swing.JRadioButton radioBtn_fcfs;
    private javax.swing.JRadioButton radioBtn_roundRobin;
    public static javax.swing.JRadioButton radiobtn_bestfit;
    public static javax.swing.JRadioButton radiobtn_fijas;
    public static javax.swing.JRadioButton radiobtn_firstfit;
    public static javax.swing.JRadioButton radiobtn_variables;
    public static javax.swing.JRadioButton radiobtn_worstfit;
    public static javax.swing.JTextField tamMemoria;
    public static javax.swing.JTextField tamParticion;
    public static javax.swing.JTextField tamanioProceso;
    private javax.swing.JTextField textField_QuantumColaAlta;
    private javax.swing.JTextField textField_QuantumColaBaja;
    private javax.swing.JTextField textField_QuantumColaMedia;
    public static javax.swing.JTextField tiempoArribo;
    // End of variables declaration//GEN-END:variables
}
