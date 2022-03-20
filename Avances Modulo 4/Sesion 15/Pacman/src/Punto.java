
public class Punto {
	//Declaracion de atributos:
	private boolean grande;
	private String color;
	private int alto;
	private int ancho;
	private int posX;
	private int posY;
	//Constructor:
	public Punto(boolean grande, String color, int alto, int ancho, int posX, int posY) {

		this.grande = grande;
		this.color = color;
		this.alto = alto;
		this.ancho = ancho;
		this.posX = posX;
		this.posY = posY;
	}
	//Getters and Setters
	public boolean isGrande() {
		return grande;
	}
	public void setGrande(boolean grande) {
		this.grande = grande;
	}
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
	//Métodos propios
	/** Este método permite al punto desaparecer
	 * de la pantalla.
	 */
	public void serComido() {
		System.out.println("El punto ha sido comido");
	}
	/**
	 * Este método permite otorgar (o no) un poder,
	 * dependiendo de la caracteristica del punto.
	 */
	public void poder() {
		if(grande==true) {
			serComido();
			System.out.println("Pacman ganó un power up!");
		}
		else {
			serComido();
		}
	}
}
