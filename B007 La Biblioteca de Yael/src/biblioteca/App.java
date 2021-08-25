package biblioteca;

public class App {

	public static void main(String[] args) {
		Libro l1 = new Libro("La Biblioteca de Yael", "Agus", 420, 2006);
		Biblioteca b1 = new Biblioteca();
		b1.agregarLibro(l1);
		System.out.println(b1.verLibros());
	}

}
