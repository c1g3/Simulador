package pantallas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import simuladorso.model.Memoria;

public class Principal extends javax.swing.JFrame {
    private Memoria memoria;
    private int contadorParticion;
    private DefaultTableModel modelParticion = new DefaultTableModel();
    private int contadorMemoriaOK;
    
    public Principal() {
        initComponents();
        setTitle("Simulador SO");
        this.contadorMemoriaOK=0;
        this.contadorParticion = 0;
        this.modelParticion.addColumn("dir Inicial");
        this.modelParticion.addColumn("tamParticon");
        this.tablaParticiones.setModel(modelParticion);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanelTabs = new javax.swing.JTabbedPane();
        jPanelMemoria = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaParticiones = new javax.swing.JTable();
        showMemoriaLibre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panel_configuracionMemoria = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputTamMemoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_tamparticion = new javax.swing.JLabel();
        inputTamParticion = new javax.swing.JTextField();
        btn_addParticion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        radiobtn_variables = new javax.swing.JRadioButton();
        radiobtn_fijas = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        radiobtn_firstfit = new javax.swing.JRadioButton();
        radiobtn_bestfit = new javax.swing.JRadioButton();
        radiobtn_worstfit = new javax.swing.JRadioButton();
        MemoriaLista = new javax.swing.JButton();
        panej_gantt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelAlgoritmos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        radioBtn_fcfs = new javax.swing.JRadioButton();
        radioBtn_roundRobin = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        radioBtn_Prioridades = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        textField_QuantumColaMedia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textField_QuantumColaAlta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        radioBtn_colasMultinivel = new javax.swing.JRadioButton();
        jRadiobtn_sjf = new javax.swing.JRadioButton();
        jPanelProcesos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_procesos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Archivo = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(876, 567));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel6.setFont(new java.awt.Font("Garuda", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Particiones");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablaParticiones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaParticiones);

        jLabel9.setText("Memoria Libre:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showMemoriaLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showMemoriaLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        panel_configuracionMemoria.setBackground(new java.awt.Color(102, 102, 102));
        panel_configuracionMemoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Tamaño de memoria:");

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

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("KB");

        jLabel_tamparticion.setForeground(java.awt.Color.white);
        jLabel_tamparticion.setText("Tamaño de particion:");

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

        btn_addParticion.setForeground(java.awt.Color.black);
        btn_addParticion.setText("Agregar");
        btn_addParticion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addParticionMouseClicked(evt);
            }
        });
        btn_addParticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addParticionActionPerformed(evt);
            }
        });
        btn_addParticion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_addParticionKeyTyped(evt);
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

        MemoriaLista.setText("MemoriaOK");
        MemoriaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemoriaListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_configuracionMemoriaLayout = new javax.swing.GroupLayout(panel_configuracionMemoria);
        panel_configuracionMemoria.setLayout(panel_configuracionMemoriaLayout);
        panel_configuracionMemoriaLayout.setHorizontalGroup(
            panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiobtn_worstfit)
                    .addComponent(radiobtn_bestfit)
                    .addComponent(jLabel4)
                    .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                        .addComponent(radiobtn_variables)
                        .addGap(18, 18, 18)
                        .addComponent(radiobtn_fijas))
                    .addComponent(jLabel5)
                    .addComponent(radiobtn_firstfit)
                    .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                        .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_tamparticion)
                            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputTamParticion, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(inputTamMemoria))))
                        .addGap(18, 18, 18)
                        .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MemoriaLista))
                            .addComponent(btn_addParticion))))
                .addGap(18, 18, Short.MAX_VALUE))
        );
        panel_configuracionMemoriaLayout.setVerticalGroup(
            panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputTamMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(MemoriaLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_tamparticion)
                    .addComponent(btn_addParticion)
                    .addComponent(inputTamParticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(panel_configuracionMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panej_gantt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_configuracionMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 294, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panej_gantt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMemoriaLayout = new javax.swing.GroupLayout(jPanelMemoria);
        jPanelMemoria.setLayout(jPanelMemoriaLayout);
        jPanelMemoriaLayout.setHorizontalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanelMemoriaLayout.setVerticalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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
        radioBtn_Prioridades.setText("Prioridades (cooperativo)");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        textField_QuantumColaMedia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_QuantumColaMediaKeyTyped(evt);
            }
        });

        jLabel12.setText("Quantum:");

        jLabel13.setText("Cola de prioridad baja: (FCFS)");

        jLabel14.setText("Quantum:");

        textField_QuantumColaAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField_QuantumColaAltaKeyTyped(evt);
            }
        });

        jLabel15.setText("Cola de prioridad media: (Round Robin)");

        jLabel16.setText("Cola de prioridad alta: (Round Robin)");

        buttonGroup1.add(radioBtn_colasMultinivel);
        radioBtn_colasMultinivel.setText("Colas multinivel");

        buttonGroup1.add(jRadiobtn_sjf);
        jRadiobtn_sjf.setText("SJF");

        javax.swing.GroupLayout jPanelAlgoritmosLayout = new javax.swing.GroupLayout(jPanelAlgoritmos);
        jPanelAlgoritmos.setLayout(jPanelAlgoritmosLayout);
        jPanelAlgoritmosLayout.setHorizontalGroup(
            jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(548, 548, 548))
                    .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtn_roundRobin)
                            .addComponent(radioBtn_fcfs)
                            .addComponent(radioBtn_Prioridades)
                            .addComponent(jRadiobtn_sjf)
                            .addComponent(radioBtn_colasMultinivel)
                            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                        .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField_QuantumColaMedia))
                                            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField_QuantumColaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 533, Short.MAX_VALUE))))
        );
        jPanelAlgoritmosLayout.setVerticalGroup(
            jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtn_fcfs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtn_roundRobin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtn_Prioridades)
                .addGap(18, 18, 18)
                .addComponent(jRadiobtn_sjf)
                .addGap(18, 18, 18)
                .addComponent(radioBtn_colasMultinivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(textField_QuantumColaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlgoritmosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel15))
                    .addGroup(jPanelAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(textField_QuantumColaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jLabel13)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jPanelTabs.addTab("Algoritmos", jPanelAlgoritmos);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton2.setText("ELIMINAR -");
        jPanel4.add(jButton2);

        jButton3.setText("AGREGAR +");
        jPanel4.add(jButton3);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        tabla_procesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), null, null, null, null},
                { new Integer(2), null, null, null, null},
                { new Integer(3), null, null, null, null},
                { new Integer(4), null, null, null, null}
            },
            new String [] {
                "Proceso", "Tamaño", "TA", "Ciclo de vida", "Prioridad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_procesos.setToolTipText("");
        tabla_procesos.setDropMode(javax.swing.DropMode.INSERT_COLS);
        tabla_procesos.setFillsViewportHeight(true);
        tabla_procesos.setName("Procesos"); // NOI18N
        tabla_procesos.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tabla_procesos);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanelProcesosLayout = new javax.swing.GroupLayout(jPanelProcesos);
        jPanelProcesos.setLayout(jPanelProcesosLayout);
        jPanelProcesosLayout.setHorizontalGroup(
            jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProcesosLayout.setVerticalGroup(
            jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTabs.addTab("Procesos", jPanelProcesos);

        jMenuBar1.setToolTipText("");

        jMenu_Archivo.setText("Archivo");
        jMenuBar1.add(jMenu_Archivo);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTabs))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtn_fcfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn_fcfsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtn_fcfsActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void textField_QuantumColaAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_QuantumColaAltaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textField_QuantumColaAltaKeyTyped

    private void textField_QuantumColaMediaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_QuantumColaMediaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textField_QuantumColaMediaKeyTyped

    private void MemoriaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemoriaListaActionPerformed
        if (this.contadorMemoriaOK==0){
            this.memoria = new Memoria(Integer.parseInt(inputTamMemoria.getText()));
            this.contadorMemoriaOK+=1;
        }
    }//GEN-LAST:event_MemoriaListaActionPerformed

    private void radiobtn_firstfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_firstfitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtn_firstfitActionPerformed

    private void radiobtn_fijasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_fijasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtn_fijasActionPerformed

    private void radiobtn_variablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_variablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtn_variablesActionPerformed

    private void btn_addParticionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_addParticionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addParticionKeyTyped

    private void btn_addParticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addParticionActionPerformed
        if(radiobtn_fijas.isSelected()){
            Integer dato[] = new Integer[2];
            int tamParticion = 0;
            int dirComienzo=0;
            int tamMemoriaLibre =0;
            tamParticion = Integer.parseInt(inputTamParticion.getText());
            tamMemoriaLibre = memoria.calcularMemoriaLibre();
            if(tamMemoriaLibre>=tamParticion){
                this.contadorParticion+=1;
                dirComienzo = memoria.calcularDirComienzo();
                memoria.crearParticion(tamParticion,dirComienzo);
                tamMemoriaLibre = memoria.calcularMemoriaLibre();
                JOptionPane.showMessageDialog(null, "La particion fue creada con EXITO, tamaño memoria disponible: " + tamMemoriaLibre, "Congratulation", JOptionPane.PLAIN_MESSAGE);
                dato[0]=memoria.getListParticion().get(contadorParticion-1).getDireccionInicial();
                dato[1]=memoria.getListParticion().get(contadorParticion-1).getTamParticion();
                this.modelParticion.addRow(dato);
                this.showMemoriaLibre.setText(""+tamMemoriaLibre);
                System.out.println("TAMAÑO MEMORIA: "+memoria.getTamMemoria());
                System.out.println("TAMAÑO SO: "+memoria.getTamanoSo());
                System.out.println("TAMAÑO MEMORIA LIBRE: "+tamMemoriaLibre);
                System.out.println("===================================");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR: Tamaño memoria disponible " + tamMemoriaLibre, "ERROR", JOptionPane.PLAIN_MESSAGE);
            }

        }
    }//GEN-LAST:event_btn_addParticionActionPerformed

    private void btn_addParticionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addParticionMouseClicked
