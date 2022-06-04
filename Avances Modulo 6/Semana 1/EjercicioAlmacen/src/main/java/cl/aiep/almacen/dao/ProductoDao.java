package cl.aiep.almacen.dao;

import java.util.List;

import cl.aiep.almacen.entities.Producto;

public interface ProductoDao {

	Producto buscar(int id);
	List<Producto> listar();
	void agregar(Producto producto);
	void eliminar(int id);
}
