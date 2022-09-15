package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.Juegos;

import java.util.ArrayList;

/**
 * Test utilidad sacoFichero, solo leemos el archivo .csv
 * comprobando que pasa con un archivo null o con uno inexistente
 * mas la prueba con el archivo correcto
 * 
 * @author Grupo 01
 *
 */

public class TestSacoFichero {
	
	/**
	 * Parte logger
	 * 
	 */

	private static byte cont = 1;
	private static Logger logger;

	// Inicializo
	static {
		try {
			logger = LogManager.getLogger(TestSacoFichero.class);
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
	public void testArchivoNulo() {
		logger.warn("Test::testArchivoNulo(): []");
		ArrayList<Juegos> listaExpected = new ArrayList<Juegos>();
		ArrayList<Juegos> listaJuegos = SacoFichero.leeFichero(null);
		Assert.assertEquals(listaExpected, listaJuegos);
	}
	
	@Test
	public void testArchivoInexistente() {
		logger.warn("Test::testArchivoInexistente(): []");
		ArrayList<Juegos> listaExpected = new ArrayList<Juegos>();
		ArrayList<Juegos> listaJuegos = SacoFichero.leeFichero("holahola.txt");
		Assert.assertEquals(listaExpected, listaJuegos);
	}	
	
	@Test
	public void testArchivoCorrecto() {
		logger.info("Test::testArchivoCorrecto(): ArrayList<Juegos>");
		
		ArrayList<Juegos> listaExpected = new ArrayList<Juegos>();
		ArrayList<Juegos> listaJuegos = SacoFichero.leeFichero("vgsales.csv");
		Assert.assertNotEquals(listaExpected, listaJuegos);
	}

}


