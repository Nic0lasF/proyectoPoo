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
        boolean estado = true;
        System.out.println("");
        System.out.println("----Usted ingresó como administrador----");


        while (estado) {
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
              estado = false;
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
                System.out.println("1. Buscar Misiones por id");
                System.out.println("2. Buscar Misiones de un tipo menores a un tiempo maximo");
                verificador = operaciones.ValidarInt();
                
                switch (verificador) {
                    case 1:
                        System.out.println("Ingrese el id de la mision que quiera buscar");
                        int idMision = operaciones.ValidarInt();                        
                        buscarMision(idMision);
                        break;
                    
                    case 2:
                        System.out.println("Ingrese el tipo de mision que quiera buscar (P pasos|R Reciclado|D Noticia Diaria)");
                        char tipoMision = operaciones.ValidarChar();                       
                        System.out.println("Ingrese el tiempo restante maximo");
                        int tiempoRestante = operaciones.ValidarInt();         
                        buscarMision(tipoMision, tiempoRestante);
                        break;
                        
                    default:
                        break;
                }
                break;
                // RECOMPENSAS
                case 2:
                System.out.println("Ingrese id de la recompensa que quiere buscar");
                int idRecompensa = operaciones.ValidarInt();                        
                buscarRecompensa(idRecompensa);                    
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
        
        System.out.println("-----------FIN-----------");

      }
    public void menuCliente(){
        System.out.println("Modo usuario");
        System.out.println(" ");
        System.out.println("Lamentamos informar que este modo se encuentra en desarrollo, gracias por su comprension");
    }

  private void agregarMision() {
    Mision mision = new Mision();
    mision.crearMision();
    coleccionMisiones.add(mision);
    operaciones.guardarDatos(mision.getDatosString(),"misiones");
  }

  private void agregarRecompensa() {
    Recompensa recompensa = new Recompensa();
    recompensa.crearRecompensa();
    coleccionRecompensas.add(recompensa);
    operaciones.guardarDatos(recompensa.getDatosString(),"recompensas");
  }

  public static void buscarMision(int id){
      for (int i = 0 ; i < coleccionMisiones.size() ; i++){
          if(coleccionMisiones.get(i).getIdMision() == id){
              System.out.println("Mision Encontrada!");
              System.out.println("");
              coleccionMisiones.get(i).verMision();
              return;
          }
      }
      System.out.println("No se ha encontrado la mision");
  }
  public static void buscarMision(char tipo, int tiempo){
      boolean flag = false; 
      for (int i = 0 ; i < coleccionMisiones.size() ; i++){
          if(Character.compare(coleccionMisiones.get(i).getTipoMision(), tipo) == 0 && coleccionMisiones.get(i).getTiempoCaducidad() < tiempo){
              if(flag == false){
                flag = true;
                System.out.println("Mostrando misiones con tiempo restante menor a " + tiempo + "horas.");
              }
                System.out.println("");
                coleccionMisiones.get(i).verMision();
          }
      }
      if(flag == false){
          System.out.println("No se ha encontrado ninguna mision");
      }
  }
  public static void buscarRecompensa(int id){
      for (int i = 0 ; i < coleccionRecompensas.size() ; i++){
          if(coleccionRecompensas.get(i).getIdRecompensa() == id){
              System.out.println("Mision Encontrada!");
              System.out.println("");
              coleccionRecompensas.get(i).verRecompensa();
              return;
          }
      }
      System.out.println("No se ha encontrado la mision");
  }  
}
