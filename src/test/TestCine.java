package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import dominio.SalaCine;

public class TestCine {


	@Test
	public void queLaSalaEsteVacia() {
		SalaCine cine = new SalaCine();
		assertTrue(cine.salaEstaVacia());
	}
	
	@Test
	public void queEsteLaButacaVacia() {
		SalaCine cine = new SalaCine();
		assertTrue(cine.butacaVacia(0, 0));
	}
	
	@Test
	public void queSePuedaAgregarButaca() {
		SalaCine cine = new SalaCine();
		assertTrue(cine.agregarButaca(0, 0));
	}
	
	@Test
	public void queSePuedaContarLaCantidadDeButacasVacia() {
		SalaCine cine = new SalaCine();
		cine.agregarButaca(0, 0);
		cine.agregarButaca(1, 0);
		
		Integer valorEsperado = 2;
		
		Integer valorObtenido = cine.cantidadDeButacasOcupadas();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queHayaEspacioParaPersonas() {
		SalaCine cine = new SalaCine();
		cine.agregarButaca(0, 1);
		cine.agregarButaca(0, 2);
		cine.agregarButaca(0, 3);
		cine.agregarButaca(1, 1);
		cine.agregarButaca(1, 2);
		cine.agregarButaca(1, 3);
		cine.agregarButaca(2, 1);
		cine.agregarButaca(2, 2);
		cine.agregarButaca(2, 3);
		assertFalse(cine.hayEspacioParaPersonas(7));
	}

}
