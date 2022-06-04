package cl.aiep.almacen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.almacen.entities.Marca;

public interface MarcaRepo extends JpaRepository<Marca, Integer>{
	
	
}