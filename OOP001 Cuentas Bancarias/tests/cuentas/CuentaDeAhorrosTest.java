package cuentas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaDeAhorrosTest {

	@Test
	public void queElSaldoSeReserveCorrectamente() {
		CuentaDeAhorros c1 = new CuentaDeAhorros();
		c1.depositar(1000);
		c1.reservar(300);
		assertEquals(700, c1.getSaldo());
	}
	
	@Test
	public void queElSaldoSeReintegreCorrectamente() {
		CuentaDeAhorros c1 = new CuentaDeAhorros();
		c1.depositar(1000);
		c1.reservar(300);
		c1.reintegrarSaldo();
		assertEquals(1000, c1.getSaldo());
	}
	
	@Test(expected = Error.class)
	public void queNoSePuedaReservarUnSaldoMayorAlDisponible() {
		CuentaDeAhorros c1 = new CuentaDeAhorros();
		c1.depositar(1000);
		c1.reservar(3000);
	}

}
