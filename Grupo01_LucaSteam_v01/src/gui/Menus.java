package gui;


/**
 * Interfaz visual, menu principal y dos submenus, el de gestion y el de listados.
 * 
 * @author Grupo1
 *
 */

public class Menus {

	public static void menuInicial() {
		System.out.println("Menu inicial.");
		System.out.println("---------------");
		System.out.println("1. Gestion de juegos.");
		System.out.println("2. Listados.");
		System.out.println("0. Salir del menu.");
	}

	public static void menuGestion() {
		System.out.println("");
		System.out.println("Submenu gestion.");
		System.out.println("-----------------");
		System.out.println("1. Alta de juego.");
		System.out.println("2. Editar un juego.");
		System.out.println("3. Eliminar un juego.");
		System.out.println("0. Salir del menu.");
		System.out.println("-----------------");
	}

	public static void menuListados() {
		System.out.println("");
		System.out.println("Submenu listados.");
		System.out.println("-----------------");
		System.out.println("1. Listado juegos del Genre plataforma.");
		System.out.println("2. Listado todos los juegos.");
		System.out.println("3. Listado juegos de Nintendo.");
		System.out.println("4. Listado Publishers.");
		System.out.println("5. Listado todos los juegos del siglo XX.");
		System.out.println("6. Listado de juegos dependiendo del Genre.");
		//System.out.println("7. Listado todos los juegos de annos pares.");
		System.out.println("0. Salir del menu.");
		System.out.println("-----------------");
	}
	
	public static void peticionKey() {
		System.out.println("");
		System.out.println("Keys disponibles del juego: ");
		System.out.println("1. Cambiar nombre.");
		System.out.println("2. Cambiar plataforma.");
		System.out.println("3. Cambiar year.");
		System.out.println("4. Cambiar genero.");
		System.out.println("5. Cambiar publisher.");
		System.out.println("0. Nada mas.");
	}
	
	public static void menuGeneros() {
		System.out.println("");
		System.out.println("Generos de juego disponibles: ");
		System.out.println("Platform, Fighting, Misc, Simulation");
		System.out.println("Action, Role-Playing, Strategy");
		System.out.println("Adventure, Sports, Shooter, Racing...");
		System.out.println("Cualquier otro es catalogado como desconocido");
	}

}

