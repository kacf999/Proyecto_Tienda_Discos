package modelo;

import java.util.ArrayList;
import java.util.List;

public class Relacion {
	private Artista artista;
	private List<Disco> discos = new ArrayList<Disco>();
	
	public Relacion() {
	}
	
	public Relacion(Artista artista, ArrayList<Disco> discos) {
		this.artista = artista;
		this.discos = discos;
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
	
}
