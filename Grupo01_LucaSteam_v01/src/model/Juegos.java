package model;

public class Juegos {
	
	private String nombre;
	private Platforms plataforma;
	private int year;
	private Genre genero;
	private String publisher;
	
	public Juegos() {
		
	}
	
	public Juegos(String nombre, Platforms plataforma, int year, Genre genero, String publisher) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.year = year;
		this.genero = genero;
		this.publisher = publisher;
	}
	
	//ESPECIALISTA CREADOR JUEGOS
	public static Juegos creadorJuegos(String nombre, String plataforma, String year, String genero, String publisher) {
		Juegos j = new Juegos(nombre, Platforms.elegirPlataforma(plataforma),
							Integer.parseInt(year),Genre.elegirGenero(genero), publisher);
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
		return "Juego de nombre " + nombre + ", de la plataforma " + plataforma + ", del anno " + year + ", del genero "
				+ genero + ", y de la editora " + publisher + ".";
	}
	
	

}
