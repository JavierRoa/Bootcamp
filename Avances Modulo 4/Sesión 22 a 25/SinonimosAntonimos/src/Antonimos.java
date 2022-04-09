import java.util.HashMap;
import java.util.HashSet;
/**
 * Clase que contiene todo lo relacionado a antónimos.
 * @author Javier Roa.
 *
 */
public class Antonimos {
	
	private HashMap<String, HashSet<String>> dAnt;

	/**
	 * Constructor de la clase Antonimos.
	 */
	public Antonimos() {
		this.dAnt = new HashMap<String, HashSet<String>>();
	}

	/**
	 * Método que permite agrega una palabra clave con un set vacío de antónimos
	 * @param palabra - String: representa a la palabra clave que se desea agregar.
	 */
	public void agregarPalabra(String palabra) {
		if(this.dAnt.keySet().contains(palabra)) {
			System.out.println("La palabra clave ingresada ya existe.");
		}
		else {
			this.dAnt.put(palabra, new HashSet<String>());
		}
	}
	/**
	 * Método que permite el ingreso de un antónimo, asociado a una palabra clave.
	 * @param palabra - String: representa la palabra a la cual será asociado el antónimo
	 * @param antonimo - String: el antónimo a asociar.
	 */
	public void agregarAntonimo(String palabra, String antonimo) {
		try {
			if (this.dAnt.get(palabra).contains(antonimo)) {
				System.out.println("El antónimo ingresado ya existe!");
			}
			else {
				this.dAnt.get(palabra).add(antonimo);
			}
		}
		catch (NullPointerException e) {
			System.out.println("No existe la palabra clave.");
		}
	}
	/**
	 * Método que permite alterar una palabra clave, manteniendo asociados sus antónimos.
	 * @param palabraAnt representa la palabra clave actual.
	 * @param nuevaPalabra representa la palabra clave modificada.
	 */
	public void editarPalabra(String palabraAnt, String nuevaPalabra) {
		HashSet<String> temp = new HashSet<String>(); //Antónimos almacenados
		temp = this.dAnt.get(palabraAnt); //Variable temporal para almacenarlos
		if(!palabraAnt.equals(nuevaPalabra)) {
			this.dAnt.remove(palabraAnt); //Eliminar palabra + antónimos
			this.dAnt.put(nuevaPalabra, temp);//Se crea el par clave-valor nuevo (palabra editada)
		}
		else {
			System.out.println("La palabra escrita es igual a la anterior");
		}
	}
	/**
	 * Método que permite alterar un antónimo asociado a una palabra clave.
	 * @param palabra - String: representa la palabra clave cuyo antónimo será editado.
	 * @param antonimo - String: representa el antónimo a alterar.
	 * @param nuevoAnt - String: representa el nuevo antónimo que reemplazará al anterior.
	 */
	public void editarAntonimo(String palabra, String antonimo, String nuevoAnt) {
		if(!antonimo.equals(nuevoAnt)) {
			this.dAnt.get(palabra).remove(antonimo);
			this.dAnt.get(palabra).add(nuevoAnt);
		}
		else {
			System.out.println("El antónimo escrito es igual al que desea modificar.");
		}
	}
	/**
	 * Método que permite borrar una palabra clave y todos sus antónimos asociados.
	 * @param palabra - String: representa la palabra clave a borrar.
	 */
	public void borrarPalabra(String palabra) {
		this.dAnt.remove(palabra);
	}
	/**
	 * Método que permite borrar un antónimo asociado a una palabra clave determinada.
	 * @param palabra - String: representa la palabra clave cuyo antónimo se desea borrar.
	 * @param antonimo - String: representa el antónimo a quitar.
	 */
	public void borrarAntonimo(String palabra, String antonimo) {
		this.dAnt.get(palabra).remove(antonimo);
	}
	/**
	 * Método que permite mostrar un listado con todas las palabras claves y sus respectivos antónimos.
	 */
	public void mostrarDiccionario() {
		if (this.dAnt.isEmpty() || this.dAnt == null) {
			System.out.println("El diccionario está vacío!");
		}
		else {
			this.dAnt.forEach((k, v) -> System.out.println("Palabra: " + k + " --- Antónimos: " + v));
		}
	}
}