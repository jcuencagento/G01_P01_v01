package data;

/**
 * 
 * @author Grupo1
 *
 */

import model.Genre;
import model.Juegos;

public interface InterfListadoJuegos {
	
	//INTRODUCCION DE LOS JUEGOS DEL CSV AL EMPEZAR
	public void listaJuegosInicial();
	
	public void imprimirListaJuegos();

	
	public void altaJuego(Juegos j);
	
	public String imprimirListaPorCategoria(Genre g);
}
