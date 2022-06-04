package cl.aiep.pfinal.dao;

import java.util.List;

import cl.aiep.pfinal.entities.Autor;

public interface AutorDao {

//	Autor agregar(Autor autor);
//	void eliminar(Integer id);
//	Autor actualizar(Autor autor);
	Autor buscar (Integer id);
	List<Autor> listar();
}
