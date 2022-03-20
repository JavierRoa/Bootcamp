
public class Escenario {
	//Declaración de atributos
	private int alto;
	private int ancho;
	private String color;
	//Constructor
	public Escenario(int alto, int ancho, String color) {
		
		this.alto = alto;
		this.ancho = ancho;
		this.color = color;
	}
	//Getters and Setters
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}