package cl.aiep.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.spring.entities.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

}
