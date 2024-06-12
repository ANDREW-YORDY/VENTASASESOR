
package com.ui;

import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/*
 *** Clase, para diseñar y dimencionar los JComponents del JFrame Forms, o Interfaz  gráfica.
*/
public class CustomComponent {
    
    public static void setCustomDimensions(JComponent label, int width, int height){
        
        label.setPreferredSize(new java.awt.Dimension(width, height));
    }
    
    public static void showCustomMessage(String message, String title, int width, int heigth, int messageType)
    {
        JLabel label = new JLabel(message);
        setCustomDimensions(label, width, heigth);
        JOptionPane.showMessageDialog(null, label, title, messageType);
    }
    
    @SuppressWarnings("empty-statement")
    public static void setTableColumWidths(JTable table, int[] columnWidths)
    {
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for(int x = 0; x < table.getColumnCount(); x++){
            TableColumn column = table.getColumnModel().getColumn(x);
            column.setPreferredWidth(columnWidths[x]);
        };
    }
    
}
