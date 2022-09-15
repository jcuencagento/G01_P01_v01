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
import java.util.HashSet;
import java.util.Set;

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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void listarPorPublisher() {
		Set<String> publishers = new HashSet<>();
		for (Juegos juegos : listaJuegos) {
			if (juegos.getPublisher() != null) {//el primer valor de la lista contiene valores vacios
				publishers.add(juegos.getPublisher());
			}
		}

		System.out.println("-----Lista de publishers: ------\n");
		int cont = 0;
		for (String publi : publishers) {
			System.out.println(cont++ + ".-" + publi);
		}
	}
}
