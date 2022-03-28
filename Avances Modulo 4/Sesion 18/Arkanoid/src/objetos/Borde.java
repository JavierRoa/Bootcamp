package objetos;

import superclases.ElementoGrafico;
/**
 * Esta clase representa los 3 bordes de la pantalla del juego
 * @author Javier Roa
 *
 */
public class Borde extends ElementoGrafico {

	public Borde(String estilo, String color, int alto, int ancho, int posX, int posY) {
		super(estilo, color, alto, ancho, posX, posY);
	}
	/**
	 * Este método limita el movimiento del jugador
	 * @param pl
	 */
	public void chocar(Jugador pl) {
		if (this.getPosX()==pl.getPosX())
		System.out.println("El jugador chocó con la pared, no puede avanzar más allá");
	}
}
