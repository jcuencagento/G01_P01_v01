package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Assert;
import util.TestSacoFichero;

/**
 * 
 * @author Grupo1
 *
 *	Test unitarios de la clase Juegos
 */

public class TesterJuegos {

	private static byte cont = 1;
	private static Logger logger;

	static {
		try {
			logger = LogManager.getLogger(TestSacoFichero.class);
		} catch (Throwable e) {
			System.out.println("Doesn't work");
		}
	}
	// Inicio del formateo para el logger 
		static {
			try {
				logger = LogManager.getLogger(TestSacoFichero.class);
			} catch (Throwable e) {
				System.out.println("Doesn't work");
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
		 * Parte de testing
		 * 
		 */

		@Test
		public void testCreadorJuegoVacio() {
			logger.warn("Test: testCreadorJuegoVacio(): null" );
			Juegos j1 = new Juegos();	
			System.out.println(j1.toString());
			Juegos j2 = Juegos.creadorJuegos(null, null, 0, null, null);
			//Assert.assertNotEquals(j1, j2);
			Assert.assertEquals(j1.toString(), j2.toString());
		}
	
}
