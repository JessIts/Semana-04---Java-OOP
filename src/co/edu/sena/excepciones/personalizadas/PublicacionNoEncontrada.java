package co.edu.sena.excepciones.personalizadas;

public class PublicacionNoEncontrada extends Exception {

  public PublicacionNoEncontrada(int id) {
    super("No existe una publicación con el ID: " + id);
  }
}

