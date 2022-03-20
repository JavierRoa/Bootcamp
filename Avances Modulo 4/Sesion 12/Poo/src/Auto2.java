
public class Auto2 {
	
	private String patente;
	private String marca;
	private String modelo;
	private String color;
	private int anio;
	private boolean encendido = false;
	private int estanque;
	
	public Auto2(String patente, String marca, String modelo, String color, int anio) {

		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.estanque = 10;
	}
	
	public void cargarCombustible(int cant) {
		this.estanque=this.estanque+cant;
	}

	public boolean isEncendido() {
		return encendido;
	}
	
	public void encender() {
		if (this.estanque>0) {
			if(encendido==false) {
				System.out.println("El auto está encendido");
				this.encendido=true;
				this.estanque=estanque-1;
				System.out.println(this.estanque);
			}
			else {
				System.out.println("El auto ya está encendido");
	
			}
		}	
		else {
			System.out.println("No hay combustible. Por favor cargue combustible");
		}
	}
	
	public void apagar() {
		if (this.estanque>0) {
			if(encendido==true) {
				System.out.println("El auto está apagado");
				this.encendido=false;
				this.estanque=estanque-1;
				System.out.println(this.estanque);
			}
			else {
				System.out.println("El auto ya está apagado");
			}
		}
		else {
			System.out.println("No hay combustible. Por favor cargar combustible");
		}
	}
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	

}
