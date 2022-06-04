package cl.aiep.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.spring.dao.ProductlineDao;
import cl.aiep.spring.entities.Productline;
import cl.aiep.spring.repositories.ProductlineRepo;

@Service
public class ProductlineService implements ProductlineDao{
	
	@Autowired
	private ProductlineRepo	productlineRepo;

	@Override
	public Productline buscar(String id) {
		return productlineRepo.getById(id);
	}
	@Override
	public List<Productline> listar() {
		return productlineRepo.findAll();
	}
}
