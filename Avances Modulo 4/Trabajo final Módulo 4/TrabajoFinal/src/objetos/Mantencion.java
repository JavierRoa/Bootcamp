package objetos;
/**
 * Clase que representa las mantenciones realizadas.
 * @author Javier Roa.
 *
 */
public class Mantencion {

	private String tipoMan;
	private String obs;
	private int monto;
	private Fecha fecha;
	private Auto auto;
	/** Constructor de la clase Mantencion
	 * @param tipoMan - String: representa el tipo de mantención realizada.
	 * @param obs - String: representa las observaciones hechas por el usuario.
	 * @param monto - int: representa el costo del servicio.
	 * @param fecha - Fecha: representa la fecha en la que se realiza la mantención
	 * @param auto - Auto: representa los datos del auto al que se le realizó la mantención
	 */
	public Mantencion(String tipoMan, String obs, int monto, Fecha fecha, Auto auto) {

		this.tipoMan = tipoMan;
		this.obs = obs;
		this.monto = monto;
		this.fecha = fecha;
		this.auto = auto;
	}
	/**
	 * Constructor de la clase Mantencion
	 *
	 */
	public Mantencion() {

		this.tipoMan = "Cambio de aceite";
		this.obs = "Auto en perfecto estado";
		this.monto = 20000;
		this.fecha = new Fecha(31, 03, 2020);
		this.auto = new Auto();
	}
	/**
	 * Método de impresión que proporciona los datos de una mantención.
	 * @return info
	 */
	public String impresion() {
		String info = "Servicio: "+this.tipoMan+" Observaciones: "+this.obs+" Monto: "+this.monto+" Fecha: "+this.fecha.getDia()+"/"+this.fecha.getMes()+"/"+this.fecha.getAnio()+" Auto: "+this.auto.getPatente();	
		return info;
	}			
	@Override
	public String toString() {
		String info = "Servicio: "+this.tipoMan+"\nObservaciones: "+this.obs+"\nMonto: "+this.monto+"\nFecha: "+String.format("%02d", this.fecha.getDia())+"/"+String.format("%02d", this.fecha.getMes())+"/"+this.fecha.getAnio()+"\nAuto: "+this.auto.getPatente();	
		return info;
	}			
	/** Método accesador del atributo tipoMan
	 * @return tipoMan
	 */
	public String getTipoMan() {
		return tipoMan;
	}
	/** Método mutador del atributo tipoMan
	 * @param tipoMan - representa el tipo de mantención realizada
	 */
	public void setTipoMan(String tipoMan) {
		this.tipoMan = tipoMan;
	}
	/** Método accesador del atributo obs
	 * @return obs
	 */
	public String getObs() {
		return obs;
	}
	/** Método mutador del atributo obs
	 * @param obs - String: representa las observaciones hechas por el usuario.
	 */
	public void setObs(String obs) {
		this.obs = obs;
	}
	/** Método accesador del atributo monto
	 * @return monto
	 */
	public int getMonto() {
		return monto;
	}
	/** Método mutador del atributo monto
	 * @param monto - int: representa el costo de la mantención
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}
	/** Método accesador del atributo fecha
	 * @return fecha
	 */
	public Fecha getFecha() {
		return fecha;
	}
	/** Método mutador del atributo fecha
	 * @param fecha - Fecha: representa la fecha en la que se realiza la mantención
	 */
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	/** Método accesador del atributo auto
	 * @return auto
	 */
	public Auto getAuto() {
		return auto;
	}
	/** Método mutador del atributo auto
	 * @param auto - Auto: representa los datos del objeto Auto, al que se le realiza la mantención
	 */
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	
	
}