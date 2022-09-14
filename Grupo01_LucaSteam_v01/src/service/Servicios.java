package service;

import data.ListadoJuegos;
import model.Genre;
import model.Juegos;
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

	public void listaJuegosInicial() {
		lj.listaJuegosInicial();
	}

	public void imprimirListaJuegos() {
		lj.imprimirListaJuegos();
	}

	// v1- podemos hacerlo con try-catch
	public void altaJuego() {
		Juegos j;
		int year;
		String nombre = LecturaDatos.leerString("Introduce el nombre: ");
		String plataforma = LecturaDatos.leerString("Introduce la platafoma: ");
		do {

			year = LecturaDatos.leerInt("Introduce el año (entre 1958 y 2022): ");

		} while (year <= 1958 || year >= 2022);

		j = Juegos.creadorJuegos(nombre, plataforma, year, // año entre 1960-2022
				LecturaDatos.leerString("Introduce el genero: "), 
				LecturaDatos.leerString("Introduce el publisher: "));

		lj.altaJuego(j);
	}

	public void imprimirListaPorCategoria(Genre g) {
		System.out.println(lj.imprimirListaPorCategoria(g));
	}

}
