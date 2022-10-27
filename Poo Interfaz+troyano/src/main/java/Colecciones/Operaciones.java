package Colecciones;

import java.util.Scanner;

public class Operaciones {
    public static Scanner Entrada = new Scanner(System.in);    
    public Operaciones(){
        
    }

  public int ValidarRol(){
    
    String cadena = Entrada.next();
    
    while(!cadena.matches("[1-2]*")){
      System.out.println("Dato no válido");
      cadena = Entrada.next();
    }
    return Integer.valueOf(cadena);
  }

  public int ValidarInt(){
    
    String cadena = Entrada.next();
    
    while(!cadena.matches("[0-9]*")){
      System.out.println("Dato no válido");
      cadena = Entrada.next();
    }
    return Integer.valueOf(cadena);
  }
 public char ValidarChar(){
        String cadena =Entrada.next();
        if(cadena.length() == 1 && cadena.matches("[A-Z]*"))
            return cadena.charAt(0);
        else 
           System.out.println("Dato no válido");
        
        return 0;
}
  public String ValidarCadena(){
      String cadena=Entrada.next();
      if(cadena.matches("[A-Za-z]*"))
        return cadena;
      else
        System.out.println("Dato no válido");
      return null;
  }
}
