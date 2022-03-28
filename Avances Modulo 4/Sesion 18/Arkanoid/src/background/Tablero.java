package background;

import objetos.Pelota;
import superclases.ElementoGrafico;

/**
 * Clase que representa el tablero de datos del juego.
 * @author Usuario
 *
 */
public class Tablero extends ElementoGrafico {

	private int puntos;
	private int vidas;
	
	/** Constructor de la clase
	 * @param estilo
	 * @param color
	 * @param alto
	 * @param ancho
	 * @param posX
	 * @param posY
	 * @param puntos
	 * @param vidas
	 */
	public Tablero(String estilo, String color, int alto, int ancho, int posX, int posY, int puntos, int vidas) {
		super(estilo, color, alto, ancho, posX, posY);

		this.puntos=puntos;
		this.vidas=vidas;
	}
	
	/** Método accesador del atributo.
	 * @return puntos
	 */
	public int getPuntos() {
		return puntos;
	}
	/** Método mutador del atributo.
	 * @param p
	 */
	public void setPuntos(Pelota p) {
		this.vidas=p.getVidas();
	}
	/** Método accesador del atributo.
	 * @return vidas
	 */
	public int getVidas() {
		return vidas;
	}
	/** Método mutador del atributo.
	 * @param p
	 */
	public void setVidas(Pelota p) {
		this.vidas=p.getVidas();
	}
}
