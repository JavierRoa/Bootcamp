package cl.aiep.almacen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.almacen.entities.Producto;

public interface ProductoRepo extends JpaRepository<Producto, Integer>{

}
