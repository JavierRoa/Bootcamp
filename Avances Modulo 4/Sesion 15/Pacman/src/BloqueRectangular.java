
public class BloqueRectangular extends Terreno{
	//Se declaran los atributos
	private boolean vertical;
	//Constructor
	public BloqueRectangular(int largo, int alto, int posX, int posY, boolean vertical) {
		super(largo, alto, posX, posY);

		this.vertical = vertical;
	}
	// Getters and Setters
	public boolean isVertical() {
		return vertical;
	}
	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}
}