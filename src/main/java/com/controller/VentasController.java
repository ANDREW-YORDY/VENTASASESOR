package com.controller;

import com.persistence.DatabaseConnection;
import com.ui.CustomComponent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentasController {

    public void DisplayVentasAsesor(JTable ParamVentasPos) {
        DatabaseConnection conn = new DatabaseConnection();
        DefaultTableModel TabModel = new DefaultTableModel();

        TabModel.addColumn("id");
        TabModel.addColumn("linea");
        TabModel.addColumn("tipo_ident");
        TabModel.addColumn("identificacion");
        TabModel.addColumn("nombre_cliente");
        TabModel.addColumn("email");
        TabModel.addColumn("imsi");
        TabModel.addColumn("dummi");
        TabModel.addColumn("nip");
        TabModel.addColumn("plann");
        TabModel.addColumn("categoria_plan");
        TabModel.addColumn("contrato_tdc");
        TabModel.addColumn("cesion_pre");
        TabModel.addColumn("adicionales");

        ParamVentasPos.setModel(TabModel);

        String query = "SELECT * FROM ventasPos;";

        try (Statement stm = conn.DBGoToConnection().createStatement(); ResultSet rs = stm.executeQuery(query)) {
            while (rs.next()) {
                String[] data = new String[14];
                for (int i = 0; i < 14; i++) {
                    data[i] = rs.getString(i + 1);
                }
                TabModel.addRow(data);
            }
        } catch (SQLException e) {
            CustomComponent.showCustomMessage("FATAL ERROR! -> No se insertaron los registros.", "Error", 300, 100, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void SelectUpdateVentasAsesor(
            JTable ParamTabVentasPos, JTextField ParamId, JTextField jTextField_linea_pos, JComboBox<String> jComboBox_tipocc_pos,
            JTextField jTextField_cedula_pos, JTextField jTextField_nombre_pos, JTextField jTextField_email_pos,
            JTextField jTextField_categoria_plan, JTextField jTextField_plan, JTextField jTextField_nip_pos,
            JTextField jTextField_imsi_pos, JTextField jTextField_dumi_pos, JComboBox<String> jComboBox_contratotdc_pos,
            JComboBox<String> jComboBox_cesionprepago_pos, JTextArea jTextArea_adicionales_pos
    ) {
        try {
            int row = ParamTabVentasPos.getSelectedRow();

            if (row >= 0) {
                ParamId.setText(ParamTabVentasPos.getValueAt(row, 0).toString());
                jTextField_linea_pos.setText(ParamTabVentasPos.getValueAt(row, 1).toString());
                jComboBox_tipocc_pos.setSelectedItem(ParamTabVentasPos.getValueAt(row, 2).toString());
                jTextField_cedula_pos.setText(ParamTabVentasPos.getValueAt(row, 3).toString());
                jTextField_nombre_pos.setText(ParamTabVentasPos.getValueAt(row, 4).toString());
                jTextField_email_pos.setText(ParamTabVentasPos.getValueAt(row, 5).toString());
                jTextField_categoria_plan.setText(ParamTabVentasPos.getValueAt(row, 6).toString());
                jTextField_plan.setText(ParamTabVentasPos.getValueAt(row, 7).toString());
                jTextField_nip_pos.setText(ParamTabVentasPos.getValueAt(row, 8).toString());
                jTextField_imsi_pos.setText(ParamTabVentasPos.getValueAt(row, 9).toString());
                jTextField_dumi_pos.setText(ParamTabVentasPos.getValueAt(row, 10).toString());
                jComboBox_contratotdc_pos.setSelectedItem(ParamTabVentasPos.getValueAt(row, 11).toString());
                jComboBox_cesionprepago_pos.setSelectedItem(ParamTabVentasPos.getValueAt(row, 12).toString());
                jTextArea_adicionales_pos.setText(ParamTabVentasPos.getValueAt(row, 13).toString());
            } else {
                CustomComponent.showCustomMessage("Error. No se seleccionó ninguna fila!", "ERROR", 300, 100, JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            CustomComponent.showCustomMessage("Error. No se logró seleccionar.", "ERROR", 300, 100, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void InsertVentasAsesor(
            JTextField jTextField_linea_pos, JComboBox<String> jComboBox_tipocc_pos,
            JTextField jTextField_cedula_pos, JTextField jTextField_nombre_pos, JTextField jTextField_email_pos,
            JTextField jTextField_categoria_plan, JTextField jTextField_plan, JTextField jTextField_nip_pos,
            JTextField jTextField_imsi_pos, JTextField jTextField_dumi_pos, JComboBox<String> jComboBox_contratotdc_pos,
            JComboBox<String> jComboBox_cesionprepago_pos, JTextArea jTextArea_adicionales_pos
    ) {
        DatabaseConnection conn = new DatabaseConnection();
        String Query = "INSERT INTO ventasPos linea,tipo_ident,identificacion,nombre_cliente,email,imsi,dummi,nip,categoria_plan,plann,ontrato_tdc,cesion_pre,adicionales) VALUES ('?','?','?','?','?','?','?','?','?','?','?','?','?');";
        try {
            CallableStatement cst = conn.DBGoToConnection().prepareCall(Query);

            // Isertando los datos de cada componente en laa DB.
            cst.setString(1, jTextField_linea_pos.getText());
            cst.setString(2, jComboBox_tipocc_pos.getSelectedItem().toString());
            cst.setString(3, jTextField_cedula_pos.getText());
            cst.setString(4, jTextField_nombre_pos.getText());
            cst.setString(5, jTextField_email_pos.getText());
            cst.setString(6, jTextField_categoria_plan.getText());
            cst.setString(7, jTextField_plan.getName());
            cst.setString(8, jTextField_nip_pos.getText());
            cst.setString(9, jTextField_imsi_pos.getText());
            cst.setString(10, jTextField_dumi_pos.getText());
            cst.setString(11, jComboBox_contratotdc_pos.getSelectedItem().toString());
            cst.setString(12, jTextField_nombre_pos.getText());
            cst.setString(13, jComboBox_cesionprepago_pos.getSelectedItem().toString());
            cst.setString(14, jTextArea_adicionales_pos.getText());

            cst.execute();

            CustomComponent.showCustomMessage("Datos insertados exitosamente  en el DB.", "ÉXITO", 300, 100, JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            CustomComponent.showCustomMessage("Datos No insertados en el DB.", "ERROR", 300, 100, JOptionPane.ERROR_MESSAGE);
        }

    }

}
