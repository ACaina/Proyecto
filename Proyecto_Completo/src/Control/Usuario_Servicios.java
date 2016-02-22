
package Control;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Usuario_Servicios {
    private final String usuario = "USUARIOS";
    private Connection cnx = null;
    private Statement St = null;
    private ResultSet Rs = null;
    public void guardar(Connection conexion, Usuario usuario) throws SQLException{
        try{
            PreparedStatement consulta;           
                consulta = conexion.prepareStatement("INSERT INTO " + this.usuario + "(Usuario, Contraseña, Id_Usuario) VALUES(?, ?, ?)");
                consulta.setString(1, usuario.getUsuario());
                consulta.setString(2, usuario.getContraseña());
                consulta.setString(3, usuario.getId_Usuario());
                consulta.executeUpdate();
                JOptionPane.showMessageDialog(null,"Ingreso existoso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ingreso incorrecto"+ex);
            throw new SQLException(ex);
        }
    }    
    public Usuario recuperarPorId(Connection conexion, String Id_Usuario) throws SQLException {
        Usuario us = null;
        try{
            
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.usuario + " WHERE Id_Usuario = ?" );
            consulta.setString(1, Id_Usuario);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                us= new Usuario(resultado.getString("Usuario"),resultado.getString("Contraseña"),Id_Usuario);
            }
            
        }catch(SQLException ex){            
            throw new SQLException(ex);            
        }
        return us;                
    }    
    public Usuario InicioSesion(Connection conexion, String Usuario,String Contraseña) throws SQLException {
        Usuario us = null;
        try{
            
            PreparedStatement consulta = conexion.prepareStatement("SELECT Usuario,Contraseña FROM " + this.usuario + " WHERE Usuario = ? and Contraseña=?" );
            consulta.setString(1, Usuario);
            consulta.setString(2, Contraseña);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                us= new Usuario(Usuario,Contraseña);
            }
            
        }catch(SQLException ex){            
            throw new SQLException(ex);            
        }
        return us;                
    }
    
public void Modificar(Connection conexion, Usuario us) throws SQLException{
        try{             
            PreparedStatement consulta;             
            consulta = conexion.prepareStatement("UPDATE " + this.usuario + " SET Usuario = ?, Contraseña = ? WHERE Id_Usuario = ?");                               
            consulta.setString(1, us.getUsuario());
            consulta.setString(2, us.getContraseña());                       
            consulta.setString(3, us.getId_Usuario());          
            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Modificación Exitosa");
             
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha Modificado"+ex);
            throw new SQLException(ex);           
        }
    } 
    
    public void eliminar(Connection conexion, Usuario us) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.usuario + " WHERE Id_Usuario = ?");
            consulta.setString(1, us.getId_Usuario());
            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Eliminación correcta");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido eliminar"+ex);
            throw new SQLException(ex);           
        }
    }  
}
