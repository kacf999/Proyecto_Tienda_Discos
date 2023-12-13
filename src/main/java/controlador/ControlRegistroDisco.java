package controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import dao.DiscoDAO;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import modelo.Disco;

@Named
@SessionScoped
public class ControlRegistroDisco implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Disco disco;
	private DiscoDAO discoDAO;
	private List<Disco> discos;
	
	@PostConstruct
	public void init() {
		disco = new Disco();
		discoDAO = new DiscoDAO();
		discos = new ArrayList<Disco>();
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	public List<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(List<Disco> discos) {
		this.discos = discos;
	}
	
	public void agregar() {
		discoDAO.insertar(disco);
		discos.add(new Disco(disco));
	}
	
	public void eliminar(Disco disco) {
		for(int i = 0; i<discos.size();i++) {
			if(disco.equals(discos.get(i)))
				discos.remove(disco);
		}
		discoDAO.borrar(disco);
	}
	
	public void consultar() {
		discos = discoDAO.buscar();
		for(int i=0; i<discos.size(); i++) {
			System.out.println(discos.get(i).getClave()+discos.get(i).getNombre());
		}
		System.out.println("===============================");
	}
}
