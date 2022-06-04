package cl.aiep.pfinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Libro {

	@Id
	@Column(name="isbn", length=17)
	private String isbn;
	
	@NotEmpty(message="Este campo es obligatorio")
	@Column(name="titulo", nullable=false, length=75)
	private String titulo;
	
	@NotNull(message="Este campo es obligatorio")
	@Column(name="edicion", nullable=false, length=3)
	private String edicion;
	
	@NotEmpty(message="Este campo es obligatorio")
	@Column(name="editorial", nullable=false, length=75)
	private String editorial;
	
	@NotEmpty(message="Este campo es obligatorio")
	@Column(name="categoria", nullable=false, length=50)
	private String categoria;
	
	@NotNull(message="Este campo es obligatorio")
	@Column(name="anio", nullable=false)
	private Integer anio;
	
	@NotEmpty(message="Este campo es obligatorio")
	@Column(name="idioma", nullable=false, length=30)
	private String idioma;
	
	@NotNull(message="Este campo es obligatorio")
	@Column(name="paginas", nullable=false)
	private Integer paginas;
	
	@ManyToOne(fetch=FetchType.LAZY) // Relacion muchos (libros) a uno (autor)
	@JoinColumn(name="autor_fk", nullable=false) //Crea columna para imprimir datos externos
	private Autor autor;

	public Libro() {
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
