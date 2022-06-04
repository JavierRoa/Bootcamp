package cl.aiep.almacen.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Producto {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message="Este campo es obligatorio")
	@Column(name="producto", nullable=false, length=75)
	private String producto;
	
	@NotNull(message="Este campo es obligatorio")
	@Column(name="stock", nullable=false)
	private Integer stock;
	
	@NotNull(message="Este campo es obligatorio")
	@Column(name="precioCompra", nullable=false)
	private Integer precioCompra;
	
	@NotNull(message="Este campo es obligatorio")
	@Column(name="precioVenta", nullable=false)
	private Integer precioVenta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="marca_fk", nullable=false)
	private Marca marca;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="proveedor_fk", nullable=false)
	private Proveedor proveedor;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(Integer precio) {
		this.precioCompra = precio;
	}
	public Integer getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Integer precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
}

