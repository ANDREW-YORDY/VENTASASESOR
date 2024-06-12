package com.main;

import com.persistence.DatabaseConnection;
import com.view.Form_Ventas;


public class VENTASASESOR {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // view
        Form_Ventas FormVentas = new Form_Ventas();
        FormVentas.setVisible(true);
        FormVentas.setLocationRelativeTo(null);
        FormVentas.UpdateTableVentas();

        // persistence
        DatabaseConnection DBConn = new DatabaseConnection();
        DBConn.DBGoToConnection();
        


    }
}
