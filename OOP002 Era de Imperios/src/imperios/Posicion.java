package imperios;

public class Posicion {
	private double x;
	private double y;

	public Posicion(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanciaCon(Posicion otraPosicion) {
		return Math.hypot(x - otraPosicion.x, y - otraPosicion.y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
