package cl.aiep.spring.dao;

import java.util.List;

import cl.aiep.spring.entities.Product;

public interface ProductDao {

	Product buscar (String id);
	List<Product> listar();
	List<Product> listarFiltro(Product product);
}
