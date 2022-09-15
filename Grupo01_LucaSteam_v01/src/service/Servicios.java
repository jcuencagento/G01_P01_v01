package service;

import data.ListadoJuegos;
import model.Genre;
import model.Juegos;
import model.Platforms;
import util.ExcepcionJuegoSinNombre;
import util.LecturaDatos;

/**
 * Clase de tipo Servicios que conecta el Control y los Datos y toma decisiones
 * y funcionalidades apartado de la capa de Datos
 * 
 * @author Grupo 01
 *
 */

public class Servicios implements InterfServicios {

	ListadoJuegos lj = new ListadoJuegos();

	//Creamos la lista inicial desde el archivo .csv
	public void listaJuegosInicial() {
		lj.listaJuegosInicial();
	}

	//Imprimimos todos los juegos
	public void imprimirListaJuegos() {
		lj.imprimirListaJuegos();
	}

	// v1- podemos hacerlo con try-catch
	//Damos de alta un juego usando el especialista con entrada por teclado y lo pasamos a datos
	public void altaJuego() {
		Juegos j = new Juegos();
		int year;
		String nombre = LecturaDatos.leerString("Introduce el nombre: ");
		String plataforma = LecturaDatos.leerString("Introduce la platafoma: ");
		do {
			year = LecturaDatos.leerInt("Introduce el año (entre 1958 y 2022): ");
		} while (year <= 1958 || year >= 2022);

		try {
			j = Juegos.creadorJuegos(nombre, plataforma, year, // año entre 1960-2022
					LecturaDatos.leerString("Introduce el genero: "), 
					LecturaDatos.leerString("Introduce el publisher: "));
		} catch (ExcepcionJuegoSinNombre e) {}

		lj.altaJuego(j);
	}

	//Imprimimos todos los juegos de un genero (Pr. ALTA -> Plataforma)
	public void imprimirListaPorCategoria(Genre g) {
		lj.imprimirListaPorCategoria(g);
	}

	public void imprimirListaPorPlataformaNintendo() {
		Platforms[] p= {Platforms.DS,Platforms.DS3,Platforms.WII,Platforms.NES,Platforms.SNES,Platforms.GBA,Platforms.WIIU,Platforms.GB,Platforms.N64};
		
		lj.imprimirListaPorPlataformaNintendo(p);
	}
}
