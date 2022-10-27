package Salida;

import static com.mycompany.poo.Poo.coleccionMisiones;
import static com.mycompany.poo.Poo.coleccionRecompensas;
import Colecciones.*;


public class Menu {
    private Operaciones operaciones = new Operaciones();
    
    public Menu(){}
    
    public void menuAdmin(){
        // Recompensa recompensa = new Recompensa();
        int verificador;
        int tipoRol;

        System.out.println("Ingrese 1 para entrar en modo administrador");
        System.out.println("Ingrese 2 para entrar como visitante");

        tipoRol = operaciones.ValidarRol();

        while (tipoRol == 1) {
          System.out.println("----Usted ingresó como administrador----");
          System.out.println("----Bienvenida/o al Menu----");
          System.out.println("Ingrese el número de la opción a realizar");
          System.out.println("1. Agregar Elemento");
          System.out.println("2. Ver Elementos");
          System.out.println("3. Modificar Elemento");
          System.out.println("4. Eliminar Elemento");
          System.out.println("5. Buscar Elemento");
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
                  System.out.println("Hubo un error, inténtelo de nuevo");
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
                      System.out.println("--MOSTRANDO MISION ID:" + coleccionMisiones.get(i).getIdMision() + "--");
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
                      System.out.println("--MOSTRANDO RECOMPENSA ID:" + coleccionRecompensas.get(i).getIdRecompensa() + "--");
                      coleccionRecompensas.get(i).verRecompensa();
                      ;
                    }
                  }
                  break;
                // DEF
                default:
                  System.out.println("Hubo un error, inténtelo denuevo");
                  System.out.println(" ");
                  break;
              }
              break;
            //MODIFICAR
            case 3:
              System.out.println("¿Que desea modificar?");
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
                  break;
                // RECOMPENSAS
                case 2:
                  break;
                // DEF
                default:
                  System.out.println("Hubo un error, inténtelo de nuevo");
                  System.out.println(" ");
                  break;
              }
              break;
            //ELIMINAR
            case 4:
              System.out.println("¿Que desea eliminar?");
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
                  break;
                // RECOMPENSAS
                case 2:
                  break;
                // DEF
                default:
                  System.out.println("Hubo un error, inténtelo de nuevo");
                  System.out.println(" ");
                  break;
              }
              break;
            //BUSCAR
            case 5:
              System.out.println("¿Que desea buscar?");
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

                  break;
                // RECOMPENSAS
                case 2:
                  break;
                // DEF
                default:
                  System.out.println("Hubo un error, inténtelo de nuevo");
                  System.out.println(" ");
                  break;
              }
              break;
            // DEF
            default:
              System.out.println("Número introducido erróneo, intentelo de nuevo");
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

  private void agregarMision() {
    Mision mision = new Mision();
    String datos = mision.crearMision();
    coleccionMisiones.add(mision);
    operaciones.guardarDatos(datos,"misiones");
  }

  private void agregarRecompensa() {
    Recompensa recompensa = new Recompensa();
    String datos = recompensa.crearRecompensa();
    coleccionRecompensas.add(recompensa);
    operaciones.guardarDatos(datos,"recompensas");
  }
}
