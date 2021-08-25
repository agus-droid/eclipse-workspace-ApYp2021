package imperios;

public class Soldado extends Unidad {

	private int energia = 5;

	public Soldado(Posicion pos) {
		super(pos);
	}

	@Override
	public void atacar(Unidad otra) {
		if (this.distanciaCon(otra) < 1.5) {
			if (this.energia <= 0)
				throw new Error("El soldado está cansado");
			otra.recibirGolpe(20);
			super.atacar(otra);
		}
	}

	public void descansar() {
		this.energia = 5;
	}
}
