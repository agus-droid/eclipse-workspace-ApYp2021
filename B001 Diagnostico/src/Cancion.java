public class Cancion {
	private String titulo;
	private String autor;
	private int duracion;
	private String genero;

	@Override
	public String toString() {
		return this.titulo;
	}

	public Cancion(String titulo, String autor, int duracion, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getGenero() {
		return genero;
	}
}
