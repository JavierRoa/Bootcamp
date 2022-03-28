
package objetos;

import superclases.ElementoGrafico;

/** Clase que representa el power up.
 * @author Javier Roa.
 */
public class PowerUp extends ElementoGrafico {

	/** Constructor de la clase.
	 * @param estilo
	 * @param color
	 * @param alto
	 * @param ancho
	 * @param posX
	 * @param posY
	 */
	public PowerUp(String estilo, String color, int alto, int ancho, int posX, int posY) {
		super(estilo, color, alto, ancho, posX, posY);
	}

	public void caer() {
		System.out.println("El poder cae");
	}
}
