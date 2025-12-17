package co.edu.sena;

/* Importo funciones de la superclase util,
* aunque podría importar varias al mismo tiempo con .* */
import java.util.InputMismatchException;
import java.util.Scanner;

import co.edu.sena.excepciones.personalizadas.PublicacionNoEncontrada;
import co.edu.sena.excepciones.personalizadas.PublicacionDuplicada;
import co.edu.sena.excepciones.personalizadas.PrecioInvalido;

//Inicio de la clase Biblioteca
public class MenuBiblioteca {

  //Creo una variable biblioteca y una scanner
  private Biblioteca biblioteca;
  private Scanner sc = new Scanner(System.in);

  /*Metodo para crear un Menu de la biblioteca, usando como parámetros
  a la clase biblioteca*/
  public MenuBiblioteca(Biblioteca biblioteca) {
    this.biblioteca = biblioteca;
  }

  //Metodo para mostrar el menu
  public void mostrarMenu() {
    int opcion = 0;
    do { //mientras se cumpla la condicion, el programa no se detendra
      try {
        System.out.println("\n=== MENÚ BIBLIOTECA ===");
        System.out.println("1. Agregar Libro");
        System.out.println("2. Agregar Revista");
        System.out.println("3. Listar Publicaciones");
        System.out.println("4. Actualizar Publicación");
        System.out.println("5. Eliminar Publicación");
        System.out.println("6. Salir");
        System.out.print("Opción: ");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
          case 1 -> agregarLibro();
          case 2 -> agregarRevista();
          case 3 -> biblioteca.listarPublicaciones();
          case 4 -> actualizar();
          case 5 -> eliminar();
          case 6 -> System.out.println("Saliendo del sistema...");
          default -> System.out.println("Porfavor, ingrese una opcion válida...");
        } //cierra del switch

      } catch (InputMismatchException e) {
        System.out.println("Error: ingrese un número.");
        sc.nextLine();
      }

    } while (opcion != 6); //cierre del ciclo
  } //cierre de la funcion mostrarMenu()

  //Inicio de la funcion agregarLibro()
  private void agregarLibro() {
    try {
      System.out.print("ID: ");
      int id = sc.nextInt();
      sc.nextLine();

      System.out.print("Título: ");
      String titulo = sc.nextLine();

      System.out.print("Autor: ");
      String autor = sc.nextLine();

      System.out.print("Precio: ");
      double precio = sc.nextDouble();

      System.out.print("Año publicación: ");
      int anio = sc.nextInt();

      biblioteca.agregarPublicacion(
          new Libro(id, titulo, autor, precio, anio)
      );

      System.out.println("Libro agregado correctamente.");

    } catch (PublicacionDuplicada | PrecioInvalido e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Datos inválidos.");
      sc.nextLine();
    }
  }//cierre de la funcion agregarLibro()

  //Inicio de la funcion agregarRevista()
  private void agregarRevista() {
    try {
      System.out.print("ID: ");
      int id = sc.nextInt();
      sc.nextLine();

      System.out.print("Título: ");
      String titulo = sc.nextLine();

      System.out.print("Autor: ");
      String autor = sc.nextLine();

      System.out.print("Precio: ");
      double precio = sc.nextDouble();

      System.out.print("Número de edición: ");
      int edicion = sc.nextInt();

      //Se usa el metodo de la clase biblioteca
      biblioteca.agregarPublicacion(new Revista(id, titulo, autor, precio, edicion));

    } catch (Exception e) {
      System.out.println("Error al agregar revista.");
    }
  }//Cierre de la funcion agregarRevista()

  //metodos para actualizar las publicaciones
  private void actualizar() {
    try {
      System.out.print("ID a actualizar: ");
      int id = sc.nextInt();
      sc.nextLine();

      System.out.print("Nuevo título: ");
      String titulo = sc.nextLine();

      System.out.print("Nuevo autor: ");
      String autor = sc.nextLine();

      System.out.print("Nuevo precio: ");
      double precio = sc.nextDouble();

      biblioteca.actualizarPublicacion(id, titulo, autor, precio);
      System.out.println("Publicación actualizada.");

    } catch (PublicacionNoEncontrada | PrecioInvalido e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Entrada inválida.");
      sc.nextLine();
    }
  }//cierre del metodo actualizar

  //Inicio del metodo para eliminar publicaciones
  private void eliminar() {
    try {
      System.out.print("ID a eliminar: ");
      int id = sc.nextInt();

      biblioteca.eliminarPublicacion(id);
      System.out.println("Publicación eliminada.");

    } catch (PublicacionNoEncontrada e) {
      System.out.println(e.getMessage());
    }
  }//Cierre del metodo para eliminar publicaciones
} //Cierre de la clase Principal


