public class SumaCifras {
	public static int sumarCifras(int numero) {
		if (numero == 0) {
			return numero;
		} else if (numero % 9 != 0) {
			return Math.abs(numero % 9);
		} else {
			return 9;
		}
	}
}
