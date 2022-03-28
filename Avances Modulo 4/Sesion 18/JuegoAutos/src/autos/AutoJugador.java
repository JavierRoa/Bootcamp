package autos;

import items.Obstaculo;
import superclase.ElementoGrafico;

/**
 * Clase que representa al auto del jugador en el juego "Carrera Coches"
 * @author Javier Roa
 *
 */
public class AutoJugador extends ElementoGrafico {
	
	private int vidas;
	/**
	 * Constructor del objeto AutoJugador	
	 * @param estilo (String) = Define color, forma, etc.
	 * @param alto (int) = Alto de la figura
	 * @param ancho (int) = Ancho de la figura
	 * @param posX (int) = Posición en el eje X
	 * @param posY (int) = Posición en el eje Y
	 */
	public AutoJugador(String estilo, int alto, int ancho, int posX, int posY, int vidas) {
		super(estilo, alto, ancho, posX, posY);
		
		this.vidas=1;
	}
	/**
	 * Este método permite la colisión entre el jugador y 
	 * los obstáculos
	 * @param ob Define el obstaculo con el que se choca
	 */
	public void chocar(Obstaculo ob) {
		this.vidas=0;
		System.out.println("Fin del juego");	
	}
	
	/**
	 * Este método permite que el auto se mueva a la izquierda
	 */
	public void moverIzquierda() {
		System.out.println("El auto se mueve a la izquierda");
	}
	/**
	 * Este método permite que el auto se mueva a la derecha
	 */
	public void moverDerecha() {
		System.out.println("El auto se mueve a la derecha");
	}
	/**
	 * Este método permite que el auto se mueva hacia arriba
	 */
	public void moverArriba() {
		System.out.println("El auto se mueve hacia arriba");
	}
	/**
	 * Este método permite que el auto se mueva hacia abajo
	 */
	public void moverAbajo() {
		System.out.println("El auto se mueve hacia abajo");
	}
	/** Método accesador del atributo.
	 * @return vidas
	 */
	public int getVidas() {
		return vidas;
	}
	/** Método mutador del atributo.
	 * @param vidas
	 */
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
}
