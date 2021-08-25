
public class App {

	public static void main(String[] args) {
		calcularInversionAnios(1000, 0.24, 4);
		// calcularInversionAnios(1000, 0.71355714, 5);
		// calcularTiempoEnMeses(1000, 0.07, 2000);
	}

	private static void validarMonto(double monto) {
		if (monto < 0) {
			throw new Error("El monto debe ser superior a cero");
		}
	}

	private static void validarInteres(double interes) {
		if (interes < 0) {
			throw new Error("El interes anual debe ser superior a cero");
		}
	}

	private static void validarCantidadAnios(int cantidadAnios) {
		if (cantidadAnios < 0) {
			throw new Error("La cantidad de años debe ser superior a cero");
		}
	}

	private static void validarSaldoFinal(double montoInvertir, double saldoFinal) {
		if (saldoFinal < montoInvertir) {
			throw new Error("El saldo final deseado debe ser superior al monto a invertir");
		}
	}

	public static void calcularInversionAnios(double montoInvertir, double interesAnual, int cantidadAniosMaximo) {
		validarMonto(montoInvertir);
		validarInteres(interesAnual);
		validarCantidadAnios(cantidadAniosMaximo);
		double resultado = montoInvertir;

		for (int i = 1; i <= cantidadAniosMaximo; i++) {
			for (int j = 1; j <= 12; j++) {
				resultado = resultado * (1 + interesAnual / 12);
			}
			System.out.println(resultado);
		}
	}

	public static void calcularTiempoEnMeses(double montoInvertir, double interesAnual, double saldoFinalDeseado) {
		validarMonto(montoInvertir);
		validarInteres(interesAnual);
		validarSaldoFinal(montoInvertir, saldoFinalDeseado);
		int meses = 0;
		double monto = montoInvertir;

		while (monto < saldoFinalDeseado) {
			monto = monto * (1 + interesAnual / 12);
			meses++;
		}

		System.out.println(meses);
	}

}
