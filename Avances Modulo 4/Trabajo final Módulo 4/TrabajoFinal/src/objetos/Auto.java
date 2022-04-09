package objetos;
/**
 * Clase que representa a los autos a los que se les ha hecho mantención.
 * @author Javier Roa.
 *
 */
public class Auto {

	private String patente;
	private String marca;
	private String modelo;
	private String anio;
	private Cliente cliente;
	/** Constructor de la clase Auto
	 * @param patente - String: representa la patente del vehículo
	 * @param marca - String: representa la marca del vehículo
	 * @param modelo - String: representa el modelo del vehículo
	 * @param anio - String: representa el año de fabricación del vehículo
	 * @param cliente - Cliente: representa el cliente al cual el vehículo está asociado
	 */
	public Auto(String patente, String marca, String modelo, String anio, Cliente cliente) {

		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.cliente = cliente;
	}
	/**
	 * Constructor de la clase Auto
	 */
	public Auto() {

		this.patente = "JGJG42";
		this.marca = "Chevrolet";
		this.modelo = "Luv";
		this.anio = "1995";
		this.cliente = new Cliente();
	}
	/**
	 * Método de impresión que proporciona los datos de un objeto Auto
	 * @return info
	 */
	public String impresion() {
		String info = "Patente: "+this.patente+" Marca: "+this.marca+" Modelo: "+this.modelo+" Año: "+this.anio+" Cliente: "+this.cliente.getRut();	
		return info;
	}			

	@Override
	public String toString() {
		String info = "Patente: "+this.patente+" Marca: "+this.marca+" Modelo: "+this.modelo+" Año: "+this.anio+" Cliente: "+this.cliente.getRut();	
		return info;
	}			
		
	/** Método accesador del atributo patente
	 * @return patente : String.
	 */
	public String getPatente() {
		return patente;
	}
	/** Método mutador del atributo patente
	 * @param patente : String.
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}
	/** Método accesador del atributo marca
	 * @return marca : String.
	 */
	public String getMarca() {
		return marca;
	}
	/** Método mutador del atributo marca
	 * @param marca : String.
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/** Método accesador del atributo modelo
	 * @return modelo : String.
	 */
	public String getModelo() {
		return modelo;
	}
	/** Método mutador del atributo modelo
	 * @param modelo : String.
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/** Método accesador del atributo anio
	 * @return anio : int.
	 */
	public String getAnio() {
		return anio;
	}
	/** Método mutador del atributo anio
	 * @param anio : int.
	 */
	public void setAnio(String anio) {
		this.anio = anio;
	}
	/** Método accesador del atributo cliente
	 * @return cliente : Cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/** Método mutador del atributo cliente
	 * @param cliente : Cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}