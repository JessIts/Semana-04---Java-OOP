package co.edu.sena;

/*Mi hermosa, preciosa, bella clase principal donde
se ejecuta todoo */
public class Main {
  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    MenuBiblioteca menu = new MenuBiblioteca(biblioteca);
    menu.mostrarMenu();
  }
}

