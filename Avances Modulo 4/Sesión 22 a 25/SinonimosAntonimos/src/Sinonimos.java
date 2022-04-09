import java.util.HashMap;
import java.util.HashSet;
/**
 * Clase que almacena todo lo relacionado a los sinónimos
 * @author Javier Roa.
 *
 */
public class Sinonimos {

	private HashMap<String, HashSet<String>> dSin;
	
	/**
	 * Constructor de la clase Sinonimos
	 */
	public Sinonimos() {
		this.dSin = new HashMap<String, HashSet<String>>();
	}

	/**
	 * Agrega una palabra con un set vacío de sinónimos
	 * @param palabra - String: representa a la palabra clave que se desea agregar.
	 */
	public void agregarPalabra(String palabra) {
		if(this.dSin.keySet().contains(palabra)) {
			System.out.println("La palabra clave ingresada ya existe.");
		}
		else {
			this.dSin.put(palabra, new HashSet<String>());
		}
	}
	/**
	 * Método que permite el ingreso de un sinónimo, asociado a una palabra clave.
	 * @param palabra - String: representa la palabra a la cual será asociado el sinónimo
	 * @param sinonimo - String: el sinónimo a asociar.
	 */
	public void agregarSinonimo(String palabra, String sinonimo) {
		try {
			if (this.dSin.get(palabra).contains(sinonimo)) {
				System.out.println("El sinónimo ingresado ya existe!");
			}
			else {
				this.dSin.get(palabra).add(sinonimo);
			}
		}
		catch (NullPointerException e) {
			System.out.println("No existe la palabra clave.");
		}
	}
	/**
	 * Método que permite alterar una palabra clave, manteniendo asociados sus sinónimos.
	 * @param palabraAnt representa la palabra clave actual.
	 * @param nuevaPalabra representa la palabra clave modificada.
	 */
	public void editarPalabra(String palabraAnt, String nuevaPalabra) {
		HashSet<String> temp = new HashSet<String>(); //Sinonimos almacenados
		temp = this.dSin.get(palabraAnt); //Variable temporal para almacenarlos
		if(!palabraAnt.equals(nuevaPalabra)) {
			this.dSin.remove(palabraAnt); //Eliminar palabra + sinonimos
			this.dSin.put(nuevaPalabra, temp);//Se crea el par clave-valor nuevo (palabra editada)
		}
		else {
			System.out.println("La palabra escrita es igual a la anterior.");
		}
	}
	/**
	 * Método que permite alterar un sinónimo asociado a una palabra clave.
	 * @param palabra - String: representa la palabra clave cuyo sinónimo será editado.
	 * @param sinonimo - String: representa el sinónimo a alterar.
	 * @param nuevoSin - String: representa el nuevo sinónimo que reemplazará al anterior.
	 */
	public void editarSinonimo(String palabra, String sinonimo, String nuevoSin) {
		if(!sinonimo.equals(nuevoSin)) {
			this.dSin.get(palabra).remove(sinonimo);
			this.dSin.get(palabra).add(nuevoSin);
		}
		else {
			System.out.println("El sinónimo escrito es igual al que desea modificar.");
		}
	}
	/**
	 * Método que permite borrar una palabra clave y todos sus sinónimos asociados.
	 * @param palabra - String: representa la palabra clave a borrar.
	 */
	public void borrarPalabra(String palabra) {
		this.dSin.remove(palabra);
	}
	/**
	 * Método que permite borrar un sinónimo asociado a una palabra clave determinada.
	 * @param palabra - String: representa la palabra clave cuyo antónimo se desea borrar.
	 * @param sinonimo - String: representa el sinónimo a quitar.
	 */
	public void borrarSinonimo(String palabra, String sinonimo) {
		this.dSin.get(palabra).remove(sinonimo);
	}
	/**
	 * Método que permite mostrar un listado con todas las palabras claves y sus respectivos sinónimos.
	 */
	public void mostrarDiccionario() {
		if (this.dSin.isEmpty() || this.dSin == null) {
			System.out.println("El diccionario está vacío!");
		}
		else {
			this.dSin.forEach((k, v) -> System.out.println("Palabra: " + k + " --- Sinónimos: " + v));
		}
	}
}