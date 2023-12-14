package modelo;

public class Disco {
	private String clave;
	private String nombre;
	private String anio;
	private double precio;
	private int stock;
	private String descripcion;
	private String claveArtista;
	
	public Disco() {
	}
	
	public Disco(Disco e) {
		this.clave = e.clave;
		this.nombre = e.nombre;
		this.anio = e.anio;
		this.precio = e.precio;
		this.stock = e.stock;
		this.descripcion = e.descripcion;
		this.claveArtista = e.claveArtista;
	}
	
	public Disco(String clave, String nombre, String anio, double precio, int stock, String descripcion, String claveArtista) {
		this.clave = clave;
		this.nombre = nombre;
		this.anio = anio;
		this.precio = precio;
		this.stock = stock;
		this.descripcion = descripcion;
		this.claveArtista = claveArtista;
	}
	public Disco(String clave, String nombre, String anio, double precio, String descripcion) {
		this.clave = clave;
		this.nombre = nombre;
		this.anio = anio;
		this.precio = precio;
		this.descripcion = descripcion;
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
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getClaveArtista() {
		return claveArtista;
	}

	public void setClaveArtista(String claveArtista) {
		this.claveArtista = claveArtista;
	}
	
}
