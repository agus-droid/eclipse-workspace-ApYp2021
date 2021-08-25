package maquinasDeCafe;

public class MaquinaEconomica extends MaquinaDeCafe {
	private int contadorDeServidos;
	
	@Override
	public void restarCafe() {
		contadorDeServidos++;
		if(contadorDeServidos % 3 == 0) {
			super.restarCafe();
			this.contadorDeServidos = 0;
		}
	}
}
