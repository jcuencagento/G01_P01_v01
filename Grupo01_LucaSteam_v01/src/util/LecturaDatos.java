package util;

import java.util.Scanner;

public class LecturaDatos {
	
	@SuppressWarnings("resource")
	public static String leerString() {
		try{Scanner input = new Scanner(System.in);
		return input.nextLine();
		}catch(Exception e) {
			System.out.println("Error al introducir dato.");
		}
		return leerString("Introduce un valor valido: ");
	}
	
	public static String leerString(String msg) {
		System.out.println(msg);
		return leerString();
	}
	
	@SuppressWarnings("resource")
	public static int leerInt() {
		try{Scanner input = new Scanner(System.in);
		return input.nextInt();
		}catch(Exception e) {
			System.out.println("Error al introducir dato.");
		}
		return leerInt("Introduce un valor valido: ");
	}
	
	public static int leerInt(String msg) {
		System.out.println(msg);
		return leerInt();
	}
	
	@SuppressWarnings("resource")
	public static boolean leerBoolean() {
		try{Scanner input = new Scanner(System.in);
		return input.nextBoolean();
		}catch(Exception e) {
			System.out.println("Error al introducir dato.");
		}
		return leerBoolean("Introduce un valor valido: ");
	}
	
	public static boolean leerBoolean(String msg) {
		System.out.println(msg);
		return leerBoolean();
	}

	@SuppressWarnings("resource")
	public static float leerFloat() {
		try{Scanner input = new Scanner(System.in);
		return input.nextFloat();
		}catch(Exception e) {
			System.out.println("Error al introducir dato.");
		}
		return leerFloat("Introduce un valor valido: ");
	}
	
	public static float leerFloat(String msg) {
		System.out.println(msg);
		return leerFloat();
	}
	
	@SuppressWarnings("resource")
	public static double leerDouble() {
		try{Scanner input = new Scanner(System.in);
		return input.nextDouble();
		}catch(Exception e) {
			System.out.println("Error al introducir dato.");
		}
		return leerDouble("Introduce un valor valido: ");
	}
	
	public static double leerDouble(String msg) {
		System.out.println(msg);
		return leerDouble();
	}


}