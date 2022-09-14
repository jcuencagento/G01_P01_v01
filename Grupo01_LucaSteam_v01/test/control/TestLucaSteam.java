package control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import util.TestSacoFichero;

public class TestLucaSteam {
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
		
	
		/* @Test  
		    public void testFindMax(){  
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
		assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
		    }  
		  
	*/
	}
}
