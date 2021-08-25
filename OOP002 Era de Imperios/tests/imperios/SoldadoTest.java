package imperios;

import static org.junit.Assert.*;

import org.junit.Test;

public class SoldadoTest {

	@Test
	public void pelea() {
		Soldado u1 = new Soldado(new Posicion(0, 0));
		Caballero u2 = new Caballero(new Posicion(1, 1));
		Arquero u3 = new Arquero(new Posicion(50, 2));

		assertEquals(100, u2.getSalud());
		u1.atacar(u2);
		assertEquals(80, u2.getSalud());

		assertEquals(100, u3.getSalud());
		u1.atacar(u3);
		assertEquals(100, u3.getSalud());
		
	}

}
