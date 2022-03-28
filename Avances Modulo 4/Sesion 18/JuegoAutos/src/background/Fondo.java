package background;

/**
 * Esta clase representa el fondo del juego "Carrera Coches"
 * @author Javier Roa.
 *
 */
public class Fondo {
	
	private String color; // Define el color del fondo
	private int alto; // Define el alto 
	private int ancho; // Define el ancho
	private int posX; // Define la posici�n del eje X
	private int posY; // Define la posici�n del eje Y
	
	/**
	 * Constructor de la clase Fondo
	 * @param estilo (String) = Define color, forma, etc.
	 * @param alto (int) = Alto de la figura
	 * @param ancho (int) = Ancho de la figura
	 * @param posX (int) = Posici�n en el eje X
	 * @param posY (int) = Posici�n en el eje Y
	 */
	public Fondo(String color, int alto, int ancho, int posX, int posY) {

		this.color = color;
		this.alto = alto;
		this.ancho = ancho;
		this.posX = posX;
		this.posY = posY;
	}
	/**
	 * M�todo para obtener un valor determinado.
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * M�todo que establece un valor determinado.
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * M�todo para obtener un valor determinado.
	 * @return alto
	 */
	public int getAlto() {
		return alto;
	}
	/**
	 * M�todo que establece un valor determinado.
	 * @param alto
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	/**
	 * M�todo para obtener un valor determinado.
	 * @return ancho
	 */
	public int getAncho() {
		return ancho;
	}
	/**
	 * M�todo que establece un valor determinado.
	 * @param ancho
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	/**
	 * M�todo para obtener un valor determinado.
	 * @return posX
	 */
	public int getPosX() {
		return posX;
	}
	/**
	 * M�todo que establece un valor determinado.
	 * @param posX
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * M�todo para obtener un valor determinado.
	 * @return posY
	 */
	public int getPosY() {
		return posY;
	}
	/**
	 * M�todo que establece un valor determinado.
	 * @param posY
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
