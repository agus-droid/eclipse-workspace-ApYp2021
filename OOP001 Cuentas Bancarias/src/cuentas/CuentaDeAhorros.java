package cuentas;

public class CuentaDeAhorros extends Cuenta {

	private int saldoReservado;

	public int getSaldoReservado() {
		return saldoReservado;
	}

	public void reservar(int monto) {
		validarSaldo(monto);
		validarMayorQueCero(monto);
		this.saldo -= monto;
		this.saldoReservado += monto;
	}

	public void reintegrarSaldo() {
		this.saldo += saldoReservado;
		saldoReservado = 0;
	}
}
