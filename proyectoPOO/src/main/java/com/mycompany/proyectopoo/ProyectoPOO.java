/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectopoo;

/*Integrantes:
Gadi Rebolledo
Nicolas Figueroa
Alan Baeza
*/

//Utilities
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

// Metodo sobrecarga en Clase: Recompensa y usuario.

public class ProyectoPOO {

  public static ArrayList<Mision> coleccionMisiones = new ArrayList<>(); // total de misiones que pueden ser escogidas para el usuario
  public static ArrayList<Recompensa> coleccionRecompensas = new ArrayList<>();

  public static void main(String[] args) {

    System.out.println("----CARGANDO DATOS----");
    cargarDatos();
    System.out.println("....");
    System.out.println(" ");

    // Recompensa recompensa = new Recompensa();
    int verificador;
    int tipoRol;
    Scanner entrada = new Scanner(System.in);
    
    Operaciones operaciones = new Operaciones(); 
    
    
    System.out.println("Ingrese 1 para entrar en modo administrador");
    System.out.println("Ingrese 2 para entrar como visitante");
    
    tipoRol = operaciones.ValidarRol();
    
    while (tipoRol == 1) {
      System.out.println("----Bienvenida/o al Menu----");
      System.out.println("Ingrese el número de la opción a realizar");
      System.out.println("1. Agregar Elemento");
      System.out.println("2. Ver Elemento");
      System.out.println("0. Salir");
      System.out.println(" ");
      verificador = operaciones.ValidarInt();

      switch (verificador) {
        // SALIR
        case 0:
          tipoRol = 0;
          break;
        // AGREGAR
        case 1:
          System.out.println("¿Que desea agregar?");
          System.out.println("1. Misiones");
          System.out.println("2. Recompensas");
          System.out.println("0. Volver al menú");
          System.out.println(" ");
          verificador = operaciones.ValidarInt();
          switch (verificador) {
            // MENU
            case 0:
              break;
            // MISIONES
            case 1:
              System.out.println("----CREANDO MISION----");
              agregarMision();
              System.out.println("----MISION CREADA----");
              System.out.println(" ");
              break;
            // RECOMPENSAS
            case 2:
              System.out.println("----CREANDO RECOMPENSA----");
              agregarRecompensa();
              System.out.println("----RECOMPENSA CREADA----");
              System.out.println(" ");
              break;
            // DEF
            default:
              System.out.println("Hubo un error, intentelo denuevo");
              System.out.println(" ");
              break;
          }
          break;
        // MOSTRAR
        case 2:
          System.out.println("¿Que desea ver?");
          System.out.println("1. Misiones");
          System.out.println("2. Recompensas");
          System.out.println("0. Volver al menú");
          verificador = operaciones.ValidarInt();
          switch (verificador) {
            // MENU
            case 0:
              break;
            // MISIONES
            case 1:
              if (coleccionMisiones.size() == 0) {
                System.out.println("Colección vacía");
                System.out.println("");
              } else {
                for (int i = 0; i < coleccionMisiones.size(); i++) {
                  System.out.println("");
                  System.out.println("--MOSTRANDO MISION N°" + (i + 1) + "--");
                  coleccionMisiones.get(i).verMision();
                }
              }
              break;
            // RECOMPENSAS
            case 2:
              if (coleccionRecompensas.size() == 0) {
                System.out.println("Colección vacía");
                System.out.println("");
              } else {
                for (int i = 0; i < coleccionRecompensas.size(); i++) {
                  System.out.println("");
                  System.out.println("--MOSTRANDO RECOMPENSA N°" + (i + 1) + "--");
                  coleccionRecompensas.get(i).verRecompensa();
                  ;
                }
              }
              break;
            // DEF
            default:
              System.out.println("Hubo un error, intentelo denuevo");
              System.out.println(" ");
              break;
          }
          break;
        // DEF
        default:
          System.out.println("Numero introducido erroneo, intentelo denuevo");
          System.out.println(" ");
          break;
      }
    }
    if (tipoRol == 2) {
      System.out.println("Modo usuario");
      System.out.println(" ");
      System.out.println("Lamentamos informar que este modo se encuentra en desarrollo, gracias por su comprension");
    }

    System.out.println("-----------FIN-----------");

  }

  public static void agregarMision() {
    Mision mision = new Mision();
    String datos = mision.crearMision();
    coleccionMisiones.add(mision);
    guardarDatos(datos,"misiones");
  }

  public static void agregarRecompensa() {
    Recompensa recompensa = new Recompensa();
    String datos = recompensa.crearRecompensa();
    coleccionRecompensas.add(recompensa);
    guardarDatos(datos,"recompensas");
  }

  public static void cargarDatos() {
    System.out.println("Cargando misiones...");
    cargarMis();
    System.out.println("Cargando recompensas...");
    cargarRec();
  }

  public static void cargarRec(){
    // RECOMPENSAS
    try {
      BufferedReader archivo = new BufferedReader(new FileReader("src/test/recompensas.txt")); // loader/reader archivo

      String linea; // Linea actual
      while ((linea = archivo.readLine()) != null) { // Mientras existan lineas para leer
        // System.out.println(linea);
        String[] campos = linea.split(";"); // separar lineas en partes
        Date fecha = new SimpleDateFormat("dd/mm/yyyy").parse(campos[1]);
        coleccionRecompensas.add(new Recompensa(campos[0].charAt(0), fecha, Integer.parseInt(campos[2])));
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(ProyectoPOO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);
    } catch (ParseException e) {
      System.out.println(e);
    }
  }

  public static void cargarMis() {
    // MISIONES
    try {
      BufferedReader archivo = new BufferedReader(new FileReader("src/test/misiones.txt")); // loader/reader archivo

      String linea; // Linea actual
      while ((linea = archivo.readLine()) != null) { // Mientras existan lineas para leer
        // System.out.println(linea);
        String[] campos = linea.split(";"); // separar lineas en partes
        coleccionMisiones.add(new Mision(Integer.parseInt(campos[0]), campos[1].charAt(0),Boolean.parseBoolean(campos[2]), Integer.parseInt(campos[3])));
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(ProyectoPOO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void guardarDatos(String datos, String nombre){
    String ruta = "src/test/"+nombre+".txt"; //Crear ruta en string
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
      lapiz.println("");
      lapiz.print(datos);

      lapiz.close();
      
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
