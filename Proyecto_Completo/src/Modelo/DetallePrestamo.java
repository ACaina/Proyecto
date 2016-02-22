
package Modelo;


public class DetallePrestamo {
    String codigocliente;
    String codigoprestamo;
    String destino;
    String fechaemision;   
    
   

    public DetallePrestamo() {
        this.codigocliente="";
        this.codigoprestamo="";
        this.destino="";
        this.fechaemision="";              
    }
   

    public DetallePrestamo(String codigocliente, String codigoprestamo, String destino, String fechaemision) {
        this.codigocliente = codigocliente;
        this.codigoprestamo = codigoprestamo;
        this.destino = destino;
        this.fechaemision = fechaemision;
    }

  

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getCodigoprestamo() {
        return codigoprestamo;
    }

    public void setCodigoprestamo(String codigoprestamo) {
        this.codigoprestamo = codigoprestamo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaemision() {
        return fechaemision;
    }

    public void setFechaemision(String fechaemision) {
        this.fechaemision = fechaemision;
    }
    
    
}
