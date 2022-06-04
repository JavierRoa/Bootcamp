package cl.aiep.pfinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.pfinal.entities.Libro;

public interface LibroRepo extends JpaRepository<Libro, String> {

}
