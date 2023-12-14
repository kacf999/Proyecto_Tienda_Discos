package controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import dao.ArtistaDAO;
import dao.DiscoDAO;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import modelo.Artista;
import modelo.CarritoCompra;
import modelo.Disco;
import modelo.Relacion;

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
	@PostConstruct
	public void init(){
		carrito = new CarritoCompra();
		disco = new Disco();
		artista = new Artista();
		discos = new ArrayList<Disco>();
		artistas = new ArrayList<Artista>();
		}

	public CarritoCompra getCarrito() {
		return carrito;
	}

	public void setCarrito(CarritoCompra carrito) {
		this.carrito = carrito;
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public List<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(List<Disco> discos) {
		this.discos = discos;
	}

	public List<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(List<Artista> artistas) {
		this.artistas = artistas;
	}
	
	
	public void AgregarCarrito(Disco disco) {
		System.out.println("Se agrego: "+disco.getNombre());
		carrito.AgregarDisco(disco);
	}
	
}
