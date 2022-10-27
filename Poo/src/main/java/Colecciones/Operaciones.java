package Colecciones;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.text.ParseException;

public class Operaciones {
    public static Scanner Entrada = new Scanner(System.in);    
    public String ValidarCadenaAlfa;
    public Operaciones(){
        
    }

  public int ValidarRol(){
    
    String cadena = Entrada.next();
    
    while(!cadena.matches("[1-2]*")){
      System.out.println("Número inválido, por favor ingrese otro");
      cadena = Entrada.next();
    }
    return Integer.valueOf(cadena);
  }

  public int ValidarInt(){
    
    String cadena = Entrada.next();
    
    while(!cadena.matches("[0-9]*")){
      System.out.println("Número inválido, por favor ingrese otro");
      cadena = Entrada.next();
    }
    return Integer.valueOf(cadena);
  }
  public char ValidarChar(){
        String cadena = Entrada.next();
        if(cadena.length() == 1 && cadena.matches("[A-Z]*"))
            return cadena.charAt(0);
        else 
           System.out.println("Dato no válido, vuelva a ingresar otro");
        
        return 0;
}
  public String ValidarCadenaAlfa(){
    String cadena=Entrada.next();
      
    while(!cadena.matches("[A-Za-z]*")){
      System.out.println("Dato no válido");
      System.out.println("Vuelva a ingresarlo.");
      cadena = Entrada.next();
    }
      return cadena;
  }
  public String ValidarRut(){
    
    String cadena = Entrada.next();
    
    while(!cadena.matches("[0-9+k]*\\w{9}")){
      System.out.println("Dato no válido");
      System.out.println("Ingrese su rut nuevamente.");
      cadena = Entrada.next();
    }
    return cadena;
  }

  public Date ValidarFecha(){
    
    String fechaEntrada = Entrada.next();
    Date fecha = null;
    
    try {
      fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaEntrada);
    } catch (ParseException e){
      e.printStackTrace();
    }

    return fecha;
  }
  
}  