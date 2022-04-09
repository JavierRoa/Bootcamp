import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Clase principal, usada para ejecutar el programa.
 * @author Javier Roa.
 *
 */
public class AppDiccionario {
	/**
	 * Procedimiento principal.
	 * @param args (Parámetro por defecto).
	 */
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		Sinonimos sin = new Sinonimos();
		Antonimos ant = new Antonimos();
		int opc = 9;
		int opc2 = 9;
		int opc3 = 9;
		
		while(opc!=0) {
			try {
				System.out.println("Bienvenido a mi diccionario. ¿Qué desea hacer?");
				System.out.println("1.- Para acceder a la sección de sinónimos");
				System.out.println("2.- Para acceder a la sección de antónimos");
				System.out.println("0.- Para salir");
				opc=leer.nextInt();
				switch(opc) {
					case 1:
						opc2=9;
						while(opc2!=0) {
							try {
								System.out.println("¿Qué necesita?");
								System.out.println("1.-Agregar palabra clave");
								System.out.println("2.-Agregar sinónimo");
								System.out.println("3.-Editar palabra clave");
								System.out.println("4.-Editar sinónimo");
								System.out.println("5.-Borrar palabra clave");
								System.out.println("6.-Borrar sinónimo");
								System.out.println("7.-Mostrar diccionario de antónimos");
								System.out.println("0.-Volver atrás");
								opc2=leer.nextInt();
								switch(opc2) {
								case 1:
									System.out.println("Ingrese la palabra que desea agregar.");
									String p1 = leer.next();
									sin.agregarPalabra(p1);
								break;
								case 2:
									System.out.println("Ingrese la palabra a la cual desea asociar un sinónimo.");
									String p2 = leer.next();
									System.out.println("Ingrese el sinónimo que desea agregar");
									String sin1 = leer.next();
									sin.agregarSinonimo(p2, sin1);
								break;
								case 3:
									System.out.println("Ingrese la palabra que desea modificar");
									String p3 = leer.next();
									System.out.println("Ingrese la nueva palabra");
									String nP1 = leer.next();
									sin.editarPalabra(p3, nP1);
								break;
								case 4:
									System.out.println("Ingrese la palabra cuyo sinónimo desea alterar.");
									String p4 = leer.next();
									System.out.println("Ingrese el sinónimo a modificar.");
									String sin2 = leer.next();
									System.out.println("Ingrese el nuevo sinónimo.");
									String nSin1 = leer.next();
									sin.editarSinonimo(p4, sin2, nSin1);
								break;
								case 5:
									System.out.println("Ingrese la palabra a borrar.");
									String p5 = leer.next();
									sin.borrarPalabra(p5);
								break;
								case 6:
									System.out.println("Ingrese la palabra cuyo sinónimo desea borrar.");
									String p6 = leer.next();
									System.out.println("Ingrese el sinónimo a quitar.");
									String sin3 = leer.next();
									sin.borrarSinonimo(p6, sin3);
								break;
								case 7:
									sin.mostrarDiccionario();
								break;
								case 0:
									System.out.println("Volviendo atrás...");
								break;
								default:
									System.out.println("Opción inválida. Intente nuevamente.");
								}
							}
							catch (InputMismatchException e) {
								System.out.println("Sólo se aceptan dígitos.");
								leer.nextLine(); // Línea para evitar error de clase Scanner
							}
						}	
					break;
					case 2:
						opc3=9;
						while(opc3!=0) {
							try {
								System.out.println("¿Qué necesita?");
								System.out.println("1.-Agregar palabra clave");
								System.out.println("1.-Agregar antónimo");
								System.out.println("1.-Editar palabra clave");
								System.out.println("1.-Editar antónimo");
								System.out.println("1.-Borrar palabra clave");
								System.out.println("1.-Borrar antónimo");
								System.out.println("1.-Mostrar diccionario de antónimos");
								System.out.println("0.-Volver atrás");
								opc3=leer.nextInt();
								switch(opc3) {
								case 1:
									System.out.println("Ingrese la palabra que desea agregar.");
									String p1 = leer.next();
									ant.agregarPalabra(p1);
								break;
								case 2:
									System.out.println("Ingrese la palabra a la cual desea asociar un sinónimo.");
									String p2 = leer.next();
									System.out.println("Ingrese el sinónimo que desea agregar");
									String sin1 = leer.next();
									ant.agregarAntonimo(p2, sin1);
								break;
								case 3:
									System.out.println("Ingrese la palabra que desea modificar");
									String p3 = leer.next();
									System.out.println("Ingrese la nueva palabra");
									String nP1 = leer.next();
									ant.editarPalabra(p3, nP1);
								break;
								case 4:
									System.out.println("Ingrese la palabra cuyo sinónimo desea alterar.");
									String p4 = leer.next();
									System.out.println("Ingrese el sinónimo a modificar.");
									String sin2 = leer.next();
									System.out.println("Ingrese el nuevo sinónimo.");
									String nSin1 = leer.next();
									ant.editarAntonimo(p4, sin2, nSin1);
								break;
								case 5:
									System.out.println("Ingrese la palabra a borrar.");
									String p5 = leer.next();
									ant.borrarPalabra(p5);
								break;
								case 6:
									System.out.println("Ingrese la palabra cuyo sinónimo desea borrar.");
									String p6 = leer.next();
									System.out.println("Ingrese el sinónimo a quitar.");
									String sin3 = leer.next();
									ant.borrarAntonimo(p6, sin3);
								break;
								case 7:
									ant.mostrarDiccionario();
								break;
								case 0:
									System.out.println("Volviendo atrás...");
								break;
								default:
									System.out.println("Opción inválida. Intente nuevamente.");
								}
							}
							catch (InputMismatchException e) {
								System.out.println("Sólo de aceptan dígitos.");
								leer.nextLine(); // Línea para evitar error de clase Scanner
							}
						}
					break;
					case 0:
						System.out.println("Saliendo...");
					break;
					default:
						System.out.println("Opción inválida, reintente por favor.");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Sólo se aceptan dígitos.");
				leer.nextLine(); // Línea para evitar error de clase Scanner
			}
		}	
		leer.close();
	}
}
