/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Prestamo {
    String Codigo_Prestamo;
    Double Monto;
    String Duracion;
    String Destino;
    String FechaEmi;

    public Prestamo() {
        this.Codigo_Prestamo = "";
        this.Monto = 0.0;
        this.Duracion = "";
        this.Destino = "";
        this.FechaEmi = "";
    }
    public Prestamo(String Codigo_Prestamo, Double Monto, String Duracion, String Destino, String Fecha) {
        this.Codigo_Prestamo = Codigo_Prestamo;
        this.Monto = Monto;
        this.Duracion = Duracion;
        this.Destino = Destino;
        this.FechaEmi = Fecha;
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

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getFechaEmi() {
        return FechaEmi;
    }

    public void setFechaEmi(String FechaEmi) {
        this.FechaEmi = FechaEmi;
    }

   
    
    
}
