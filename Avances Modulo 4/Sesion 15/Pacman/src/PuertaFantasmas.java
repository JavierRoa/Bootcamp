
public class PuertaFantasmas extends Terreno {
	//Declaración de atributos
	private boolean horizontal;
	//Constructor
	public PuertaFantasmas(int largo, int alto, int posX, int posY, boolean horizontal) {
		super(largo, alto, posX, posY);

		this.horizontal = horizontal;
	}
	//Getters and Setters
	public boolean isHorizontal() {
		return horizontal;
	}
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}
}