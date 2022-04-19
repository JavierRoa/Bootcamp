package dao;

import java.util.List;

import modelo.OrdenServicio;

public interface OrdenDao {

	public int agregar(OrdenServicio orden);
	List<OrdenServicio> listar();
	OrdenServicio buscar(int id);
	List<OrdenServicio> listar(String rutBusqueda);
	public int actualizar(OrdenServicio orden);
}

