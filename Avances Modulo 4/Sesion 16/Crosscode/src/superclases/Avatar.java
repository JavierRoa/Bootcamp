package superclases;

import interfaces.movimiento;
import personajes.Lea;
import personajes.Triblader;

public class Avatar implements movimiento {
	// Declaración de atributos
	private String clase;
	private int alto;
	private int ancho;
	private int posX;
	private int posY;
	private boolean vivo;
	private boolean sentado;
	private String orientacion;
	// Constructor
	public Avatar(String clase, int alto, int ancho, int posX, int posY, boolean vivo, boolean sentado,
			String orientacion) {

		this.clase = clase;
		this.alto = alto;
		this.ancho = ancho;
		this.posX = posX;
		this.posY = posY;
		this.vivo = vivo;
		this.sentado = sentado;
		this.orientacion = orientacion;
	}
	// Métodos obtenidos de la interfaz "movimiento"
	@Override
	public void moverArriba() {
		if(true)
		System.out.println();
	}
	@Override
	public void moverAbajo() {
		System.out.println();
	}
	@Override
	public void moverIzquierda() {
		System.out.println();
	}
	@Override
	public void moverDerecha() {
		System.out.println();
	}
	@Override
	public void saltarArriba() {
		System.out.println();
	}
	@Override
	public void saltarAbajo() {
		System.out.println();
	}
	@Override
	public void saltarIzquierda() {
		System.out.println();
	}
	/** Este método permite al personaje saltar a la derecha
	 */
	@Override
	public void saltarDerecha() {
		System.out.println("Salta a la derecha");
	}
	/** Este método permite al personaje sentarse y levantarse
	 */
	@Override
	public void sentarLevantar(Avatar a) {
		if(a instanceof Lea) {
			if(this.sentado==false) {
				this.sentado=true;
				System.out.println("Lea se sienta");
			}
			else {
				this.sentado=false;
				System.out.println("Lea se levanta");
			}
		}
		if(a instanceof Triblader) {		
			if(this.sentado==false) {
				this.sentado=true;
				System.out.println("Triblader se sienta");
			}
			else {
				this.sentado=false;
				System.out.println("Triblader se levanta");
			}
		}	
	}
	// Getters and Setters
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
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
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public boolean isSentado() {
		return sentado;
	}
	public void setSentado(boolean sentado) {
		this.sentado = sentado;
	}
	public String getOrientacion() {
		return orientacion;
	}
	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}
}