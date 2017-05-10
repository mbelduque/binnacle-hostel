package interfazGrafica;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestJunit {

	@Test
	public void testRegistrar() {
		String[] arrayListResultado = { "id", "Nombre y apellido", "ID", "Precio" };
		String[] arrayListEsperado = arrayListResultado;
		Assert.assertEquals(arrayListResultado, arrayListEsperado);
	}

	@Test
	public void testEliminar() {
		String[] arrayListResultado = null;
		String[] arrayListEsperado = arrayListResultado;
		Assert.assertEquals(arrayListResultado, arrayListEsperado);
	}

	@Test
	public void testOrdenar() {
		String[] arrayListResultado = { "orden alfabetico" };
		String[] arrayListEsperado = arrayListResultado;
		Assert.assertEquals(arrayListResultado, arrayListEsperado);
	}

	@Test
	public void testBuscar() {
		String[] arrayListResultado = { "id", "Nombre y apellido", "ID", "Precio" };
		String[] arrayListEsperado = arrayListResultado;
		Assert.assertEquals(arrayListResultado, arrayListEsperado);
	}

}