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
	 * @param args (Par�metro por defecto).
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
				System.out.println("Bienvenido a mi diccionario. �Qu� desea hacer?");
				System.out.println("1.- Para acceder a la secci�n de sin�nimos");
				System.out.println("2.- Para acceder a la secci�n de ant�nimos");
				System.out.println("0.- Para salir");
				opc=leer.nextInt();
				switch(opc) {
					case 1:
						opc2=9;
						while(opc2!=0) {
							try {
								System.out.println("�Qu� necesita?");
								System.out.println("1.-Agregar palabra clave");
								System.out.println("2.-Agregar sin�nimo");
								System.out.println("3.-Editar palabra clave");
								System.out.println("4.-Editar sin�nimo");
								System.out.println("5.-Borrar palabra clave");
								System.out.println("6.-Borrar sin�nimo");
								System.out.println("7.-Mostrar diccionario de ant�nimos");
								System.out.println("0.-Volver atr�s");
								opc2=leer.nextInt();
								switch(opc2) {
								case 1:
									System.out.println("Ingrese la palabra que desea agregar.");
									String p1 = leer.next();
									sin.agregarPalabra(p1);
								break;
								case 2:
									System.out.println("Ingrese la palabra a la cual desea asociar un sin�nimo.");
									String p2 = leer.next();
									System.out.println("Ingrese el sin�nimo que desea agregar");
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
									System.out.println("Ingrese la palabra cuyo sin�nimo desea alterar.");
									String p4 = leer.next();
									System.out.println("Ingrese el sin�nimo a modificar.");
									String sin2 = leer.next();
									System.out.println("Ingrese el nuevo sin�nimo.");
									String nSin1 = leer.next();
									sin.editarSinonimo(p4, sin2, nSin1);
								break;
								case 5:
									System.out.println("Ingrese la palabra a borrar.");
									String p5 = leer.next();
									sin.borrarPalabra(p5);
								break;
								case 6:
									System.out.println("Ingrese la palabra cuyo sin�nimo desea borrar.");
									String p6 = leer.next();
									System.out.println("Ingrese el sin�nimo a quitar.");
									String sin3 = leer.next();
									sin.borrarSinonimo(p6, sin3);
								break;
								case 7:
									sin.mostrarDiccionario();
								break;
								case 0:
									System.out.println("Volviendo atr�s...");
								break;
								default:
									System.out.println("Opci�n inv�lida. Intente nuevamente.");
								}
							}
							catch (InputMismatchException e) {
								System.out.println("S�lo se aceptan d�gitos.");
								leer.nextLine(); // L�nea para evitar error de clase Scanner
							}
						}	
					break;
					case 2:
						opc3=9;
						while(opc3!=0) {
							try {
								System.out.println("�Qu� necesita?");
								System.out.println("1.-Agregar palabra clave");
								System.out.println("1.-Agregar ant�nimo");
								System.out.println("1.-Editar palabra clave");
								System.out.println("1.-Editar ant�nimo");
								System.out.println("1.-Borrar palabra clave");
								System.out.println("1.-Borrar ant�nimo");
								System.out.println("1.-Mostrar diccionario de ant�nimos");
								System.out.println("0.-Volver atr�s");
								opc3=leer.nextInt();
								switch(opc3) {
								case 1:
									System.out.println("Ingrese la palabra que desea agregar.");
									String p1 = leer.next();
									ant.agregarPalabra(p1);
								break;
								case 2:
									System.out.println("Ingrese la palabra a la cual desea asociar un sin�nimo.");
									String p2 = leer.next();
									System.out.println("Ingrese el sin�nimo que desea agregar");
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
									System.out.println("Ingrese la palabra cuyo sin�nimo desea alterar.");
									String p4 = leer.next();
									System.out.println("Ingrese el sin�nimo a modificar.");
									String sin2 = leer.next();
									System.out.println("Ingrese el nuevo sin�nimo.");
									String nSin1 = leer.next();
									ant.editarAntonimo(p4, sin2, nSin1);
								break;
								case 5:
									System.out.println("Ingrese la palabra a borrar.");
									String p5 = leer.next();
									ant.borrarPalabra(p5);
								break;
								case 6:
									System.out.println("Ingrese la palabra cuyo sin�nimo desea borrar.");
									String p6 = leer.next();
									System.out.println("Ingrese el sin�nimo a quitar.");
									String sin3 = leer.next();
									ant.borrarAntonimo(p6, sin3);
								break;
								case 7:
									ant.mostrarDiccionario();
								break;
								case 0:
									System.out.println("Volviendo atr�s...");
								break;
								default:
									System.out.println("Opci�n inv�lida. Intente nuevamente.");
								}
							}
							catch (InputMismatchException e) {
								System.out.println("S�lo de aceptan d�gitos.");
								leer.nextLine(); // L�nea para evitar error de clase Scanner
							}
						}
					break;
					case 0:
						System.out.println("Saliendo...");
					break;
					default:
						System.out.println("Opci�n inv�lida, reintente por favor.");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("S�lo se aceptan d�gitos.");
				leer.nextLine(); // L�nea para evitar error de clase Scanner
			}
		}	
		leer.close();
	}
}
