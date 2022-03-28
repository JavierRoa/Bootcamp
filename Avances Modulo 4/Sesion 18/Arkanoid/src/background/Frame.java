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

	private Fondo f; // Composición: Instancia clase Fondo
	private Tablero t; // Composición: Instancia clase Tablero
	private Jugador pl; // Composición: Instancia clase Jugador
	private Borde b; // Composición: Instancia clase Borde
	private Pelota p; // Agregación: Instancia clase Pelota
	private Bloque bl; // Agregación: Instancia clase Bloque
	private PowerUp pu; // Agregación: Instancia clase PowerUp
	
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
	
	/** Método accesador del atributo.
	 * @return f
	 */
	public Fondo getF() {
		return f;
	}
	/** Método mutador del atributo.
	 * @param f f
	 */
	public void setF(Fondo f) {
		this.f = f;
	}
	/** Método accesador del atributo.
	 * @return t
	 */
	public Tablero getT() {
		return t;
	}
	/** Método mutador del atributo.
	 * @param t t
	 */
	public void setT(Tablero t) {
		this.t = t;
	}
	/** Método accesador del atributo.
	 * @return pl
	 */
	public Jugador getPl() {
		return pl;
	}
	/** Método mutador del atributo.
	 * @param pl pl
	 */
	public void setPl(Jugador pl) {
		this.pl = pl;
	}
	/** Método accesador del atributo.
	 * @return b
	 */
	public Borde getB() {
		return b;
	}
	/** Método mutador del atributo.
	 * @param b b
	 */
	public void setB(Borde b) {
		this.b = b;
	}
	/** Método accesador del atributo.
	 * @return p
	 */
	public Pelota getP() {
		return p;
	}
	/** Método mutador del atributo.
	 * @param p p
	 */
	public void setP(Pelota p) {
		this.p = p;
	}
	/** Método accesador del atributo.
	 * @return bl
	 */
	public Bloque getBl() {
		return bl;
	}
	/** Método mutador del atributo.
	 * @param bl bl
	 */
	public void setBl(Bloque bl) {
		this.bl = bl;
	}
	/** Método accesador del atributo.
	 * @return pu
	 */
	public PowerUp getPu() {
		return pu;
	}
	/** Método mutador del atributo.
	 * @param pu pu
	 */
	public void setPu(PowerUp pu) {
		this.pu = pu;
	}
	
	
	
}
