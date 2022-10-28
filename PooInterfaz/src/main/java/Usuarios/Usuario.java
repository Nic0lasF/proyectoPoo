package Usuarios;
import Colecciones.Operaciones;


public class Usuario {
    
    private String nombreUsuario; // nombre unico
    private String clave;
    private Operaciones operaciones = new Operaciones();
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void crearUsuario(){
        this.nombreUsuario =  operaciones.ValidarNUsuario();
        this.clave = operaciones.ValidarClave();
    }
}
