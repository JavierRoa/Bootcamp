package cl.aiep.almacen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.almacen.dao.ProductoDao;
import cl.aiep.almacen.entities.Producto;
import cl.aiep.almacen.repositories.ProductoRepo;

@Service
public class ProductoService implements ProductoDao{
	
	@Autowired
	private ProductoRepo productoRepo;
	
	@Override
	public Producto buscar(int id) {
		return productoRepo.getById(id);
	}
	@Override
	public List<Producto> listar() {
		return productoRepo.findAll();
	}
	@Override
	public void agregar(Producto producto) {
		productoRepo.save(producto);
	}
	@Override
	public void eliminar(int id) {
		productoRepo.deleteById(id);
	}
}
