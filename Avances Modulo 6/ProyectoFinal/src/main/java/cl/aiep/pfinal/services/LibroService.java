package cl.aiep.pfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import cl.aiep.pfinal.dao.LibroDao;
import cl.aiep.pfinal.entities.Libro;
import cl.aiep.pfinal.repositories.LibroRepo;

@Service
public class LibroService implements LibroDao{
	
	@Autowired
	private LibroRepo libroRepo;

	@Override
	public Libro buscar(String id) {
		return libroRepo.getById(id);
	}

	@Override
	public List<Libro> listar() {
		return libroRepo.findAll();
	}
	@Override
	public List<Libro> listarFiltro(Libro libro) {
		return libroRepo.findAll(Example.of(libro));
	}
}
