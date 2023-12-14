package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Disco;

public class DiscoDAO {
	private Administrador administrador;
	
	public DiscoDAO() {
		administrador = new Administrador();
	}
	
	public void insertar(Disco disco) {
		Connection conexion = administrador.dameConexion();
		String comandoSQL = "INSERT INTO discos VALUES(?,?,?,?,?,?,?)";
		
		PreparedStatement comando;
		try {
			comando = conexion.prepareStatement(comandoSQL);
			comando.setString(1, disco.getClave());
			comando.setString(2, disco.getNombre());
			comando.setString(3, disco.getAnio());
			comando.setDouble(4, disco.getPrecio());
			comando.setInt(5, disco.getStock());
			comando.setString(6, disco.getDescripcion());
			comando.setString(7, disco.getClaveArtista());
			comando.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void borrar(Disco disco) {
		Connection conexion = administrador.dameConexion();
		String comandoSQL = "DELETE FROM discos WHERE clave = ?";
		
		PreparedStatement comando;
		try {
			comando = conexion.prepareStatement(comandoSQL);
			comando.setString(1, disco.getClave());
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<Disco> buscar(){
		Connection conexion = administrador.dameConexion();
		String comandoSQL = "SELECT * FROM discos;";
		ResultSet resultSet = null;
		Disco disco = null;
		ArrayList<Disco> discos = new ArrayList<Disco>();
		
		PreparedStatement comando;
		try {
			comando = conexion.prepareStatement(comandoSQL);
			resultSet = comando.executeQuery();
			while(resultSet.next()){
				disco = new Disco(resultSet.getString("clave"),resultSet.getString("nombre"),
						resultSet.getString("anio"),resultSet.getFloat("precio"),
						resultSet.getInt("stock"),resultSet.getString("descripcion"),
						resultSet.getString("claveArtista"));
				discos.add(disco);
			} 
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return discos;
	}
}
