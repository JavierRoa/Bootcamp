
public class Yoshi {
	//Se declaran atributos
	private String color;
	private String nombre;
	private Botas boots;
	//Constructor
	public Yoshi(String color, String nombre, Botas boots) {
		this.color = color;
		this.nombre = nombre;
		this.boots = boots;
	}
	//Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.color = nombre;
	}
	public Botas getBotas() {
		return boots;
	}
	public void setBotas(Botas boots) {
		this.boots = boots;
	}
}