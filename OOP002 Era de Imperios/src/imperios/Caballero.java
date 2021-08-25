package imperios;

public class Caballero extends Unidad {

	public Caballero(Posicion posicion) {
		super(posicion);
	}

	
	@Override
	public void atacar(Unidad otra) {
		int aleatoreidad = (int) (Math.random() * 10) + 1;
		if (this.distanciaCon(otra) >= 1 && this.distanciaCon(otra) <= 3) {
			otra.recibirGolpe(30);
			super.atacar(otra);
			if (aleatoreidad > 7)
				this.espantar();
		}
	}

	private void espantar() {
		int x = (int) (Math.random() * 3) + 1;
		int y = (int) (Math.random() * 3) + 1;
		super.getPos().setX(x);
		super.getPos().setY(y);
	}

}
