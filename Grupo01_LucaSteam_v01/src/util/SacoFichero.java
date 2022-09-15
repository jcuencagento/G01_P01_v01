package util;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

import java.nio.file.Paths;
import java.util.ArrayList;

import model.Juegos;

/**
 * Fichero de utilidades utilizado para extraer la informacion del archivo .csv
 * y crear objetos Juegos que seran almacenados en una lista.
 * 
 * @author Grupo 01
 *
 */

public class SacoFichero {
	
	/*
	 * Metodo complementario para devolver un archivo introduciendo un String con el nombre
	 */
	public static File buscar(String archivoABuscar, File directorio) {
	    File[] archivos = directorio.listFiles(); //Suele ser Paths.get(".").toFile()
	    for (File archivo : archivos) {
	        if (archivo.getName().equals(archivoABuscar)) {
	            return archivo;
	        }
	        if (archivo.isDirectory()) {
	            File resultadoRecursion = buscar(archivoABuscar, archivo);
	            if (resultadoRecursion != null) {
	                return resultadoRecursion;
	            }
	        }
	    }
	    return null;
	}
	
	/*
	 * Metodo principal para devolver una lista de objetos Juegos provenientes de un fichero .csv
	 * Utilizando el especialista creadorJuegos e instanciando la clase de datos
	 */
	public static ArrayList<Juegos> leeFichero(String archivo) {
		FileReader fr = null;
		BufferedReader br = null;
		String cvsSplitBy = ",";
		ArrayList<Juegos> listaJuegos = new ArrayList<Juegos>(); 	//INSTANCIAMOS UNA LISTA (LA INICIAL)
		
		try {
			File file = buscar(archivo, Paths.get(".").toFile());
			if(file==null) return listaJuegos;
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line=null;
			line=br.readLine();
			line=br.readLine();
			while((line=br.readLine())!=null) {
				String[] datos = line.split(cvsSplitBy);
																//ENUM	    INT		ENUM	
				try{
					listaJuegos.add(Juegos.creadorJuegos(datos[1],datos[2],Integer.parseInt(datos[3]),datos[4],datos[5]));
				}catch(Exception e) {
					listaJuegos.add(Juegos.creadorJuegos(datos[1],datos[2],0,datos[4],datos[5]));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(null!=fr) fr.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}

		return listaJuegos;
	}

}
