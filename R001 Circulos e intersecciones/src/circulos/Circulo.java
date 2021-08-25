package circulos;
public class Circulo {
	private Punto centro;
	private double radio;

	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public boolean intersectaCon(Circulo otroCirculo) {
		return centro.distanciaCon(otroCirculo.centro) <= this.radio + otroCirculo.radio;
	}
}
