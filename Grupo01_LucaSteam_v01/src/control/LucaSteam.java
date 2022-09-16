package control;

import gui.Menus;
import model.Genre;
import service.Servicios;
import util.LecturaDatos;

/**
 * Clase principal de Control del proyecto.
 * 
 * @author Grupo 01
 *
 */

public class LucaSteam {

	Servicios serv = new Servicios();

	public void entro() {
		serv.listaJuegosInicial(); // METEMOS LOS JUEGOS NADA MAS ENTRAR
		System.out.println("La lista de juegos ha sido creada.");
		boolean sigue = true;
		while (sigue) {
			Menus.menuInicial();
			sigue = eligeOpcion();
		}
	}

	/**
	 * Elegir opcion en el menu principal
	 */

	public boolean eligeOpcion() {
		boolean sigue = true;
		switch (LecturaDatos.leerInt("Introduce una opcion: ")) {

		// MENU GESTION
		case 1:
			boolean sigueGestion = true;
			while (sigueGestion) {
				Menus.menuGestion();
				sigueGestion = eligeOpcionGestion();
			}
			break;

		// MENU LISTADOS
		case 2:
			boolean sigueListados = true;
			while (sigueListados) {
				Menus.menuListados();
				sigueListados = eligeOpcionListados();
			}
			break;

		// SALIMOS DEL MENU
		case 0:
			sigue = false;
			break;

		default:
			System.out.println("No es una opcion valida.");
			break;
		}

		return sigue;
	}

	/**
	 * Elegir opcion en el submenu 1(gestion)
	 */

	public boolean eligeOpcionGestion() {
		boolean sigue = true;
		switch (LecturaDatos.leerInt("Introduce una opcion: ")) {
		// ALTA JUEGO
		case 1:
			serv.altaJuego();
			break;

		// EDITAR JUEGO
		case 2:
			serv.editarJuego();
			break;

		// ELIMINAR JUEGO
		case 3:
			serv.eliminarJuego();
			break;

		// SALIMOS DEL MENU
		case 0:
			sigue = false;
			break;

		default:
			System.out.println("No es una opcion valida.");
			break;
		}
		return sigue;
	}

	/**
	 * Elegir opcion en el submenu 2(listados)
	 */

	public boolean eligeOpcionListados() {
		boolean sigue = true;
		switch (LecturaDatos.leerInt("Introduce una opcion: ")) {

		// IMPRIMIR POR PLATAFORMA
		case 1:
			serv.imprimirListaPorCategoria(Genre.PLATAFORMA);
			break;

		// LISTADO JUEGOS
		case 2:
			serv.imprimirListaJuegos();
			break;

		// LISTADO JUEGOS NINTENDO
		case 3:
			serv.imprimirListaPorPlataformaNintendo();
			break;

		// LISTADO PUBLISHERS
		case 4:
			serv.listarPublishers();
			break;

			// LISTADO SIGLO XX
		case 5:
			serv.listarJuegosSigloXX();
			break;

		// LISTADO ELIGIENDO GENERO
		case 6:
			Menus.menuGeneros();
			serv.imprimirListaPorCategoria(
					Genre.elegirGenero(LecturaDatos.leerString("Introduce el genero que quieras listar.")));
			break;
		// LISTADO POR AÑOS PARES
		case 7:
			serv.listarYearPares();
			break;

		// SALIMOS DEL MENU
		case 0:
			sigue = false;
			break;

		default:
			System.out.println("No es una opcion valida.");
			break;
		}
		return sigue;
	}

}
