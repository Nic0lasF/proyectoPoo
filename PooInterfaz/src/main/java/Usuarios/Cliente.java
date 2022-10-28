package Usuarios;

import Colecciones.*;
import java.util.Date;

public class Cliente extends Usuario{
    private String nombre;
    private String rut; 
    private Date fechaDeNacimiento; 
    private int puntos; //Puntos acumulados del usuario
    private int pasos; //Cantidad total de pasos dados por el usuario
    private Mision[] misiones = new Mision[3] ; //Listado de misiones activas del usuario (max 3 por dia)
    private Recompensa[] recompensas = new Recompensa[5]; //Listado de recompensas que puede reclamar el usuario (max 5)
    private Operaciones operaciones = new Operaciones();
  
  //Constructor (datos default)}
  // El Usuario Si o Si debe de registrar su nombre y rut para poder identificarlo
    public Cliente(String nombre, String rut, Date fechaDeNacimiento, int puntos, int pasos, String nombreUsuario, String clave){
        super(nombreUsuario, clave);
        this.nombre = nombre;
        this.rut = rut;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.puntos = puntos;
        this.pasos = pasos;
  }

    //SOBRECARGA DE CONSTRUCTORES
    public Cliente(String nombre, String rut, Date fecha, String nombreUsuario, String clave) {
        super(nombreUsuario, clave);
        this.nombre = nombre;
        this.rut = rut;
        this.fechaDeNacimiento = fecha;
    }
    public Cliente(String nombre, String rut, String nombreUsuario, String clave){
        super(nombreUsuario, clave);
        this.nombre = nombre;
        this.rut = rut;
    }
  
    public Cliente(String nombre, String rut, Date fecha, int puntos, String nombreUsuario, String clave){
        super(nombreUsuario, clave);
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
  @Override
 public void crearUsuario(){
    
    System.out.println("Ingrese su nombre");
    this.nombre = operaciones.ValidarCadenaAlfa();
    
    System.out.println("Ingrese su rut");
    this.rut = operaciones.ValidarRut();
    
    System.out.println("Ingrese su fecha de nacimiento con formato dd/MM/yyyy");
    this.fechaDeNacimiento = operaciones.ValidarFecha();
    
    System.out.println("Ingrese su nombre de usuario");
    String nombreUsuario = operaciones.ValidarNUsuario();
    System.out.println("Ingrese su contraseña");
    String clave = operaciones.ValidarClave();
        
    setNombreUsuario(nombreUsuario);
    setClave(clave);
    
    
    this.pasos = 0;
    this.puntos = 0;

  }
  
  //Perfil del usuario
  public void verEstadisticas(){
    System.out.println("--MOSTRANDO ESTADISTICAS de " + getNombreUsuario() + "--");
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
