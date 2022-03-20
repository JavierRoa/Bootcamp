package background;

import superclases.Terreno;

public class Arbol extends Terreno {
	// Declaraci�n de atributos propios.
	private String color;
	private boolean destructible;
	// Constructor
	public Arbol(int largo, int alto, int posX, int posY, String color, boolean destructible) {
		super(largo, alto, posX, posY);
		
		this.color = color;
		this.destructible = destructible;
	}
	/** Este m�todo determina si el arbol puede o no
	 * ser destru�do.
	 */
	public void destruido() {
		if(this.destructible==true) {
			System.out.println("El �rbol puede ser destru�do");
		}
		else {
			System.out.println("El �rbol no puede ser destru�do");
		}
	}	
	// Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isDestructible() {
		return destructible;
	}
	public void setDestructible(boolean destructible) {
		this.destructible = destructible;
	}
}