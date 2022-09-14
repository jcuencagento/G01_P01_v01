package control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import util.LecturaDatos;

public class TestLucaSteam {

	/**
	 * Parte logger
	 * 
	 */

	private static byte cont = 1;
	private static Logger logger;

	// Inicializo
	static {
		try {
			logger = LogManager.getLogger(TestLucaSteam.class);
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
		logger.info("=== PRUEBA " + (cont++) + " ======");
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
	public void verificarOpcion() {
		logger.warn("Test: verificarOpcion(): ");
		LucaSteam ls = new LucaSteam();
		boolean x=ls.eligeOpcion();
		Assert.assertNotNull(x);
		
	}

	@Test
	public void verificarOpcionGestion() {
		logger.warn("Test: verificarOpcionGestion(): ");
		LucaSteam ls = new LucaSteam();
		boolean x=ls.eligeOpcionGestion();
		Assert.assertNotNull(x);
		
	}@Test
	public void verificarOpcionListados() {
		logger.warn("Test: eligeOpcionListados(): ");
		LucaSteam ls = new LucaSteam();
		boolean x=ls.eligeOpcionListados();
		Assert.assertNotNull(x);
		
	}
	
}
