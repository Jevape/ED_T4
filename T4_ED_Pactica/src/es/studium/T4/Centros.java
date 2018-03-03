package es.studium.T4;

public class Centros {
	private String nombre;
	private String direccion;
	private String alumnos;
	private int numerohoras;
	private int idCentro;
	public Centros() {
	nombre = "";
	direccion = "";
	alumnos = "";
	numerohoras = 0;
	idCentro=0;
	}
	public Centros (String n, String d, String a, int nh,int ic) {
	nombre = n;
	direccion = d;
	alumnos = a;
	numerohoras = nh;
	idCentro= ic;
	}
	
	public String getNombre() {
	return nombre;
		
		//cómo nos gusta un comentario!! 
	}

}
