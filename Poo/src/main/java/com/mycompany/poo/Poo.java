package com.mycompany.poo;

/*Integrantes:
Gadi Rebolledo
Nicolas Figueroa
Alan Baeza
*/

//Utilities
import Salida.*;
import Colecciones.*;
import Interfaz.*;
import java.util.ArrayList;

// Metodo sobrecarga en Clase: Recompensa y usuario.

public class Poo{
  public static Operaciones op = new Operaciones();
  public static ArrayList<Mision> coleccionMisiones = new ArrayList<>(); // total de misiones que pueden ser escogidas para el usuario
  public static ArrayList<Recompensa> coleccionRecompensas = new ArrayList<>();

  public static void main(String[] args) {
    Menu m = new Menu();
    System.out.println("----CARGANDO DATOS----");
    cargarDatos();
    System.out.println("....");
    System.out.println(" ");
    m.menuAdmin(); //lamada menu
    
  }


  private static void cargarDatos() {
    if(op.validarArchivo("misiones") == true){
      System.out.println("Cargando misiones...");
      op.cargarMis();
      if (coleccionMisiones != null){
      System.out.println("Misiones cargadas correctamente!");
      }
      else{
        System.out.println("Ocurrió un error al cargar las misiones");
      }
    }
    System.out.println("");
    if(op.validarArchivo("recompensas") == true){
      System.out.println("Cargando recompensas...");
      op.cargarRec();
      if (coleccionRecompensas != null){
        System.out.println("Recompensas cargadas correctamente!");
      }
      else{
        System.out.println("Ocurrió un error al cargar las recompensas");
      }
    }
  }
}

