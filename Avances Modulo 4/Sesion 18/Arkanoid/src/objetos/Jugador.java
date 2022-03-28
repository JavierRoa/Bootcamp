package objetos;
import superclases.ElementoGrafico;
/**
 * Esta clase representa al jugador.
 * @author Javier Roa
 *
 */
public class Jugador extends ElementoGrafico {

	private String powerUp; // Define qué poder posee el jugador
	
	public Jugador(String estilo, String color, int alto, int ancho, int posX, int posY, String powerUp) {
		super(estilo, color, alto, ancho, posX, posY);

		this.powerUp = powerUp;	
	}
	/**
	 * Este método permite al jugador moverse a la izquierda
	 */
	public void moverIzquierda() {
		System.out.println("Te mueves a la izquierda");
	}
	/**
	 * Este método permite al jugador moverse a la derecha
	 */
	public void moverDerecha() {
		System.out.println("Te mueves a la derecha");
	}
	/**
	 * Este método obtiene el poder actual del jugador
	 * @return powerUp
	 */
	public String getPowerUp() {
		return powerUp;
	}
	/**
	 * Este método establece el nuevo poder del jugador
	 * @param powerUp
	 */
	public void setPowerUp(String powerUp) {
		this.powerUp = powerUp;
	}
	/**
	 * Este método permite al jugador conseguir un poder.
	 * @param pu representa el poder conseguido por el jugador
	 */
	public void obtenerPoder(PowerUp pu) {
		if (this.getPosX()==pu.getPosX()) {
			System.out.println("Has recibido un Power Up!");
			this.setPowerUp(pu.getEstilo());
		}
	}
}
