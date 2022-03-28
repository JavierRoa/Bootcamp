package background;

import superclases.ElementoGrafico;
/**
 * Esta clase representa la imagen de fondo del juego.
 * @author Javier Roa.
 *
 */
public class Fondo extends ElementoGrafico {

	/** Constructor de la clase.
	 * @param estilo
	 * @param color
	 * @param alto
	 * @param ancho
	 * @param posX
	 * @param posY
	 */
	public Fondo(String estilo, String color, int alto, int ancho, int posX, int posY) {
		super(estilo, color, alto, ancho, posX, posY);
	}
}
