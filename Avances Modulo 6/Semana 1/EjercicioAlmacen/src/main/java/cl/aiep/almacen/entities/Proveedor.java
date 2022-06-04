package cl.aiep.almacen.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Proveedor {

	@Id
	@Column(name="rut")
	@Size(min=9,max=10)
	private String rut;
	@NotNull(message="Este campo es obligatorio")
	@Column(name="empresa", nullable=false)
	private String empresa;
	@NotNull(message="Este campo es obligatorio")
	@Column(name="vendedor", nullable=false)
	private String vendedor;
	@NotNull(message="Este campo es obligatorio")
	@Column(name="telefono", nullable=false)
	private String telefono;
	@NotNull(message="Este campo es obligatorio")
	@Column(name="email", nullable=false)
	private String email;
	@OneToMany(mappedBy = "proveedor")
	private List<Producto> productos;
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
