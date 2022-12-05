package Colecciones;

import static Interfaz.InterfazInicioSesion.admin;
import static Interfaz.InterfazInicioSesion.cliente;
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
            coleccionMisiones.add(new Mision(Integer.parseInt(campos[0]),Integer.parseInt(campos[1]), campos[2].charAt(0),Boolean.parseBoolean(campos[3]), Integer.parseInt(campos[4]),Integer.parseInt(campos[5])));
        }
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Poo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
  
    public void cargarAdmin(String datos){
        String[] cadena = datos.split(";");
        
        //Poblado Datos
        admin.setNombreUsuario(cadena[0]);
        admin.setClave(cadena[1]);
        admin.setRol(Integer.parseInt(cadena[2]));
        admin.setNombre(cadena[3]);
  }

    public void cargarCliente(String datos){
        try {
            String[] cadena = datos.split(";");
            Date fecha = new SimpleDateFormat("dd/mm/yyyy").parse(cadena[5]);
            Mision[] misiones = new Mision[3];
            Recompensa[] recompensas = new Recompensa[5];
            
            
            //Poblado Misiones
            for(int i = 0; i < misiones.length ; i++){
                if(retornarMision(Integer.parseInt(cadena[(8 + i)])) != null){
                    misiones[(0 + i)] = retornarMision(Integer.parseInt(cadena[(8 + i)]));
                }
                //System.out.println(i+"   "+cadena[(8+i)]);
            }
            
            //Poblado Recompensas
            for(int i = 0; i < recompensas.length; i++){
                if(retornarRecompensa(Integer.parseInt(cadena[(11 + i)])) != null){
                    recompensas[(0 + i)] = retornarRecompensa(Integer.parseInt(cadena[(11 + i)]));
                }
                //System.out.println(i+"   "+cadena[(11+i)]);
            }
            
            //Poblado Datos
            cliente.setNombreUsuario(cadena[0]);
            cliente.setClave(cadena[1]);
            cliente.setRol(Integer.parseInt(cadena[2]));
            cliente.setNombre(cadena[3]);
            cliente.setRut(cadena[4]);
            cliente.setFechaDeNacimiento(fecha);
            cliente.setPuntos(Integer.parseInt(cadena[6]));
            cliente.setPasos(Integer.parseInt(cadena[7]));
            cliente.setMisiones(misiones);
            cliente.setRecompensas(recompensas);
            
        } catch (ParseException e) {
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

  public String buscarUsuario(String datos, String nombre){
    String ruta = "src/test/"+nombre+".csv"; //Crear ruta en string
    File archivo = new File(ruta); //load archivo
    
    try {
      BufferedReader lector = new BufferedReader(new FileReader(archivo)); //Declaracion lector archivo
      String linea; // Linea actual
      while ((linea = lector.readLine()) != null) { // Mientras existan lineas para leer
        if(!"".equals(linea)){ //Linea vacia
            String[] cadenaDatos = datos.split(";");
            String[] cadenaString = linea.split(";");
            if(cadenaDatos[0].equals(cadenaString[0]) && cadenaDatos[1].equals(cadenaString[1])){
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


// ----------------------- Operaciones de interfaz -----------------------------
  
  public void agregarMision(int id, int cantidad, char tipo, int cant,char tipoNoticia ){ //CREAR CON NOTICIA
    Mision mision = new Mision();
    mision.crearMision(id,cantidad,tipo,cant,tipoNoticia);
    coleccionMisiones.add(mision);
    System.out.println("------GUARDANDO MISION------");
    guardarDatos(mision.getDatosString(),"misiones");
  }
  
  public void agregarMision(int id, int cantidadPuntos, char tipoMision, int pasos, int cantTiempo ){ //CREAR SIN NOTICIA
    Mision mision = new Mision();
    mision.crearMision(id,cantidadPuntos,tipoMision,pasos,cantTiempo);
    coleccionMisiones.add(mision);
    System.out.println("------GUARDANDO MISION------");
    guardarDatos(mision.getDatosString(),"misiones");
  }

    public int modMision(int id,int tiempoCambiar){
        for (int i = 0 ; i < coleccionMisiones.size() ; i++){
            if(coleccionMisiones.get(i).getIdMision() == id){
                coleccionMisiones.get(i).setTiempoCaducidad(tiempoCambiar);
                borrarDatos("misiones");
                recargarMisiones();
                return 0;//exitoso
            }
        }
        System.out.println("No se ha encontrado la mision");
        return 1; // fallo
    }

    public int verMision(char tipo, int tiempo){
        boolean flag = false; 
        for (int i = 0 ; i < coleccionMisiones.size() ; i++){
            if(Character.compare(coleccionMisiones.get(i).getTipoMision(), tipo) == 0 && coleccionMisiones.get(i).getTiempoCaducidad() < tiempo){
                if(flag == false){
                    flag = true;
                    System.out.println("Mostrando misiones con tiempo restante menor a " + tiempo + "horas.");
                  }
                System.out.println("");
                coleccionMisiones.get(i).verMision();
                return 0;
            }
        }
        if(flag == false){
            return -2;
        }
        return -1;
    }
    
    public int VerMision(){
        boolean validar=false;
        for (int i = 0 ; i < coleccionMisiones.size() ; i++){
            coleccionMisiones.get(i).verMision();
            validar=true; 
        }
        //System.out.println("No se ha encontrado la mision");
        
        if(validar==false)return 1;
        else{
            return 0;
        }
    }
    
    public int buscarMision(char tipo, int tiempo){
        boolean flag = false;
        int cant=0;
        for (int i = 0 ; i < coleccionMisiones.size() ; i++){
            if(Character.compare(coleccionMisiones.get(i).getTipoMision(), tipo) == 0 && coleccionMisiones.get(i).getTiempoCaducidad() < tiempo){
                cant++;
                System.out.println("Mision Encontrada!");
                System.out.println("");
                coleccionMisiones.get(i).verMision();
                if(flag == false){
                    flag = true;
                  }
            }
        }
        if(flag == false){
            return cant;
        }
        return cant;
    }
    
    public int buscarMision(int id){
        int cant=0;
        for (int i = 0 ; i < coleccionMisiones.size() ; i++){
            if(coleccionMisiones.get(i).getIdMision() == id){
                System.out.println("Mision Encontrada!");
                System.out.println("");
                coleccionMisiones.get(i).verMision();
                //coleccionMisiones.get(i).verMision();
                cant++;
            } 
        }
        //System.out.println("No se ha encontrado la mision");
         return cant;
    }

    public boolean borrarMision(int id){
        for (int i = 0 ; i < coleccionMisiones.size() ; i++){
            if(coleccionMisiones.get(i).getIdMision() == id){
                coleccionMisiones.remove(i);
                borrarDatos("misiones");
                recargarMisiones();
                return true;
            }
        }
        return false;   
    }
  
    public void modificarMision(int i,int tiempoCaducidad){
        coleccionMisiones.get(i).setTiempoCaducidad(tiempoCaducidad);
        borrarDatos("misiones");
        recargarMisiones();
    }
    
        public Mision retornarMision(int id){
        for (int i = 0 ; i < coleccionMisiones.size() ; i++){
            if(coleccionMisiones.get(i).getIdMision() == id){
                return coleccionMisiones.get(i);
            } 
        }
        return null;
    }
  
// -----------------------------------------------------------------------------
    
    public void agregarRecompensa(int id,char tipoRecompensa,Date fecha,int puntos) {
        Recompensa recompensa = new Recompensa();
        recompensa.crearRecompensa(id,tipoRecompensa,fecha,puntos);
        coleccionRecompensas.add(recompensa);
        guardarDatos(recompensa.getDatosString(),"recompensas");
    }

    public boolean borrarRecompensa(int id){
        for (int i = 0 ; i < coleccionRecompensas.size() ; i++){
            if(coleccionRecompensas.get(i).getIdRecompensa() == id){
                coleccionRecompensas.remove(i);
                borrarDatos("recompensas");
                recargarRecompensas();
                return true;
            }
        }
        return false;   
    }

    public int buscarRecompensa(int id){
        int cant=0;
        for (int i = 0 ; i < coleccionRecompensas.size() ; i++){
            if(coleccionRecompensas.get(i).getIdRecompensa() == id){
                System.out.println("Recompensa Encontrada!");
                System.out.println("");
                coleccionRecompensas.get(i).verRecompensa();
                cant++;
                //coleccionRecompensas.get(i).verRecompensa();
            }
        }
        return cant;
    }
    
    public int modRecompensa(int id,int puntosParaCanjear){
        for (int i = 0 ; i < coleccionRecompensas.size() ; i++){
            if(coleccionRecompensas.get(i).getIdRecompensa() == id){
                coleccionRecompensas.get(i).setPuntosParaCanjear(puntosParaCanjear);
                borrarDatos("recompensas");
                recargarRecompensas();
                return 0;//exitoso
            }
        }
        return 1; // fallo
    }
    
    public int VerRecompensa(){
        boolean validar=false;
        for (int i = 0 ; i < coleccionRecompensas.size() ; i++){
            coleccionRecompensas.get(i).verRecompensa();
            validar=true; 
        }
        if(validar==false)return 1;
        else{
            return 0;
        }
    }
    
    public Recompensa retornarRecompensa(int id){
        for (int i = 0 ; i < coleccionRecompensas.size() ; i++){
            if(coleccionRecompensas.get(i).getIdRecompensa() == id){
                return coleccionRecompensas.get(i);
            }
        }
        return null;
    }
  
  //---------- VALIDAR EN INTERFAZ ----------------
    public int ValidarInt(String cadena){
        int numero;
        try{
            numero = Integer.parseInt(cadena);
        }catch(NumberFormatException ex){
            return -1;
        }
        return numero;
    }

    public String validarCadena(String cadena){
        
        try{
            if(cadena.matches("[A-Za-z]*")){ // si la cadena contiene numero o simbolos
                return cadena;
            }

        }catch(NullPointerException ex){
            System.out.println("Dato es null");
        }
        
        return null;  
    }

    public char ValidarChar(String cadena){
        try{
            if(cadena.length() == 1 && cadena.matches("[A-Z]*")){
                return cadena.charAt(0);     
            }
            else{
                System.out.println("Dato no válido, vuelva a ingresar otro");
            }       
        }catch(NullPointerException ex){
            System.out.println("Dato es null");
        }
        return '\0';
    }

    public Date ValidarFecha(String cadena){
    Date fecha = null;
        try {
          fecha = new SimpleDateFormat("dd/MM/yyyy").parse(cadena);
        } catch (ParseException e){
        e.printStackTrace();
        }
        if(fecha == null){
            System.out.println("Dato no válido, ingrese nuevamente");
        }
    return fecha;
    }

    public Date intAFecha(int dia, int mes, int anyo){
        String fecha = (Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(anyo));
        return ValidarFecha(fecha);
    }
}