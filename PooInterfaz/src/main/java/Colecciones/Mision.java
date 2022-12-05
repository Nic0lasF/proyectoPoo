package Colecciones;

public class Mision {
  private int idMision;
  private int cantidadPuntos; // Puntos obtenidos al completar la mision
  private char tipoMision; // P:Pasos | R:Reciclado | D: Noticia Diaria
  private boolean estado; //Mision completada = true | incompleta = false
  private int tiempoCaducidad; //Horas restantes de la mision
  private Noticia noticiaDiaria; //Noticia de la mision tipo 'D'
  private int cantidadPasos;
  
  //constructor
  public Mision(int idMision, int puntos, char tipo, boolean estado,int tiempoCaducidad, int cantidadPasos){
    this.idMision = idMision;
    this.cantidadPuntos = puntos;
    this.tipoMision = tipo;
    this.estado = estado;
    this.tiempoCaducidad = tiempoCaducidad;
    this.cantidadPasos = cantidadPasos;
  }

  public Mision(){}

  //Accesores
  public int getIdMision(){
    return this.idMision;
  }
  
  public int getCantidadPuntos(){
    return this.cantidadPuntos;
  }

  public char getTipoMision(){
    return this.tipoMision;
  }

  public boolean getEstado(){
    return this.estado;
  }

  public int getTiempoCaducidad(){
    return this.tiempoCaducidad;
  }

  public Noticia getNoticiaDiaria(){
    return this.noticiaDiaria;
  }
  //Fin Accesores


  //Mutadores
  public void setIdMision(int idMision){
    this.idMision = idMision;
  }
  
  public void setCantidadPuntos(int cantidadPuntos){
    this.cantidadPuntos = cantidadPuntos;
  }

  public void setTipoMision(char tipoMision){
    this.tipoMision = tipoMision;
  }

  public void setEstado(boolean estado){
    this.estado = estado;
  }

  public void setTiempoCaducidad(int tiempoCaducidad){
    this.tiempoCaducidad = tiempoCaducidad;
  }

  public void setNoticiaDiaria(Noticia diaria){
    this.noticiaDiaria = diaria;
  }
  //Fin Mutadores
  
  //Metodos
  public String getDatosString(){
      return (this.idMision+";"+this.cantidadPuntos+";"+this.tipoMision+";"+this.estado+";"+this.tiempoCaducidad+";"+this.cantidadPasos);
  }
  
  public void crearMision(int id,int cantidad,char tipo,int puntosNoticia,char tipoNoticia){ //CREAR CON NOTICIA
    //cant lo tomtamos como cantidad de pasos para pasos o cantidad de puntos para noticis o tiempo de caducidad
    this.idMision = id;
    this.cantidadPuntos = cantidad;
    this.tipoMision= tipo;
    this.estado = false;
    
    if(tipoMision == 'D'){ // Seccion noticia
      this.noticiaDiaria = new Noticia('d',0);
      noticiaDiaria.crearNoticia(tipoNoticia,puntosNoticia);
      this.tiempoCaducidad = 24;
    }
   }
  
    public void crearMision(int id,int cantidad,char tipo,int pasos,int tiempoCaducidad){ // SIN NOTICIA
    //pasos lo tomtamos como cantidad de pasos para pasos o cantidad de puntos para noticis o tiempo de caducidad
        this.idMision = id;
        this.cantidadPuntos = cantidad;
        this.tipoMision= tipo;
        this.estado = false;
    
        if(tipoMision == 'P'){  // Seccion pasos
            this.cantidadPasos = pasos;
        }
        if(tipoMision != 'D'){
            this.tiempoCaducidad = tiempoCaducidad;
        }
    }
  
  public void verMision(){
    System.out.println("--MOSTRANDO MISION ID:" + this.idMision + "--");
    System.out.println("Cantidad de puntos: "+ this.cantidadPuntos);
    System.out.println("Tipo de mision: "+ this.tipoMision);

    if(tipoMision == 'D'){
      if(this.noticiaDiaria != null)
        this.noticiaDiaria.verNoticia();
    }
    
    if(this.estado == true){
      System.out.println("Felicidades, su mision a sido completada con exito");
      System.out.println(" ");
    }
    else{
        System.out.println("Aun falta para completar la mision :(");
        System.out.println("El tiempo restante para completar la mision es de "+ this.tiempoCaducidad+"hrs");
      System.out.println(" ");
    }
  }
}
