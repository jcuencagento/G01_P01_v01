package service;

import data.ListadoJuegos;

/**Clase de tipo Servicios que conecta el Control y los Datos...
 * 
 * @author Grupo 01
 *
 */

public class Servicios implements InterfServicios{
	
	ListadoJuegos lj = new ListadoJuegos();
	
	public void listaJuegosInicial() {
		lj.listaJuegosInicial();
	}
	
	public void imprimirLista() {
		
	}
	
}
