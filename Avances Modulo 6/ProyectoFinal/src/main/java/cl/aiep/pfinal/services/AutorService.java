package cl.aiep.pfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.pfinal.dao.AutorDao;
import cl.aiep.pfinal.entities.Autor;
import cl.aiep.pfinal.repositories.AutorRepo;

@Service
public class AutorService implements AutorDao {

	@Autowired
	private AutorRepo autorRepo;
	
	@Override
	public Autor buscar(Integer id) {
		return autorRepo.getById(id);
	}

	@Override
	public List<Autor> listar() {
		return autorRepo.findAll();
	}
}
