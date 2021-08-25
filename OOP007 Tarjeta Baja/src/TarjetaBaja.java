class TarjetaBaja {
	private double saldo;
	private int viajesColectivo;
	private int viajesSubte;
	private final double PRECIO_VIAJE_COLECTIVO = 21.50;
	private final double PRECIO_VIAJE_SUBTE = 19.50;

	/**
	 * @pre: saldo inicial debe ser mayor a 0
	 * @post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		validarSaldoInicial(saldoInicial);
		saldo = saldoInicial;
	}

	private void validarSaldoInicial(double saldoInicial) {
		if (saldoInicial <= 0)
			throw new Error("El saldo inicial debe ser mayor a 0");
	}

	/**
	 * @post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return saldo;
	}

	/**
	 * @pre: el monto debe ser mayor a 0.
	 * @post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		validarMonto(monto);
		saldo += monto;
	}

	private void validarMonto(double monto) {
		if (monto <= 0)
			throw new Error("El monto debe ser mayor a 0");
	}

	/**
	 * @pre : saldo suficiente.
	 * @post: utiliza 21.50 del saldo para un viaje en colectivo.
	 */
	public void pagarViajeEnColectivo() {
		verificarSaldoColectivo();
		saldo -= PRECIO_VIAJE_COLECTIVO;
		viajesColectivo++;
	}

	private void verificarSaldoColectivo() {
		if (saldo < PRECIO_VIAJE_COLECTIVO)
			throw new Error("Saldo Insuficiente");
	}

	/**
	 * @pre : saldo suficiente.
	 * @post: utiliza 19.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		verificarSaldoSubte();
		saldo -= PRECIO_VIAJE_SUBTE;
		viajesSubte++;
	}

	private void verificarSaldoSubte() {
		if (saldo < PRECIO_VIAJE_SUBTE)
			throw new Error("Saldo Insuficiente");
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return viajesColectivo + viajesSubte;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return viajesColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return viajesSubte;
	}
}
