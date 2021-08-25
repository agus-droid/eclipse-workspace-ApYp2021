package biblioteca;

import java.util.Objects;

public class Libro {
	private String titulo;
	private String autor;
	private int cantidadPaginas;
	private int anioPublicacion;
	private Genero genero;
	private final int LARGO_DETERMINADO = 200;

	public Libro(String titulo_, String autor_, int cantidadPaginas_, int anioPublicacion_) {
		if (titulo_.length() > LARGO_DETERMINADO)
			this.titulo = titulo_.substring(0, LARGO_DETERMINADO);
		else
			this.titulo = titulo_;
		this.autor = autor_;
		this.cantidadPaginas = cantidadPaginas_;
		this.anioPublicacion = anioPublicacion_;
	}

	public String tituloNormalizado() {
		String articulo = this.titulo.substring(0, this.titulo.indexOf(' '));
		String resto = this.titulo.substring(this.titulo.indexOf(' ') + 1);
		return resto + ", " + articulo;
	}

	public String formatoAPA() {
		return this.titulo + ", " + this.autor + " (" + this.anioPublicacion + "). " + this.genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero_) {
		this.genero = genero_;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}

}
