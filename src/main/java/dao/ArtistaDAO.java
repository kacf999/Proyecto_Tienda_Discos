package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Artista;

public class ArtistaDAO {
	private Administrador administrador;

	public ArtistaDAO() {
		administrador = new Administrador();
	}
	
	public void insertar(Artista artista) {
		Connection conexion = administrador.dameConexion();
		String comandoSQL = "INSERT INTO Artistas VALUES(?,?,?)";

		PreparedStatement comando;
		try {
			comando = conexion.prepareStatement(comandoSQL);
			comando.setString(1, artista.getClave());
			comando.setString(2, artista.getNombre());
			comando.setString(3, artista.getGenero());
			comando.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void borrar(Artista artista) {
		Connection conexion = administrador.dameConexion();
		String comandoSQL = "DELETE FROM Artistas WHERE clave =?";

		PreparedStatement comando;
		try {
			comando = conexion.prepareStatement(comandoSQL);
			comando.setString(1, artista.getClave());

			comando.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertarTransaccion(Artista artista, Connection conexion) throws SQLException {

		String comandoSQL = "INSERT INTO Artistas VALUES(?,?,?)";

		PreparedStatement comando;

		comando = conexion.prepareStatement(comandoSQL);
		comando.setString(1, artista.getClave());
		comando.setString(2, artista.getNombre());
		comando.setString(3, artista.getGenero());
		comando.executeUpdate();

	}

	public ArrayList<Artista> buscar() {
		Connection conexion = administrador.dameConexion();
		String comandoSQL = "SELECT * FROM Artistas;";
		ResultSet resultSet = null;
		Artista artista = null;
		ArrayList<Artista> artistas = new ArrayList<Artista>();

		PreparedStatement comando;
		try {
			comando = conexion.prepareStatement(comandoSQL);
			resultSet = comando.executeQuery();
			while (resultSet.next()) {
				artista = new Artista(resultSet.getString("clave"), resultSet.getString("nombre"),
						resultSet.getString("genero"));
				artistas.add(artista);
			}

		} catch (SQLException e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return artistas;
	}
}
