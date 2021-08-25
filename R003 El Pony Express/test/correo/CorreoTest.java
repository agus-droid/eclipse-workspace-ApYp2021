package correo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CorreoTest {

	@Test
	public void queElMetodoCalculeCantidadCaballos() {
		assertEquals(1, Correo.caballos(new int[] { 18, 15 }));
		assertEquals(2, Correo.caballos(new int[] { 43, 23, 40, 13 }));
		assertEquals(3, Correo.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		assertEquals(4, Correo.caballos(new int[] { 51, 51, 51, 51 }));
		assertEquals(4, Correo.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}

	@Test(expected = Error.class)
	public void queLasDistanciasSeanValidas() {
		Correo.caballos(new int[] { -40, 51, 51, 51 });
		Correo.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 1000, 49 });
	}

	@Test(expected = Error.class)
	public void detectarArrayVacio() {
		Correo.caballos(new int[] {});
	}
}
