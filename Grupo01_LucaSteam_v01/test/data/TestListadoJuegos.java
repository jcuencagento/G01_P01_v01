package data;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Genre;
import model.Juegos;
import model.Platforms;
import util.ExcepcionJuegoSinNombre;

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
	public void testAltaJuegoVacio() {
		logger.warn("Test::testAltaJuegoVacio(): []");
		Juegos j = new Juegos();
		try {
			j = Juegos.creadorJuegos("Prueba", "PC", 1620, "Hola", "Publis"); // Devuelve Juego vacio por la fecha
		} catch (ExcepcionJuegoSinNombre e) {
		}
		ListadoJuegos listaJuegos1 = new ListadoJuegos();
		ListadoJuegos listaJuegos2 = new ListadoJuegos();
		listaJuegos1.altaJuego(j);
		Assert.assertEquals(listaJuegos1.listaJuegos, listaJuegos2.listaJuegos);
	}

	@Test
	public void testAltaJuegoCorrecto() {
		logger.info("Test::testAltaJuegoCorrecto(): [Juego de nombre Prueba...]");
		Juegos j = new Juegos();
		try {
			j = Juegos.creadorJuegos("Prueba", "PC", 1999, "Hola", "Publis");
		} catch (ExcepcionJuegoSinNombre e) {
		}
		ListadoJuegos listaJuegos1 = new ListadoJuegos();
		ListadoJuegos listaJuegos2 = new ListadoJuegos();
		listaJuegos1.altaJuego(j);
		Assert.assertNotEquals(listaJuegos1.listaJuegos, listaJuegos2.listaJuegos);
	}

	@Test
	public void testimprimirListaPorPlataformaNintendoVacia() {
		ListadoJuegos listaJuegos = new ListadoJuegos();
		logger.info("Test::testimprimirListaPorPlataformaNintendoVacia(): void");
		Platforms[] p = {};
		listaJuegos.imprimirListaPorPlataformaNintendo(p);
		logger.info("Test::testimprimirListaPorPlataformaNintendoVacia(): No hay ningun error");

	}

	@Test
	public void testimprimirListaPorPlataformaNintendoLlena() {
		ListadoJuegos listaJuegos = new ListadoJuegos();
		logger.info("Test::testimprimirListaPorPlataformaNintendoLlena(): void");
		Platforms[] p = { Platforms.DS, Platforms.DS3, Platforms.WII, Platforms.NES, Platforms.SNES, Platforms.GBA,
				Platforms.WIIU, Platforms.GB, Platforms.N64 };
		listaJuegos.imprimirListaPorPlataformaNintendo(p);
		logger.info("Test::testimprimirListaPorPlataformaNintendoLlena(): No hay ningun error");

	}

	@Test
	public void testborrarJuegoVacio() {
		ListadoJuegos listaJuegos = new ListadoJuegos();
		ListadoJuegos listaJuegos1 = new ListadoJuegos();
		logger.warn("Test::testborrarJuegoVacio(): void");
		Juegos j = new Juegos();
		listaJuegos.listaJuegos.add(j);
		listaJuegos.eliminarJuego(listaJuegos.listaJuegos.size() - 1);
		Assert.assertEquals(listaJuegos.listaJuegos, listaJuegos1.listaJuegos);
		logger.info("Test::testborrarJuegoVacio(): void");
	}
	
	
	/**
	 * Comprobar que el publisher no este vacio
	 */
	@Test
	public void testListarPorPublisherNulo() {
		logger.info("Test::testListarPorPublisherNulo():void");
		ListadoJuegos listaJuegos = new ListadoJuegos();
		logger.warn("Lista de juegos y publishers vacia");
		listaJuegos.listarPorPublisher();
		logger.info("no se imprime nada, como nosotros queremos");
	}
	
	@Test
	public void testListarPorPublisherAlt() {
		logger.info("Test::testListarPorPublisherAlt():void");
		ListadoJuegos listaJuegos = new ListadoJuegos();
		logger.warn("Añado un Juego con el Publisher null");
		Juegos j1= new Juegos();
		j1.setNombre("Prueba");
		j1.setGenero(Genre.DEPORTE);
		j1.setYear(1999);
		j1.setPlataforma(Platforms.GB);
		logger.info("Añado juego al ArrayList");
		listaJuegos.altaJuego(j1);
		logger.info("imprimo para comprobar que se ha añadido");
		listaJuegos.imprimirListaJuegos();
		listaJuegos.listarPorPublisher();
		logger.info("No imprime nada porque el campo publisher esta vacio, como esperamos");
	}
}