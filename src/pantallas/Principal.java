package pantallas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import simuladorso.model.Connector;
import simuladorso.model.EntradaSalida;
import simuladorso.model.Memoria;
import simuladorso.model.Planificador;
import simuladorso.model.Procesador;
import simuladorso.model.Proceso;

public class Principal extends javax.swing.JFrame {

    DefaultTableModel tablaProcesos;
    DefaultTableModel modelTablaParticiones=new DefaultTableModel();
    Object[] procesos = new Object[5];
    
    int filaSeleccionada = -1;
    private static Memoria memoria;
    private int contadorParticion;
    //private DefaultTableModel modelParticion = new DefaultTableModel();
    private int contadorMemoriaOK;

    public Principal() {
        initComponents();
        tablaProcesos = (DefaultTableModel) tabla_procesos.getModel();
        modelTablaParticiones = (DefaultTableModel) tabla_particiones.getModel();
        this.tabla_particiones.setModel(modelTablaParticiones);
        txt_quantumRR.setEnabled(false);
        textField_QuantumColaAlta.setEnabled(false);
        textField_QuantumColaMedia.setEnabled(false);
        this.contadorMemoriaOK=0;
        this.contadorParticion = 0;
        inputTamParticion.setEnabled(false);
        btn_addParticion.setEnabled(false);
        btn_removeParticion.setEnabled(false);
        radiobtn_worstfit.setEnabled(false);
        radiobtn_bestfit.setEnabled(false);
        radiobtn_firstfit.setEnabled(false);
        radiobtn_partFijas.setEnabled(false);
        radiobtn_partVariables.setEnabled(false);
        inputTamParticion.setEnabled(false);
        //
        db = new Connector();
        db.crearTabla();
        db.insertarProceso(1, 10, 0, "2-1-2", "BAJA");
        db.insertarProceso(2, 5, 0, "1-1-1", "MEDIA");
        db.insertarProceso(3, 60, 1, "3-1-2", "ALTA");
        db.insertarProceso(4, 15, 1, "1-2-1", "ALTA");
        db.insertarProceso(5, 3, 1, "2-1-1", "MEDIA");
        db.insertarProceso(6, 30, 2, "1-2-3", "BAJA");
        db.insertarProceso(7, 21, 2, "1-1-1", "MEDIA");
        setUpColas();
        //
        initialProcedures();
        setTitle("Simulador SO");
    }
//==============AutoGenerado===================sss
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRButtons_tipoParticionamiento = new javax.swing.ButtonGroup();
        grupoRButtons_algoritmoIntercambio = new javax.swing.ButtonGroup();
        grupoRButtons_algoritmosPlanificacion = new javax.swing.ButtonGroup();
        jPanelTabs = new javax.swing.JTabbedPane();
        jPanelMemoria = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_particiones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        showMemoriaLibre = new javax.swing.JLabel();
        panel_configuracionMemoria = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputTamMemoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_tamparticion = new javax.swing.JLabel();
        inputTamParticion = new javax.swing.JTextField();
        btn_addParticion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        radiobtn_partVariables = new javax.swing.JRadioButton();
        radiobtn_partFijas = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        radiobtn_firstfit = new javax.swing.JRadioButton();
        radiobtn_bestfit = new javax.swing.JRadioButton();
        radiobtn_worstfit = new javax.swing.JRadioButton();
        btn_removeParticion = new javax.swing.JButton();
        setTamMemoria = new javax.swing.JButton();
        jPanelAlgoritmos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        radioBtn_fcfs = new javax.swing.JRadioButton();
        radioBtn_roundRobin = new javax.swing.JRadioButton();
        label_RR = new javax.swing.JLabel();
        radioBtn_Prioridades = new javax.swing.JRadioButton();
        txt_quantumRR = new javax.swing.JTextField();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_procesos = new javax.swing.JTable();
        btn_addProceso = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTxt_tamanioProceso = new javax.swing.JTextField();
        jTxt_tiempoArriboProceso = new javax.swing.JTextField();
        jTxt_cicloVidaProceso = new javax.swing.JTextField();
        jBox_prioridadProceso = new javax.swing.JComboBox<>();
        btn_eliminarProceso = new javax.swing.JButton();
        btn_modificarProceso = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_seleccionarProceso = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        panej_gantt1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ejecutarSimulador = new javax.swing.JButton();
        panej_gantt2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
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

