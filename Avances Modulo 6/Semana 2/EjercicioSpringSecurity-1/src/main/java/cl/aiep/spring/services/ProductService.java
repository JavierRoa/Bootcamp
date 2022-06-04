package cl.aiep.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import cl.aiep.spring.dao.ProductDao;
import cl.aiep.spring.entities.Product;
import cl.aiep.spring.repositories.ProductRepo;

@Service
public class ProductService implements ProductDao {
	
	@Autowired 
	private ProductRepo productRepo;

	@Override
	public Product buscar(String id) {
		return productRepo.findById(id).orElseThrow();
	}

	@Override
	public List<Product> listar() {

		return productRepo.findAll();
	}

	@Override
	public List<Product> listarFiltro(Product product) {
		return productRepo.findAll(Example.of(product));
	}

}
