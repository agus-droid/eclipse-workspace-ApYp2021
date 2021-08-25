package biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class LibroTest {

	@Test
	public void queDosLibrosConMismoTituloYAutorSonIguales() {
		LibroBak l1 = new LibroBak("Java", "Norma", Genero.DIVULGACION);
		LibroBak l2 = new LibroBak("Java", "Norma", Genero.DIVULGACION);

		boolean valorEsperado = true;
		boolean valorObtenido = l1.equals(l2);

		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSiAsignoUnGeneroElLibroPertenezcaAEseGenero() {
		LibroBak l1 = new LibroBak("HashCode", "Joana", Genero.FICCION);

		Genero valorEsperado = Genero.FICCION;

		Genero valorObtenido = l1.getGenero();

		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaRecortarTitulosLargos() {
		int largoDetermina = 3;
		LibroBak l1 = new LibroBak("HashCode", "Joana", Genero.FICCION);

		String valorEsperado = "Has";

		String valorObtenido = l1.recortarTitulo(largoDetermina);

		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePuedaFromatearTituloAPA() {
		LibroBak l1 = new LibroBak("HashCode", "Joana", Genero.FICCION);
		l1.setAnio(2018);
		String apaEsperado = "HashCode (2018). Joana";
		String apaObtenido = l1.formatoAPA();
		Assert.assertEquals(apaEsperado, apaObtenido);
	}

}