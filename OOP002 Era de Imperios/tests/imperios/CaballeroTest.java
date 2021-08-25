package imperios;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaballeroTest {

	@Test
	public void distancias() {
		Caballero c1 = new Caballero(new Posicion(0, 0));
		Caballero c2 = new Caballero(new Posicion(1, 1));
		assertEquals(Math.sqrt(2), c1.distanciaCon(c2),0.0001);
	}

	@Test
	public void pelea() {
		Caballero u1 = new Caballero(new Posicion(0, 0));
		Caballero u2 = new Caballero(new Posicion(1, 1));
		Arquero u3 = new Arquero(new Posicion(50, 2));

		assertEquals(100, u2.getSalud());
		u1.atacar(u2);
		assertEquals(70, u2.getSalud());
		u1.atacar(u2);
		assertEquals(40, u2.getSalud());

		assertEquals(100, u3.getSalud());
		u1.atacar(u3);
		assertEquals(100, u3.getSalud());
		
	}

}
