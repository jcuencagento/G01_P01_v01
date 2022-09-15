package util;

/**
 * Clase excepciones year not in [1959-2022] THROW en Constructor JUEGOS
 * 
 * @author Grupo1
 */

public class ExcepcionYearIncorrecto extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	/**
	 * la excepcion manda un mensaje de error cuando el año
	 * este fuera del rango [1958-2022]
	 * @param msg
	 */
	public ExcepcionYearIncorrecto(String msg) {
        super(msg);
    }
}
