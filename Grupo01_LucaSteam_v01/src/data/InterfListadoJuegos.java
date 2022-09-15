package data;

/**
 * 
 * @author Grupo1
 *
 */

import model.Genre;
import model.Juegos;

public interface InterfListadoJuegos {
	
	public void listaJuegosInicial();
	
	public void imprimirListaJuegos();
	
	public void altaJuego(Juegos j);
	
	public void imprimirListaPorCategoria(Genre g);
	
	public void listarPublishers();

	public void listarJuegosSigloXX();

	public void editarJuego(int opcion, int posicion);
	
	public void eliminarJuego(int posicion);
	
	public void listarYearPares();
	
}

