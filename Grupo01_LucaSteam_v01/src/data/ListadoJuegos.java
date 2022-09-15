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
import model.Platforms;
<<<<<<< Updated upstream
=======
import util.LecturaDatos;
>>>>>>> Stashed changes
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
	
	
	//AILED
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//ANTONIO
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//ELINA
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//JAVI
	
	
	//Metodo editar juego


	public void editarJuego(int opcion, int posicion) {
		
		switch(opcion) {
		//Cambio de nombre
		case 1:
			listaJuegos.get(posicion).setNombre(LecturaDatos.leerString("Cambie de nombre: "));
			System.out.println("Cambio de nombre correcto!");
			break;
		//Cambio de plataforma
		case 2:
			listaJuegos.get(posicion).setPlataforma(Platforms.elegirPlataforma("Introduzca una plataforma: "));
			System.out.println("Cambio de plataforma correcto!");
			break;
		//Cambio de year
		case 3:
			listaJuegos.get(posicion).setYear(LecturaDatos.leerInt("Introduce un year: "));
			System.out.println("Cambio de year correcto!");
			break;
		//Cambio de genero
		case 4:
			listaJuegos.get(posicion).setGenero(Genre.elegirGenero("Introduzca un genero: "));
			System.out.println("Cambio de genero correcto!");
			break;
		//Cambio de publisher
		case 5:
			listaJuegos.get(posicion).setPublisher(LecturaDatos.leerString("Cambie de editora: "));
			System.out.println("Cambio de editora correcto!");
			break;	
		default:
			System.out.println("No es una opcion valida.");
			break;
		}
		 
	}
	
	
	public void eliminarJuego(int posicion) {
		listaJuegos.remove(posicion);
		System.out.println("Juego borrado!");
	}
	
	public int buscadorJuegos(String s) {
		int encontrado = -1;
		for(int i = 1; i<listaJuegos.size(); i++) {
			if(listaJuegos.get(i).getNombre()!=null) {
				if(listaJuegos.get(i).getNombre().equalsIgnoreCase(s)) {
					encontrado = i;
				}
			}
		}
		if(encontrado==-1) System.out.println("No hemos encontrado el juego "+s);
		return encontrado;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	public void imprimirListaPorPlataformaNintendo(Platforms[] p) {

		for (int i = 0; i < listaJuegos.size(); i++) {
			for (int j = 0; j < p.length; j++) {
				if (listaJuegos.get(i).getPlataforma() == p[j]) {
					System.out.println(listaJuegos.get(i).toString());
				}
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

	
	
	
	
	
	
	
	
	/**
	 * Un método que devuelve un listado de juegos 
	 * que lanzaron el sigle XX
	 */
	
	public void listarJuegosSigloXX() {
		for (Juegos j : listaJuegos) {
			if (j.getYear()<2000) {
			System.out.println(j.toString());
			}
		} 
	 }

}

