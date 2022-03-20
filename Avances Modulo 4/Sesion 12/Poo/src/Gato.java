
public class Gato {
	
	private String nombre;
	private String raza;
	private float altura;
	private String color;
	
	public Gato(String nombre, String raza, float altura, String color) {

		this.nombre = nombre;
		this.raza = raza;
		this.altura = altura;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
