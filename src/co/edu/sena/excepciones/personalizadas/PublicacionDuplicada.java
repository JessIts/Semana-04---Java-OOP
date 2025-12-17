package co.edu.sena.excepciones.personalizadas;

public class PublicacionDuplicada extends Exception {

  public PublicacionDuplicada(int id) {
    super("Ya existe una publicación con el ID: " + id);
  }
}

