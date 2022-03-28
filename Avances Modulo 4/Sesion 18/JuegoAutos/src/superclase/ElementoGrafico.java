package superclase;

/**
 * Clase que representa los elementos gráficos en el juego "Carrera Coches"
 * @author Javier Roa
 *
 */
public class ElementoGrafico {

	private String estilo; // Define el diseño del obstáculo (arbol, piedra, auto)
	private int alto; // Define el alto de la figura
	private int ancho; // Define el ancho de la figura
	private int posX; // Define la posición de la calle en el eje X
	private int posY; // Define la posición de la calle en el eje Y
	
	/**
	 * Constructor de la superclase ElementoGrafico
	 * @param estilo (String) = Define color, forma, etc.
	 * @param alto (int) = Alto de la figura
	 * @param ancho (int) = Ancho de la figura
	 * @param posX (int) = Posición en el eje X
	 * @param posY (int) = Posición en el eje Y
	 */
	public ElementoGrafico(String estilo, int alto, int ancho, int posX, int posY) {
		
		this.estilo = estilo;
		this.alto = alto;
		this.ancho = ancho;
		this.posX = posX;
		this.posY = posY;
	}
	/**
	 * Este método se usa para obtener un dato en concreto
	 * @return estilo
	 */
	public String getEstilo() {
		return estilo;
	}
	/**
	 * Este método se usa para establecer un dato
	 * @param estilo (String) = Define la forma, color, etc.
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	/**
	 * Este método se usa para obtener un dato en concreto
	 * @return alto
	 */
	public int getAlto() {
		return alto;
	}
	/**
	 * Este método se usa para establecer un dato
	 * @param estilo (int) = Define el alto de la figura.
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	/**
	 * Este método se usa para obtener un dato en concreto
	 * @return ancho
	 */
	public int getAncho() {
		return ancho;
	}
	/**
	 * Este método se usa para establecer un dato
	 * @param estilo (int) = Define el ancho de la figura.
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	/**
	 * Este método se usa para obtener un dato en concreto
	 * @return posX
	 */
	public int getPosX() {
		return posX;
	}
	/**
	 * Este método se usa para establecer un dato
	 * @param estilo (int) = Posición en el eje X.
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * Este método se usa para obtener un dato en concreto
	 * @return posY
	 */
	public int getPosY() {
		return posY;
	}
	/**
	 * Este método se usa para establecer un dato
	 * @param estilo (int) = Posición en el eje Y.
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
}