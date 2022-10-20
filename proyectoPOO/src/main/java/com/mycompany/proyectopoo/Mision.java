package com.mycompany.proyectopoo;


import java.util.Date;
import java.util.Scanner;

public class Mision{
  private int cantidadPuntos; // Puntos obtenidos al completar la mision
  private char tipoMision; // P:Pasos | R:Reciclado | D: Noticia Diaria
  private boolean estado; //Mision completada = true | incompleta = false
  private int tiempoCaducidad; //Horas restantes de la mision
  private Noticia noticiaDiaria; //Noticia de la mision tipo 'D'
  private int cantidadPasos;
  private Operaciones operaciones = new Operaciones();
  
  //constructor
  public Mision(int puntos, char tipo, boolean estado,int tiempoCaducidad){
    this.cantidadPuntos = puntos;
    this.tipoMision = tipo;
    this.estado = estado;
    this.tiempoCaducidad = tiempoCaducidad;
    this.cantidadPasos = 0;
  }

  public Mision(){
    ;
  }

  //Accesores
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

  
  public String crearMision(){
    Scanner Entrada = new Scanner(System.in);
    do{
      System.out.println("Ingrese la cantidad de puntos de recompensa MAX 5000");
      this.cantidadPuntos = operaciones.ValidarInt();
    }while((this.cantidadPuntos <= 0) || (this.cantidadPuntos > 5000));
    
    System.out.println("Ingrese tipo de misión");
    do{
      System.out.println("P para Pasos | R para Reciclado | D para Noticia Diaria");
      this.tipoMision= operaciones.ValidarChar();
    }while((this.tipoMision != 'P') && (this.tipoMision != 'R') && (this.tipoMision != 'D'));

    if(tipoMision == 'P'){  // Seccion pasos
      System.out.println("Ingrese la cantidad de pasos para completar la mision");
      do{
        System.out.println("Numero MAYOR a 0");
        this.cantidadPasos = operaciones.ValidarInt();
      }while(cantidadPasos <= 0);
    }
    
    else if(tipoMision == 'D'){ // Seccion noticia
      System.out.println("");
      this.noticiaDiaria = new Noticia('d',0);
      noticiaDiaria.crearNoticia();
      this.tiempoCaducidad = 24;
    }
  
    this.estado = false;
    
    if(tipoMision != 'D'){
      do{
        System.out.println("Ingrese horas restantes de la mision");
        this.tiempoCaducidad = operaciones.ValidarInt();
      }while(tiempoCaducidad <= 0);
    } 

    return (this.cantidadPuntos+";"+this.tipoMision+";"+this.estado+";"+this.tiempoCaducidad);
  }


  
  public void verMision(){
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