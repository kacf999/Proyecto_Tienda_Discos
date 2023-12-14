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
	private List<Disco> discosCarrito;
	private double total;
	@PostConstruct
	public void init(){
		carrito = new CarritoCompra();
		disco = new Disco();
		artista = new Artista();
		discos = new ArrayList<Disco>();
		artistas = new ArrayList<Artista>();
		discosCarrito = new ArrayList<Disco>(); 
		total = 0.0;
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
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Disco> getDiscosCarrito() {
		return discosCarrito;
	}

	public void setDiscosCarrito(List<Disco> discosCarrito) {
		this.discosCarrito = discosCarrito;
	}

	public void VerCarrito() {
		carrito.MostrarListaCompra();
		discosCarrito = carrito.getDiscos();
		total = carrito.getTotal();
	}
	
	public void AgregarCarrito(Disco disco) {
		System.out.println("Se agrego: "+disco.getNombre());
		carrito.AgregarDisco(disco);
		VerCarrito();
		for(int i=0; i<discosCarrito.size();i++) {
			System.out.println("Disco en la lista"+discosCarrito.get(i).getNombre());
		}
	}
	
}
