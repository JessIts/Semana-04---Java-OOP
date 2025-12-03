package co.edu.sena;

//Se crea la clase extendiendo la desde la superclase publicacion
public class Libro extends Publicacion {
  private int anioPublicacion; //nuevo atributo solo para los libros

  //Constructor para libros, añadiendo el año a la plantilla base
  public Libro(int id, String titulo, String autor, double precio, int anioPublicacion) {
    super(id, titulo, autor, precio);
    this.anioPublicacion = anioPublicacion;
  }

  //Identifica que tipo de publicacion es; sobreescribe un metodo de publicacion
  @Override
  public String getTipo() {
    return "Libro";
  }

  //Sobreescribe el metodo de publicacion, y le añade nuevos parámetros
  @Override
  public String toString() {
    return super.toString() + ", Año=" + anioPublicacion + "]";
  }
}


