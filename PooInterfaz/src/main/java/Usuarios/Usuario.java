package Usuarios;
import Colecciones.Operaciones;

public class Usuario {
    
    private String nombreUsuario; // nombre unico
    private String clave;
    private Operaciones operaciones = new Operaciones();
    
    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }
    
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
        System.out.println("CREANDO USUARIO GENERICO");
        System.out.println("Ingrese su nombre de usuario");
        this.nombreUsuario = operaciones.ValidarNUsuario();
        System.out.println("Ingrese su contraseña");
        this.clave = operaciones.ValidarClave();
        
    }
}
