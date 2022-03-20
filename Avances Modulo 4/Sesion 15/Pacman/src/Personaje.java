
public class Personaje {
	//Declaración de atributos
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
	/** Este método permite al personaje moverse hacia arriba
	 * 	
	 */
	public void moverseArriba() {
		System.out.println("El personaje se está moviendo hacia arriba");
	}
	/** Este método permite al personaje moverse hacia abajo
	 * 
	 */
	public void moverseAbajo() {
		System.out.println("El personaje se está moviendo hacia abajo");
	}
	/** Este método permite al personaje moverse hacia la 
	 * izquierda
	 */
	public void moverseIzquierda() {
		System.out.println("El personaje se está moviendo a la izquierda");
	}
	/** Este método permite al personaje moverse hacia la
	 * derecha
	 */
	public void moverseDerecha() {
		System.out.println("El personaje se está moviendo a la derecha");
	}
	/** Este método permite morir al personaje
	 */
	public void morir() {
		System.out.println("El personaje murió");
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
