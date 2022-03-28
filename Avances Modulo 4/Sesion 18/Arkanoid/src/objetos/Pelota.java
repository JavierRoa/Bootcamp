package objetos;

import superclases.ElementoGrafico;
/**
 * Esta clase representa a la pelota en el juego.
 * @author Javier Roa
 *
 */
public class Pelota extends ElementoGrafico {
	
	private int vidas;
	private int puntos;

	public Pelota(String estilo, String color, int alto, int ancho, int posX, int posY, int vidas, int puntos) {
		super(estilo, color, alto, ancho, posX, posY);

		this.vidas = 3;
		this.puntos = 0;
	}
	/**
	 * Este m�todo hace rebotar la pelota
	 */
	public void rebotar() {
		System.out.println("La pelota rebota");
	}
	/**
	 * Este m�todo hace a la pelota moverse en diagonal
	 * hacia arriba a la izquierda
	 */
	public void moverArribaIz() {
		System.out.println("La pelota se mueve hacia arriba a la izquierda");
	}
	/**
	 * Este m�todo hace a la pelota moverse en diagonal
	 * hacia arriba a la derecha
	 */
	public void moverArribaDer() {
		System.out.println("La pelota se mueve hacia arriba a la derecha");
	}
	/**
	 * Este m�todo hace a la pelota moverse en diagonal
	 * hacia abajo a la izquierda
	 */
	public void moverAbajoIz() {
		System.out.println("La pelota se mueve hacia abajo a la izquierda");
	}
	/**
	 * Este m�todo hace a la pelota moverse en diagonal
	 * hacia abajo a la derecha
	 */
	public void moverAbajoDer() {
		System.out.println("La pelota se mueve hacia abajo a la derecha");
	}
	/**
	 * Este m�todo permite perder vidas.
	 */
	public void perderVida() {
		if (this.getPosY()<0) {
			System.out.println("Pierdes una vida");
		}
	}
	/**
	 * Este m�todo permite el aumento del puntaje
	 * @param b Define el bloque golpeado
	 */
	public void ganarPuntos(Bloque b) {
		if (this.getPosX()==b.getPosX() && this.getPosY()==b.getPosY()) {
			System.out.println("ganas 100 puntos");
			this.rebotar();
			this.puntos+=100;
		}
	}
	/** M�todo accesador del atributo.
	 * @return vidas
	 */
	public int getVidas() {
		return vidas;
	}
	/** M�todo mutador del atributo.
	 * @param vidas vidas
	 */
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	/** M�todo accesador del atributo.
	 * @return puntos
	 */
	public int getPuntos() {
		return puntos;
	}
	/** M�todo mutador del atributo.
	 * @param puntos puntos
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}
