package Usuarios;

import Colecciones.Operaciones;

public class Administrador extends Usuario{
    
    Operaciones operaciones = new Operaciones();
    
   
    @Override
    public void crearUsuario(){
        
        System.out.println("--------CREANDO NUEVA CUENTA DE ADMINISTRADOR--------");
        
        String nombreUsuario = operaciones.ValidarNUsuario();
        
        String clave = operaciones.ValidarClave();
        
        setNombreUsuario(nombreUsuario);
        setClave(clave);
        
    }
    
    
    
}
