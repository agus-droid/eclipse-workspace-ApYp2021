package luchadores;

public class Luchador {

	private int altura;
	private int peso;

	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public boolean dominaA(Luchador otroLuchador) {
		boolean superaEnAltura = this.altura > otroLuchador.altura;
		boolean superaEnPeso = this.peso > otroLuchador.peso;
		
		boolean mismaAltura = this.altura == otroLuchador.altura;
		boolean mismoPeso = this.peso == otroLuchador.peso;
		
		return superaEnAltura && superaEnPeso
				||mismaAltura && superaEnPeso
				||superaEnAltura && mismoPeso;
	}
}
