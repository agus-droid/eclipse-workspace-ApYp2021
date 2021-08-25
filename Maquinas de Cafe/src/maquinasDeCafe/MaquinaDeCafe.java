package maquinasDeCafe;

public abstract class MaquinaDeCafe {
	private int gramosDeCafe;
	private static final int GRAMOS_POR_CAFE = 10;
	private static final int CANTIDAD_INICIAL_CAFE = 1000;

	public MaquinaDeCafe() {
		this.gramosDeCafe = CANTIDAD_INICIAL_CAFE;
	}

	public VasoDeCafe servirCafe() {
		if (this.puedeServir()) {
			this.restarCafe();
			return new VasoDeCafe(true);
		} else {
			return new VasoDeCafe(false);
		}
	}

	protected void restarCafe() {
		this.gramosDeCafe -= GRAMOS_POR_CAFE;
	}

	protected boolean puedeServir() {
		return this.gramosDeCafe >= GRAMOS_POR_CAFE;
	}
}
