package Colecciones;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.text.ParseException;

public class Recompensa {
    private char tipoRecompensa; //D = CuponDescuento || B = bono || C = canasta 
  private Date fechaCaducidad; // Limite de tiempo para que caduque el cupon
  private int puntosParaCanjear;
  private Operaciones operaciones = new Operaciones();
  //Constructor
  public Recompensa(char tipoRecompensa, Date fechaCaducidad, int puntosParaCanjear)
  {
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
  public Recompensa()
  {
    ;
  }

  //Accesores
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
  public String crearRecompensa(){
    Scanner entrada = new Scanner(System.in);
    String fechaEntrada;
    
    System.out.println("Ingrese tipo de Recompensa");
    do{
      System.out.println("D = CuponDescuento || B = bono || C = canasta");
      System.out.println(" ");
      this.tipoRecompensa = operaciones.ValidarChar();
    }while((tipoRecompensa != 'D') && (tipoRecompensa != 'B') && (tipoRecompensa != 'C'));
    
    System.out.println("Ingrese fecha de caducidad en formato dd/MM/yyyy");
    fechaEntrada = entrada.next();
    try {
      Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaEntrada);
      this.fechaCaducidad = fecha;
    } catch (ParseException e){
      e.printStackTrace();
    }
    do{
      System.out.println("Ingrese el valor para canjear la recompensa (maximo 10000)");
      this.puntosParaCanjear = operaciones.ValidarInt();
    }while(puntosParaCanjear<= 0 && puntosParaCanjear >10000);

    return (this.tipoRecompensa+";"+fechaEntrada+";"+this.puntosParaCanjear);
  }
  
  public void verRecompensa(){
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
