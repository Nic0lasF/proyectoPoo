package Usuarios;

import Colecciones.*;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.text.ParseException;

public class Usuario {
  private String nombre;
  private String rut; 
  private Date fechaDeNacimiento; 
  private int puntos; //Puntos acumulados del usuario
  private int pasos; //Cantidad total de pasos dados por el usuario
  private Mision[] misiones = new Mision[3] ; //Listado de misiones activas del usuario (max 3 por dia)
  private Recompensa[] recompensas = new Recompensa[5]; //Listado de recompensas que puede reclamar el usuario (max 5)
  
  //Constructor (datos default)}
  // El Usuario Si o Si debe de registrar su nombre y rut para poder identificarlo
  public Usuario(String nombre, String rut, Date fecha, int puntos, int pasos){
    this.nombre = nombre;
    this.rut = rut;
    this.fechaDeNacimiento = fecha;
    this.puntos = puntos;
    this.pasos = pasos;
  }
  //SOBRECARGA DE CONSTRUCTORES
  public Usuario(String nombre, String rut, Date fecha){
    this.nombre = nombre;
    this.rut = rut;
    this.fechaDeNacimiento = fecha;
  }
  public Usuario(String nombre, String rut){
    this.nombre = nombre;
    this.rut = rut;
  }
  
  public Usuario(String nombre, String rut, Date fecha, int puntos){
    this.nombre = nombre;
    this.rut = rut;
    this.fechaDeNacimiento = fecha;
    this.puntos = puntos;
  }
  
  //Accesores
  public String getNombre(){
    return this.nombre;
  }
  public String getRut(){
    return this.rut;
  }
  public Date getFechaDeNacimiento(){
    return this.fechaDeNacimiento;
  }
  public int getPuntos(){
    return this.puntos;
  }
  public int getPasos(){
    return this.pasos;
  }
  public Mision[] getMisiones(){
    return this.misiones;
  }
  public Recompensa[] getRecompensas(){
    return this.recompensas;
  }
  //Fin accesores

  
  //Mutadores
 public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setRut(String rut){
    this.rut = rut;
  }
  public void setFechaDeNacimiento(Date fecha){
    this.fechaDeNacimiento = fecha;
  }
  public void setPuntos(int puntos){
    this.puntos = puntos;
  }
  public void setPasos(int pasos){
    this.pasos = pasos;
  }
  public void setMisiones(Mision misiones[] ){
    this.misiones = misiones;
  }
  public void setRecompensas(Recompensa recompensas[]){
    this.recompensas = recompensas;
  }
  //Fin mutadores

  //Metodos
  
  //Crear datos
  public void crearUsuario(){
    Scanner entrada = new Scanner(System.in); 
    String fechaEntrada;
    
    System.out.println("Ingrese su nombre");
    this.nombre = entrada.next();
    
    System.out.println("Ingrese su rut");
    this.rut = entrada.next();
    
    System.out.println("Ingrese su fecha de nacimiento con formato dd/MM/yyyy");
    fechaEntrada = entrada.next();
    try {
      Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaEntrada);
      this.fechaDeNacimiento = fecha;
    } catch (ParseException e){
      e.printStackTrace();
    }

    this.pasos = 0;
    this.puntos = 0;
    
  }
  
  //Perfil del usuario
  public void verEstadisticas(){
    System.out.println("--MOSTRANDO ESTADISTICAS--");
    System.out.println("Nombre: "+ this.nombre);
    System.out.println("RUT: "+ this.rut);
    System.out.println("Fecha de Nacimiento: "+ this.fechaDeNacimiento);
    System.out.println("Puntos: "+ this.puntos);
    System.out.println("Total de Pasos: "+ this.pasos);
  }
  
  //Comportamiento
  public void verMisiones(){
    System.out.println("--TUS MISIONES ACTIVAS--");
  }

  public void verRecompensas(){
    System.out.println("--TUS RECOMPENSAS--");
  }

  public void caminar(){
    System.out.println("Está caminando!");
  }
  
  public void leerNoticia(){
    System.out.println("Está leyendo la siguiente noticia: ");
  }
  
  public void compartirNoticia(){
    System.out.println("Haz compartido la noticia!");
  }
  
  public void escanear(){
    System.out.println("Haz escaneado el siguiente codigo: ");
  }
  
  public void cambiarMision(){
    System.out.println("Misión cambiada con exito!");
  }
  
  public void cambiarNoticia(){
    System.out.println("Noticia cambiada con exito!");
  }
}
