package biblioteca;

public class BibliotecaBak {

	private int cantidadLibrosEnLaColeccion;
	private LibroBak[] libros;
	private int cantidadActualDeLibros = 0;

	public BibliotecaBak(int cantidadLibrosEnLaColeccion) {
		this.cantidadLibrosEnLaColeccion = cantidadLibrosEnLaColeccion;
		this.libros = new LibroBak[cantidadLibrosEnLaColeccion];
	}

	public void agregarLibro(LibroBak libro) {
		this.libros[cantidadActualDeLibros] = libro;
		this.cantidadActualDeLibros++;
	}

	public int[] contarLibrosPorGeneros() {
		int[] librosPorGenero = new int[Genero.values().length];
		for (LibroBak libro : this.libros) {
			librosPorGenero[libro.getGenero().ordinal()] += 1;
		}
		return librosPorGenero;
	}

	public int getCantidadLibrosEnLaColeccion() {
		return cantidadLibrosEnLaColeccion;
	}

}