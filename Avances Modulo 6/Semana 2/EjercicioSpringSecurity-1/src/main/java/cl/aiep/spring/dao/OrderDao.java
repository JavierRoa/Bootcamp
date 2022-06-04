package cl.aiep.spring.dao;

import java.util.List;

import cl.aiep.spring.entities.Order;

public interface OrderDao {
	
	Order buscar (int id);
	List<Order> listar();
}
