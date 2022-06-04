package cl.aiep.pfinal.dao;

import java.util.List;

import cl.aiep.pfinal.entities.Libro;

public interface LibroDao {

//	Libro agregar(Libro libro);
//	void eliminar(String id);
//	Libro actualizar(Libro libro);
	Libro buscar (String id);
	List<Libro> listar();
	List<Libro> listarFiltro(Libro libro);
}
