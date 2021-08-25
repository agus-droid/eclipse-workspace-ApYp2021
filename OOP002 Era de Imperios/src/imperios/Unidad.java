package imperios;

public abstract class Unidad {
	private Posicion pos;
	private int salud;
	private int dinero;

	public Unidad(Posicion pos_) {
		this.pos = pos_;
		this.salud = 100;
		this.dinero = 100;
	}

	public double distanciaCon(Unidad otra) {
		return pos.distanciaCon(otra.pos);
	}

	public boolean estaMuerto() {
		return this.salud <= 0;
	}

	public void comprarPocion() {
		this.dinero -= 50;
		this.salud = 100;
	}
	
	protected void recibirGolpe(int danio) {
		this.salud -= danio;
	}
	
	public void atacar(Unidad otra) {
		if (otra.estaMuerto()) {
			this.dinero += otra.dinero;
			otra.dinero = 0;
		}
			
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero_) {
		this.dinero = dinero_;
	}

	public int getSalud() {
		return salud;
	}

	public Posicion getPos() {
		return pos;
	}
}
