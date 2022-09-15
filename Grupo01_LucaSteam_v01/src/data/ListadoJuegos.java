package data;

/**
 * Clase de Datos la cual crea una lista de juegos (inicialmente con el .csv) y
 * a partir de ahi va accediendo a ella, bien sea para modificarla o simplemente
 * para imprimirla por pantalla.
 * 
 * @author Grupo1
 *
 */

import java.util.ArrayList;

import model.Genre;
import model.Juegos;
import model.Platforms;
import util.SacoFichero;

public class ListadoJuegos implements InterfListadoJuegos {

	ArrayList<Juegos> listaJuegos = new ArrayList<Juegos>();

	public void listaJuegosInicial() {
		listaJuegos = SacoFichero.leeFichero("vgsales.csv");
	}

	public void imprimirListaJuegos() {
		for (Juegos j : listaJuegos) {
			System.out.println(j.toString());
		}
	}

	public void altaJuego(Juegos j) {
		if (!(j.getNombre() == null))
			listaJuegos.add(j);
	}

	public void imprimirListaPorCategoria(Genre g) {
		for (Juegos j : listaJuegos) {
			if (j.getGenero().equals(g)) {
				System.out.println(j.toString());
			}
		}
	}


	public void imprimirListaPorPlataformaNintendo(Platforms[] p) {

		for (int i = 0; i < listaJuegos.size(); i++) {
			for (int j = 0; j < p.length; j++) {
				if (listaJuegos.get(i).getPlataforma() == p[j]) {
					System.out.println(listaJuegos.get(i).toString());
				}
			}
		}
	}

	
}