//
//        i = i + 1;
//        jLabel5.setText("veces que clickeo: " + i);
    }//GEN-LAST:event_btn_addParticionMouseClicked

    private void inputTamParticionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTamParticionKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_inputTamParticionKeyTyped

    private void inputTamParticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamParticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTamParticionActionPerformed

    private void inputTamMemoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTamMemoriaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();

    }//GEN-LAST:event_inputTamMemoriaKeyTyped

    private void inputTamMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamMemoriaActionPerformed
        if(this.contadorMemoriaOK==0){
            this.memoria= new Memoria();
        }
    }//GEN-LAST:event_inputTamMemoriaActionPerformed
  //******************Algoritmos generados*************************************************
    /**
     if(okRadioMemoria.isSelected()){
            
        }
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MemoriaLista;
    private javax.swing.JButton btn_addParticion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField inputTamMemoria;
    private javax.swing.JTextField inputTamParticion;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JMenu jMenu_Archivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAlgoritmos;
    private javax.swing.JPanel jPanelMemoria;
    private javax.swing.JPanel jPanelProcesos;
    public static javax.swing.JTabbedPane jPanelTabs;
    public static javax.swing.JRadioButton jRadiobtn_sjf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panej_gantt;
    private javax.swing.JPanel panel_configuracionMemoria;
    public static javax.swing.JRadioButton radioBtn_Prioridades;
    public static javax.swing.JRadioButton radioBtn_colasMultinivel;
    public static javax.swing.JRadioButton radioBtn_fcfs;
    public static javax.swing.JRadioButton radioBtn_roundRobin;
    private javax.swing.JRadioButton radiobtn_bestfit;
    private javax.swing.JRadioButton radiobtn_fijas;
    private javax.swing.JRadioButton radiobtn_firstfit;
    private javax.swing.JRadioButton radiobtn_variables;
    private javax.swing.JRadioButton radiobtn_worstfit;
    private javax.swing.JLabel showMemoriaLibre;
    private javax.swing.JTable tablaParticiones;
    public static javax.swing.JTable tabla_procesos;
    public static javax.swing.JTextField textField_QuantumColaAlta;
    public static javax.swing.JTextField textField_QuantumColaMedia;
    // End of variables declaration//GEN-END:variables
}
