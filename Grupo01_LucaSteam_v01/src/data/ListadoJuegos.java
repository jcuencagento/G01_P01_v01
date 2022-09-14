package data;

/**
 * 
 * @author Grupo1
 *
 */

import java.util.ArrayList;

import model.Genre;
import model.Juegos;
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
		listaJuegos.add(j);
	}

	
	public void imprimirListaPorCategoria(Genre g) {
		for (Juegos j: listaJuegos) {
			if(j.getGenero().equals(g)) {
				System.out.println(j.toString());
			}
		}
		
	}

}
