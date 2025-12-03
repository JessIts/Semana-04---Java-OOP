package co.edu.sena;

//Mi hermosa, preciosa, bella e inigualable clase main
public class Main {
  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    MenuBiblioteca menu = new MenuBiblioteca(biblioteca);
    menu.mostrarMenu();
  }
}


