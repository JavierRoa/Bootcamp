package objetos;
/**
 * Clase que representa a los autos a los que se les ha hecho mantenci�n.
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
	 * @param patente - String: representa la patente del veh�culo
	 * @param marca - String: representa la marca del veh�culo
	 * @param modelo - String: representa el modelo del veh�culo
	 * @param anio - String: representa el a�o de fabricaci�n del veh�culo
	 * @param cliente - Cliente: representa el cliente al cual el veh�culo est� asociado
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
	 * M�todo de impresi�n que proporciona los datos de un objeto Auto
	 * @return info
	 */
	public String impresion() {
		String info = "Patente: "+this.patente+" Marca: "+this.marca+" Modelo: "+this.modelo+" A�o: "+this.anio+" Cliente: "+this.cliente.getRut();	
		return info;
	}			

	@Override
	public String toString() {
		String info = "Patente: "+this.patente+" Marca: "+this.marca+" Modelo: "+this.modelo+" A�o: "+this.anio+" Cliente: "+this.cliente.getRut();	
		return info;
	}			
		
	/** M�todo accesador del atributo patente
	 * @return patente : String.
	 */
	public String getPatente() {
		return patente;
	}
	/** M�todo mutador del atributo patente
	 * @param patente : String.
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}
	/** M�todo accesador del atributo marca
	 * @return marca : String.
	 */
	public String getMarca() {
		return marca;
	}
	/** M�todo mutador del atributo marca
	 * @param marca : String.
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/** M�todo accesador del atributo modelo
	 * @return modelo : String.
	 */
	public String getModelo() {
		return modelo;
	}
	/** M�todo mutador del atributo modelo
	 * @param modelo : String.
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/** M�todo accesador del atributo anio
	 * @return anio : int.
	 */
	public String getAnio() {
		return anio;
	}
	/** M�todo mutador del atributo anio
	 * @param anio : int.
	 */
	public void setAnio(String anio) {
		this.anio = anio;
	}
	/** M�todo accesador del atributo cliente
	 * @return cliente : Cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/** M�todo mutador del atributo cliente
	 * @param cliente : Cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}