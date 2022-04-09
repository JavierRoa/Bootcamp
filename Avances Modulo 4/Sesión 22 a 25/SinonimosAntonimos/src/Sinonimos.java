import java.util.HashMap;
import java.util.HashSet;
/**
 * Clase que almacena todo lo relacionado a los sin�nimos
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
	 * Agrega una palabra con un set vac�o de sin�nimos
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
	 * M�todo que permite el ingreso de un sin�nimo, asociado a una palabra clave.
	 * @param palabra - String: representa la palabra a la cual ser� asociado el sin�nimo
	 * @param sinonimo - String: el sin�nimo a asociar.
	 */
	public void agregarSinonimo(String palabra, String sinonimo) {
		try {
			if (this.dSin.get(palabra).contains(sinonimo)) {
				System.out.println("El sin�nimo ingresado ya existe!");
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
	 * M�todo que permite alterar una palabra clave, manteniendo asociados sus sin�nimos.
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
	 * M�todo que permite alterar un sin�nimo asociado a una palabra clave.
	 * @param palabra - String: representa la palabra clave cuyo sin�nimo ser� editado.
	 * @param sinonimo - String: representa el sin�nimo a alterar.
	 * @param nuevoSin - String: representa el nuevo sin�nimo que reemplazar� al anterior.
	 */
	public void editarSinonimo(String palabra, String sinonimo, String nuevoSin) {
		if(!sinonimo.equals(nuevoSin)) {
			this.dSin.get(palabra).remove(sinonimo);
			this.dSin.get(palabra).add(nuevoSin);
		}
		else {
			System.out.println("El sin�nimo escrito es igual al que desea modificar.");
		}
	}
	/**
	 * M�todo que permite borrar una palabra clave y todos sus sin�nimos asociados.
	 * @param palabra - String: representa la palabra clave a borrar.
	 */
	public void borrarPalabra(String palabra) {
		this.dSin.remove(palabra);
	}
	/**
	 * M�todo que permite borrar un sin�nimo asociado a una palabra clave determinada.
	 * @param palabra - String: representa la palabra clave cuyo ant�nimo se desea borrar.
	 * @param sinonimo - String: representa el sin�nimo a quitar.
	 */
	public void borrarSinonimo(String palabra, String sinonimo) {
		this.dSin.get(palabra).remove(sinonimo);
	}
	/**
	 * M�todo que permite mostrar un listado con todas las palabras claves y sus respectivos sin�nimos.
	 */
	public void mostrarDiccionario() {
		if (this.dSin.isEmpty() || this.dSin == null) {
			System.out.println("El diccionario est� vac�o!");
		}
		else {
			this.dSin.forEach((k, v) -> System.out.println("Palabra: " + k + " --- Sin�nimos: " + v));
		}
	}
}