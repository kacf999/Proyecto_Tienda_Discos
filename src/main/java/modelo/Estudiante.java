package modelo;

import java.io.Serializable;

public class Estudiante implements Serializable{
	private static final long serialVersionUID = 1L;

	private String matricula;
	private String nombre; 
	private String apellidoPaterno;
	private String apellidoMaterno; 
	private int edad;
	
	
	public Estudiante() {
	}
	public Estudiante(Estudiante e) {
		this.matricula = e.matricula;
		this.nombre = e.nombre;
		this.apellidoPaterno = e.apellidoPaterno;
		this.apellidoMaterno = e.apellidoMaterno;
		this.edad = e.edad;		
	}
	public Estudiante(String matricula, String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
}
