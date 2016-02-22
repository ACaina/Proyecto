
package Control;


import Modelo.Prestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Prestamo_Servicios {
    private final String pres = "PRESTAMO";
        
    
    public void guardar(Connection conexion, Prestamo prestamo) throws SQLException{
        try{
            PreparedStatement consulta;           
                consulta = conexion.prepareStatement("INSERT INTO " + this.pres + "(codigo, monto, duracion, tipoprestamo) VALUES(?, ?, ?,?)");
                consulta.setString(1, prestamo.getCodigo_Prestamo());
                consulta.setDouble(2, prestamo.getMonto());
                consulta.setString(3, prestamo.getDuracion());
                consulta.setString(4, prestamo.getTipoPrestamo());
                consulta.executeUpdate();
                JOptionPane.showMessageDialog(null,"Ingreso existoso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Ingreso incorrecto"+ex);
            throw new SQLException(ex);
        }
    }    
    public Prestamo recuperarPorId(Connection conexion, String codigo) throws SQLException {
        Prestamo prest = null;
        try{
            
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.pres + " WHERE codigo = ?" );
            consulta.setString(1, codigo);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                prest= new Prestamo(codigo,resultado.getDouble("monto"),resultado.getString("duracion"),resultado.getString("tipoprestamo"));
            }
            
        }catch(SQLException ex){            
            throw new SQLException(ex);            
        }
        return prest;                
    }    
   
public void Modificar(Connection conexion, Prestamo prestamo) throws SQLException{
        try{             
            PreparedStatement consulta;             
                consulta = conexion.prepareStatement("UPDATE " + this.pres + " SET monto = ?, duracion = ?, tipoprestamo = ? WHERE codigo = ?");                                               
                consulta.setDouble(1, prestamo.getMonto());
                consulta.setString(2, prestamo.getDuracion());
                consulta.setString(3, prestamo.getTipoPrestamo()); 
                consulta.setString(4, prestamo.getCodigo_Prestamo());
                consulta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Modificación Exitosa");
             
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha Modificado"+ex);
            throw new SQLException(ex);           
        }
    } 
    
    public void eliminar(Connection conexion, Prestamo prestamo) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.pres + " WHERE codigo = ?");
            consulta.setString(1, prestamo.getCodigo_Prestamo());
            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Eliminación correcta");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido eliminar"+ex);
            throw new SQLException(ex);           
        }
    }  
    public List<Prestamo> recuperarTodas(Connection conexion) throws SQLException{
        List<Prestamo> ve = new ArrayList<>();
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + this.pres + " ORDER BY codigo");
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                ve.add(new Prestamo(resultado.getString("codigo"),resultado.getDouble("monto"),resultado.getString("duracion"),resultado.getString("tipoprestamo")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return ve;                                    
    }
}
