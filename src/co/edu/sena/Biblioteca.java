package co.edu.sena;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {

  private Map<Integer, Publicacion> publicaciones = new HashMap<>();

  //Primer metodo para agregar una publicacion a la "biblioteca"
  public void agregarPublicacion(Publicacion p) {
    publicaciones.put(p.getId(), p);
    System.out.println("Publicación agregada.");
  }

  //Metodo para agregar una publicacion a la "biblioteca" con parametros diferentes del primero
  public void agregarPublicacion(int id, String titulo, String autor, double precio) {
    Publicacion p = new Libro(id, titulo, autor, precio, 0);
    agregarPublicacion(p);
  }

  //Metodo para mostrar todas las publicaciones en la "biblioteca"
  public void listarPublicaciones() {
    if (publicaciones.isEmpty()) {
      System.out.println("No hay publicaciones registradas.");
      return;
    }
    //Por cada publicacion dentro de las publicaciones, mostrará sus respectivos valores
    for (Publicacion p : publicaciones.values()) {
      System.out.println(p);
    }
  }

  //Busca y obtiene el id de una publicacion
  public Publicacion buscar(int id) {
    return publicaciones.get(id);
  }

  //Actualiza la informacion de la publicacion si hay un ID valido
  public void actualizarPublicacion(int id, String titulo, String autor, double precio) {

    Publicacion p = buscar(id);

    //Actualiza la informacion utilizando los setters de publicacion
    if (p != null) {
      p.setTitulo(titulo);
      p.setAutor(autor);
      p.setPrecio(precio);
      System.out.println("Publicación actualizada.");
    } else {
      System.out.println("No existe una publicación con ese ID.");
    }
  }

  //Elimina una publicacion si councide con el ID
  public void eliminarPublicacion(int id) {
    if (publicaciones.remove(id) != null) {
      System.out.println("Publicación eliminada.");
    } else {
      System.out.println("No se encontró la publicación.");
    }
  }
}


