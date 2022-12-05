package Usuarios;
import Colecciones.Operaciones;

public abstract class Usuario {
    
    private String nombreUsuario; // nombre unico
    private String clave;
    private int rol;
    private Operaciones operaciones = new Operaciones();
    
    public Usuario(String nombreUsuario, String clave, int rol) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.rol = rol;
    }
    
    public Usuario(){
        
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public int getRol() {
        return rol;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public abstract void crearUsuario();
    
    public abstract String getDatosString();
    
}