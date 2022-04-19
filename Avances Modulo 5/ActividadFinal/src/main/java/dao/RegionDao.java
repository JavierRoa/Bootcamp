package dao;

import java.util.List;

import modelo.Region;


public interface RegionDao {

	List<Region> listar();
	Region buscar(int id);
}
	
