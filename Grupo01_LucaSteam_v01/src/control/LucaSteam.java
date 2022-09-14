package control;

import gui.Menus;
import service.Servicios;
import util.LecturaDatos;

/**Clase principal de Control del proyecto
 * 
 * @author Grupo 01
 *
 */

public class LucaSteam {
	
	Servicios serv = new Servicios();
	
	//MENU PRINCIPAL
	public void entro() {
		serv.listaJuegosInicial();  //METEMOS LOS JUEGOS NADA MAS ENTRAR
		boolean sigue = true;
		while(sigue) {
			Menus.menuInicial();
			sigue = eligeOpcion();
		}
	}
	
	//ELEGIR OPCION EN MENU PRINCIAL
	public boolean eligeOpcion() {
		boolean sigue = true;
		switch(LecturaDatos.leerInt("Introduce una opcion: ")) {
		
			//MENU GESTION
			case 1:
				boolean sigueGestion = true;
				while(sigueGestion) {
					Menus.menuGestion();
					sigueGestion = eligeOpcionGestion();
				}
				break;
				
			//MENU LISTADOS
			case 2:
				boolean sigueListados = true;
				while(sigueListados) {
					Menus.menuListados();
					sigueListados = eligeOpcionListados();
				}
				break;
				
			//SALIMOS DEL MENU	
			case 0:
				sigue = false;
				break;
				
			default:
				System.out.println("No es una opcion valida.");
				break;
		}
		
		return sigue;
	}
	
	//ELEGIR OPCION EN SUBMENU 1
	public boolean eligeOpcionGestion() {
		boolean sigue = true;
		
		return sigue;
	}
	
	//ELEGIR OPCION EN SUBMENU 2
	public boolean eligeOpcionListados() {
		boolean sigue = true;
		
		return sigue;
	}
}
