package items;

import superclase.ElementoGrafico;

/**
 * Esta clase representa los diferentes obstáculos que el
 * jugador puede toparse en el camino.
 * @author Javier Roa
 *
 */
public class Obstaculo extends ElementoGrafico{
	/**
	 * Constructor del objeto Obstaculo	
	 * @param estilo (String) = Define color, forma, etc.
	 * @param alto (int) = Alto de la figura
	 * @param ancho (int) = Ancho de la figura
	 * @param posX (int) = Posición en el eje X
	 * @param posY (int) = Posición en el eje Y
	 */
	public Obstaculo(String estilo, int alto, int ancho, int posX, int posY) {
		super(estilo, alto, ancho, posX, posY);
	}
	/**
	 * Este método permite al obstaculo bajar.
	 */
	public void bajar() {
		this.setPosY(this.getPosY()-50); // Desciende 50 px
		System.out.println("El auto desciende");
	}
}
