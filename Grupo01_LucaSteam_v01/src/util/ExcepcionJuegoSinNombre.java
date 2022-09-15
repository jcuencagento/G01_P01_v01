package util;

/**
 * Clase Excepcion de crear un juego sin nombre; THROW en Especialista CreadorJuegos
 * 
 * @author Grupo1
 */

public class ExcepcionJuegoSinNombre extends Exception {
    
	private static final long serialVersionUID = 1L;

	/**
	 * Lanza un mensaje para informar que el juego no tiene nombre.
	 * @param msg
	 */
	public ExcepcionJuegoSinNombre(String msg) {
        super(msg);
    }
}