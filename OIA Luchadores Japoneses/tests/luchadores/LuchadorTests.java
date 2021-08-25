package luchadores;

import static org.junit.Assert.*;

import org.junit.Test;

public class LuchadorTests {

	@Test
	public void dominaEnTodo() {
		Luchador l1 = new Luchador(300, 1500);
		Luchador l2 = new Luchador(280,1450);
		assertTrue(l1.dominaA(l2));
		assertFalse(l2.dominaA(l1));
	}
	
	@Test
	public void dominaMismoPeso() {
		Luchador l1 = new Luchador(300,1500);
		Luchador l2 = new Luchador(300,1450);
		assertTrue(l1.dominaA(l2));
		assertFalse(l2.dominaA(l1));
	}
	
	@Test
	public void dominaMismaAltura() {
		Luchador l1 = new Luchador(300,1500);
		Luchador l2 = new Luchador(280,1500);
		assertTrue(l1.dominaA(l2));
		assertFalse(l2.dominaA(l1));
	}

}
