package cl.aiep.spring.dao;

import java.util.List;

import cl.aiep.spring.entities.Employee;

public interface EmployeeDao {

	Employee buscar (int id);
	List<Employee> listar();
}
