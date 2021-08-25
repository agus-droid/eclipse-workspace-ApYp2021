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
		//Preparaci�n
		boolean valorEsperado = true;
		//Ejecuci�n
		boolean valorObtenido = sala.estaVacia();
		//Contrastaci�n
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queLaButacaSeOcupe(){
		//Preparaci�n
		boolean valorEsperado = true;
		int fil = 1;
		int col = 4;
		//Ejecuci�n
		sala.ocuparButaca(fil, col);
		boolean valorObtenido = sala.butacaEstaOcupada(fil, col);
		//Contrastaci�n
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}

