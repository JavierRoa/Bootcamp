package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import dao.ElecDao;
import modelo.Electrodomestico;

public class ElecService implements ElecDao {
	
	@Override
	public List<Electrodomestico> listar() {
		List<Electrodomestico> lista = new ArrayList<Electrodomestico>();
		String query = "SELECT id, electrodomestico FROM electrodomesticos ORDER BY electrodomestico";
		try {
			PreparedStatement smt = Conexion.getInstancia().prepareStatement(query);
			ResultSet rs = smt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String electrodomestico = rs.getString("electrodomestico");
				Electrodomestico elec = new Electrodomestico(id, electrodomestico);
				lista.add(elec);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public Electrodomestico buscar(int id) {
		String query = "SELECT id, electrodomestico FROM electrodomesticos WHERE id = ?";
		Electrodomestico electrodomestico = null;
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setInt(1, id);
			ResultSet rs = smt.executeQuery();
			while(rs.next()) {
				String elec = rs.getString("electrodomestico");
				electrodomestico = new Electrodomestico(id, elec);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return electrodomestico;
	}
}