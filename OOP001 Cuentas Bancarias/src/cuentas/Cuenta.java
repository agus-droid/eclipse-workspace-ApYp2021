package cuentas;

public class Cuenta {
	protected int saldo;

	protected void validarMayorQueCero(int dinero) {
		if (dinero <= 0)
			throw new Error("El dinero debe ser superior a cero");
	}
	
	protected void validarSaldo(int monto) {
		if (this.saldo < monto)
			throw new Error("El dinero a retirar es mayor al saldo disponible");
	}

	public void depositar(int dinero) {
		validarMayorQueCero(dinero);
		this.saldo += dinero;
	}
	
	public void retirar(int dinero) {
		validarMayorQueCero(dinero);
		validarSaldo(dinero);
		this.saldo -= dinero;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public void transferir (int monto, Cuenta otra) {
		validarSaldo(monto);
		validarMayorQueCero(monto);
		this.saldo-=monto;
		otra.saldo+=monto;
	}

}
