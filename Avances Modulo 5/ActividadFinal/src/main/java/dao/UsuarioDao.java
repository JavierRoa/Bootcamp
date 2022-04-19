package dao;

import modelo.Usuario;

public interface UsuarioDao {

	Usuario buscar(String usuario, String clave);
}
