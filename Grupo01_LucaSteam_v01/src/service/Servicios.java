package service;

import data.ListadoJuegos;
import model.Juegos;
import util.LecturaDatos;

/**
 * Clase de tipo Servicios que conecta el Control y los Datos...
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

	public void altaJuego() {
		Juegos j = Juegos.creadorJuegos(LecturaDatos.leerString("Introduce el nombre "),
				LecturaDatos.leerString("Introduce la platafoma "),
				LecturaDatos.leerInt("Introduce el año "),
				LecturaDatos.leerString("Introduce genero "),
				LecturaDatos.leerString("Introduce publisher "));
		lj.altaJuego(j);
	}

}
