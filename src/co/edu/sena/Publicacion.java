package co.edu.sena;

//Inicio de la clase publicacion con sus atributos
public abstract class Publicacion {
  protected int id;
  protected String titulo;
  protected String autor;
  protected double precio;

  //Constructor o "plantilla" base para las publicaciones
  public Publicacion(int id, String titulo, String autor, double precio) {
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.precio = precio;
  }

  // metodo abstracto para usar en las diferentes tipos de publicaciones
  public abstract String getTipo();

  // getters y setters
  public int getId() { return id; }
  public void setTitulo(String titulo) { this.titulo = titulo; }
  public void setAutor(String autor) { this.autor = autor; }
  public void setPrecio(double precio) { this.precio = precio; }

  // Metodo para sobreescritura en otras clases
  @Override
  public String toString() {
    return getTipo() + " [ID=" + id + ", Título=" + titulo + ", Autor=" + autor + ", Precio=" + precio + "]";
  }
}

