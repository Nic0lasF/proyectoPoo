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
import java.util.InputMismatchException;

public class Operaciones {
    public static Scanner Entrada = new Scanner(System.in);    
    public String ValidarCadenaAlfa;
    public Operaciones(){
        
    }
    
//-----------------------Operaciones de validacion------------------------------
    
  public int ValidarRol(){
    
    int rol = 0;
    boolean continuar;
    
    do{
        try{
            continuar = false;
            rol = Entrada.nextInt();
        }catch(InputMismatchException ex){
            Entrada.next();
            continuar = true;
            System.out.println("Número inválido, por favor ingrese otro");
        }
        
    }while(continuar && (rol!=1 || rol!=2));
    
    return rol;
  }

  public int ValidarInt(){
    
    boolean continuar;
    int numero = 0;
    
    do{
        try{
            continuar = false;
            numero = Entrada.nextInt();
        }catch(InputMismatchException ex){
            Entrada.next();
            System.out.println("Dato inválido, por favor ingrese otro");
            continuar = true;
        }
        
    }while(continuar);

    return numero;
  }
  
  public char ValidarChar(){
    String cadena = "0";
    boolean continuar;
    do{
        try{
            cadena = Entrada.next();
            if(cadena.length() == 1 && cadena.matches("[A-Z]*")){
                continuar = false;
            }
            else{
                continuar = true;
                System.out.println("Dato no válido, vuelva a ingresar otro");
            }    
        }catch(InputMismatchException ex){
            Entrada.next();
            System.out.println("Dato no válido, vuelva a ingresar otro");
            continuar = true;
        }
    }while(continuar);
    
        return cadena.charAt(0);
}
  public String ValidarCadenaAlfa(){
    String cadena = null;
    boolean continuar;
    do{
        try{
            cadena = Entrada.next();
            if(cadena.matches("[A-Za-z]*")){
                continuar = false;
            }
            else{
                System.out.println("Dato no válido, vuelva a ingresar otro");
                continuar = true;
            }    
        }catch(InputMismatchException ex){
            Entrada.next();
            System.out.println("Dato no válido, vuelva a ingresar otro");
            continuar = true;
        }
    }while(continuar);
    
    return cadena;

  }
  
  public String ValidarRut(){
    
    String cadena = null;
    boolean continuar;
    do{
        try{
            cadena = Entrada.next();
            if(cadena.matches("\\d{8,9}+[k]?")){
                continuar = false;
            }
            else{
                System.out.println("Dato no válido, vuelva a ingresar otro");
                continuar = true;
            }    
        }catch(InputMismatchException ex){
            Entrada.next();
            System.out.println("Dato no válido, vuelva a ingresar otro");
            continuar = true;
        }
    }while(continuar);
    
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
    String cadena = null;
    System.out.println("Ingrese su nombre de usuario (min. 4 caracteres y max. 10)");  
    boolean continuar;
    do{
        try{
            cadena = Entrada.next();
            if(cadena.length() > 4 && cadena.length() < 10){
                continuar = false;
            }
            else{
                System.out.println("Dato no válido, vuelva a ingresar otro");
                continuar = true;
            }    
        }catch(InputMismatchException ex){
            Entrada.next();
            System.out.println("Dato no válido, vuelva a ingresar otro");
            continuar = true;
        }
    }while(continuar);
    System.out.println("Nombre de usuario ingresado exitosamente.");
    return cadena;
      
  }
   public String ValidarClave(){
    String cadena = null;
    System.out.println("Ingrese su contraseña (minimo 4 caracteres y max 10)");
    boolean continuar;
    do{
        try{
            cadena = Entrada.next();
            if(cadena.length() > 4 && cadena.length() < 10){
                continuar = false;
            }
            else{
                System.out.println("Dato no válido, vuelva a ingresar otro");
                continuar = true;
            }    
        }catch(InputMismatchException ex){
            Entrada.next();
            System.out.println("Dato no válido, vuelva a ingresar otro");
            continuar = true;
        }
    }while(continuar);
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
  
  public void borrarDatos(String nombre){
    String ruta = "src/test/"+nombre+".csv"; //Crear ruta en string
    File archivo = new File(ruta); //load archivo
    
    //Limpieza archivo
    try{
        PrintWriter lapiz = new PrintWriter(new FileWriter(archivo));
        lapiz.print("");
        lapiz.close();
        
    } catch (IOException e) {
      System.out.println(e);   
    }
  }
  
  public void recargarMisiones(){
    String ruta = "src/test/misiones.csv"; //Crear ruta en string
    File archivo = new File(ruta); //load archivo
    
    try{
        PrintWriter lapiz = new PrintWriter(new FileWriter(archivo));
        for (int i = 0 ; i < coleccionMisiones.size() ; i++){
            String datos = coleccionMisiones.get(i).getDatosString();
            lapiz.print(datos+"\n");
            lapiz.flush();
        }
        lapiz.close();
        
    } catch (IOException e) {
      System.out.println(e);   
    }   
  }
  
  public void recargarRecompensas(){
    String ruta = "src/test/recompensas.csv"; //Crear ruta en string
    File archivo = new File(ruta); //load archivo
    
    try{
        PrintWriter lapiz = new PrintWriter(new FileWriter(archivo));
        for (int i = 0 ; i < coleccionRecompensas.size() ; i++){
            String datos = coleccionRecompensas.get(i).getDatosString();
            lapiz.print(datos+"\n");
            lapiz.flush();
        }
        lapiz.close();
        
    } catch (IOException e) {
      System.out.println(e);   
    }   
  }
}  