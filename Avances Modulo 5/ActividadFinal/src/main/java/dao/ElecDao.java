package dao;

import java.util.List;

import modelo.Electrodomestico;
import modelo.Estado;

public interface ElecDao {

	List<Electrodomestico> listar();
	Electrodomestico buscar(int id);
}
