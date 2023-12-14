package modelo;

import java.util.ArrayList;

public class CarritoCompra {
	private ArrayList<Disco> discos = new ArrayList<Disco>();
	private double total = 0.0;
	
	public CarritoCompra() {
	}

	public ArrayList<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(ArrayList<Disco> discos) {
		this.discos = discos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void AgregarDisco(Disco disco) {
		discos.add(disco);
		total += disco.getPrecio();
		System.out.println("Se agrego: "+disco.getNombre());
		System.out.println("Total Actualizado: "+total);
	}
	
	public void EliminarDisco(String claveDisco) {
		for(Disco disco: discos) {
			if(disco.getClave() == claveDisco) {
				System.out.println("Se elimino: "+disco.getNombre());
				total = total - disco.getPrecio();
				discos.remove(disco);
				break;
			}
		}
		System.out.println("Total Actualizado: "+total);
	}
	
	public void MostrarListaCompra() {
		for(Disco disco: discos) {
			System.out.println("Disco: "+disco.getNombre()+" precio: "+disco.getPrecio());
		}
		System.out.println("Total: "+total);
	}
	
	public void borrarlista() {
		discos.clear();
	}
	
}
