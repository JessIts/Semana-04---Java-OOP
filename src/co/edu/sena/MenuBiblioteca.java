package co.edu.sena;

import java.util.Scanner;

/*clase que muestra el menu, sin embargo aca podemos
hacer mas menús :3
 */
public class MenuBiblioteca {
  private Biblioteca biblioteca;
  private Scanner sc;

  // Constructor
  public MenuBiblioteca(Biblioteca biblioteca) {
    this.biblioteca = biblioteca; //mi diccionario donde voy a guardar los libros
    this.sc = new Scanner(System.in);
    /*Cuando llamea sc, creare un objeto de la clase
    scanner para poder leer datos ingresados por teclado*/
  }

  /* Funcion para mostrar el menú*/
  public void mostrarMenu() {
    int opcion;
    /* Inicio del ciclo de opciones*/
    do {
      System.out.println("\n=== MENÚ BIBLIOTECA ===");
      System.out.println("1. Agregar libro");
      System.out.println("2. Listar libros");
      System.out.println("3. Actualizar libro");
      System.out.println("4. Eliminar libro");
      System.out.println("5. Salir");
      System.out.print("Elige una opción: ");
      opcion = sc.nextInt();
      sc.nextLine(); // toma todos los caracteres que se agreguen, incluso con espacios

      /* Selector para no hacer un reguero de
      if
        elif
          elif
            elif......
              ELSE
       */
      switch (opcion) {
        case 1:
          agregarLibro();
          break;
        case 2:
          biblioteca.listarLibros();
          break;
        case 3:
          actualizarLibro();
          break;
        case 4:
          eliminarLibro();
          break;
        case 5:
          System.out.println("Hasta Pronto!!!...");
          break;
        default:
          System.out.println("===Porfavor, ingrese una opcion válida===");
      }

    } while (opcion != 5);
  }


  //Funcion para agregar libros
  private void agregarLibro() {
    System.out.print("ID del libro: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Título: ");
    String titulo = sc.nextLine();
    System.out.print("Autor: ");
    String autor = sc.nextLine();
    System.out.print("Precio :");
    Double price = sc.nextDouble();
    System.out.print("Año de publicación: ");
    int anio = sc.nextInt();

    /* Acá hacemos uso del constructor en la clase libros
    para crear los nuevos libros, usando la informacion
    ingresada
     */
    Libro nuevo = new Libro(id, titulo, autor, price, anio);
    biblioteca.agregarLibro(nuevo); //se añaden los datos del libro nuevo a la biblioteca
  }

  //Funcion para actualizar el libro
  private void actualizarLibro() {
    System.out.print("ID del libro a actualizar: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Nuevo título: ");
    String nuevoTitulo = sc.nextLine();
    System.out.print("Nuevo autor: ");
    String nuevoAutor = sc.nextLine();
    System.out.print("Nuevo Precio: ");
    Double nuevoPrice = sc.nextDouble();
    System.out.print("Nuevo Año: ");
    int nuevoAnio = sc.nextInt();

    //Acá se actualizan los nuevos datos teniendo en cuenta el ID del libro
    biblioteca.actualizarLibro(id, nuevoTitulo, nuevoAutor, nuevoPrice, nuevoAnio);
  }

  //Funcion para eliminar un libro
  private void eliminarLibro() {
    System.out.print("ID del libro a eliminar: ");
    int id = sc.nextInt();

    //lo mismo, se eliminan teniendo en cuenta el ID
    biblioteca.eliminarLibro(id);
  }
}

