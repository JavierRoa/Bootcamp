package background;

public class Escenario {
	//Declaración de atributos
	private int alto;
	private int ancho;
	private String disenio;
	//Constructor
	public Escenario(int alto, int ancho, String disenio) {
		
		this.alto = alto;
		this.ancho = ancho;
		this.disenio = disenio;
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
	public String getDisenio() {
		return disenio;
	}
	public void setDisenio(String disenio) {
		this.disenio = disenio;
	}
}