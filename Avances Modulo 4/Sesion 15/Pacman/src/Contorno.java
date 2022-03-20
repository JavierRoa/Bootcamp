
public class Contorno {
	// Declaración de atributos
	private int alto;
	private int ancho;
	private int grosor;
	
	//Constructor
	public Contorno(int alto, int ancho, int grosor) {

		this.alto = alto;
		this.ancho = ancho;
		this.grosor = grosor;
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
	public int getGrosor() {
		return grosor;
	}
	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}
}
