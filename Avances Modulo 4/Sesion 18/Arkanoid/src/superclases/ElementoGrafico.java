package superclases;

/**
 * Clase que representa los elementos gráficos en el juego "Arkanoid"
 * @author Javier Roa
 *
 */
public abstract class ElementoGrafico {
	
	private String estilo; // Define el diseño del objeto (bloque, paleta, pared)
	private String color; // Define el color del objeto
	private int alto; // Define el alto del objeto
	private int ancho; // Define el ancho del objeto
	private int posX; // Define la posición en el eje X
	private int posY; // Define la posición en el eje Y
	
	/**
	 * Constructor de la superclase ElementoGrafico
	 * @param estilo (String) = Define cual de varios diseños tiene el objeto
	 * @param color (String) = Define el color del objeto
	 * @param alto (int) = Alto de la figura
	 * @param ancho (int) = Ancho de la figura
	 * @param posX (int) = Posición en el eje X
	 * @param posY (int) = Posición en el eje Y
	 */
	public ElementoGrafico(String estilo, String color, int alto, int ancho, int posX, int posY) {
		
		this.estilo = estilo;
		this.color = color;
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
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Este método se usa para establecer un dato
	 * @param color (String) = Define color
	 */
	public void setColor(String color) {
		this.color = color;
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