package Control;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cliente_Servicios {
        
    private final String tabla = "CLIENTES";
    public void guardar(Connection conexion, Cliente cliente) throws SQLException{
        try{
            PreparedStatement consulta; 
           
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(cedula,apellidos, nombres, direccion, telefono, ing_mensual,tipoempleo) VALUES(?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, cliente.getCedula());                          
            consulta.setString(2, cliente.getApellidos());
            consulta.setString(3, cliente.getNombres());
            consulta.setString(4, cliente.getDireccion());
            consulta.setString(5, cliente.getTelefono());
            consulta.setDouble(6, cliente.getIng_Mensual());
            consulta.setString(7, cliente.getTipoem());
            consulta.executeUpdate();             
            
            JOptionPane.showMessageDialog(null,"Ingreso existoso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ingreso incorrecto"+ex);
            throw new SQLException(ex);           
        }
    }    
    public Cliente recuperarPorId(Connection conexion, String cedula) throws SQLException {
        Cliente cli = null;
        try{
            
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.tabla + " WHERE cedula = ?" );
            
            consulta.setString(1, cedula);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                cli = new Cliente(cedula,resultado.getString("apellidos"),resultado.getString("nombres"),resultado.getString("direccion"),resultado.getString("telefono"),resultado.getDouble("ing_mensual"),resultado.getString("tipoempleo"));
            }
            
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return cli;                
    }    
   
public void Modificar(Connection conexion, Cliente cliente) throws SQLException{
        try{             
            PreparedStatement consulta;             
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET apellidos = ?, nombres = ? , direccion = ?, telefono = ?, ing_mensual = ?, tipoempleo = ? WHERE cedula = ?");                               
            consulta.setString(1, cliente.getApellidos());
            consulta.setString(2, cliente.getNombres());
            consulta.setString(3, cliente.getDireccion());
            consulta.setString(4, cliente.getTelefono());
            consulta.setDouble(5, cliente.getIng_Mensual());
            consulta.setString(6, cliente.getTipoem());
            consulta.setString(7, cliente.getCedula());          
            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Modificación Exitosa");
             
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha Modificado"+ex);
            throw new SQLException(ex);           
        }
    } 
    
    public void eliminar(Connection conexion, Cliente cliente) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE cedula = ?");
            consulta.setString(1, cliente.getCedula());
            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Eliminación correcta");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido eliminar"+ex);
            throw new SQLException(ex);           
        }
    }  
    public List<Cliente> recuperarTodas(Connection conexion) throws SQLException{
        List<Cliente> ve = new ArrayList<>();
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.tabla + " ORDER BY cedula");
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                ve.add(new Cliente(resultado.getString("cedula"),resultado.getString("apellidos"),resultado.getString("nombres"),resultado.getString("direccion"),resultado.getString("telefono"),resultado.getDouble("ing_mensual"),resultado.getString("tipoempleo")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return ve;                                    
    }
}