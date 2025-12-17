package co.edu.sena.excepciones.personalizadas;

public class PrecioInvalido extends Exception {

  public PrecioInvalido(double precio) {
    super("El precio no es válido: " + precio);
  }
}

