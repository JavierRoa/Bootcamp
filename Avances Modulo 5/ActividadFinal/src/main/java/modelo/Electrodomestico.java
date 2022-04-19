package modelo;

public class Electrodomestico {

	private int id;
	private String electrodomestico;
	
	public Electrodomestico(int id, String electrodomestico) {

		this.id = id;
		this.electrodomestico = electrodomestico;
	}
	
	public Electrodomestico(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getElectrodomestico() {
		return electrodomestico;
	}
	public void setElectrodomestico(String electrodomestico) {
		this.electrodomestico = electrodomestico;
	}
}
