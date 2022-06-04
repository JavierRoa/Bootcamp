package cl.aiep.spring.dao;

import java.util.List;

import cl.aiep.spring.entities.Productline;

public interface ProductlineDao {

	Productline buscar (String id);
	List<Productline> listar();
}
