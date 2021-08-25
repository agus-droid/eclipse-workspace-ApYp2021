package sala.cine;

public class SalaDeCine {

	private int cantidadDeButacas;
	private int cantidadDeFilas;
	private int cantidadDeColumnas;
	private boolean[][] butacas;

	private void verificarCantidadButacas(int butacas) {
		if (butacas < 0) {
			throw new Error("El número de butacas debe ser mayor a cero");
		}
	}

	private void verificarCantidadFilas(int butacas) {
		if (butacas < 0) {
			throw new Error("El número de butacas debe ser mayor a cero");
		}
	}

	public SalaDeCine(int cantidadButacas, int cantidadFilas) {
		verificarCantidadButacas(cantidadButacas);
		verificarCantidadFilas(cantidadFilas);
		this.cantidadDeButacas = cantidadButacas;
		this.cantidadDeFilas = cantidadFilas;
		this.cantidadDeColumnas = cantidadButacas / cantidadFilas;
		this.butacas = new boolean[this.cantidadDeFilas][this.cantidadDeColumnas];
		for (int fil = 0; fil < this.cantidadDeFilas; fil++) {
			for (int col = 0; col < this.cantidadDeColumnas; col++) {
				this.butacas[fil][col] = false;
			}
		}
	}

	public boolean estaVacia() {
		for (int fil = 0; fil < this.cantidadDeFilas; fil++) {
			for (int col = 0; col < this.cantidadDeColumnas; col++) {
				if (this.butacas[fil][col]) {
					return false;
				}
			}
		}
		return true;
	}

	public void ocuparButaca(int fil, int col) {
		this.butacas[fil][col] = true;
	}

	public boolean butacaEstaOcupada(int fil, int col) {
		return this.butacas[fil][col];
	}

	public int butacasOcupadas() {
		int cantidad = 0;
		for (int fil = 0; fil < this.cantidadDeFilas; fil++) {
			for (int col = 0; col < this.cantidadDeColumnas; col++) {
				if (this.butacas[fil][col]) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}

	public boolean hayEspacioPara(int cantidadDePersonas) {
		int butacasLibres = 0;
		for (int fil = 0; fil < this.cantidadDeFilas; fil++) {
			for (int col = 0; col < this.cantidadDeColumnas; col++) {
				if (!this.butacas[fil][col]) {
					butacasLibres++;
				}
			}
		}
		return butacasLibres > cantidadDePersonas;
	}

	public boolean hayEspacioFilaGente(int cantidadDePersonas) {
		int espaciosContiguos = 0;
		for (int fil = 0; fil < this.cantidadDeFilas; fil++) {
			espaciosContiguos = 0;
			for (int col = 0; col < this.cantidadDeColumnas; col++) {
				if (butacas[fil][col])
					espaciosContiguos = 0;
				else
					espaciosContiguos++;
				if (espaciosContiguos >= cantidadDePersonas)
					return true;
			}
		}
		return false;
	}

	public boolean acomodarGrupo(int cantGrupo) {
		int contadorEspacioContiguo = 0;
		if (cantGrupo <= this.cantidadDeColumnas) {
			for (int i = 0; i < this.cantidadDeFilas; i++) {
				for (int j = 0; j < this.cantidadDeColumnas; j++) {
					if (!butacas[i][j]) {
						contadorEspacioContiguo++;
					} else {
						contadorEspacioContiguo = 0;
					}
					if (contadorEspacioContiguo == cantGrupo) {
						return true;
					}
				}
				contadorEspacioContiguo = 0;
			}
		}
		return false;
	}

	public int getCantidadDeButacas() {
		return cantidadDeButacas;
	}

	public int getCantidadDeFilas() {
		return cantidadDeFilas;
	}

	public int getCantidadDeColumnas() {
		return cantidadDeColumnas;
	}

}
