package objetos;
/**
 * Clase que representa a los clientes.
 * @author Javier Roa.
 *
 */
public class Cliente {
	// Declaraci�n de los atributos de la clase Cliente.
	private String rut;
	private String pNom;
	private String sNom;
	private String pApe;
	private String sApe;
	private String email;
	private String fono;
	/** Constructor de la clase Cliente
	 * @param rut : Corresponde al RUT del cliente
	 * @param pNom : Corresponde al primer nombre del cliente
	 * @param sNom : Corresponde al segundo nombre del cliente
	 * @param pApe : Corresponde al primer apellido del cliente
	 * @param sApe : Corresponde al segundo apellido del cliente
	 * @param email : Corresponde al correo electr�nico del cliente
	 * @param fono : Corresponde al tel�fono del cliente
	 */
	public Cliente(String rut, String pNom, String sNom, String pApe, String sApe, String email, String fono) {

		this.rut = rut;
		this.pNom = pNom;
		this.sNom = sNom;
		this.pApe = pApe;
		this.sApe = sApe;
		this.email = email;
		this.fono = fono;
	}
	/**
	 * Constructor de la clase Cliente (con par�metros preestablecidos)
	 */
	public Cliente() {

		this.rut = "9483256-7";
		this.pNom = "Jorge";
		this.sNom = "Iv�n";
		this.pApe = "Sep�lveda";
		this.sApe = "Gutierrez";
		this.email = "jorge.sep@gmail.com";
		this.fono = "78424297";
	}
	/**
	 * M�todo de impresi�n de los datos de un objeto Cliente
	 * @return info
	 */
	public String impresion() {
		String info = "RUT: "+this.rut+" Nombres: "+this.pNom+" "+this.sNom+" Apellidos: "+this.pApe+" "+this.sApe+" Email: "+this.email+" Fono: "+this.fono;	
		return info;
	}
	@Override
	public String toString() {
		String info = "RUT: "+this.rut+" Nombres: "+this.pNom+" "+this.sNom+" Apellidos: "+this.pApe+" "+this.sApe+" Email: "+this.email+" Fono: "+this.fono;	
		return info;
	}
	/** M�todo accesador del atributo rut
	 * @return rut : String
	 */
	public String getRut() {
		return rut;
	}
	/** M�todo mutador del atributo rut
	 * @param rut : String
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/** M�todo accesador del atributo pNom
	 * @return pNom : String
	 */
	public String getpNom() {
		return pNom;
	}
	/** M�todo mutador del atributo pNom
	 * @param pNom : String
	 */
	public void setpNom(String pNom) {
		this.pNom = pNom;
	}
	/** M�todo accesador del atributo sNom
	 * @return sNom : String
	 */
	public String getsNom() {
		return sNom;
	}
	/** M�todo mutador del atributo sNom
	 * @param sNom : String
	 */
	public void setsNom(String sNom) {
		this.sNom = sNom;
	}
	/** M�todo accesador del atributo pApe
	 * @return pApe : String
	 */
	public String getpApe() {
		return pApe;
	}
	/** M�todo mutador del atributo pApe
	 * @param pApe : String
	 */
	public void setpApe(String pApe) {
		this.pApe = pApe;
	}
	/** M�todo accesador del atributo sApe
	 * @return sApe : String
	 */
	public String getsApe() {
		return sApe;
	}
	/** M�todo mutador del atributo sApe
	 * @param sApe : String
	 */
	public void setsApe(String sApe) {
		this.sApe = sApe;
	}
	/** M�todo accesador del atributo email
	 * @return email : String
	 */
	public String getEmail() {
		return email;
	}
	/** M�todo mutador del atributo email
	 * @param email : String
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/** M�todo accesador del atributo fono
	 * @return fono : String
	 */
	public String getFono() {
		return fono;
	}
	/** M�todo mutador del atributo fono
	 * @param fono : String
	 */
	public void setFono(String fono) {
		this.fono = fono;
	}
	
	
}