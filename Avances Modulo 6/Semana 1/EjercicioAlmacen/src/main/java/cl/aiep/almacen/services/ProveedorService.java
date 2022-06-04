package cl.aiep.almacen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.aiep.almacen.dao.ProveedorDao;
import cl.aiep.almacen.entities.Proveedor;
import cl.aiep.almacen.repositories.ProveedorRepo;

@Service
public class ProveedorService implements ProveedorDao{
	
	@Autowired
	private ProveedorRepo proveedorRepo;
	
	@Override
	public Proveedor buscar(String id) {
		return proveedorRepo.getById(id);
	}
	@Override
	public List<Proveedor> listar() {
		return proveedorRepo.findAll();
	}
	@Override
	public void agregar(Proveedor proveedor) {
		proveedorRepo.save(proveedor);
	}
	@Override
	public void eliminar(String id) {
		proveedorRepo.deleteById(id);
	}
}
