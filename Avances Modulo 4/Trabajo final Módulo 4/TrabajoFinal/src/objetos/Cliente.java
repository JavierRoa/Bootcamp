package objetos;
/**
 * Clase que representa a los clientes.
 * @author Javier Roa.
 *
 */
public class Cliente {
	// Declaración de los atributos de la clase Cliente.
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
	 * @param email : Corresponde al correo electrónico del cliente
	 * @param fono : Corresponde al teléfono del cliente
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
	 * Constructor de la clase Cliente (con parámetros preestablecidos)
	 */
	public Cliente() {

		this.rut = "9483256-7";
		this.pNom = "Jorge";
		this.sNom = "Iván";
		this.pApe = "Sepúlveda";
		this.sApe = "Gutierrez";
		this.email = "jorge.sep@gmail.com";
		this.fono = "78424297";
	}
	/**
	 * Método de impresión de los datos de un objeto Cliente
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
	/** Método accesador del atributo rut
	 * @return rut : String
	 */
	public String getRut() {
		return rut;
	}
	/** Método mutador del atributo rut
	 * @param rut : String
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/** Método accesador del atributo pNom
	 * @return pNom : String
	 */
	public String getpNom() {
		return pNom;
	}
	/** Método mutador del atributo pNom
	 * @param pNom : String
	 */
	public void setpNom(String pNom) {
		this.pNom = pNom;
	}
	/** Método accesador del atributo sNom
	 * @return sNom : String
	 */
	public String getsNom() {
		return sNom;
	}
	/** Método mutador del atributo sNom
	 * @param sNom : String
	 */
	public void setsNom(String sNom) {
		this.sNom = sNom;
	}
	/** Método accesador del atributo pApe
	 * @return pApe : String
	 */
	public String getpApe() {
		return pApe;
	}
	/** Método mutador del atributo pApe
	 * @param pApe : String
	 */
	public void setpApe(String pApe) {
		this.pApe = pApe;
	}
	/** Método accesador del atributo sApe
	 * @return sApe : String
	 */
	public String getsApe() {
		return sApe;
	}
	/** Método mutador del atributo sApe
	 * @param sApe : String
	 */
	public void setsApe(String sApe) {
		this.sApe = sApe;
	}
	/** Método accesador del atributo email
	 * @return email : String
	 */
	public String getEmail() {
		return email;
	}
	/** Método mutador del atributo email
	 * @param email : String
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/** Método accesador del atributo fono
	 * @return fono : String
	 */
	public String getFono() {
		return fono;
	}
	/** Método mutador del atributo fono
	 * @param fono : String
	 */
	public void setFono(String fono) {
		this.fono = fono;
	}
	
	
}