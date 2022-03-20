package personajes;

import superclases.Avatar;

public class Lea extends Avatar {
	// Declaración de atributos propios.
	private boolean manLea;
	private boolean ninjaLea;
	// Constructor
	public Lea(String clase, int alto, int ancho, int posX, int posY, boolean vivo, boolean sentado,
			String orientacion, boolean manLea, boolean ninjaLea) {
		super(clase, alto, ancho, posX, posY, vivo, sentado, orientacion);

		this.manLea=manLea;
		this.ninjaLea=ninjaLea;
	}
	/** Este método permite a Lea transformarse en su versión
	 * "Man Lea", o volver a la normalidad.
	 */
	public void cambioMan() {
		if(this.manLea==false) {
			this.manLea=true;
			System.out.println("Lea se transforma en Man Lea");
		}
		else {
			this.manLea=false;
			System.out.println("Man Lea se transforma en Lea");
		}
	}
	/** Este método permite a Lea transormarse en su versión
	 * "Ninja Lea", o volver a la normalidad.
	 */
	public void cambioNinja() {
		if(this.ninjaLea==false) {
			this.ninjaLea=true;
			System.out.println("Lea se transforma en Ninja Lea");
		}
		else {
			this.ninjaLea=false;
			System.out.println("Ninja Lea se transforma en Lea");
		}
	}
	// Getters and Setters
	public boolean isManLea() {
		return manLea;
	}
	public void setManLea(boolean manLea) {
		this.manLea = manLea;
	}
	public boolean isNinjaLea() {
		return ninjaLea;
	}
	public void setNinjaLea(boolean ninjaLea) {
		this.ninjaLea = ninjaLea;
	}
}