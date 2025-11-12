package co.edu.sena;

//Clase que define como sera el libro dentro de mi biblioteca
public class Libro {
  // Atributos privados
  private int id;
  private String titulo;
  private String autor;
  private Double price;
  private int anioPublicacion;

  // Constructor
  public Libro(int id, String titulo, String autor, Double price, int anioPublicacion) {
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.price = price;
    this.anioPublicacion = anioPublicacion;
  }

  // Getters para obtener la informacion, y setters para modificarla/actualizarla
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }
  public Double getPrice(){
    return price;
  }
  public void setPrice(Double price){
    this.price = price;
  }
  public int getAnioPublicacion() {
    return anioPublicacion;
  }

  public void setAnioPublicacion(int anioPublicacion) {
    this.anioPublicacion = anioPublicacion;
  }

  @Override //permite asegurarnos de que un metodo se puede sobreescribir

  //permite ver un libro, o su informacion, como un string para imprimirlo bien piola
  public String toString() {
    return "Libro [ID=" + id + ", Título=" + titulo + ", Autor=" + autor + ", Precio=" + price + ", Año=" + anioPublicacion + "]";
  }
}

