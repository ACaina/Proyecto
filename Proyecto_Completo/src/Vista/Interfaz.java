/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Conexion;
import java.sql.Connection;
import java.sql.SQLException;


public class Interfaz {

        public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Conexion cnx = new Conexion();
        Connection c = cnx.obtener();
        
    }
}