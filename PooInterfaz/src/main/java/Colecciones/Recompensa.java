package Colecciones;

import java.util.Date;
import java.text.SimpleDateFormat;  

public class Recompensa {
  private int idRecompensa;
  private char tipoRecompensa; //D = CuponDescuento || B = bono || C = canasta 
  private Date fechaCaducidad; // Limite de tiempo para que caduque el cupon
  private int puntosParaCanjear;
  
  //Constructor
  public Recompensa(int id, char tipoRecompensa, Date fechaCaducidad, int puntosParaCanjear)
  {
    this.idRecompensa = id;
    this.tipoRecompensa = tipoRecompensa;
    this.fechaCaducidad = fechaCaducidad;
    this.puntosParaCanjear = puntosParaCanjear;
  }
  
  public Recompensa(char tipoRecompensa)
  {
    this.tipoRecompensa = tipoRecompensa;
  }

  public Recompensa(Date fechaCaducidad)
  {
    this.fechaCaducidad = fechaCaducidad;
  }
 
  public Recompensa(){}


  public int getIdRecompensa(){
    return this.idRecompensa;
  }

  public char getTipoRecompensa(){
    return this.tipoRecompensa;
  }

  public Date getFechaCaducidad(){
    return this.fechaCaducidad;
  }

  public int getPuntosParaCanjear(){
    return this.puntosParaCanjear;
  }
  
  //Mutadores

  public void setIdRecompensa(int idRecompensa) {
      this.idRecompensa = idRecompensa;
  }

  public void setTipoRecompensa(char tipo){
    this.tipoRecompensa = tipo;
  }
  public void setFechaCaducidadD(Date fecha){
    this.fechaCaducidad = fecha;
  }
  public void setPuntosParaCanjear(int puntos){
    this.puntosParaCanjear = puntos;
  }


  //Metodos
  public String getDatosString(){
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    String fecha = formatter.format(this.fechaCaducidad);  
    return (this.idRecompensa+";"+this.tipoRecompensa+";"+fecha+";"+this.puntosParaCanjear);
  }
  
  public void crearRecompensa(int id,char tipoRecompensa,Date fecha,int puntos){
    this.idRecompensa= id;
    this.tipoRecompensa = tipoRecompensa;
    this.fechaCaducidad = fecha;
    this.puntosParaCanjear = puntos;
  }
  
  public void verRecompensa(){
    System.out.println("--MOSTRANDO RECOMPENSA ID:" + this.idRecompensa + "--");
    switch(this.tipoRecompensa)
      {
        case 'D':
          System.out.println("Cupon de Descuento");
          break;
        case 'B':
          System.out.println("Bono");
          break;
        case 'C':
          System.out.println("Canasta");
          break;
        default:
          System.out.println("---");
          break;
      }
    System.out.println("La recompensa cuesta: "+ this.puntosParaCanjear);
    System.out.println("La recompensa vence en: "+ this.fechaCaducidad);
    System.out.println(""); 
  }
    
}
