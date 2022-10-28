package Usuarios;
import Colecciones.Operaciones;

public class Administrador extends Usuario{
    
    private String nombre;
    
    Operaciones operaciones = new Operaciones();

    public Administrador(String nombre, String nombreUsuario, String clave) {
        super(nombreUsuario, clave);
        this.nombre = nombre;
    }
    
    @Override
    public void crearUsuario(){
        System.out.println("CREANDO ADMINISTRADOR");
        System.out.println("Ingrese su nombre");
        this.nombre = operaciones.ValidarCadenaAlfa();        
        System.out.println("Ingrese su nombre de usuario");
        String nombreUsuario = operaciones.ValidarNUsuario();
        System.out.println("Ingrese su contraseña");
        String clave = operaciones.ValidarClave();
        
        setNombreUsuario(nombreUsuario);
        setClave(clave);
    }
    
    
}
