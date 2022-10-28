package Usuarios;
import Colecciones.Operaciones;

public class Administrador extends Usuario{
    
    Operaciones operaciones = new Operaciones();

    @Override
    public void crearUsuario(){
        System.out.println("Ingrese su nombre de usuario");
        String nombreUsuario = operaciones.ValidarNUsuario();
        System.out.println("Ingrese su contraseña");
        String clave = operaciones.ValidarClave();
        
        setNombreUsuario(nombreUsuario);
        setClave(clave);
    }
    
    
    
}
