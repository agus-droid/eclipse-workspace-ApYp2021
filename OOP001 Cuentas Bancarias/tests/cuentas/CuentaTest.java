package cuentas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test(expected = Error.class)
	public void queNoSePuedaRetirarMasDineroQueElSaldoDisponible() {
		Cuenta c1 = new Cuenta();
		c1.retirar(50);
	}

	@Test(expected = Error.class)
	public void queNoSePuedaDepositarMontoMenorOIgualACero() {
		Cuenta c1 = new Cuenta();
		c1.depositar(-800000);
	}

	@Test(expected = Error.class)
	public void queNoSePuedaRetirarMontoMenorOIgualACero() {
		Cuenta c1 = new Cuenta();
		c1.depositar(50000);
		c1.retirar(-50);
	}

	@Test
	public void queSeDepositeElMontoCorrecto() {
		Cuenta c1 = new Cuenta();
		c1.depositar(5000);
		assertEquals(5000, c1.getSaldo());
	}
	
	@Test
	public void queLaTransferenciaSeaCorrecta() {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.depositar(1000);
		c1.transferir(500, c2);
		assertEquals(500, c2.getSaldo());
	}
}
