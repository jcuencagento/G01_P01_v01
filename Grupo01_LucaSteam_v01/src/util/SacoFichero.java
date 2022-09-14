package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
	public static ArrayList<Juegos> extraigoJuegosdeCSV() {
		String csvFile = "archivo.csv"; 							//ARCHIVO CSV GUARDADO EN ESTA MISMA CARPETA
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ","; 									//DELIMITADOR
		ArrayList<Juegos> listaJuegos = new ArrayList<Juegos>(); 	//INSTANCIAMOS UNA LISTA (LA INICIAL)
		try {
		    br = new BufferedReader(new FileReader(csvFile));
		    while ((line = br.readLine()) != null) {  				//LEEMOS TODO EL ARCHIVO CSV              
		        String[] datos = line.split(cvsSplitBy);
		       												//ENUM	    INT		ENUM	
		       listaJuegos.add(Juegos.creadorJuegos(datos[1],datos[2],datos[3],datos[4],datos[5]));
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();									//EXCEPCION CON EL ARCHIVO
		} catch (IOException e) {					
		    e.printStackTrace();
		} finally {
		    if (br != null) {
		        try {
		            br.close();
		        } catch (IOException e) {							//EXCEPCION CON EL BUFFER
		            e.printStackTrace();
		        }
		    }
		}
		return listaJuegos;
	}
}
