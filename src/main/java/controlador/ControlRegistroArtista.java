package controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import dao.ArtistaDAO;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import modelo.Artista;

@Named
@SessionScoped
public class ControlRegistroArtista implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Artista artista;
	private ArtistaDAO artistaDAO;
	private List<Artista> artistas;
	
	@PostConstruct
	public void init() {
		artista = new Artista();
		artistaDAO = new ArtistaDAO();
		artistas = new ArrayList<Artista>();
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public List<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(List<Artista> artistas) {
		this.artistas = artistas;
	}
	
	public void agregar() {
		artistaDAO.insertar(artista);
		artistas.add(new Artista(artista));
	}
	
	public void eliminar(Artista artista) {
		for(int i=0; i<artistas.size();i++) {
			if(artista.equals(artistas.get(i)))
				artistas.remove(artista);
		}
		artistaDAO.borrar(artista);
	}
	
	public void consultar() {
		artistas = artistaDAO.buscar();
		for(int i=0; i < artistas.size(); i++) {
			System.out.println(artistas.get(i).getClave()+artistas.get(i).getNombre()+artistas.get(i).getGenero());
		}
		System.out.println("===============================");
	}
}
