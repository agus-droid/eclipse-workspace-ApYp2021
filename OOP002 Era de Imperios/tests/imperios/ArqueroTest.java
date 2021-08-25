package imperios;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArqueroTest {

	@Test
	public void distancias() {
		Arquero c1 = new Arquero(new Posicion(0, 0));
		Soldado c2 = new Soldado(new Posicion(1, 1));
		assertEquals(Math.sqrt(2), c1.distanciaCon(c2), 0.0001);
	}

	@Test
	public void pelea() {
		Arquero u1 = new Arquero(new Posicion(0, 0));
		Caballero u2 = new Caballero(new Posicion(5, 5));
		Soldado u3 = new Soldado(new Posicion(50, 2));

		assertEquals(100, u2.getSalud());
		u1.atacar(u2);
		assertEquals(93, u2.getSalud());

		assertEquals(100, u3.getSalud());
		u1.atacar(u3);
		assertEquals(100, u3.getSalud());

	}

}
