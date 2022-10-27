package Colecciones;

import com.mycompany.poo.Poo;
import static com.mycompany.poo.Poo.coleccionMisiones;
import static com.mycompany.poo.Poo.coleccionRecompensas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operaciones {
    public static Scanner Entrada = new Scanner(System.in);    
    public String ValidarCadenaAlfa;
    public Operaciones(){
        
    }
    
//-----------------------Operaciones de validacion------------------------------
    
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
    
    while(!cadena.matches("\\d{8,9}+[k]?")){
      System.out.println("Dato no válido");
      System.out.println("Ingrese su rut nuevamente.");
      cadena = Entrada.next();
    }
    return cadena;
  }
  
  public Date ValidarFecha(){
    
    
    Date fecha = null;
    
    while(fecha == null){
        String fechaEntrada = Entrada.next();
        try {
          fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaEntrada);
        } catch (ParseException e){
        e.printStackTrace();
        }
        if(fecha == null){
            System.out.println("Dato no válido, ingrese nuevamente");
        }
        
    }
   
    return fecha;
  }
  
  public String ValidarNUsuario(){
      
      System.out.println("Ingrese su nombre de usuario (min. 4 caracteres y max. 10)");
      String cadena = Entrada.next();
      
      while(cadena.length() < 4 || cadena.length() > 10){
        System.out.println("Dato no válido");
        System.out.println("Vuelva a ingresarlo.");
        cadena = Entrada.next();
      }
      System.out.println("Nombre de usuario ingresado exitosamente.");
      return cadena;
      
  }
   public String ValidarClave(){
      
      System.out.println("Ingrese su contraseña (minimo 4 caracteres y max 10)");
      String cadena = Entrada.next();
      
      while(cadena.length() < 4 || cadena.length() > 10){
        System.out.println("Dato no válido");
        System.out.println("Vuelva a ingresarlo.");
        cadena = Entrada.next();
      }
      System.out.println("Contraseña creada exitosamente.");
      return cadena;
      
  }

//-----------------------Operaciones de Entrada/Salida--------------------------

  public void cargarRec(){
    // RECOMPENSAS
    try {
      BufferedReader archivo = new BufferedReader(new FileReader("src/test/recompensas.csv")); // loader/reader archivo

      String linea; // Linea actual
      while ((linea = archivo.readLine()) != null) { // Mientras existan lineas para leer
        if(!"".equals(linea)){
            String[] campos = linea.split(";"); // separar lineas en partes
            Date fecha = new SimpleDateFormat("dd/mm/yyyy").parse(campos[2]);
            coleccionRecompensas.add(new Recompensa(Integer.parseInt(campos[0]),campos[1].charAt(0), fecha, Integer.parseInt(campos[3])));
        }
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Poo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);
    } catch (ParseException e) {
      System.out.println(e);
    }
  }

  public void cargarMis() {
    // MISIONES
    try {
      BufferedReader archivo = new BufferedReader(new FileReader("src/test/misiones.csv")); // loader/reader archivo

      String linea; // Linea actual
      while ((linea = archivo.readLine()) != null) { // Mientras existan lineas para leer
        // System.out.println(linea);
        if(!"".equals(linea)){ //Si la linea NO esta vacia
            String[] campos = linea.split(";"); // separar lineas en partes
            coleccionMisiones.add(new Mision(Integer.parseInt(campos[0]),Integer.parseInt(campos[1]), campos[2].charAt(0),Boolean.parseBoolean(campos[3]), Integer.parseInt(campos[4])));
        }
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Poo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void guardarDatos(String datos, String nombre){
    String ruta = "src/test/"+nombre+".csv"; //Crear ruta en string
    File archivo = new File(ruta); //load archivo
    
    if(!archivo.exists()){
      try{
        archivo.createNewFile();
      } catch (IOException e) {
      System.out.println(e);
      }
    }
    try{
      FileWriter escritor = new FileWriter(archivo,true);
      PrintWriter lapiz = new PrintWriter(escritor);
      lapiz.print(datos+"\n");
      lapiz.close();
      
    } catch (IOException e) {
      System.out.println(e);
    }
  }
  
  public boolean validarArchivo(String nombre){
    String ruta = "src/test/"+nombre+".csv"; //Crear ruta en string
    File archivo = new File(ruta); //load archivo
    
    if(!archivo.exists()){ //Validar
        return false;
    }
    return true;
  }
  
  public String buscarDatos(String datos, String nombre){
    String ruta = "src/test/"+nombre+".csv"; //Crear ruta en string
    File archivo = new File(ruta); //load archivo
    
    try {
      BufferedReader lector = new BufferedReader(new FileReader(archivo)); //Declaracion lector archivo
      String linea; // Linea actual
      while ((linea = lector.readLine()) != null) { // Mientras existan lineas para leer
        if(!"".equals(linea)){ //Linea vacia
            if(datos.equals(linea)){
                return linea;
            }
        }
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Poo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);   
    }
    return null;
  }
}  