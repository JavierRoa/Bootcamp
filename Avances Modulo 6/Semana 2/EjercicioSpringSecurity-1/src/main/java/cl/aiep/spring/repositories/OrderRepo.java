package cl.aiep.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.spring.entities.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

}
