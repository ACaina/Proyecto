
package Modelo;

public class Prestamo {
    String Codigo_Prestamo;
    Double Monto;
    String Duracion;
    String TipoPrestamo;

    public Prestamo() {
        this.Codigo_Prestamo = "";
        this.Monto = 0.0;
        this.Duracion = "";
        this.TipoPrestamo = "";
    }

    public Prestamo(String Codigo_Prestamo, Double Monto, String Duracion, String TipoPrestamo) {
        this.Codigo_Prestamo = Codigo_Prestamo;
        this.Monto = Monto;
        this.Duracion = Duracion;
        this.TipoPrestamo = TipoPrestamo;
    }
    

    public String getCodigo_Prestamo() {
        return Codigo_Prestamo;
    }

    public void setCodigo_Prestamo(String Codigo_Prestamo) {
        this.Codigo_Prestamo = Codigo_Prestamo;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }  

    public String getTipoPrestamo() {
        return TipoPrestamo;
    }

    public void setTipoPrestamo(String TipoPrestamo) {
        this.TipoPrestamo = TipoPrestamo;
    }
    
   
    
    
}
