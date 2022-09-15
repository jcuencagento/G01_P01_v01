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
import model.Platforms;
import util.ExcepcionJuegoSinNombre;


/**
 * Clase Test de la capa de Datos 
 * 
 * @author Grupo 1
 *
 */

public class TestListadoJuegos {

	/**
	 * Parte logger
	 * 
	 */

	private static byte cont = 1;
	private static Logger logger;

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

	/**
	 * Introducimos a altaJuego un juego vacio (va a ser vacio por el year incorrecto)
	 * y comprobamos que una lista vacia y una queriendo sumar un juego vacio es lo mismo.
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

	/**
	 * Introducimos un juego correcto en la lista y comprobamos que se da de alta.
	 * 
	 */
	@Test
	public void testAltaJuegoCorrecto() {
		logger.info("Test::testAltaJuegoCorrecto(): [Juego de nombre Prueba...]");
		Juegos j = new Juegos();
		try {
			j = Juegos.creadorJuegos("Prueba", "PC", 1999, "Hola", "Publis");
		} catch (ExcepcionJuegoSinNombre e) {}
		ListadoJuegos listaJuegos1 = new ListadoJuegos();
		ListadoJuegos listaJuegos2 = new ListadoJuegos();
		listaJuegos1.altaJuego(j);
		Assert.assertNotEquals(listaJuegos1.listaJuegos, listaJuegos2.listaJuegos);
	}

	/**
	 * Introducimos a imprimirPorNintendo una lista vacia de plataformas y comprobamos
	 * que no imprime nada y por tanto no da error.
	 * 
	 */
	@Test
	public void testimprimirListaPorPlataformaNintendoVacia() {
		ListadoJuegos listaJuegos = new ListadoJuegos();
		logger.info("Test::testimprimirListaPorPlataformaNintendoVacia(): void");
		Platforms[] p = {};
		listaJuegos.imprimirListaPorPlataformaNintendo(p);
		logger.info("Test::testimprimirListaPorPlataformaNintendoVacia(): No hay ningun error");

	}

	/**
	 * Introducimos a imprimirPorNintendo una de plataformas correcta y comprobamos
	 * que imprime el juego introducido como deseamos.
	 * 
	 */
	@Test
	public void testimprimirListaPorPlataformaNintendoLlena() {
		ListadoJuegos listaJuegos = new ListadoJuegos();
		logger.info("Test::testimprimirListaPorPlataformaNintendoLlena(): void");
		Platforms[] p = { Platforms.DS, Platforms.DS3, Platforms.WII, Platforms.NES, Platforms.SNES, Platforms.GBA,
				Platforms.WIIU, Platforms.GB, Platforms.N64 };
		Juegos j = new Juegos();
		try {
			j = Juegos.creadorJuegos("Prueba", "DS", 1999, "Hola", "Publis");
		} catch (ExcepcionJuegoSinNombre e) {}
		listaJuegos.altaJuego(j);
		listaJuegos.imprimirListaPorPlataformaNintendo(p);
		logger.info("Test::testimprimirListaPorPlataformaNintendoLlena(): No hay ningun error");

	}

	/**
	 * Introducimos a eliminarJuego un juego vacio (previamente "dado de alta"
	 * y comprobamos que no hace nada.
	 * 
	 */
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
	
	@Test
	public void testEliminarJuegoDeUnaListaYCompararSuTamannoConOtra() {
		logger.info("Test::testEliminarJuego(): void");
		ListadoJuegos listaJuegos1 = new ListadoJuegos();
		ListadoJuegos listaJuegos2 = new ListadoJuegos();
		Juegos j1 = new Juegos();
		try {
			j1 = Juegos.creadorJuegos("Worms", "PC", 1995, "Strategy", "Microsoft");
		} catch (ExcepcionJuegoSinNombre e) {}
		listaJuegos1.listaJuegos.add(j1);
		listaJuegos2.listaJuegos.add(j1);
		listaJuegos1.eliminarJuego(listaJuegos1.listaJuegos.size()-1);
		Assert.assertNotEquals(listaJuegos1.listaJuegos.size(), listaJuegos2.listaJuegos.size());
		logger.info("Test::testEliminarJuego(): Tamanno de lista 1 y lista 2 no son iguales, juego eliminado.");
	}
	
	
	/**
	 * Comprobar que el publisher no este vacio
	 */
	@Test
	public void testListarPorPublisherNulo() {
		logger.info("Test::testListarPorPublisherNulo():void");
		ListadoJuegos listaJuegos = new ListadoJuegos();
		logger.warn("Lista de juegos y publishers vacia");
		listaJuegos.listarPublishers();
		logger.info("no se imprime nada, como nosotros queremos");
	}
	
	/**
	 * Test para comprobar que el metodo listarPorPublisher no imprime 
	 * juegos que no tengan nada en el campo publisher
	 */
	@Test
	public void testListarPorPublisherLlenoNulo() {
		logger.info("Test::testListarPorPublisherLlenoNulo():void");
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
		listaJuegos.listarPublishers();
		logger.info("No imprime nada porque el campo publisher esta vacio, como esperamos");
	}
	
	/**
	 * Test para comprobar que el metodo listarPorPublisher imprime 
	 * la editora de un juego correctamente
	 */
	@Test
	public void testListarPorPublisherLleno() {
		logger.info("Test::testListarPorPublisherNulo():void");
		ListadoJuegos listaJuegos = new ListadoJuegos();
		Juegos j1 = new Juegos();
		try {
			j1 = Juegos.creadorJuegos("Worms", "PC", 1995, "Strategy", "Microsoft");
		} catch (ExcepcionJuegoSinNombre e) {}
		listaJuegos.listaJuegos.add(j1);
		listaJuegos.listarPublishers();
	}
	
	/**
	 * Test para comprobar que el metodo editarJuego puede editar 
	 * un juego vacio correctamente
	 */
	@Test
	public void testEditarJuegoVacio() {
		ListadoJuegos listaJuegos = new ListadoJuegos ();
		logger.info("Test::testEditarJuegoVacio(): void");
		Juegos j = new Juegos();
		listaJuegos.listaJuegos.add(j);
		//Editamos nombre
		listaJuegos.editarJuego(1, listaJuegos.listaJuegos.indexOf(j));
		Assert.assertNotEquals(j.getNombre(), null);
	}
	
	/**
	 * Test para comprobar que el metodo editarJuego puede editar 
	 * un juego ya lleno correctamente
	 */
	@Test
	public void testEditarJuegoLleno() {
		ListadoJuegos listaJuegos = new ListadoJuegos ();
		logger.info("Test::testEditarJuegoLleno(): void");
		Juegos j = new Juegos();
		try {
			j = Juegos.creadorJuegos("Worms", "PC", 1995, "Strategy", "Microsoft");
		} catch (ExcepcionJuegoSinNombre e) {}
		listaJuegos.listaJuegos.add(j);
		//Editamos nombre
		listaJuegos.editarJuego(1, listaJuegos.listaJuegos.indexOf(j));
		Assert.assertNotEquals(j.getNombre(), "Worms");
	}

}