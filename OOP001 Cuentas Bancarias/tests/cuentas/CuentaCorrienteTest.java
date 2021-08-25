package cuentas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void queElDescubiertoSeAsigneCorrectamente() {
		CuentaCorriente c1 = new CuentaCorriente(2000);
		assertEquals(2000, c1.getDescubierto());
	}
	
	@Test(expected = Error.class)
	public void queNoSePuedaUnSaldoMayorAlDisponible() {
		CuentaCorriente c1 = new CuentaCorriente(2000);
		c1.retirar(2001);
	}

}
