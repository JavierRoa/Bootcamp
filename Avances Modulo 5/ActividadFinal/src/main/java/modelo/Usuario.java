package modelo;

public class Usuario {

	private int id;
	private String usuario;
	private String clave;
	private int rol;
	private String rut;
	
	public Usuario(int id, String usuario, String clave, int rol, String rut) {

		this.id = id;
		this.usuario = usuario;
		this.clave = clave;
		this.rol = rol;
		this.rut = rut;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
}
