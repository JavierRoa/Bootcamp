
public class Luigi {
	// Se declaran los atributos
	private String nombre;
	//Constructor
	public Luigi(String nombre) {
		this.nombre = nombre;
	}
	// Este método permite que luigi monte a yoshi
	public void montarYoshi(Yoshi yoshiv) {
		System.out.println("Luigi monta a " + yoshiv.getNombre() + " de color " + yoshiv.getColor());
	}
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}