package service;

import conexion.Conexion;
import dao.OrdenDao;
import modelo.Electrodomestico;
import modelo.Estado;
import modelo.OrdenServicio;
import modelo.Region;
import modelo.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdenService implements OrdenDao {
	
	@Override
	public OrdenServicio buscar(int id) {
		OrdenServicio orden = null;
		String query = "SELECT * FROM ordenes WHERE id = ?";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setInt(1, id);
			ResultSet rs = smt.executeQuery();
			while(rs.next()) {
				String rut = rs.getString("rut");
				String nombre = rs.getString("nombre");
				String tel = rs.getString("tel");
				int tipoElec = rs.getInt("tipoElec");
				int region = rs.getInt("region");
				String comuna = rs.getString("comuna");
				String direccion = rs.getString("direccion");
				String fecha = rs.getString("fecha");
				String fechaAct = rs.getString("fechaAct");
				int estado = rs.getInt("estado");
				String obs = rs.getString("observaciones");
				
				RegionService registroRegion = new RegionService();
				Region reg = registroRegion.buscar(region);
				ElecService registroElec = new ElecService();
				Electrodomestico elec = registroElec.buscar(tipoElec);
				EstadoService registroEstado = new EstadoService();
				Estado est = registroEstado.buscar(estado);
				
				orden = new OrdenServicio(id, rut, nombre, tel, elec, reg, comuna, direccion, fecha, fechaAct, est, obs);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return orden;
	}

	@Override
	public int agregar(OrdenServicio orden) {
		String query = "INSERT INTO ordenes (rut, nombre, tel, tipoElec, region, comuna, direccion, fecha, fechaAct, estado, observaciones) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setString(1, orden.getRut());
			smt.setString(2, orden.getnCliente());
			smt.setString(3, orden.gettCliente());
			smt.setInt(4, orden.getTipoElec().getId());
			smt.setInt(5, orden.getRegion().getId());
			smt.setString(6, orden.getComuna());
			smt.setString(7, orden.getdCliente());
			smt.setString(8, orden.getFecha());
			smt.setString(9, orden.getFechaAct());
			smt.setInt(10, orden.getEstado().getId());
			smt.setString(11, orden.getObs());
			
			int a = smt.executeUpdate();
			return a;
				
		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public List<OrdenServicio> listar() {
		List<OrdenServicio> lista = new ArrayList<OrdenServicio>();
		String query = "SELECT * FROM ordenes";
		try {
			PreparedStatement smt = Conexion.getInstancia().prepareStatement(query);
			ResultSet rs = smt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String rut = rs.getString("rut");
				String nombre = rs.getString("nombre");
				String tel = rs.getString("tel");
				int tipoElec = rs.getInt("tipoElec");
				int region = rs.getInt("region");
				String comuna = rs.getString("comuna");
				String direccion = rs.getString("direccion");
				String fecha = rs.getString("fecha");
				String fechaAct = rs.getString("fechaAct");
				int estado = rs.getInt("estado");
				String obs = rs.getString("observaciones");
				
				RegionService registroRegion = new RegionService();
				Region reg = registroRegion.buscar(region);
				ElecService registroElec = new ElecService();
				Electrodomestico elec = registroElec.buscar(tipoElec);
				EstadoService registroEstado = new EstadoService();
				Estado est = registroEstado.buscar(estado);
				
				OrdenServicio orden = new OrdenServicio (id, rut, nombre, tel, elec, reg, comuna, direccion, fecha, fechaAct, est, obs); 
				lista.add(orden);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<OrdenServicio> listar(String rutBusqueda) {
		List<OrdenServicio> lista = new ArrayList<OrdenServicio>();
		String query = "SELECT * FROM ordenes WHERE rut = ? ORDER BY id";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setString(1, rutBusqueda);
			ResultSet rs = smt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String tel = rs.getString("tel");
				int tipoElec = rs.getInt("tipoElec");
				int region = rs.getInt("region");
				String comuna = rs.getString("comuna");
				String direccion = rs.getString("direccion");
				String fecha = rs.getString("fecha");
				String fechaAct = rs.getString("fechaAct");
				int estado = rs.getInt("estado");
				String obs = rs.getString("observaciones");
				
				RegionService registroRegion = new RegionService();
				Region reg = registroRegion.buscar(region);
				ElecService registroElec = new ElecService();
				Electrodomestico elec = registroElec.buscar(tipoElec);
				EstadoService registroEstado = new EstadoService();
				Estado est = registroEstado.buscar(estado);
				
				OrdenServicio orden = new OrdenServicio (id,rutBusqueda, nombre, tel, elec, reg, comuna, direccion, fecha, fechaAct, est, obs); 
				lista.add(orden);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public int actualizar(OrdenServicio orden) {
		String query = "UPDATE ordenes SET fechaAct = ?, estado = ?, observaciones = ? WHERE id = ?";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setString(1, orden.getFechaAct());
			smt.setInt(2, orden.getEstado().getId());
			smt.setString(3, orden.getObs());
			smt.setInt(4, orden.getId());
			int a = smt.executeUpdate();
			return a;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}

	}
}