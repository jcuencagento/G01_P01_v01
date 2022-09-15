package service;

import model.Genre;

/**
 * Clase principal de Control del proyecto
 * 
 * @author Grupo 01
 *
 */

public interface InterfServicios {

	// INTRODUCCION DE LOS JUEGOS DEL CSV AL EMPEZAR
	public void listaJuegosInicial();

	public void imprimirListaJuegos();

	public void altaJuego();
	
	public void imprimirListaPorCategoria(Genre g);
	
	public void listarPorPublisher();

	public void editarJuego();
	
	public void eliminarJuego();

	public void listarYearPares();
}
