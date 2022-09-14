package data;

import java.util.ArrayList;

import model.Juegos;
import util.SacoFichero;

public class ListadoJuegos implements InterfListadoJuegos{
	
	ArrayList<Juegos> listaJuegos = new ArrayList<Juegos>();
	
	public void listaJuegosInicial() {
		listaJuegos = SacoFichero.extraigoJuegosdeCSV();
	}
		

}
