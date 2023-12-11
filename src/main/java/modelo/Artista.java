package modelo;

public class Artista {
	private String clave;
	private String nombre;
	private String genero;
	
	public Artista() {
		
	}
	
	public Artista(Artista e) {
		this.clave = e.clave;
		this.nombre = e.nombre;
		this.genero = e.genero;
	}
	public Artista(String clave, String nombre, String genero) {
		this.clave = clave;
		this.nombre = nombre;
		this.genero = genero;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
