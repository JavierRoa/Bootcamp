package cl.aiep.almacen.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.almacen.entities.Proveedor;

public interface ProveedorRepo extends JpaRepository<Proveedor, String>{

	List<Proveedor> findAllByOrderByVendedor();
}
