package cl.aiep.almacen.dao;

import java.util.List;

import cl.aiep.almacen.entities.Proveedor;

public interface ProveedorDao {

	Proveedor buscar(String id);
	List<Proveedor> listar();
	void agregar(Proveedor proveedor);
	void eliminar(String id);
}
