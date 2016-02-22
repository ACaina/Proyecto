/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author BDSistemas
 */
public class Conexion {
    
    private static Connection cnx = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
       
        if (cnx == null) {
            
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                cnx = DriverManager.getConnection("jdbc:sqlserver://HP-HP:1433;databaseName=Cesantia","sa","1234");         
                System.out.println("Conexion Exitosa");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return cnx;
    }

    

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
    
}
