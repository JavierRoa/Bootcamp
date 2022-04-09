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
	 * @param dia - int: representa el número del día en el que se realiza una mantención
	 * @param mes - int: representa el número del mes en el que se realiza una mantención
	 * @param anio - int: representa el número del año en el que se realiza una mantención
	 */
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	/**
	 * Constructor de la clase Fecha (con parámetros definidos)
	 */
	public Fecha() {

		this.dia = 31;
		this.mes = 03;
		this.anio = 2022;
	}
	/**
	 * Método de impresión de la fecha.
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
	/** Método accesador del atributo dia
	 * @return dia
	 */
	public int getDia() {
		return dia;
	}
	/** Método mutador del atributo dia
	 * @param dia - int: representa el número del día en el que se realiza una mantención
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/** Método accesador del atributo mes
	 * @return mes - int
	 */
	public int getMes() {
		return mes;
	}
	/** Método mutador del atributo mes
	 * @param mes - int: representa el número del mes en el que se realiza una mantención
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/** Método accesador del atributo anio
	 * @return anio
	 */
	public int getAnio() {
		return anio;
	}
	/** Método mutador del atributo anio
	 * @param anio - int: representa el número del año en el que se realiza una mantención
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
}