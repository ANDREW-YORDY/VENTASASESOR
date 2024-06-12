
package com.persistence;

import com.ui.CustomComponent;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class DatabaseConnection {
    
    String user  = "rootDB";
    String passw = "1611propio";
    String DB    = "DBVentasAsesor"; // -> Verificar la excepcion con relacion a esta variable.
    String pto   = "1433";
    String ip    = "localhost";
    
    Connection conn = null; 
    
    public Connection DBGoToConnection(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String StrDB = "jdbc:sqlserver://"+ip+":"+pto+";"+"databaseName="+DB+";"+"encrypt=true;trustServerCertificate=true";
            conn = DriverManager.getConnection(StrDB, user, passw);
            
            // clase diseñadora, invocando el método creado para dimensiona JOptionPanne.
            CustomComponent.showCustomMessage("CONEXIÓN EXITOSA! A LA DB.", "Éxito", 300, 100, JOptionPane.INFORMATION_MESSAGE);
            //JOptionPane.showMessageDialog(null, "CONEXÓN EXITOSA!... A LA DB.");
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();  // Imprimir el stack trace para depurar
            CustomComponent.showCustomMessage("CONEXIÓN FALLIDA! A LA DB.", "Error", 300, 100, JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(null, "CONEXÓN FALLIDA ... A LA DB.");
        }
        return conn;
    }


    
}
