package cl.aiep.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.spring.entities.Productline;

public interface ProductlineRepo extends JpaRepository<Productline, String>{

}
