package vehiculo;

public abstract class Vehiculo {
	private double kilometros;
	private Chofer chofer;
	private int pasajeros;
	
	public Vehiculo(Chofer chofer, int pasajeros) {
		this.chofer = chofer;
		this.pasajeros = pasajeros;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	public Chofer getChofer() {
		return chofer;
	}
	
	
}
