package background;

import objetos.Bloque;
import objetos.Borde;
import objetos.Jugador;
import objetos.Pelota;
import objetos.PowerUp;
/**
 * Esta clase contiene los objetos del juego.
 * @author Javier Roa.
 *
 */
public class Frame {

	private Fondo f; // Composici�n: Instancia clase Fondo
	private Tablero t; // Composici�n: Instancia clase Tablero
	private Jugador pl; // Composici�n: Instancia clase Jugador
	private Borde b; // Composici�n: Instancia clase Borde
	private Pelota p; // Agregaci�n: Instancia clase Pelota
	private Bloque bl; // Agregaci�n: Instancia clase Bloque
	private PowerUp pu; // Agregaci�n: Instancia clase PowerUp
	
	/** Constructor de la clase.
	 * @param f
	 * @param t
	 * @param pl
	 * @param b
	 * @param p
	 * @param bl
	 * @param pu
	 */
	public Frame(Fondo f, Tablero t, Jugador pl, Borde b, Pelota p, Bloque bl, PowerUp pu) {
		super();
		this.f = f;
		this.t = t;
		this.pl = pl;
		this.b = b;
		this.p = p;
		this.bl = bl;
		this.pu = pu;
	}
	
	/** M�todo accesador del atributo.
	 * @return f
	 */
	public Fondo getF() {
		return f;
	}
	/** M�todo mutador del atributo.
	 * @param f f
	 */
	public void setF(Fondo f) {
		this.f = f;
	}
	/** M�todo accesador del atributo.
	 * @return t
	 */
	public Tablero getT() {
		return t;
	}
	/** M�todo mutador del atributo.
	 * @param t t
	 */
	public void setT(Tablero t) {
		this.t = t;
	}
	/** M�todo accesador del atributo.
	 * @return pl
	 */
	public Jugador getPl() {
		return pl;
	}
	/** M�todo mutador del atributo.
	 * @param pl pl
	 */
	public void setPl(Jugador pl) {
		this.pl = pl;
	}
	/** M�todo accesador del atributo.
	 * @return b
	 */
	public Borde getB() {
		return b;
	}
	/** M�todo mutador del atributo.
	 * @param b b
	 */
	public void setB(Borde b) {
		this.b = b;
	}
	/** M�todo accesador del atributo.
	 * @return p
	 */
	public Pelota getP() {
		return p;
	}
	/** M�todo mutador del atributo.
	 * @param p p
	 */
	public void setP(Pelota p) {
		this.p = p;
	}
	/** M�todo accesador del atributo.
	 * @return bl
	 */
	public Bloque getBl() {
		return bl;
	}
	/** M�todo mutador del atributo.
	 * @param bl bl
	 */
	public void setBl(Bloque bl) {
		this.bl = bl;
	}
	/** M�todo accesador del atributo.
	 * @return pu
	 */
	public PowerUp getPu() {
		return pu;
	}
	/** M�todo mutador del atributo.
	 * @param pu pu
	 */
	public void setPu(PowerUp pu) {
		this.pu = pu;
	}
	
	
	
}
