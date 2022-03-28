package objetos;

import superclases.ElementoGrafico;

/**
 * Esta clase representa los bloques a destruir en el juego.
 * @author Javier Roa.
 *
 */
public class Bloque extends ElementoGrafico {
	
	private int numGolpes; // Define cuantos golpes requiere para ser destru�do
	private boolean poder; // Define si liberar� un poder al ser destru�do

	public Bloque(String estilo, String color, int alto, int ancho, int posX, int posY, int numGolpes, boolean poder) {
		super(estilo, color, alto, ancho, posX, posY);
		this.numGolpes = numGolpes;
		this.poder = poder;
	}

	/** M�todo accesador del atributo.
	 * @return numGolpes
	 */
	public int getNumGolpes() {
		return numGolpes;
	}
	/** M�todo mutador del atributo.
	 * @param numGolpes : int
	 */
	public void setNumGolpes(int numGolpes) {
		this.numGolpes = numGolpes;
	}
	/** M�todo accesador del atributo.
	 * @return poder
	 */
	public boolean isPoder() {
		return poder;
	}
	/** M�todo mutador del atributo.
	 * @param poder : boolean
	 */
	public void setPoder(boolean poder) {
		this.poder = poder;
	}
	/**
	 * Este m�todo permite a un bloque ser destru�do
	 */
	public void serDestruido() {
		if(this.numGolpes==0) {
			System.out.println("El bloque fue destru�do");
		}
	}
	/**
	 * Este m�todo permite a los bloques perder golpes de resistencia
	 * @param p representa la pelota en el juego.
	 */
	public void perderGolpes(Pelota p) {
		if (this.getPosX()==p.getPosX() && this.getPosY()==p.getPosY()) {
			this.numGolpes-=1;
			p.rebotar();
			System.out.println("El bloque perdi� un golpe de resistencia");
			serDestruido();
		}
	}
}	