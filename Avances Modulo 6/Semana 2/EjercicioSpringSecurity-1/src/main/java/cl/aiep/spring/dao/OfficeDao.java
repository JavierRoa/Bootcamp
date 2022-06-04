package cl.aiep.spring.dao;

import java.util.List;

import cl.aiep.spring.entities.Office;

public interface OfficeDao {
	
	Office buscar (String id);
	List<Office> listar();
}
