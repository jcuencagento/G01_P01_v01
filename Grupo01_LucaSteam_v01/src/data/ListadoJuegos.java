package data;

import java.util.ArrayList;

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

}
