package cl.aiep.pfinal.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Autor {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message="Este campo es obligatorio")
	@Column(name="nombres", nullable=false, length=50)
	private String nombres;
	
	@NotEmpty(message="Este campo es obligatorio")
	@Column(name="apellido1", nullable=false, length=50)
	private String apellido1;
	
	@NotEmpty(message="Este campo es obligatorio")
	@Column(name="apellido2", nullable=false, length=50)
	private String apellido2;
	
	@NotEmpty(message="Este campo es obligatorio")
	@Column(name="nacionalidad", nullable=false, length=50)
	private String nacionalidad;
	
	@Column(name="biografia", nullable=true, length=50)
	private String biografia;
	
	@OneToMany(mappedBy="autor")
	private List<Libro> libro;

	public Autor() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombre) {
		this.nombres = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	
	
}
