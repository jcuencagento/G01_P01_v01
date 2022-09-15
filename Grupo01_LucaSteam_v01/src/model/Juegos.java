package model;

import util.ExcepcionJuegoSinNombre;
import util.ExcepcionYearIncorrecto;

/**
 * Clase principal de Control del proyecto
 * 
 * @author Grupo 01
 *
 */

public class Juegos {
	
	private String nombre;
	private Platforms plataforma;
	private int year;
	private Genre genero;
	private String publisher;
	
	public Juegos() {
		
	}
	
	public Juegos(String nombre, Platforms plataforma, int year, Genre genero, String publisher) throws ExcepcionYearIncorrecto {
		this.nombre = nombre;
		this.plataforma = plataforma;
		if(year<=1958 || year>= 2022) {
			throw new ExcepcionYearIncorrecto("Anno incorrecto.");
		}
		this.year = year;
		this.genero = genero;
		this.publisher = publisher;
	}
	
	//ESPECIALISTA CREADOR JUEGOS
	public static Juegos creadorJuegos(String nombre, String plataforma, int year, String genero, String publisher) throws ExcepcionJuegoSinNombre {
		if(nombre == null) {
			throw new ExcepcionJuegoSinNombre("Juego sin nombre.");
		}
		Juegos j=new Juegos();
		try {
			j = new Juegos(nombre, Platforms.elegirPlataforma(plataforma),
								year,Genre.elegirGenero(genero), publisher);
			return j;
		} catch (ExcepcionYearIncorrecto e) {}
		return j;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Platforms getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Platforms plataforma) {
		this.plataforma = plataforma;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Genre getGenero() {
		return genero;
	}

	public void setGenero(Genre genero) {
		this.genero = genero;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Juego de nombre "+ nombre + ", de la plataforma " + plataforma + ", del anno " + year + ", del genero "
				+ genero + ", y de la editora " + publisher + ".";
	}
	
	

}
