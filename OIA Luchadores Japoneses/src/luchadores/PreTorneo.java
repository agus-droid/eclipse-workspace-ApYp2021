package luchadores;

public class PreTorneo {
	
	private Luchador[] luchadores;
	private int cantidadActual;
	
	public PreTorneo(int cantidadParticipantes) {
		luchadores = new Luchador[cantidadParticipantes];
		cantidadActual = 0;
	}
	
	public void agregar(Luchador luchador) {
		luchadores[cantidadActual] = luchador;
		cantidadActual++;
	}
	
	public int[] calcularDominios() {
		int[] dominios = new int[luchadores.length];
		
		for (int i = 0; i<luchadores.length-1;i++) {
			Luchador referencia = luchadores[i];
			for (int j=i+1; j<luchadores.length;j++) {
				if (i==j) continue;
				Luchador otro = luchadores[j];
				if (referencia.dominaA(otro)) {
					dominios[i]++;
				}
				if (otro.dominaA(referencia)) {
					dominios[j]++;
				}
			}
		}
		return dominios;
	}
}
