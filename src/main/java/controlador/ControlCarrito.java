package controlador;

import java.io.Serializable;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import modelo.Artista;
import modelo.CarritoCompra;
import modelo.Disco;

@Named
@SessionScoped
public class ControlCarrito implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CarritoCompra carrito;
	private Disco disco;
	private Artista artista;
	private List<Disco> discos;
	private List<Artista> artistas; 
	
	
}
