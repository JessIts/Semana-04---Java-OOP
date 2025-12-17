package co.edu.sena;

import java.util.HashMap;
import java.util.Map;

import co.edu.sena.excepciones.personalizadas.PublicacionNoEncontrada;
import co.edu.sena.excepciones.personalizadas.PublicacionDuplicada;
import co.edu.sena.excepciones.personalizadas.PrecioInvalido;

public class Biblioteca {

  private Map<Integer, Publicacion> publicaciones = new HashMap<>();

  public void agregarPublicacion(Publicacion p)
      throws PublicacionDuplicada, PrecioInvalido {

    if (publicaciones.containsKey(p.getId())) {
      throw new PublicacionDuplicada(p.getId());
    }

    if (p.precio <= 0) {
      throw new PrecioInvalido(p.precio);
    }

    publicaciones.put(p.getId(), p);
  }

  public Publicacion buscar(int id)
      throws PublicacionNoEncontrada {

    Publicacion p = publicaciones.get(id);

    if (p == null) {
      throw new PublicacionNoEncontrada(id);
    }

    return p;
  }

  public void listarPublicaciones() {
    if (publicaciones.isEmpty()) {
      System.out.println("No hay publicaciones registradas.");
      return;
    }

    for (Publicacion p : publicaciones.values()) {
      System.out.println(p);
    }
  }

  public void actualizarPublicacion(int id, String titulo, String autor, double precio)
      throws PublicacionNoEncontrada, PrecioInvalido {

    if (precio <= 0) {
      throw new PrecioInvalido(precio);
    }

    Publicacion p = buscar(id);

    p.setTitulo(titulo);
    p.setAutor(autor);
    p.setPrecio(precio);
  }

  public void eliminarPublicacion(int id)
      throws PublicacionNoEncontrada {

    if (publicaciones.remove(id) == null) {
      throw new PublicacionNoEncontrada(id);
    }
  }
}



