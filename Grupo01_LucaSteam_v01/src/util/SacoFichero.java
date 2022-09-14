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

//Paths.get(csvFile).toFile().getName())



public class SacoFichero {
	
	public static File buscar(String archivoABuscar, File directorio) {
		//DIRECTORIO
		//Suele ser Paths.get(".").toFile()
	    File[] archivos = directorio.listFiles();
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
	
	public static ArrayList<Juegos> leeFichero(String archivo) {
		FileReader fr = null;
		BufferedReader br = null;
		String cvsSplitBy = ",";
		ArrayList<Juegos> listaJuegos = new ArrayList<Juegos>(); 	//INSTANCIAMOS UNA LISTA (LA INICIAL)
		
		try {
			File file = buscar(archivo, Paths.get(".").toFile());
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line=null;
			line=br.readLine();
			while((line=br.readLine())!=null) {
				String[] datos = line.split(cvsSplitBy);
				//System.out.println("Nombre:"+datos[1]+". Plat:"+datos[2]+". Year:"+datos[3]+". Genre:"+datos[4]+". Publisher:"+datos[5]);
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
