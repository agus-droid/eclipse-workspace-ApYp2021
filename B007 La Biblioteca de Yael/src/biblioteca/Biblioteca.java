package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> Libros;
	
	public Biblioteca() {
		 Libros = new ArrayList<Libro>();
	}
	
	public void agregarLibro(Libro libro) {
		Libros.add(libro);
	}

	public String verLibros(){
		return Libros.toString();
	}
	
}
