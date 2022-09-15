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

	// MENU PRINCIPAL
	public void entro() {
		serv.listaJuegosInicial(); // METEMOS LOS JUEGOS NADA MAS ENTRAR
		System.out.println("La lista de juegos ha sido creada.");
		boolean sigue = true;
		while (sigue) {
			Menus.menuInicial();
			sigue = eligeOpcion();
		}
	}

	// ELEGIR OPCION EN MENU INICIAL
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

	// ELEGIR OPCION EN SUBMENU 1
	public boolean eligeOpcionGestion() {
		boolean sigue = true;
		switch (LecturaDatos.leerInt("Introduce una opcion: ")) {
		// ALTA JUEGO
		case 1:
			serv.altaJuego();
			break;
			
		// EDITAR JUEGO
		case 2:

			break;
			
		// ELIMINAR JUEGO
		case 3:

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

	// ELEGIR OPCION EN SUBMENU 2
	public boolean eligeOpcionListados() {
		boolean sigue = true;
		switch (LecturaDatos.leerInt("Introduce una opcion: ")) {
		
		//IMPRIMIR POR PLATAFORMA
		case 1:
			serv.imprimirListaPorCategoria(Genre.PLATAFORMA);
			break;
		
		// LISTADO JUEGOS
		case 2:
			serv.imprimirListaJuegos();
			break;
			
		// LISTADO JUEGOS NINTENDO
		case 3:

			break;
			
		case 4:
			serv.listarPorPublisher();
			
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
