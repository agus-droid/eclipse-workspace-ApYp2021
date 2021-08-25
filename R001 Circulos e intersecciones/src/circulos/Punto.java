package circulos;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distanciaCon(Punto otroPunto) {
		return Math.hypot(x-otroPunto.x, y-otroPunto.y);
	}
}
