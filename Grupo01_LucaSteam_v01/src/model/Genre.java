package model;

/**
 * 
 * @author Grupo1
 *
 */

public enum Genre {
	
	PLATAFORMA, ACCION, ROL, 
	AVENTURA, LUCHA, DEPORTE, 
	MISC, SHOOTER, ESTRATEGIA, 
	PUZLE, CARRERAS, SIMULACION;
	
	
	/**
	 * Aqui se explica que hace el metodo
	 */
	//METODO DONDE PASAR DE STRING A GENERO (ENUM)
	public static Genre elegirGenero(String s){
		Genre g = null;
		switch (s) {
		case "Platform": {
			g = Genre.PLATAFORMA;
			return g;
			
		}
		case "Action": {
			g = Genre.ACCION;
			return g;
			
		}
		case "Adventure": {
			g = Genre.AVENTURA;
			return g;
			
		}
		case "Fighting": {
			g = Genre.LUCHA;
			return g;
			
		}
		case "Misc": {
			g = Genre.MISC;
			return g;
			
		}
		case "Role-Playing": {
			g = Genre.ROL;
			return g;
			
		}
		case "Strategy": {
			g = Genre.ESTRATEGIA;
			return g;
			
		}
		case "Sports": {
			g = Genre.DEPORTE;
			return g;
			
		}
		case "Shooter": {
			g = Genre.SHOOTER;
			return g;
			
		}
		case "Puzzle": {
			g = Genre.PUZLE;
			return g;
			
		}
		case "Racing": {
			g = Genre.CARRERAS;
			return g;
			
		}
		case "Simulation": {
			g = Genre.SIMULACION;
			return g;
			
		}
		default:
			return null;
		}
	}
}
