package superclases;

public class Terreno {
	//Declaracion de atributos:
	private int largo;
	private int alto;
	private int posX;
	private int posY;
	//Constructor:
	public Terreno(int largo, int alto, int posX, int posY) {

		this.largo = largo;
		this.alto = alto;
		this.posX = posX;
		this.posY = posY;
			
	}
	//Getters and Setters
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
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
}