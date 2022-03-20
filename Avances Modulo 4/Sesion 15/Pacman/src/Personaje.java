
public class Personaje {
	//Declaraci�n de atributos
	private String color;
	private int alto;
	private int ancho;
	private int posX;
	private int posY;
	private String orientacion;
	//Constructor
	public Personaje(String color, int alto, int ancho, int posX, int posY, String orientacion) {
	
		this.color = color;
		this.alto = alto;
		this.ancho = ancho;
		this.posX = posX;
		this.posY = posY;
		this.orientacion = orientacion;
	}
	/** Este m�todo permite al personaje moverse hacia arriba
	 * 	
	 */
	public void moverseArriba() {
		System.out.println("El personaje se est� moviendo hacia arriba");
	}
	/** Este m�todo permite al personaje moverse hacia abajo
	 * 
	 */
	public void moverseAbajo() {
		System.out.println("El personaje se est� moviendo hacia abajo");
	}
	/** Este m�todo permite al personaje moverse hacia la 
	 * izquierda
	 */
	public void moverseIzquierda() {
		System.out.println("El personaje se est� moviendo a la izquierda");
	}
	/** Este m�todo permite al personaje moverse hacia la
	 * derecha
	 */
	public void moverseDerecha() {
		System.out.println("El personaje se est� moviendo a la derecha");
	}
	/** Este m�todo permite morir al personaje
	 */
	public void morir() {
		System.out.println("El personaje muri�");
	}
	//Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public String getOrientacion() {
		return orientacion;
	}
	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}
}
