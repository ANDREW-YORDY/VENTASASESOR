package com.view;

import com.controller.VentasController;
import com.ui.CustomComponent;
import javax.swing.JTable;

public class Form_Ventas extends javax.swing.JFrame {

    public Form_Ventas() {
        initComponents();

        // Llama al método para establecer el ancho de las columnas de la tabla
        int[] columWidths = {100, 200, 150};
        CustomComponent.setTableColumWidths(jTable_Table_pos, columWidths);
    }

    // Método para actualizar la tabla
    public void UpdateTableVentas() {
        VentasController ventasControll = new VentasController();
        ventasControll.DisplayVentasAsesor(jTable_Table_pos);
    }
        
    public JTable getTable_Table_pos() {
        return jTable_Table_pos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_container_main = new javax.swing.JPanel();
        jButton_previous = new javax.swing.JButton();
        jButton_hogar = new javax.swing.JButton();
        jButton_prepago = new javax.swing.JButton();
        jPanel_titulo = new javax.swing.JPanel();
        jLabel_titulo_pos = new javax.swing.JLabel();
        jLabel_adicionales_pos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_adicionales_pos = new javax.swing.JTextArea();
        jPanel_botones_grupo = new javax.swing.JPanel();
        jButton_Registrar_pos = new javax.swing.JButton();
        jButton_Modificar_pos = new javax.swing.JButton();
        jButton_Eliminar_pos = new javax.swing.JButton();
        jPanel_Table = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane_Tabla_pos = new javax.swing.JScrollPane();
        jTable_Table_pos = new javax.swing.JTable();
        jPanel_datosCliente_pos = new javax.swing.JPanel();
        jLabel_linea_pos = new javax.swing.JLabel();
        jTextField_linea_pos = new javax.swing.JTextField();
        jLabel_tipocc_pos = new javax.swing.JLabel();
        jComboBox_tipocc_pos = new javax.swing.JComboBox<>();
        jLabel_cc_pos = new javax.swing.JLabel();
        jTextField_cedula_pos = new javax.swing.JTextField();
        jLabel_nombre_pos = new javax.swing.JLabel();
        jTextField_nombre_pos = new javax.swing.JTextField();
        jLabel_email_pos = new javax.swing.JLabel();
        jTextField_email_pos = new javax.swing.JTextField();
        jPanel_datosProcesos = new javax.swing.JPanel();
        jLabel_plan = new javax.swing.JLabel();
        jTextField_plan = new javax.swing.JTextField();
        jLabel_nip_pos = new javax.swing.JLabel();
        jTextField_nip_pos = new javax.swing.JTextField();
        jLabel_imsi_pos = new javax.swing.JLabel();
        jTextField_imsi_pos = new javax.swing.JTextField();
        jLabel_dumi_pos = new javax.swing.JLabel();
        jTextField_dumi_pos = new javax.swing.JTextField();
        jTextField_categoria_plan = new javax.swing.JTextField();
        jLabel_categoria_plan = new javax.swing.JLabel();
        jPanel_datosTigoDcs = new javax.swing.JPanel();
        jLabel_contratotdc_pos = new javax.swing.JLabel();
        jComboBox_contratotdc_pos = new javax.swing.JComboBox<>();
        jLabel_cesionprepago_pos = new javax.swing.JLabel();
        jComboBox_cesionprepago_pos = new javax.swing.JComboBox<>();
        jTextField_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_container_main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_container_main.setLayout(null);

        jButton_previous.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jButton_previous.setText("PREVIOUS");
        jPanel_container_main.add(jButton_previous);
        jButton_previous.setBounds(7, 1, 83, 15);

        jButton_hogar.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jButton_hogar.setText("HOGAR");
        jPanel_container_main.add(jButton_hogar);
        jButton_hogar.setBounds(293, 1, 88, 15);

        jButton_prepago.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jButton_prepago.setText("PREPAGO");
        jButton_prepago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_prepagoActionPerformed(evt);
            }
        });
        jPanel_container_main.add(jButton_prepago);
        jButton_prepago.setBounds(387, 1, 81, 15);

        jPanel_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_titulo_pos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_titulo_pos.setText(" VENTAS POSPAGO");

        javax.swing.GroupLayout jPanel_tituloLayout = new javax.swing.GroupLayout(jPanel_titulo);
        jPanel_titulo.setLayout(jPanel_tituloLayout);
        jPanel_tituloLayout.setHorizontalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tituloLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel_titulo_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel_tituloLayout.setVerticalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo_pos, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_container_main.add(jPanel_titulo);
        jPanel_titulo.setBounds(274, 28, 226, 41);

        jLabel_adicionales_pos.setText("ADICIONALES");
        jPanel_container_main.add(jLabel_adicionales_pos);
        jLabel_adicionales_pos.setBounds(550, 250, 90, 16);

        jTextArea_adicionales_pos.setColumns(20);
        jTextArea_adicionales_pos.setRows(5);
        jScrollPane1.setViewportView(jTextArea_adicionales_pos);

        jPanel_container_main.add(jScrollPane1);
        jScrollPane1.setBounds(550, 270, 180, 90);

        jPanel_botones_grupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_Registrar_pos.setText("REGISTRAR");
        jButton_Registrar_pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Registrar_posActionPerformed(evt);
            }
        });

        jButton_Modificar_pos.setText("MODIFICAR");

        jButton_Eliminar_pos.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel_botones_grupoLayout = new javax.swing.GroupLayout(jPanel_botones_grupo);
        jPanel_botones_grupo.setLayout(jPanel_botones_grupoLayout);
        jPanel_botones_grupoLayout.setHorizontalGroup(
            jPanel_botones_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botones_grupoLayout.createSequentialGroup()
                .addComponent(jButton_Registrar_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton_Modificar_pos)
                .addGap(18, 18, 18)
                .addComponent(jButton_Eliminar_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel_botones_grupoLayout.setVerticalGroup(
            jPanel_botones_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botones_grupoLayout.createSequentialGroup()
                .addGroup(jPanel_botones_grupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Registrar_pos)
                    .addComponent(jButton_Modificar_pos)
                    .addComponent(jButton_Eliminar_pos))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel_container_main.add(jPanel_botones_grupo);
        jPanel_botones_grupo.setBounds(30, 490, 340, 40);

        jPanel_Table.setBorder(new javax.swing.border.MatteBorder(null));

        jScrollPane_Tabla_pos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane_Tabla_posMouseClicked(evt);
            }
        });

        jTable_Table_pos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Table_pos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable_Table_pos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane_Tabla_pos.setViewportView(jTable_Table_pos);
        jTable_Table_pos.getAccessibleContext().setAccessibleParent(jScrollPane1);

        jScrollPane2.setViewportView(jScrollPane_Tabla_pos);

        javax.swing.GroupLayout jPanel_TableLayout = new javax.swing.GroupLayout(jPanel_Table);
        jPanel_Table.setLayout(jPanel_TableLayout);
        jPanel_TableLayout.setHorizontalGroup(
            jPanel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TableLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_TableLayout.setVerticalGroup(
            jPanel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TableLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_container_main.add(jPanel_Table);
        jPanel_Table.setBounds(750, 30, 530, 480);

        jPanel_datosCliente_pos.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL CLIENTE"));

        jLabel_linea_pos.setText("LINEA");

        jLabel_tipocc_pos.setText("TIPO DE CC");

        jComboBox_tipocc_pos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "CE", "NIT", "PAS" }));
        jComboBox_tipocc_pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_tipocc_posActionPerformed(evt);
            }
        });

        jLabel_cc_pos.setText("IDENTIFICACIÓN");

        jTextField_cedula_pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cedula_posActionPerformed(evt);
            }
        });

        jLabel_nombre_pos.setText("NOMBRE");

        jLabel_email_pos.setText("EMAIL");

        javax.swing.GroupLayout jPanel_datosCliente_posLayout = new javax.swing.GroupLayout(jPanel_datosCliente_pos);
        jPanel_datosCliente_pos.setLayout(jPanel_datosCliente_posLayout);
        jPanel_datosCliente_posLayout.setHorizontalGroup(
            jPanel_datosCliente_posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datosCliente_posLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_datosCliente_posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_nombre_pos)
                    .addGroup(jPanel_datosCliente_posLayout.createSequentialGroup()
                        .addGroup(jPanel_datosCliente_posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_linea_pos)
                            .addComponent(jLabel_tipocc_pos)
                            .addComponent(jLabel_nombre_pos)
                            .addComponent(jLabel_email_pos)
                            .addGroup(jPanel_datosCliente_posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox_tipocc_pos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_cc_pos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 139, Short.MAX_VALUE))
                    .addComponent(jTextField_linea_pos)
                    .addComponent(jTextField_cedula_pos)
                    .addComponent(jTextField_email_pos))
                .addContainerGap())
        );
        jPanel_datosCliente_posLayout.setVerticalGroup(
            jPanel_datosCliente_posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datosCliente_posLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel_linea_pos)
                .addGap(4, 4, 4)
                .addComponent(jTextField_linea_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_tipocc_pos)
                .addGap(14, 14, 14)
                .addComponent(jComboBox_tipocc_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_cc_pos)
                .addGap(14, 14, 14)
                .addComponent(jTextField_cedula_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_nombre_pos)
                .addGap(14, 14, 14)
                .addComponent(jTextField_nombre_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_email_pos)
                .addGap(14, 14, 14)
                .addComponent(jTextField_email_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_container_main.add(jPanel_datosCliente_pos);
        jPanel_datosCliente_pos.setBounds(10, 90, 250, 370);

        jPanel_datosProcesos.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DE PROCESOS"));

        jLabel_plan.setText("PLAN");

        jLabel_nip_pos.setText("NIP");

        jLabel_imsi_pos.setText("IMSI");

        jTextField_imsi_pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_imsi_posActionPerformed(evt);
            }
        });

        jLabel_dumi_pos.setText("DUMI");

        jTextField_dumi_pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dumi_posActionPerformed(evt);
            }
        });

        jLabel_categoria_plan.setText(" CATEGORIA / PLAN");

        javax.swing.GroupLayout jPanel_datosProcesosLayout = new javax.swing.GroupLayout(jPanel_datosProcesos);
        jPanel_datosProcesos.setLayout(jPanel_datosProcesosLayout);
        jPanel_datosProcesosLayout.setHorizontalGroup(
            jPanel_datosProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datosProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_datosProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_imsi_pos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_plan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_categoria_plan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_datosProcesosLayout.createSequentialGroup()
                        .addGroup(jPanel_datosProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_categoria_plan)
                            .addComponent(jTextField_nip_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_nip_pos)
                            .addComponent(jLabel_imsi_pos)
                            .addComponent(jLabel_dumi_pos)
                            .addComponent(jTextField_dumi_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_plan))
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_datosProcesosLayout.setVerticalGroup(
            jPanel_datosProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datosProcesosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel_categoria_plan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_categoria_plan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel_plan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_plan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_nip_pos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_nip_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel_imsi_pos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_imsi_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel_dumi_pos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_dumi_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel_container_main.add(jPanel_datosProcesos);
        jPanel_datosProcesos.setBounds(280, 90, 250, 370);

        jPanel_datosTigoDcs.setBorder(javax.swing.BorderFactory.createTitledBorder("TIGO DOCS"));

        jLabel_contratotdc_pos.setText("CONTRATO TDC");

        jComboBox_contratotdc_pos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jComboBox_contratotdc_pos.setToolTipText("");

        jLabel_cesionprepago_pos.setText("CESION PREPAGO");

        jComboBox_cesionprepago_pos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        javax.swing.GroupLayout jPanel_datosTigoDcsLayout = new javax.swing.GroupLayout(jPanel_datosTigoDcs);
        jPanel_datosTigoDcs.setLayout(jPanel_datosTigoDcsLayout);
        jPanel_datosTigoDcsLayout.setHorizontalGroup(
            jPanel_datosTigoDcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datosTigoDcsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_datosTigoDcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_contratotdc_pos)
                    .addComponent(jComboBox_contratotdc_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_cesionprepago_pos)
                    .addComponent(jComboBox_cesionprepago_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel_datosTigoDcsLayout.setVerticalGroup(
            jPanel_datosTigoDcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_datosTigoDcsLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel_contratotdc_pos)
                .addGap(4, 4, 4)
                .addComponent(jComboBox_contratotdc_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_cesionprepago_pos)
                .addGap(4, 4, 4)
                .addComponent(jComboBox_cesionprepago_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_container_main.add(jPanel_datosTigoDcs);
        jPanel_datosTigoDcs.setBounds(550, 90, 190, 140);

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });
        jPanel_container_main.add(jTextField_ID);
        jTextField_ID.setBounds(50, 50, 71, 22);

        jLabel2.setText("ID");
        jPanel_container_main.add(jLabel2);
        jLabel2.setBounds(20, 50, 20, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_container_main, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container_main, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_tipocc_posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_tipocc_posActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_tipocc_posActionPerformed

    private void jTextField_cedula_posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cedula_posActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cedula_posActionPerformed

    private void jTextField_imsi_posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_imsi_posActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_imsi_posActionPerformed

    private void jButton_Registrar_posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Registrar_posActionPerformed
        VentasController ventasContoller = new VentasController();
        ventasContoller.InsertVentasAsesor(
                jTextField_linea_pos, jComboBox_tipocc_pos, jTextField_cedula_pos, 
                jTextField_nombre_pos, jTextField_email_pos, jTextField_categoria_plan, jTextField_plan, 
                jTextField_nip_pos, jTextField_imsi_pos, jTextField_dumi_pos, jComboBox_contratotdc_pos, 
                jComboBox_cesionprepago_pos, jTextArea_adicionales_pos);
        //ventasContoller.DisplayVentasAsesor(jTable_Table_pos);
    }//GEN-LAST:event_jButton_Registrar_posActionPerformed

    private void jButton_prepagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_prepagoActionPerformed
        // TODO add your handling code her
    }//GEN-LAST:event_jButton_prepagoActionPerformed

    private void jTextField_dumi_posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dumi_posActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dumi_posActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jScrollPane_Tabla_posMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane_Tabla_posMouseClicked
        // TODO add your handling code here:
        VentasController ventasControll = new VentasController();
        ventasControll.SelectUpdateVentasAsesor(
            jTable_Table_pos, jTextField_ID, jTextField_linea_pos, jComboBox_tipocc_pos, jTextField_cedula_pos,
            jTextField_nombre_pos, jTextField_email_pos, jTextField_categoria_plan, jTextField_plan, jTextField_nip_pos, jTextField_imsi_pos,
            jTextField_dumi_pos, jComboBox_contratotdc_pos, jComboBox_cesionprepago_pos, jTextArea_adicionales_pos);
    }//GEN-LAST:event_jScrollPane_Tabla_posMouseClicked

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
            java.util.logging.Logger.getLogger(Form_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_Ventas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Eliminar_pos;
    private javax.swing.JButton jButton_Modificar_pos;
    private javax.swing.JButton jButton_Registrar_pos;
    private javax.swing.JButton jButton_hogar;
    private javax.swing.JButton jButton_prepago;
    private javax.swing.JButton jButton_previous;
    private javax.swing.JComboBox<String> jComboBox_cesionprepago_pos;
    private javax.swing.JComboBox<String> jComboBox_contratotdc_pos;
    private javax.swing.JComboBox<String> jComboBox_tipocc_pos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_adicionales_pos;
    private javax.swing.JLabel jLabel_categoria_plan;
    private javax.swing.JLabel jLabel_cc_pos;
    private javax.swing.JLabel jLabel_cesionprepago_pos;
    private javax.swing.JLabel jLabel_contratotdc_pos;
    private javax.swing.JLabel jLabel_dumi_pos;
    private javax.swing.JLabel jLabel_email_pos;
    private javax.swing.JLabel jLabel_imsi_pos;
    private javax.swing.JLabel jLabel_linea_pos;
    private javax.swing.JLabel jLabel_nip_pos;
    private javax.swing.JLabel jLabel_nombre_pos;
    private javax.swing.JLabel jLabel_plan;
    private javax.swing.JLabel jLabel_tipocc_pos;
    private javax.swing.JLabel jLabel_titulo_pos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Table;
    private javax.swing.JPanel jPanel_botones_grupo;
    private javax.swing.JPanel jPanel_container_main;
    private javax.swing.JPanel jPanel_datosCliente_pos;
    private javax.swing.JPanel jPanel_datosProcesos;
    private javax.swing.JPanel jPanel_datosTigoDcs;
    private javax.swing.JPanel jPanel_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane_Tabla_pos;
    private javax.swing.JTable jTable_Table_pos;
    private javax.swing.JTextArea jTextArea_adicionales_pos;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_categoria_plan;
    private javax.swing.JTextField jTextField_cedula_pos;
    private javax.swing.JTextField jTextField_dumi_pos;
    private javax.swing.JTextField jTextField_email_pos;
    private javax.swing.JTextField jTextField_imsi_pos;
    private javax.swing.JTextField jTextField_linea_pos;
    private javax.swing.JTextField jTextField_nip_pos;
    private javax.swing.JTextField jTextField_nombre_pos;
    private javax.swing.JTextField jTextField_plan;
    // End of variables declaration//GEN-END:variables
}
