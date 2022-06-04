package cl.aiep.almacen.dao;

import java.util.List;

import cl.aiep.almacen.entities.Marca;

public interface MarcaDao {

	Marca buscar(int id);
	List<Marca> listar();
	void agregar(Marca marca);
	void eliminar(int id);
}
