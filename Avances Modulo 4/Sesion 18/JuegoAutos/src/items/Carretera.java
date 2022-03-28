package items;

import autos.AutoJugador;
import superclase.ElementoGrafico;

/**
 * Clase que representa la carretera en el juego "Carrera Coches"
 * @author Javier Roa
 *
 */
public class Carretera extends ElementoGrafico {
	/**
	 * Constructor de la clase Carretera
	 * @param estilo (String) = Define color, forma, etc.
	 * @param alto (int) = Alto de la figura
	 * @param ancho (int) = Ancho de la figura
	 * @param posX (int) = Posición en el eje X
	 * @param posY (int) = Posición en el eje Y
	 */
	public Carretera(String estilo, int alto, int ancho, int posX, int posY) {
		super(estilo, alto, ancho, posX, posY);
	}
	/**
	 * Este método permite acelerar al auto del jugador
	 * @param a
	 */
	public void acelerarAuto(AutoJugador a) {
		System.out.println("El auto corre más rápido");
	}
}
