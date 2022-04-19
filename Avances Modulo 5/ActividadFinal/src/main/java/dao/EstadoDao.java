package dao;

import java.util.List;

import modelo.Estado;
import modelo.Region;

public interface EstadoDao {

	List<Estado> listar();
	Estado buscar(int id);
}
