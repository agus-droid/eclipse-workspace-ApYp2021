package biblioteca;

public class LibroBak {

	private String titulo;
	private String autor;
	private Genero genero;
	private final int LARGO_DETERMINADO = 200;
	private int anio;

	public LibroBak(String titulo, String autor, Genero genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
	}

	public Genero getGenero() {
		return this.genero;
	}

	public String recortarTitulo(int largoDetermina) {
		if (this.titulo.length() > largoDetermina) {
			return this.titulo.substring(0, largoDetermina);
		}
		return this.titulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibroBak other = (LibroBak) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public String formatoAPA() {
		return this.titulo + " (" + this.anio + "). " + this.autor;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getLARGO_DETERMINADO() {
		return LARGO_DETERMINADO;
	}
	@Override
	public String toString() {
		return this.titulo;
	}
}