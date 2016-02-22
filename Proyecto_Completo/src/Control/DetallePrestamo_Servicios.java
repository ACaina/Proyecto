
package Control;

import Modelo.DetallePrestamo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DetallePrestamo_Servicios {
    private final String detalle = "DETALLE_PRESTAMO";  
    public void guardar(Connection conexion, DetallePrestamo det) throws SQLException{
        try{
            PreparedStatement consulta;           
                consulta = conexion.prepareStatement("INSERT INTO " + this.detalle + "(codcliente, codprestamo,destino,fechaemision) VALUES(?, ?, ?,?)");
                consulta.setString(1, det.getCodigocliente());
                consulta.setString(2, det.getCodigoprestamo());
                consulta.setString(3, det.getDestino());
                consulta.setString(4, det.getFechaemision());
                consulta.executeUpdate();
                JOptionPane.showMessageDialog(null,"Ingreso existoso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ingreso incorrecto"+ex);
            throw new SQLException(ex);
        }
    }    
    public DetallePrestamo recuperarPorId(Connection conexion, String cod) throws SQLException {
        DetallePrestamo det = null;
        try{
            
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.detalle + " WHERE codcliente = ?" );
            consulta.setString(1, cod);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                det= new DetallePrestamo(cod,resultado.getString("codprestamo"),resultado.getString("destino"),resultado.getString("fechaemision"));
            }
            
        }catch(SQLException ex){            
            throw new SQLException(ex);            
        }
        return det;                
    }    
   
public void Modificar(Connection conexion, DetallePrestamo det) throws SQLException{
        try{             
            PreparedStatement consulta;             
                consulta = conexion.prepareStatement("UPDATE " + this.detalle + " SET codprestamo = ?, destino = ?, fechaemision = ? WHERE codcliente = ?");                                               
                consulta.setString(1, det.getCodigoprestamo());
                consulta.setString(2, det.getDestino());
                consulta.setString(3, det.getFechaemision()); 
                consulta.setString(4, det.getCodigocliente());
                consulta.executeUpdate();
                JOptionPane.showMessageDialog(null,"Modificación Exitosa");
             
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha Modificado"+ex);
            throw new SQLException(ex);           
        }
    } 
    
    public void eliminar(Connection conexion, DetallePrestamo det) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.detalle + " WHERE codcliente = ?");
            consulta.setString(1, det.getCodigocliente());
            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Eliminación correcta");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido eliminar"+ex);
            throw new SQLException(ex);           
        }
    }  
    public List<DetallePrestamo> recuperarTodas(Connection conexion) throws SQLException{
        List<DetallePrestamo> ve = new ArrayList<>();
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.detalle);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                ve.add(new DetallePrestamo(resultado.getString("codcliente"),resultado.getString("codprestamo"),resultado.getString("destino"),resultado.getString("fechaemision")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return ve;                                    
    }
}
