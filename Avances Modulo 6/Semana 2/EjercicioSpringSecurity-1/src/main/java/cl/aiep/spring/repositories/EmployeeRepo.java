package cl.aiep.spring.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.spring.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	Optional<Employee> findByEmailIs(String username);
}