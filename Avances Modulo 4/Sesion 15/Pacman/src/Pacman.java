
/**
 * @author Javier Roa
 *
 */
public class Pacman extends Personaje {
	
	public Pacman(String color, int alto, int ancho, int posX, int posY, String orientacion) {
		super(color, alto, ancho, posX, posY, orientacion);

	}
	/** Este m�todo permite a Pacman tragar un punto.
	 */
	public void tragarPunto() {
		System.out.println("Pacman se trag� un punto");
	}
	/** Este m�todo permite obtener PowerUp al tragar el
	 * punto adecuado.
	 */
	public void tragarPowerUp() {
		System.out.println("Pacman se trag� un Power Up");
	}
}
