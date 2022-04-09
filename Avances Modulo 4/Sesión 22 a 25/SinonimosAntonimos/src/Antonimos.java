import java.util.HashMap;
import java.util.HashSet;
/**
 * Clase que contiene todo lo relacionado a ant�nimos.
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
	 * M�todo que permite agrega una palabra clave con un set vac�o de ant�nimos
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
	 * M�todo que permite el ingreso de un ant�nimo, asociado a una palabra clave.
	 * @param palabra - String: representa la palabra a la cual ser� asociado el ant�nimo
	 * @param antonimo - String: el ant�nimo a asociar.
	 */
	public void agregarAntonimo(String palabra, String antonimo) {
		try {
			if (this.dAnt.get(palabra).contains(antonimo)) {
				System.out.println("El ant�nimo ingresado ya existe!");
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
	 * M�todo que permite alterar una palabra clave, manteniendo asociados sus ant�nimos.
	 * @param palabraAnt representa la palabra clave actual.
	 * @param nuevaPalabra representa la palabra clave modificada.
	 */
	public void editarPalabra(String palabraAnt, String nuevaPalabra) {
		HashSet<String> temp = new HashSet<String>(); //Ant�nimos almacenados
		temp = this.dAnt.get(palabraAnt); //Variable temporal para almacenarlos
		if(!palabraAnt.equals(nuevaPalabra)) {
			this.dAnt.remove(palabraAnt); //Eliminar palabra + ant�nimos
			this.dAnt.put(nuevaPalabra, temp);//Se crea el par clave-valor nuevo (palabra editada)
		}
		else {
			System.out.println("La palabra escrita es igual a la anterior");
		}
	}
	/**
	 * M�todo que permite alterar un ant�nimo asociado a una palabra clave.
	 * @param palabra - String: representa la palabra clave cuyo ant�nimo ser� editado.
	 * @param antonimo - String: representa el ant�nimo a alterar.
	 * @param nuevoAnt - String: representa el nuevo ant�nimo que reemplazar� al anterior.
	 */
	public void editarAntonimo(String palabra, String antonimo, String nuevoAnt) {
		if(!antonimo.equals(nuevoAnt)) {
			this.dAnt.get(palabra).remove(antonimo);
			this.dAnt.get(palabra).add(nuevoAnt);
		}
		else {
			System.out.println("El ant�nimo escrito es igual al que desea modificar.");
		}
	}
	/**
	 * M�todo que permite borrar una palabra clave y todos sus ant�nimos asociados.
	 * @param palabra - String: representa la palabra clave a borrar.
	 */
	public void borrarPalabra(String palabra) {
		this.dAnt.remove(palabra);
	}
	/**
	 * M�todo que permite borrar un ant�nimo asociado a una palabra clave determinada.
	 * @param palabra - String: representa la palabra clave cuyo ant�nimo se desea borrar.
	 * @param antonimo - String: representa el ant�nimo a quitar.
	 */
	public void borrarAntonimo(String palabra, String antonimo) {
		this.dAnt.get(palabra).remove(antonimo);
	}
	/**
	 * M�todo que permite mostrar un listado con todas las palabras claves y sus respectivos ant�nimos.
	 */
	public void mostrarDiccionario() {
		if (this.dAnt.isEmpty() || this.dAnt == null) {
			System.out.println("El diccionario est� vac�o!");
		}
		else {
			this.dAnt.forEach((k, v) -> System.out.println("Palabra: " + k + " --- Ant�nimos: " + v));
		}
	}
}