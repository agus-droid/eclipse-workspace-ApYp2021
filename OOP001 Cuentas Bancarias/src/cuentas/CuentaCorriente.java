package cuentas;

public class CuentaCorriente extends Cuenta {
	private int descubierto;

	public CuentaCorriente(int descubierto) {
		this.descubierto = descubierto;
	}

	public int getDescubierto() {
		return descubierto;
	}
	
	protected void validarSaldo(int monto) {
		if (this.saldo + this.descubierto < monto)
			throw new Error("El dinero a retirar es mayor al saldo disponible");
	}

	
}
