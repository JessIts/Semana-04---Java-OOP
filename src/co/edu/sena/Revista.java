package co.edu.sena;

//Se crea la clase extendiendo la desde publicacion
public class Revista extends Publicacion {
  private int numeroEdicion; //nuevo atributo solo para las revistas

  //Constructor para revistas, añadiendo el numero de edicion a la plantilla base
  public Revista(int id, String titulo, String autor, double precio, int numeroEdicion) {
    super(id, titulo, autor, precio);
    this.numeroEdicion = numeroEdicion;
  }

  //Identifica que tipo de publicacion es; sobreescribe un metodo de publicacion
  @Override
  public String getTipo() {
    return "Revista";
  }

  //Sobreescribe el metodo de publicacion, y le añade nuevos parámetros
  @Override
  public String toString() {
    return super.toString() + ", Edición=" + numeroEdicion + "]";
  }
}

