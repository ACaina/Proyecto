/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {

   private static Connection cnx = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (cnx == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                cnx = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bd_music","sa","admin001");
                //cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/Concesionaria?zeroDateTimeBehavior=convertToNull","root","");
                //jdbc:mysql://localhost:3306/bd_music?zeroDateTimeBehavior=convertToNull [root on Default schema]
            System.out.println("Conexion Exitosa");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return cnx;
    }
    
    public boolean crearConexion() throws ClassNotFoundException
    {
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                cnx = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bd_music","sa","admin001");
                //jdbc:mysql://localhost:3306/bd_music?zeroDateTimeBehavior=convertToNull [root on Default schema]
                System.out.println("Conexion Exitosa");
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            return false; 
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
            return false; 
        }
        
        return true; 
    }
    
        public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
        

}
