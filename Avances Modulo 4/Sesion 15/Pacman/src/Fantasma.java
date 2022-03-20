
public class Fantasma extends Personaje {
	//Se declaran los atributos
	private boolean forma;
	//Constructor
	public Fantasma(String color, int alto, int ancho, int posX, int posY, String orientacion) {
		super(color, alto, ancho, posX, posY, orientacion);
		this.forma=true;
	}
	// Getters and Setters
	public boolean isForma() {
		return forma;
	}
	public void setForma(boolean forma) {
		this.forma = forma;
	}
	/** Este método permite cambiar la forma del fantasma
	 */
	public void cambiarForma() {
		if(forma==true) {
			forma=false;
		}
		else {
			forma=true;
		}
	}
}