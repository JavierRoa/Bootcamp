
public class BloqueT extends Terreno{
	//Se declaran los atributos
	private String techo;
	//Constructor
	public BloqueT(int largo, int alto, int posX, int posY, String techo) {
		super(largo, alto, posX, posY);

		this.techo = techo;
	}
	// Getters and Setters
	public String getTecho() {
		return techo;
	}
	public void setTecho(String techo) {
		this.techo = techo;
	}
}