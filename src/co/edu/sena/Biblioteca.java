package co.edu.sena;

import java.util.ArrayList;

//Clase para guardar los libros
public class Biblioteca {

  // Lista de libros

  /* Diccionario de libros, donde almacenaré diferentes
  libros iniciando una instancia vacía que puede crecer
  o disminuirse, indicando que solo puede tener objetos
  de la clase Libros.
   */
  private ArrayList<Libro> libros = new ArrayList<>();

  //Funcion para añadir libros
  public void agregarLibro(Libro libro) {
    libros.add(libro);
    System.out.println("Libro agregado correctamente.");
  }

  //Función que muestra todos los libros registrados
  public void listarLibros() {

    //compruebo si la lista de libros esta vacía
    if (libros.isEmpty()) {
      System.out.println("No hay libros registrados.");
    } else {
      System.out.println("Lista de libros:");

      //Un ciclo para que imprima cada libro, dentro de libros
      for (Libro l : libros) {
        System.out.println(l);
      }
    }
  }

  //Funcion para listar los libros, filtrando por ID
  public Libro buscarLibro(int id) {
    for (Libro l : libros) {
      if (l.getId() == id) {
        return l;
      }
    }
    return null;
  }

  //Funcion para modificar los datos de los li8bros
  public void actualizarLibro(int id, String nuevoTitulo, String nuevoAutor, Double nuevoPrice, int nuevoAnio) {
    Libro libro = buscarLibro(id);
    if (libro != null) {

      /*acá usamos los setters que definimos antes en la
      calse Libro para actualizar informacion jejeje
       */
      libro.setTitulo(nuevoTitulo);
      libro.setAutor(nuevoAutor);
      libro.setPrice(nuevoPrice);
      libro.setAnioPublicacion(nuevoAnio);
      System.out.println("Libro actualizado correctamente.");
    } else {
      System.out.println("Libro no encontrado.");
    }
  }

  //Funcion para eliminar un libro teniendo en cuenta su ID
  public void eliminarLibro(int id) {
    Libro libro = buscarLibro(id);
    if (libro != null) {
      libros.remove(libro);
      System.out.println("Libro eliminado correctamente.");
    } else {
      System.out.println("Libro no encontrado.");
    }
  }
}

