package data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Genre;
import model.Juegos;



public class TestListadoJuegos {
	
	/**
	 * Parte logger
	 * 
	 */

	private static byte cont = 1;
	private static Logger logger;

	// Inicializo
	static {
		try {
			logger = LogManager.getLogger(TestListadoJuegos.class);
		} catch (Throwable e) {
			System.out.println("Don't work");
		}
	}

	@BeforeClass
	public static void onceExecutedBeforeAll() {
		logger.info(">>> Iniciando las pruebas");
	}

	@Before
	public void executedBeforeEach() {
		System.out.println("");
		logger.info("=== PRUEBA "+(cont++)+" ======");
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		System.out.println("");
		logger.info(">>> Terminado las pruebas");
	}


	/**
	 * Parte testing
	 * 
	 */

	
	@Test
	public void testAltaJuegoVacio() {
		logger.info("Test::testAltaJuegoVacio(): []");
		Juegos j = Juegos.creadorJuegos("Prueba","PC", 1620, "Hola", "Publis");
		ListadoJuegos listaJuegos1 = new ListadoJuegos();
		ListadoJuegos listaJuegos2 = new ListadoJuegos();
		listaJuegos1.altaJuego(j);
		Assert.assertEquals(listaJuegos1.listaJuegos,listaJuegos2.listaJuegos);
	}

	/*
	@Test
	public void testImprimirListaPorCategoriaVacio() {
		logger.warn("Test::testImprimirListaPorCategoriaVacio(): []");
	}	
	
	@Test
	public void testImprimirListaPorCategoriaPlatform() {
		logger.warn("Test::testImprimirListaPorCategoriaPlatform(): []");
		Genre g = Genre.PLATAFORMA;
		new ListadoJuegos().imprimirListaPorCategoria(g);
	}
	
	@Test
	public void testImprimirListaPorCategoriaPlataformaIgualAAccion() {
		logger.warn("Test::testImprimirListaPorCategoriaPlataformaIgualAAccion(): []");
		Genre gP = Genre.PLATAFORMA;
		Genre gA = Genre.ACCION;
		Assert.assertNotEquals(gP,gA);
		//(ListadoJuegos.imprimirListaPorCategoria(g));
	}
	*/
	
	
}