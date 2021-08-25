package correo;

public class Correo {
	/**
	 * @param distancias es la distancia en millas de una estación hasta la otra
	 * @returns la cantidad de caballos necesarios para enviar el correo desde un
	 *          extremo hasta el otro del recorrido
	 */
	public static int caballos(int[] distancias) {
		int distancia = 0;
		int caballos = 1;
		if (distancias.length == 0)
			throw new Error("Arreglo ingresado inválido");
		for (int i = 0; i < distancias.length; i++) {
			if (distancias[i] <= 0 || distancias[i] > 100)
				throw new Error("Valor ingresado inválido");
			distancia += distancias[i];
			if (distancia > 100) {
				caballos++;
				distancia = 0;
				i--;
			}
		}
		return caballos;
	}

}
