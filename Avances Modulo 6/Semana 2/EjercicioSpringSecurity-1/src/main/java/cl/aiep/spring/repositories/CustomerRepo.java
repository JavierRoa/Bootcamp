package cl.aiep.spring.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.spring.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	Optional<Customer> findByUsernameIs(String username);
}
