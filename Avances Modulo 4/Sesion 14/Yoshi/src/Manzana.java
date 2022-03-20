
public class Manzana {
	//Declaracion de atributos
	private String color;
	//Constructor
	public Manzana(String color) {
		this.color = color;
	}
	//Este método permite que Yoshi pueda ingerir una manzana
	public void ingerida(Yoshi yoshiv) {
		System.out.println("Esta manzana ha sido comida por " + yoshiv.getNombre());
	}
	//Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}