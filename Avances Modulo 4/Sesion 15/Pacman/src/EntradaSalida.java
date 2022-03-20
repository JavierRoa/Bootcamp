
public class EntradaSalida {
	//Declaraci�n de atributos
	private int alto;
	private int ancho;
	//Constructor
	public EntradaSalida(int alto, int ancho) {

		this.alto = alto;
		this.ancho = ancho;
	}
	//Este m�todo permite mover a Pacman a la otra entrada/salida.
	public void telePacman () {
		System.out.println("Pacman desaparece y aparece por la otra entrada/salida");
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
}
