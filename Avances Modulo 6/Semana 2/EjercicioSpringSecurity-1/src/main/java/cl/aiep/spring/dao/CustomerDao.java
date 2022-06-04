package cl.aiep.spring.dao;

import java.util.List;

import cl.aiep.spring.entities.Customer;

public interface CustomerDao {

	Customer buscar (int id);
	List<Customer> listar();
}
