package cl.aiep.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.spring.entities.Office;

public interface OfficeRepo extends JpaRepository<Office, String>{

}
