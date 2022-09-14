package control;

/**
 * Clase Main del programa donde se instancia la clase principal de Control y 
 * se llama al metodo bucle.
 * 
 * @author Grupo1
 *
 */

public class Main {

	public static void main(String[] args) {
		LucaSteam ls = new LucaSteam();

		System.out.println("Bienvenido al administrador de LucaSteam!");
		ls.entro();
		System.out.println("Te despedimos del administrador de LucaSteam!");
	}
}
