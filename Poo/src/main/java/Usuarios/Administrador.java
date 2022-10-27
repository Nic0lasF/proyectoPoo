package Usuarios;

import java.util.Scanner;

public class Administrador extends Usuario{
    
    Scanner entrada = new Scanner(System.in);
    
   
    @Override
    public void crearUsuario(){
        System.out.println("Ingrese su nombre de usuario");
        String nombreUsuario = entrada.next();
        System.out.println("Ingrese su contraseña");
        String clave = entrada.next();
        
        setNombreUsuario(nombreUsuario);
        setClave(clave);
    }
    
    
    
}
