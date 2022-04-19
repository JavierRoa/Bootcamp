package service;

import conexion.Conexion;
import dao.UsuarioDao;
import modelo.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioService implements UsuarioDao{
	
	@Override
	public Usuario buscar(String usuario, String clave) {
		Usuario user = null;
		String query = "SELECT id, usuario, clave, rol, rut FROM usuarios WHERE usuario = ? and clave = ?";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setString(1, usuario);
			smt.setString(2, clave);
			ResultSet rs = smt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				int rol = rs.getInt("rol");
				String rut = rs.getString("rut");
				user = new Usuario(id,usuario,clave,rol,rut);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
