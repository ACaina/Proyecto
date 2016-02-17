/*
 * Andres Caina
 * Julio Sanaguano 
 * Thalia Veloz
 * Daniel Caceres
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Cliente {
    String Cedula;
    String Apellidos;
    String Nombres;
    String Direccion;
    String Telefono;
    Double Ing_Mensual;

    public Cliente(String Cedula, String Apellidos, String Nombres, String Direccion, String Telefono, Double Ing_Mensual) {
        this.Cedula = Cedula;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Ing_Mensual = Ing_Mensual;
    }
        public Cliente() {
        this.Cedula = "";
        this.Apellidos = "";
        this.Nombres = "";
        this.Direccion = "";
        this.Telefono = "";
        this.Ing_Mensual = 0.0;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Double getIng_Mensual() {
        return Ing_Mensual;
    }

    public void setIng_Mensual(Double Ing_Mensual) {
        this.Ing_Mensual = Ing_Mensual;
    }


    
    
    
    
}
