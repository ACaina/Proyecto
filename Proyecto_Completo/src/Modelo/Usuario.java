
package Modelo;

public class Usuario {
    String Usuario;
    String Contraseña;
    String Id_Usuario;

      public Usuario() {
        this.Usuario = "";
        this.Contraseña = "";
        this.Id_Usuario= "";
    }

    public Usuario(String Usuario, String Contraseña, String Id_Usuario) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Id_Usuario = Id_Usuario;
    }

    public Usuario(String Usuario, String Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    public String getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(String Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }


    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
}
