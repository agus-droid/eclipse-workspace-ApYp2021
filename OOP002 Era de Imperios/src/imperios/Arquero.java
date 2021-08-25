package imperios;

public class Arquero extends Unidad {
	private int flechas = 10;

	public Arquero(Posicion pos) {
		super(pos);
	}

	@Override
	public void atacar(Unidad otra) {
		if (this.distanciaCon(otra) >= 5 && this.distanciaCon(otra) <= 25) {
			if (flechas <= 0)
				throw new Error("El arquero ya no tiene flechas");
			otra.recibirGolpe(7);
			flechas--;
			super.atacar(otra);
		}
	}

	public void recargar() {
		flechas = 10;
	}
}