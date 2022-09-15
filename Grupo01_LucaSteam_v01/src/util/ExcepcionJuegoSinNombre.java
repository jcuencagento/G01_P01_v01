package util;

/**
 * Clase Excepcion de crear un juego sin nombre THROW en Especialista CreadorJuegos
 */

public class ExcepcionJuegoSinNombre extends Exception {
    
	private static final long serialVersionUID = 1L;

	public ExcepcionJuegoSinNombre(String msg) {
        super(msg);
    }
}