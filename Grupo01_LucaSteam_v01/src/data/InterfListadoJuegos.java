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
	
	public void imprimirListaPorCategoria(Genre g);
	
	
	
	
	
<<<<<<< Updated upstream

	
	
	
	
	
	
	public void listarPorPublisher();

	public void listarJuegosSigloXX();
=======
	
	
	public void editarJuego(int opcion, int posicion);
	
	public void eliminarJuego(int posicion);
	
>>>>>>> Stashed changes
}

