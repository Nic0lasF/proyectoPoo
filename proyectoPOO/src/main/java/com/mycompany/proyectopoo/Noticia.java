package com.mycompany.proyectopoo;

import java.util.Scanner;

public class Noticia { // Lista

  private char tipoNoticia; // C = clima | R = Reciclaje | M = Contaminacion maritima | Q = Quimicos Peligrosos | d=default
  private boolean estadoCompartido; // Noticia compartida = true | No compartida = false
  private int puntosRecompensa; // Puntos por compartir una noticia (Max 1 compartir por noticia)
  private Operaciones operaciones = new Operaciones();

  // constructor
  public Noticia(char tipo, int puntos) {
    this.tipoNoticia = tipo;
    this.estadoCompartido = false;
    this.puntosRecompensa = puntos;
  }

  // Accesores
  public char getTipoNoticia() {
    return this.tipoNoticia;
  }

  public boolean getEstadoCompartido() {
    return this.estadoCompartido;
  }

  public int getPuntosRecompensa() {
    return this.puntosRecompensa;
  }
  // Fin Accesores

  // Mutadores
  public void setTipoNoticia(char tipo) {
    this.tipoNoticia = tipo;
  }

  public void setEstadoCompartido(boolean estado) {
    this.estadoCompartido = estado;
  }

  public void setPuntosRecompensa(int puntos) {
    this.puntosRecompensa = puntos;
  }
  // Fin mutadores

  // Metodos
  public void crearNoticia() {
    Scanner Entrada = new Scanner(System.in);
    System.out.println("-- CREANDO NOTICIA --");

    System.out.println("Ingrese la cantidad De Puntos por compartir la noticia");
    do {
      System.out.println("MAX 300");
      System.out.println(" ");
      this.puntosRecompensa = operaciones.ValidarInt();
    } while ((this.puntosRecompensa <= 0) || (this.puntosRecompensa > 300));

    System.out.println("Ingrese tipo de Noticia");
    do {
      System.out.println("C = clima | R = Reciclaje | M = Contaminacion maritima | Q = Quimicos Peligrosos");
      this.tipoNoticia = operaciones.ValidarChar();
    } while ((this.tipoNoticia != 'C') && (this.tipoNoticia != 'R') && (this.tipoNoticia != 'M')
        && (this.tipoNoticia != 'Q'));
    this.estadoCompartido = false;
  }

  public void verNoticia() {
    System.out.println("La noticia es acerca de: ");
    switch (this.tipoNoticia) {
      case 'R':
        System.out.println("Reciclaje");
        break;
      case 'M':
        System.out.println("Contaminacion Maritima");
        break;
      case 'C':
        System.out.println("Clima");
        break;
      case 'Q':
        System.out.println("Quimicos Peligrosos");
      default:
        System.out.println("---");
        break;
    }
    System.out.println(" ");
    if (estadoCompartido == true)
      System.out.println("Esta noticia ya ha sido comparida!");
    else
      System.out.println("Por compartir esta noticia recibiras " + this.puntosRecompensa + " puntos!");
  }
}