package util;

/**
 * Clase excepciones year not in [1959-2022] THROW en Constructor JUEGOS
 */

public class ExcepcionYearIncorrecto extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public ExcepcionYearIncorrecto(String msg) {
        super(msg);
    }
}
