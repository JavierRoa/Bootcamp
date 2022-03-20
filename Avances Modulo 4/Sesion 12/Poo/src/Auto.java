
public class Auto {

	private String marca;
	private String serie;
	private String modelo;
	private String placa;
	
	public Auto (String marca, String serie, String modelo, String placa) {
		this.marca = marca;
		this.serie = serie;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	//métodos accesadores
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getSerie() {
		return this.serie;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	//métodos mutadores
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}