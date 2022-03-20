
public class BloqueL extends Terreno{
	//Se declaran los atributos
	private String base;
	private String vertical;
	//Constructor
	public BloqueL(int largo, int alto, int posX, int posY, String base, String vertical) {
		super(largo, alto, posX, posY);
		
		this.base = base;
		this.vertical = vertical;
	}
	// Getters and Setters
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getVertical() {
		return vertical;
	}
	public void setVertical(String vertical) {
		this.vertical = vertical;
	}	
}