        tabla_particiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Particion", "Dir. Comienzo", "Tam. Particion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_particiones);
        if (tabla_particiones.getColumnModel().getColumnCount() > 0) {
            tabla_particiones.getColumnModel().getColumn(0).setResizable(false);
            tabla_particiones.getColumnModel().getColumn(1).setResizable(false);
            tabla_particiones.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("MemoriaLibre: ");

        showMemoriaLibre.setText("memoriaLibre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showMemoriaLibre)
                .addGap(132, 132, 132))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(showMemoriaLibre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        grupoRButtons_tipoParticionamiento.add(radiobtn_partVariables);
        radiobtn_partVariables.setForeground(java.awt.Color.white);
        radiobtn_partVariables.setText("Variables");
        radiobtn_partVariables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radiobtn_partVariablesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radiobtn_partVariablesMousePressed(evt);
            }
        });
        radiobtn_partVariables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_partVariablesActionPerformed(evt);
            }
        });

        grupoRButtons_tipoParticionamiento.add(radiobtn_partFijas);
        radiobtn_partFijas.setForeground(new java.awt.Color(255, 255, 255));
        radiobtn_partFijas.setText("Fijas");
        radiobtn_partFijas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radiobtn_partFijas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radiobtn_partFijasMousePressed(evt);
            }
        });
        radiobtn_partFijas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_partFijasActionPerformed(evt);
            }
        });

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Algoritmo de Intercambio:");

        grupoRButtons_algoritmoIntercambio.add(radiobtn_firstfit);
        radiobtn_firstfit.setForeground(java.awt.Color.white);
        radiobtn_firstfit.setText("First-Fit");
        radiobtn_firstfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_firstfitActionPerformed(evt);
            }
        });

        grupoRButtons_algoritmoIntercambio.add(radiobtn_bestfit);
        radiobtn_bestfit.setForeground(java.awt.Color.white);
        radiobtn_bestfit.setText("Best-Fit");

        grupoRButtons_algoritmoIntercambio.add(radiobtn_worstfit);
        radiobtn_worstfit.setForeground(java.awt.Color.white);
        radiobtn_worstfit.setText("Worst-Fit");

        btn_removeParticion.setText("Eliminar");
        btn_removeParticion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeParticionActionPerformed(evt);
            }
        });

        setTamMemoria.setText("tamMemoriaOK");
        setTamMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTamMemoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_configuracionMemoriaLayout = new javax.swing.GroupLayout(panel_configuracionMemoria);
        panel_configuracionMemoria.setLayout(panel_configuracionMemoriaLayout);
        panel_configuracionMemoriaLayout.setHorizontalGroup(
            panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                        .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                                .addComponent(radiobtn_partVariables)
                                .addGap(18, 18, 18)
                                .addComponent(radiobtn_partFijas))
                            .addComponent(radiobtn_worstfit)
                            .addComponent(jLabel5)
                            .addComponent(radiobtn_firstfit)
                            .addComponent(radiobtn_bestfit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(setTamMemoria)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                                .addComponent(btn_addParticion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_removeParticion)))
                        .addGap(35, 35, 35))))
        );
        panel_configuracionMemoriaLayout.setVerticalGroup(
            panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configuracionMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputTamMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(setTamMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_tamparticion)
                    .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputTamParticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_removeParticion)
                        .addComponent(btn_addParticion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_configuracionMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtn_partVariables)
                    .addComponent(radiobtn_partFijas))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_configuracionMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 380, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_configuracionMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMemoriaLayout = new javax.swing.GroupLayout(jPanelMemoria);
        jPanelMemoria.setLayout(jPanelMemoriaLayout);
        jPanelMemoriaLayout.setHorizontalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
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

        grupoRButtons_algoritmosPlanificacion.add(radioBtn_fcfs);
        radioBtn_fcfs.setText("First-Come,First-Served (FCFS)");
        radioBtn_fcfs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radioBtn_fcfsMousePressed(evt);
            }
        });
        radioBtn_fcfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn_fcfsActionPerformed(evt);
            }
        });

        grupoRButtons_algoritmosPlanificacion.add(radioBtn_roundRobin);
        radioBtn_roundRobin.setText("Round Robin");
        radioBtn_roundRobin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radioBtn_roundRobinMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                radioBtn_roundRobinMouseReleased(evt);
            }
        });

        label_RR.setText("Quantum");

        grupoRButtons_algoritmosPlanificacion.add(radioBtn_Prioridades);
        radioBtn_Prioridades.setText("Prioridades (cooperativo)");
        radioBtn_Prioridades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radioBtn_PrioridadesMousePressed(evt);
            }
        });

        txt_quantumRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantumRRActionPerformed(evt);
            }
        });
        txt_quantumRR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_quantumRRKeyTyped(evt);
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

        grupoRButtons_algoritmosPlanificacion.add(radioBtn_colasMultinivel);
        radioBtn_colasMultinivel.setText("Colas multinivel");
        radioBtn_colasMultinivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                radioBtn_colasMultinivelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radioBtn_colasMultinivelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                radioBtn_colasMultinivelMouseReleased(evt);
            }
        });

        grupoRButtons_algoritmosPlanificacion.add(jRadiobtn_sjf);
        jRadiobtn_sjf.setText("SJF");
        jRadiobtn_sjf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadiobtn_sjfMousePressed(evt);
            }
        });

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
                                        .addComponent(label_RR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_quantumRR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(0, 590, Short.MAX_VALUE))))
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
                    .addComponent(label_RR)
                    .addComponent(txt_quantumRR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jPanelTabs.addTab("Algoritmos", jPanelAlgoritmos);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        tabla_procesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Tamaño", "TA", "Ciclo de vida", "Prioridad", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_procesos.setToolTipText("");
        tabla_procesos.setDropMode(javax.swing.DropMode.INSERT_COLS);
        tabla_procesos.setFillsViewportHeight(true);
        tabla_procesos.setName("Procesos"); // NOI18N
        tabla_procesos.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tabla_procesos);
        if (tabla_procesos.getColumnModel().getColumnCount() > 0) {
            tabla_procesos.getColumnModel().getColumn(0).setResizable(false);
            tabla_procesos.getColumnModel().getColumn(1).setResizable(false);
            tabla_procesos.getColumnModel().getColumn(2).setResizable(false);
            tabla_procesos.getColumnModel().getColumn(3).setResizable(false);
            tabla_procesos.getColumnModel().getColumn(4).setResizable(false);
            tabla_procesos.getColumnModel().getColumn(5).setResizable(false);
            tabla_procesos.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        btn_addProceso.setText("AGREGAR PROCESO");
        btn_addProceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addProcesoMouseClicked(evt);
            }
        });
        btn_addProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProcesoActionPerformed(evt);
            }
        });

        jLabel10.setText("Tamanio:");

        jLabel11.setText("Tiempo de arribo:");

        jLabel17.setText("Ciclo de vida:");

        jLabel18.setText("Prioridad: ");

        jTxt_tamanioProceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxt_tamanioProcesoKeyTyped(evt);
            }
        });

        jTxt_tiempoArriboProceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxt_tiempoArriboProcesoKeyTyped(evt);
            }
        });

        jTxt_cicloVidaProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_cicloVidaProcesoActionPerformed(evt);
            }
        });
        jTxt_cicloVidaProceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxt_cicloVidaProcesoKeyTyped(evt);
            }
        });

        jBox_prioridadProceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAJA", "MEDIA", "ALTA" }));

        btn_eliminarProceso.setText("ELIMINAR PROCESO");
        btn_eliminarProceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarProcesoMouseClicked(evt);
            }
        });
        btn_eliminarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarProcesoActionPerformed(evt);
            }
        });

        btn_modificarProceso.setText("MODIFICAR PROCESO");
        btn_modificarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarProcesoActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btn_seleccionarProceso.setText("SELECCIONAR PROCESO");
        btn_seleccionarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarProcesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProcesosLayout = new javax.swing.GroupLayout(jPanelProcesos);
        jPanelProcesos.setLayout(jPanelProcesosLayout);
        jPanelProcesosLayout.setHorizontalGroup(
            jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBox_prioridadProceso, 0, 90, Short.MAX_VALUE)
                    .addComponent(jTxt_cicloVidaProceso)
                    .addComponent(jTxt_tamanioProceso)
                    .addComponent(jTxt_tiempoArriboProceso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_addProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(btn_eliminarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modificarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_seleccionarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelProcesosLayout.setVerticalGroup(
            jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelProcesosLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanelProcesosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                    .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jTxt_tamanioProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jTxt_tiempoArriboProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jTxt_cicloVidaProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(jBox_prioridadProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator1))
                            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                .addComponent(btn_seleccionarProceso)
                                .addGap(18, 18, 18)
                                .addComponent(btn_addProceso)
                                .addGap(18, 18, 18)
                                .addComponent(btn_modificarProceso)
                                .addGap(18, 18, 18)
                                .addComponent(btn_eliminarProceso)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanelTabs.addTab("Procesos", jPanelProcesos);

        panej_gantt1.setBackground(new java.awt.Color(102, 102, 102));
        panej_gantt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panej_gantt1Layout = new javax.swing.GroupLayout(panej_gantt1);
        panej_gantt1.setLayout(panej_gantt1Layout);
        panej_gantt1Layout.setHorizontalGroup(
            panej_gantt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panej_gantt1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panej_gantt1Layout.setVerticalGroup(
            panej_gantt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panej_gantt1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel8.setText("Diagrama de Gantt");

        ejecutarSimulador.setText("EJECUTAR");
        ejecutarSimulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarSimuladorActionPerformed(evt);
            }
        });

        panej_gantt2.setBackground(new java.awt.Color(102, 102, 102));
        panej_gantt2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        javax.swing.GroupLayout panej_gantt2Layout = new javax.swing.GroupLayout(panej_gantt2);
        panej_gantt2.setLayout(panej_gantt2Layout);
        panej_gantt2Layout.setHorizontalGroup(
            panej_gantt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panej_gantt2Layout.setVerticalGroup(
            panej_gantt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel9.setText("Bloques de memoria");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panej_gantt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ejecutarSimulador, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panej_gantt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(0, 783, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ejecutarSimulador, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panej_gantt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panej_gantt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelTabs.addTab("Simulacion", jPanel5);

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

    //==============AutoGenerado===================
    //==============Desarrolladores===================
    private void inputTamMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTamMemoriaActionPerformed
    
    private void cargarProcesos(){
        int fila = 0; 
        for (Iterator<Proceso> itr = colaProcesos.iterator(); itr.hasNext();){
            Proceso proceso = itr.next();
            if (!tablaProcesos.getValueAt(fila, 5).equals(true)){
                itr.remove();
            }
            fila++;
        }
        cantProcesos = colaProcesos.size();
        for (Proceso proceso : colaProcesos){
            System.out.println(proceso);
        }
    }
    
    private void btn_addParticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addParticionActionPerformed
          if(radiobtn_partFijas.isSelected()){
            Object[] datoTablaparticion = new Object[3];
            int tamParticion = 0;
            int dirComienzo=0;
            int tamMemoriaLibre =0;
            tamParticion = Integer.parseInt(inputTamParticion.getText());
            tamMemoriaLibre = memoria.calcularMemoriaLibre();
            if(tamMemoriaLibre>=tamParticion && tamParticion > 0 ){
                this.contadorParticion+=1;
                dirComienzo = memoria.calcularDirComienzo();
                memoria.crearParticion(tamParticion,dirComienzo);
                tamMemoriaLibre = memoria.calcularMemoriaLibre();
                JOptionPane.showMessageDialog(null, "La particion fue creada con EXITO, tamaño memoria disponible: " + tamMemoriaLibre, "Congratulation", JOptionPane.PLAIN_MESSAGE);
                datoTablaparticion[0]=memoria.getListParticion().get(contadorParticion-1).getIdParticion();
                datoTablaparticion[1]=memoria.getListParticion().get(contadorParticion-1).getDireccionInicial();
                datoTablaparticion[2]=memoria.getListParticion().get(contadorParticion-1).getTamParticion();
                this.modelTablaParticiones.addRow(datoTablaparticion);
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

    private void radiobtn_partVariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_partVariablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtn_partVariablesActionPerformed

    private void radiobtn_partFijasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_partFijasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtn_partFijasActionPerformed

    private void radiobtn_firstfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_firstfitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtn_firstfitActionPerformed

    private void inputTamParticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTamParticionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTamParticionActionPerformed

    private void inputTamMemoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTamMemoriaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
        
    }//GEN-LAST:event_inputTamMemoriaKeyTyped

    private void inputTamParticionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTamParticionKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_inputTamParticionKeyTyped

    private void btn_addParticionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addParticionMouseClicked
        
    }//GEN-LAST:event_btn_addParticionMouseClicked

    private void btn_addParticionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_addParticionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addParticionKeyTyped

    private void jTxt_cicloVidaProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_cicloVidaProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_cicloVidaProcesoActionPerformed

    private void jTxt_tamanioProcesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_tamanioProcesoKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_jTxt_tamanioProcesoKeyTyped

    private void jTxt_tiempoArriboProcesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_tiempoArriboProcesoKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_jTxt_tiempoArriboProcesoKeyTyped

    private void jTxt_cicloVidaProcesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxt_cicloVidaProcesoKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_jTxt_cicloVidaProcesoKeyTyped

    private void btn_addProcesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addProcesoMouseClicked
         
    }//GEN-LAST:event_btn_addProcesoMouseClicked

    private void btn_eliminarProcesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarProcesoMouseClicked

    }//GEN-LAST:event_btn_eliminarProcesoMouseClicked

    private void btn_eliminarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarProcesoActionPerformed
         /* Accion al presionar Eliminar Proceso (deberia eliminarlo de la tabla de 
        procesos)*/
        if (tabla_procesos.getSelectedRow() != -1){
            tablaProcesos.removeRow(tabla_procesos.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun proceso"
                    + "","Atencion",JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_btn_eliminarProcesoActionPerformed
        
    int item = 0;
    
    
    private void btn_addProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProcesoActionPerformed
        /* Accion al presionar Agregar Proceso (deberia agregarlo a la tabla de 
        procesos) */
        
        if (checkCamposProcesos()){
          tablaProcesos.removeRow(item);
        }
        
        item = item + 1;
        
        
        procesos[0] = String.valueOf(item);
        procesos[1] = jTxt_tamanioProceso.getText();
        procesos[2] = jTxt_tiempoArriboProceso.getText();
        procesos[3] = jTxt_cicloVidaProceso.getText();
        procesos[4] = jBox_prioridadProceso.getSelectedItem();
        
        tablaProcesos.addRow(procesos);
        
        limpiarTextFields();        
        
    }//GEN-LAST:event_btn_addProcesoActionPerformed

    private void btn_modificarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarProcesoActionPerformed
         /* Accion al presionar Modificar Proceso (deberia modificarlo en la tabla de 
        procesos) */
        
        if (filaSeleccionada != -1){
            tabla_procesos.setValueAt(jTxt_tamanioProceso.getText(), filaSeleccionada, 1);
            tabla_procesos.setValueAt(jTxt_tiempoArriboProceso.getText(), filaSeleccionada, 2);
            tabla_procesos.setValueAt(jTxt_cicloVidaProceso.getText(), filaSeleccionada, 3);
            tabla_procesos.setValueAt(jBox_prioridadProceso.getSelectedItem(), filaSeleccionada, 4);
            limpiarTextFields();
            filaSeleccionada = -1;
        } else {
            JOptionPane.showMessageDialog(this, "No se cargo campos", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarProcesoActionPerformed

    private void btn_seleccionarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarProcesoActionPerformed
        filaSeleccionada = tabla_procesos.getSelectedRow();
        if (filaSeleccionada != -1) {
            limpiarTextFields();
            jTxt_tamanioProceso.setText(tabla_procesos.getValueAt(filaSeleccionada, 1).toString());
            jTxt_tiempoArriboProceso.setText(tabla_procesos.getValueAt(filaSeleccionada, 2).toString());
            jTxt_cicloVidaProceso.setText(tabla_procesos.getValueAt(filaSeleccionada, 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "No has seleccinado una fila");
        }
    
    }//GEN-LAST:event_btn_seleccionarProcesoActionPerformed

    private void btn_removeParticionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeParticionActionPerformed
        if (tabla_particiones.getSelectedRow() != -1){
            //CORREGIR
            modelTablaParticiones.removeRow(tabla_particiones.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna particion"+ "","Atencion",JOptionPane.INFORMATION_MESSAGE);
        }  
    }//GEN-LAST:event_btn_removeParticionActionPerformed

    private void radiobtn_partFijasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radiobtn_partFijasMousePressed
        inputTamParticion.setEnabled(true);
        btn_addParticion.setEnabled(true);
        btn_removeParticion.setEnabled(true);
        radiobtn_worstfit.setEnabled(false);
        radiobtn_bestfit.setEnabled(true);
        radiobtn_firstfit.setEnabled(true);
        
    }//GEN-LAST:event_radiobtn_partFijasMousePressed

    private void radiobtn_partVariablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radiobtn_partVariablesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_radiobtn_partVariablesMouseClicked

    private void radiobtn_partVariablesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radiobtn_partVariablesMousePressed
        inputTamParticion.setEnabled(false);
        btn_addParticion.setEnabled(false);
        btn_removeParticion.setEnabled(false);
        btn_removeParticion.setEnabled(false);
        radiobtn_bestfit.setEnabled(false);
        radiobtn_worstfit.setEnabled(true);
        radiobtn_firstfit.setEnabled(true);
        memoria.getListParticion().removeAll(memoria.getListParticion());
        int rowCount = modelTablaParticiones.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            modelTablaParticiones.removeRow(i);
        }
    }//GEN-LAST:event_radiobtn_partVariablesMousePressed

    private void setTamMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTamMemoriaActionPerformed
           if (this.contadorMemoriaOK==0){
            this.memoria = new Memoria(Integer.parseInt(inputTamMemoria.getText()));
            this.contadorMemoriaOK+=1;
            radiobtn_partFijas.setEnabled(true);
            radiobtn_partVariables.setEnabled(true);
        }
    }//GEN-LAST:event_setTamMemoriaActionPerformed

    private void jRadiobtn_sjfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadiobtn_sjfMousePressed
        textField_QuantumColaAlta.setEnabled(false);
        textField_QuantumColaMedia.setEnabled(false);
        txt_quantumRR.setEnabled(false);
    }//GEN-LAST:event_jRadiobtn_sjfMousePressed

    private void radioBtn_colasMultinivelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBtn_colasMultinivelMouseExited

    }//GEN-LAST:event_radioBtn_colasMultinivelMouseExited

    private void radioBtn_colasMultinivelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBtn_colasMultinivelMouseReleased

    }//GEN-LAST:event_radioBtn_colasMultinivelMouseReleased

    private void radioBtn_colasMultinivelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBtn_colasMultinivelMousePressed
        textField_QuantumColaAlta.setEnabled(true);
        textField_QuantumColaMedia.setEnabled(true);
        txt_quantumRR.setEnabled(false);
    }//GEN-LAST:event_radioBtn_colasMultinivelMousePressed

    private void textField_QuantumColaAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_QuantumColaAltaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textField_QuantumColaAltaKeyTyped

    private void textField_QuantumColaMediaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_QuantumColaMediaKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_textField_QuantumColaMediaKeyTyped

    private void txt_quantumRRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantumRRKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_txt_quantumRRKeyTyped

    private void radioBtn_PrioridadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBtn_PrioridadesMousePressed
        textField_QuantumColaAlta.setEnabled(false);
        textField_QuantumColaMedia.setEnabled(false);
        txt_quantumRR.setEnabled(false);
    }//GEN-LAST:event_radioBtn_PrioridadesMousePressed

    private void radioBtn_roundRobinMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBtn_roundRobinMouseReleased

    }//GEN-LAST:event_radioBtn_roundRobinMouseReleased

    private void radioBtn_roundRobinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBtn_roundRobinMousePressed
        txt_quantumRR.setEnabled(true);
        textField_QuantumColaAlta.setEnabled(false);
        textField_QuantumColaMedia.setEnabled(false);
    }//GEN-LAST:event_radioBtn_roundRobinMousePressed

    private void radioBtn_fcfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn_fcfsActionPerformed

    }//GEN-LAST:event_radioBtn_fcfsActionPerformed

    private void radioBtn_fcfsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBtn_fcfsMousePressed
        textField_QuantumColaAlta.setEnabled(false);
        textField_QuantumColaMedia.setEnabled(false);
        txt_quantumRR.setEnabled(false);
    }//GEN-LAST:event_radioBtn_fcfsMousePressed

    private void ejecutarSimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarSimuladorActionPerformed
        clock = 0;
        if(radiobtn_partVariables.isSelected()){
            crearParticionesVariables();
        }
        tiempoEsperaPromedio = 0;
        tiempoRetornoPromedio = 0;
        cargarProcesos();
        inicializarPlanificador();
        while (colaTerminado.size() != cantProcesos){
            cargarColaNuevo(); 
            intercambio();
            controlES();
            controlProcesador();
            planificacion();
            if (es.procesoIsNull() && colaBloqueado.size()!=0){
               cargarES(); 
            }
            tiempoColaListo();
            tiempoColaBloqueado();
            imprimir();
            clock++;
        }
        for (Proceso proceso : colaTerminado){
            System.out.println("TE:  "+proceso.getTiempoEspera()+" TR:  "+proceso.getTiempoRetorno());
            tiempoEsperaPromedio += proceso.getTiempoEspera();
            tiempoRetornoPromedio += proceso.getTiempoRetorno();
        }
        tiempoEsperaPromedio /= cantProcesos;
        tiempoRetornoPromedio /= cantProcesos;
        System.out.println("TEP: "+tiempoEsperaPromedio+" TRP: "+tiempoRetornoPromedio);
    }//GEN-LAST:event_ejecutarSimuladorActionPerformed
    
    private void inicializarPlanificador(){
        planificador = new Planificador();
        if(radioBtn_roundRobin.isSelected()){
            Integer q = Integer.parseInt(txt_quantumRR.getText());
            if (q == null){
                q = 1;
            }
            planificador.setQuantum(q);
        }
        if(radioBtn_colasMultinivel.isSelected()){
            Integer qAlta = Integer.parseInt(textField_QuantumColaAlta.getText());
            Integer qMedia = Integer.parseInt(textField_QuantumColaMedia.getText());
            if (qAlta == null){
                qAlta = 2;
            }
            if (qMedia == null){
                qMedia = 1;
            }
            planificador.setQuantumAlta(qAlta);
            planificador.setQuantumMedia(qMedia);
        }
    }
    
    private void txt_quantumRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantumRRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantumRRActionPerformed
    
    private void limpiarTextFields(){
        jTxt_tamanioProceso.setText("");
        jTxt_tiempoArriboProceso.setText("");
        jTxt_cicloVidaProceso.setText("");
        inputTamMemoria.setText("");
        inputTamParticion.setText("");
    }
    
    private boolean checkCamposProcesos(){
        if ((jTxt_tamanioProceso.getText().length() == 0) || ( jTxt_tiempoArriboProceso.getText().length() == 0 ) ||
                (jTxt_cicloVidaProceso.getText().length() == 0)){
                JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);
                return true;
        } else {
            return false;
        }    
    }
    
    private boolean checkCamposParticion(){
        if ((inputTamMemoria.getText().length() == 0) || ( inputTamParticion.getText().length() == 0 )){
                JOptionPane.showMessageDialog(this, "No dejar campos Vacíos", "Error!", JOptionPane.ERROR_MESSAGE);
                return true;
        } else {
            return false;
        }
    }
    
    //==============Desarrolladores===================
    //==============ClaseMain=======================
    private static int clock;
    private static List<Proceso> colaProcesos;
    private static List<Proceso> colaNuevo;
    private static List<Proceso> colaListo;
    private static List<Proceso> colaBloqueado;
    private static List<Proceso> colaTerminado;
    private static Procesador procesador;
    private static EntradaSalida es;

    private static Scanner teclado;
    private static Planificador planificador;
    private static Integer cantProcesos;
    private static int tiempoEsperaPromedio;
    private static int tiempoRetornoPromedio;
    private static Connector db;
    
    //Inicializa los procesos.
    private void initialProcedures() {
        db.getProcesos(colaProcesos);
        Object[] datoTablaProceso = new Object[6];
        datoTablaProceso[5] = false;
        for (Proceso proceso : colaProcesos){
            datoTablaProceso[0]=proceso.getNombreProceso();
            datoTablaProceso[1]=proceso.getTamProceso();
            datoTablaProceso[2]=proceso.getTiempoArribo();
            datoTablaProceso[3]=proceso.getRafaga();
            datoTablaProceso[4]=proceso.getPrioridad();
            this.tablaProcesos.addRow(datoTablaProceso);
        }
        db.closeConnection();
    }
    
    //Crea las particiones fijas.
    private static void crearParticionesFijas() {
        int tamanio;
        int dirComienzo;
        teclado = new Scanner(System.in);
        while(memoria.calcularMemoriaLibre() > 0){
            System.out.println("Ingrese el tamaño de la siguiente particion: ");
            System.out.println("Memoria libre: " + memoria.calcularMemoriaLibre());
            tamanio = teclado.nextInt();
            if (tamanio > memoria.calcularMemoriaLibre()){
                do {
                    System.out.println("Ingrese el tamaño de la siguiente particion: ");
                    System.out.println("Memoria libre: " + memoria.calcularMemoriaLibre());
                    tamanio = teclado.nextInt();
                }while (tamanio > memoria.calcularMemoriaLibre());
            }
            dirComienzo = memoria.calcularDirComienzo();
            memoria.crearParticion(tamanio,dirComienzo);
        }
    }
    
    //Crea la primera particion.
    private static void crearParticionesVariables(){
        int tamanio = memoria.calcularMemoriaLibre();
        int dirComienzo = memoria.calcularDirComienzo();
        memoria.crearParticion(tamanio,dirComienzo);
    }
    
    //Crea las colas.
    private static void setUpColas() {
        colaProcesos = new ArrayList<Proceso>();
        colaNuevo = new ArrayList<Proceso>();
        colaListo = new ArrayList<Proceso>();
        colaBloqueado = new ArrayList<Proceso>();
        colaTerminado = new ArrayList<Proceso>();
        procesador = new Procesador();
        es = new EntradaSalida();
    }
    
    //Carga la cola de nuevo con los procesos que arriban.
    private static void cargarColaNuevo(){
        for(Iterator<Proceso> itr = colaProcesos.iterator(); itr.hasNext();){
            Proceso proceso = itr.next();
            if (proceso.getTiempoArribo() == clock){
                colaNuevo.add(proceso);
                itr.remove();
            }
        }
    }
    
    //Crea la memoria.
    private static void setUpMemoria() {
        memoria = new Memoria();
    }
    
    //Carga un proceso en entrada/salida.
    private static void cargarES(){
        Proceso proceso;
        int tiempo;
        proceso = colaBloqueado.get(0);
        es.setProceso(proceso);
        tiempo = proceso.getRafaga().get(proceso.getIndice());
        es.setTimer(tiempo);
        colaBloqueado.remove(es.getProceso());
    }
    
    private static void imprimir(){
        System.out.println("Clock: "+clock);
        memoria.imprimirProcesoPorConsola();
        System.out.println("Procesador" + procesador.getProceso());
        System.out.println("E/S" + es.getProceso());
        System.out.println("COLA NUEVO: "+colaNuevo);
        System.out.println("COLA LISTO: "+colaListo);
        System.out.println("COLA BLOQUEADOS: "+colaBloqueado);
        System.out.println("COLA TERMINADOS: "+colaTerminado);
    }
    
    //Selecciona el algoritmo de intercambio a ejecutar.
    private static void intercambio(){
        if(radiobtn_partFijas.isSelected()){
            if(radiobtn_bestfit.isSelected()){
                memoria.BestFit(colaNuevo, colaListo);
            }
            if(radiobtn_firstfit.isSelected()){
                memoria.FirstFit(colaNuevo, colaListo);
            }
        }
        if(radiobtn_partVariables.isSelected()){
            if(radiobtn_worstfit.isSelected()){
                memoria.WorstFit(colaNuevo, colaListo);
            }
            if(radiobtn_firstfit.isSelected()){
                memoria.FirstFitVariable(colaNuevo, colaListo);
            }
        }
    }
    
    //Controla si termino el proceso en entrada/salida.
    private static void controlES(){
        if (es.procesoIsNotNull()){
            es.ejecutar();
            if (es.timeout() && clock != 0){
                es.getProceso().setIndice(es.getProceso().getIndice()+1);
                es.getProceso().setTiempoActual(es.getProceso().getRafaga().get(es.getProceso().getIndice()));
                colaListo.add(es.getProceso());
                es.removeProceso();
            }
        }
    }
    
    //Revisa cuando el proceso termina una rafaga y decide que hacer..
    private static void procesoTermino(){
        procesador.getProceso().setIndice(procesador.getProceso().getIndice() + 1);
        if (procesador.getProceso().getRafaga().size() > procesador.getProceso().getIndice()){
            colaBloqueado.add(procesador.getProceso());
        }
        else{
            memoria.liberarMemoria(procesador.getProceso());
            colaTerminado.add(procesador.getProceso());
        }
        procesador.removeProceso();    
    }
    
    //Revisa cuando el proceso no termino de ejecutarse por un limite de tiempo maximo establecido.
    private static void procesoNoTermino(int comparativa){
        procesador.getProceso().setRafaga(procesador.getProceso().getIndice(),comparativa);
        colaListo.add(procesador.getProceso());
        procesador.removeProceso();
    }
    
    //Controla si un proceso termino de ejecutarse.
    public static void controlProcesador(){
        int comparativa;
        if (procesador.procesoIsNotNull()){
            procesador.ejecutar();
            if (clock != 0){
                comparativa = procesador.getProceso().getRafaga().get(procesador.getProceso().getIndice()) - procesador.getOriginalTimer();
                procesador.getProceso().setTiempoActual(procesador.getProceso().getRafaga().get(procesador.getProceso().getIndice()));
                if (comparativa == 0 && procesador.timeout()){
                    procesoTermino();
                }
                else{
                    if (procesador.timeout()){
                        procesoNoTermino(comparativa);
                    }
                    if (comparativa == 0){
                        procesoTermino();
                    }
                }
            }
        }
    }
    
    //Inicializa las particiones.
    private static void setUpParticiones(){
        if (memoria.getTipoParticion())
        {
           crearParticionesFijas();
        }
        else
        {
            crearParticionesVariables();
        }
    }
    
    //Selecciona el algoritmo de planificacion a ejecutar.
    public static void planificacion(){
        if (procesador.procesoIsNull() && colaListo.size()!=0){
            if (radioBtn_fcfs.isSelected()){
                planificador.FCFS(colaListo,procesador); 
            }
            if (radioBtn_roundRobin.isSelected()){
                planificador.roundRobin(colaListo, procesador, planificador.getQuantum());
            }
            if (radioBtn_Prioridades.isSelected()){
                planificador.prioridades(colaListo, procesador);
            }
            if (jRadiobtn_sjf.isSelected()){
                planificador.SJF(colaListo, procesador);
            }
            if (radioBtn_colasMultinivel.isSelected()){
                planificador.colasMultinivel(colaListo, procesador);
            }             
        }
    }
    
    //Incrementa el tiempo de retorno y espera de los procesos en estado listo.
    public static void tiempoColaListo(){
        for (Proceso proceso : colaListo){
            proceso.incTiempoRetorno();
            if (proceso.getPrimeraEjecucion()){
                proceso.incTiempoEspera();  
            }
        }
    }
    
    //Incrementa el tiempo de retorno de los procesos en estado bloqueado.
    public static void tiempoColaBloqueado(){
        for (Proceso proceso : colaBloqueado){
            proceso.incTiempoRetorno();
        }
    }
    
    public static void mainEjecutor() {
        /*db = new Connector();
        db.crearTabla();
        clock = 0;
        setUpMemoria();
        setUpParticiones();
        setUpColas();
        initialProcedures();
        db.closeConnection();
        tiempoEsperaPromedio = 0;
        tiempoRetornoPromedio = 0;
        while (colaTerminado.size() != cantProcesos){
            cargarColaNuevo(); 
            intercambio();
            controlES();
            controlProcesador();
            planificacion();
            if (es.procesoIsNull() && colaBloqueado.size()!=0){
               cargarES(); 
            }
            tiempoColaListo();
            tiempoColaBloqueado();
            imprimir();
            clock++;
        }
        for (Proceso proceso : colaTerminado){
            System.out.println("TE:  "+proceso.getTiempoEspera()+" TR:  "+proceso.getTiempoRetorno());
            tiempoEsperaPromedio += proceso.getTiempoEspera();
            tiempoRetornoPromedio += proceso.getTiempoRetorno();
        }
        tiempoEsperaPromedio /= cantProcesos;
        tiempoRetornoPromedio /= cantProcesos;
        System.out.println("TEP: "+tiempoEsperaPromedio+" TRP: "+tiempoRetornoPromedio);*/
    }
    //==============AutoGenerado===================
    /**
     * @param args the command line arguments
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
    public static javax.swing.JButton btn_addParticion;
    public static javax.swing.JButton btn_addProceso;
    public static javax.swing.JButton btn_eliminarProceso;
    public javax.swing.JButton btn_modificarProceso;
    public javax.swing.JButton btn_removeParticion;
    public javax.swing.JButton btn_seleccionarProceso;
    public javax.swing.JButton ejecutarSimulador;
    private javax.swing.ButtonGroup grupoRButtons_algoritmoIntercambio;
    private javax.swing.ButtonGroup grupoRButtons_algoritmosPlanificacion;
    private javax.swing.ButtonGroup grupoRButtons_tipoParticionamiento;
    public static javax.swing.JTextField inputTamMemoria;
    public static javax.swing.JTextField inputTamParticion;
    public static javax.swing.JComboBox<String> jBox_prioridadProceso;
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
    private javax.swing.JMenu jMenu_Archivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelAlgoritmos;
    private javax.swing.JPanel jPanelMemoria;
    private javax.swing.JPanel jPanelProcesos;
    public static javax.swing.JTabbedPane jPanelTabs;
    public static javax.swing.JRadioButton jRadiobtn_sjf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField jTxt_cicloVidaProceso;
    public static javax.swing.JTextField jTxt_tamanioProceso;
    public static javax.swing.JTextField jTxt_tiempoArriboProceso;
    private javax.swing.JLabel label_RR;
    public static javax.swing.JPanel panej_gantt1;
    public static javax.swing.JPanel panej_gantt2;
    private javax.swing.JPanel panel_configuracionMemoria;
    public static javax.swing.JRadioButton radioBtn_Prioridades;
    public static javax.swing.JRadioButton radioBtn_colasMultinivel;
    public static javax.swing.JRadioButton radioBtn_fcfs;
    public static javax.swing.JRadioButton radioBtn_roundRobin;
    public static javax.swing.JRadioButton radiobtn_bestfit;
    public static javax.swing.JRadioButton radiobtn_firstfit;
    public static javax.swing.JRadioButton radiobtn_partFijas;
    public static javax.swing.JRadioButton radiobtn_partVariables;
    public static javax.swing.JRadioButton radiobtn_worstfit;
    public javax.swing.JButton setTamMemoria;
    private javax.swing.JLabel showMemoriaLibre;
    public static javax.swing.JTable tabla_particiones;
    public static javax.swing.JTable tabla_procesos;
    public static javax.swing.JTextField textField_QuantumColaAlta;
    public static javax.swing.JTextField textField_QuantumColaMedia;
    public static javax.swing.JTextField txt_quantumRR;
    // End of variables declaration//GEN-END:variables
}
