package modelo;

public class Estado {

	private int id;
	private String estado;
	
	public Estado(int id, String estado) {

		this.id = id;
		this.estado = estado;
	}
	
	public Estado(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
