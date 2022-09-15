package model;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import util.ExcepcionJuegoSinNombre;
import util.ExcepcionYearIncorrecto;

import org.junit.Assert;

/**
 * 
 * @author Grupo1
 *
 *	Test unitarios de la clase Juegos
 */

public class TesterJuegos {

	private static byte cont = 1;
	private static Logger logger;

	
// Inicio del formateo para el logger 
	static {
		try {
			logger = LogManager.getLogger(TesterJuegos.class);
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
		logger.info("Test: testCreadorJuegoVacio(): null" );
		Juegos j1 = new Juegos();
		Juegos j2 = new Juegos();
		try {
			j2 = Juegos.creadorJuegos(null, null, 0, null, null);
		} catch (ExcepcionJuegoSinNombre e) {}
		Assert.assertEquals(j1.toString(), j2.toString());
	}
	
	//
	@Test
	public void testCreadorJuegoCorrecto() {
		logger.info("Test::testCreadorJuegoCorrecto() ");
		
		Juegos j1 = new Juegos();
		try {
			j1 = new Juegos("Pruega",Platforms.A2600, 2001, Genre.ACCION, "publi");
		} catch (ExcepcionYearIncorrecto e) {}
		Juegos j2 = new Juegos();;
		try {
			j2 = Juegos.creadorJuegos("Pruega", "2600", 2001, "Action", "publi");
		} catch (ExcepcionJuegoSinNombre e) {
		}
		
		Assert.assertEquals(j1.toString(), j2.toString());
		logger.info("Ahora viene la comparacion de objetos");
		Assert.assertNotEquals(j1, j2);
		
	}
	
	@Test
	public void testCreadorJuegoEnumsIncorrecto() {
		logger.info("Test::testCreadorJuegoEnumsIncorrecto() ");
		
		Juegos j1 = new Juegos();
		try {
			j1 = new Juegos("Pruega",Platforms.DESCONOCIDO, 1995, Genre.DESCONOCIDO, "publi");
		} catch (ExcepcionYearIncorrecto e) {}
		Juegos j2 = new Juegos();
		try {
			j2 = Juegos.creadorJuegos("Pruega", "ggg", 1995, "patatas", "publi");
		} catch (ExcepcionJuegoSinNombre e) {}
		
		Assert.assertEquals(j1.toString(), j2.toString());
		
		
	}
	
	
	//Comprueba que el year esta entre 1960-2022
	@Test
	public void testCreadorJuegoYearIncorrecto() {
		logger.info("Test::testCreadorJuegoYearsIncorrecto() ");
		Juegos j1 = new Juegos();
		try {
			 j1= new Juegos("Pruega",Platforms.DESCONOCIDO, 0, Genre.DESCONOCIDO, "publi");
			
		} catch (Exception e) {
			System.out.println("Año incorrecto");
		}
		Juegos j2 = new Juegos();;
		try {
			j2 = Juegos.creadorJuegos("Pruega", "ggg", 14572, "patatas", "publi");
		} catch (ExcepcionJuegoSinNombre e) {
		}
		
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		
		Assert.assertEquals(j1.getYear(), j2.getYear());
		
		
	}
	
}
