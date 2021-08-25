import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Cancion> CancionesLista = new ArrayList<Cancion>();
		Cancion c1 = new Cancion("Torero", "Chayanne", 221, "Pop");
		Cancion c2 = new Cancion("Torero2", "Chayanne", 221, "Pop");
		Cancion c3 = new Cancion("Torero2", "Daddy Yankee", 221, "Pop");
		Cancion c4 = new Cancion("Torero2", "Daddy Yankee", 221, "Pop");
		Cancion c5 = new Cancion("Torero2", "Daddy Yankee", 221, "Pop");
		CancionesLista.add(c1);
		CancionesLista.add(c2);
		CancionesLista.add(c3);
		CancionesLista.add(c4);
		CancionesLista.add(c5);
		System.out.println(c5);
		System.out.println(AutorMasCanciones(CancionesLista));
	}

	public static String CancionMasLarga(ArrayList<Cancion> Canciones) {
		int duracion = 0;
		String NombreCancion = "";
		for (Cancion i : Canciones) {
			if (i.getDuracion() > duracion) {
				duracion = i.getDuracion();
				NombreCancion = i.getTitulo();
			}
		}
		return NombreCancion;
	}

	public static int CantidadCancionesPorGenero(ArrayList<Cancion> Canciones, String genero) {
		int cantidad = 0;
		for (Cancion i : Canciones) {
			if (i.getGenero() == genero) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public static int CantidadCancionesPorAutor(ArrayList<Cancion> Canciones, String autor) {
		int cantidad = 0;
		for (Cancion i : Canciones) {
			if (i.getAutor() == autor) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public static String AutorMasCanciones(ArrayList<Cancion> Canciones) {
		String Autor = "";
		int cantidad = 0;
		for (Cancion i : Canciones) {
			if (CantidadCancionesPorAutor(Canciones, i.getAutor()) > cantidad) {
				Autor = i.getAutor();
				cantidad = CantidadCancionesPorAutor(Canciones, i.getAutor());
			}
		}
		return Autor;
	}

	public static double TotalHorasMusica(ArrayList<Cancion> Canciones) {
		double horas;
		double minutos;
		int segundos = 0;
		for (Cancion i : Canciones) {
			segundos += i.getDuracion();
		}
		minutos = segundos / 60;
		horas = minutos / 60;
		return horas;
	}
}
