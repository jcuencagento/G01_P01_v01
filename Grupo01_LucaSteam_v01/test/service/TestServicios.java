package service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * Test de Servicios con la clase Servicios que tiene los metodos provenientes
 * del Control y que posteriormente llamaran a Datos tras manejar (o no) diferentes
 * servicios o funciones
 * 
 * @author Grupo 1
 *
 */

public class TestServicios {
	
	/**
	 * Parte logger
	 * 
	 */
	
	private static byte cont = 1;
	private static Logger logger;
	
	// Inicializo
	static {
		try {
			logger = LogManager.getLogger(TestServicios.class);
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
	public void testImprimirCategoriaNula(){  
		logger.info("Test:: ");
		Assert.assertEquals(true, false);
	}  
}
