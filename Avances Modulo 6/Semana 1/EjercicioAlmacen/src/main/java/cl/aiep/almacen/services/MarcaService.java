package cl.aiep.almacen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.almacen.dao.MarcaDao;
import cl.aiep.almacen.entities.Marca;
import cl.aiep.almacen.repositories.MarcaRepo;

@Service
public class MarcaService implements MarcaDao{

	@Autowired
	private MarcaRepo marcaRepo;
	
	@Override
	public Marca buscar(int id) {
		return marcaRepo.getById(id);
	}
	@Override
	public List<Marca> listar() {
		return marcaRepo.findAll();
	}
	@Override
	public void agregar(Marca marca) {
		marcaRepo.save(marca);
	}
	@Override
	public void eliminar(int id) {
		marcaRepo.deleteById(id);
	}
}
