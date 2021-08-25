package sala.cine;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class SalaDeCineTest {
	
	private SalaDeCine sala;
	
	@Before
	public void crearSala() {
		int butacas = 10;
		int filas = 2;
		sala = new SalaDeCine(butacas, filas);	
	}
	
	@Test
	public void queAlCrearLaSalaTodasLasButacasEstenVacias(){
		//Preparación
		boolean valorEsperado = true;
		//Ejecución
		boolean valorObtenido = sala.estaVacia();
		//Contrastación
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queLaButacaSeOcupe(){
		//Preparación
		boolean valorEsperado = true;
		int fil = 1;
		int col = 4;
		//Ejecución
		sala.ocuparButaca(fil, col);
		boolean valorObtenido = sala.butacaEstaOcupada(fil, col);
		//Contrastación
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}

