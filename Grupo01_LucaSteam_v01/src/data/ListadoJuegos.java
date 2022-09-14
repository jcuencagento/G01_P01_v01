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

	
	public String imprimirListaPorCategoria(Genre g) {
		for (Juegos j: listaJuegos) {
			if(j.getGenero().equals(g)) {
				return j.toString();
				// He buscado en internet cómo se hacen las pruebas de métodos void 
				// y parece que no se puede hacerlas, por eso he cambiado un poco
				// este método para que devuelva un valor para poder hacer 
				// pruebas con ella co
			}
		}
		return null;
	}

}
