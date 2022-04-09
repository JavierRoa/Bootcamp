package objetos;
/**
 * Clase que representa la fecha de las mantenciones.
 * @author Javier Roa.
 *
 */
public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	/** Constructor de la clase Fecha.
	 * @param dia - int: representa el n�mero del d�a en el que se realiza una mantenci�n
	 * @param mes - int: representa el n�mero del mes en el que se realiza una mantenci�n
	 * @param anio - int: representa el n�mero del a�o en el que se realiza una mantenci�n
	 */
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	/**
	 * Constructor de la clase Fecha (con par�metros definidos)
	 */
	public Fecha() {

		this.dia = 31;
		this.mes = 03;
		this.anio = 2022;
	}
	/**
	 * M�todo de impresi�n de la fecha.
	 * @return info
	 */
	public String impresion() {
		String info = this.dia+"/"+this.mes+"/"+this.anio;	
		return info;
	}
	@Override
	public String toString() {
		String info = String.format("%02d", this.dia)+"/"+String.format("%02d", this.mes)+"/"+this.anio;	
		return info;
	}
	/** M�todo accesador del atributo dia
	 * @return dia
	 */
	public int getDia() {
		return dia;
	}
	/** M�todo mutador del atributo dia
	 * @param dia - int: representa el n�mero del d�a en el que se realiza una mantenci�n
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/** M�todo accesador del atributo mes
	 * @return mes - int
	 */
	public int getMes() {
		return mes;
	}
	/** M�todo mutador del atributo mes
	 * @param mes - int: representa el n�mero del mes en el que se realiza una mantenci�n
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/** M�todo accesador del atributo anio
	 * @return anio
	 */
	public int getAnio() {
		return anio;
	}
	/** M�todo mutador del atributo anio
	 * @param anio - int: representa el n�mero del a�o en el que se realiza una mantenci�n
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
}