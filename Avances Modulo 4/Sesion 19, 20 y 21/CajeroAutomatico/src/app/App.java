package app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import cajero.CajeroAutomatico;
import cuenta.CuentaBancaria;
import tarjeta.Tarjeta;

/**
 * Clase App, donde se lleva a cabo el funcionamiento del programa
 * @author Javier Roa.
 */
public class App {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		int opc2 = 0;
		int indice;
		String nuevaClave, numTarjetaIng, montoGiro;
		CuentaBancaria cuenta;

		ArrayList<CuentaBancaria> bd = new ArrayList<CuentaBancaria>();
		bd.add(new CuentaBancaria("Santander", "corriente", "Lorena López", 567838, 500000, 3, "2345", new Tarjeta("552266", "debito")));
		bd.add(new CuentaBancaria("Estado", "vista", "Julio Ramirez", 567356, 380000, 10, "2312", new Tarjeta("678987", "mixta")));
		bd.add(new CuentaBancaria("Itau", "Ahorro", "Carla Ruiz", 654123, 780000, 5, "2435", new Tarjeta("674589", "crédito")));
		bd.add(new CuentaBancaria("Falabella", "Corriente", "Roberto Aranguiz", 432124, 1900230, 10, "4321", new Tarjeta("6342", "debito")));


		CajeroAutomatico atm = new CajeroAutomatico(5000000, bd);
		
		//Se ingresa el número de tarjeta (solo 6 dígitos)
		while (true) {
			System.out.println("Ingrese número de tarjeta:");
			numTarjetaIng = leer.nextLine();
			if (numTarjetaIng.matches("^[0-9]{6}$")) {
				break;
			}
			else {
				System.out.println("El código de tarjeta solo debe contener 6 dígitos, sin letras y/o símbolos");
			}
		}
		//buscar si el numero de tarjeta esta asociado a una cuenta existente
		indice = atm.busquedaCuenta(numTarjetaIng);

		//Si la cuenta no existe, se sale del ciclo
		if (indice == -1) {
			System.out.println("La cuenta no existe. Contacte a su banco.");
		}
		else {
			cuenta = atm.getTarjetaIng().get(indice);
			//Se solicita clave secreta. Tres intentos fallidos bloquean la tarjeta.
			cuenta.validarClave();
			while (opc != 5 && cuenta.getTarjeta().isHabilitada()) {
				System.out.println("Menú:");
				System.out.println("(1) Consultar Saldo");
				System.out.println("(2) Giro");
				System.out.println("(3) Cambiar Clave");
				System.out.println("(4) Mostrar Historial");
				System.out.println("(5) Salir");
				try {
					opc = leer.nextInt();
					leer.nextLine(); // Línea para proteger de un error propio de Scanner
				}
				catch (InputMismatchException e) {
					System.out.println("Error. Ingrese sólo dígitos");
					leer.nextLine();  // Línea para proteger de un error propio de Scanner
				}
				switch (opc) {
				case 1:
					cuenta.consultarSaldo();
					atm.guardarTransaccion("Consulta Saldo",
							"24/03/2022",
							cuenta.getTipoCuenta(), cuenta.getTitular(), null);
					break;
				case 2:
					while (opc2 != 7) {
						System.out.println("Monto a Girar:");
						System.out.println("(1) $5.000");
						System.out.println("(2) $10.000");
						System.out.println("(3) $20.000");
						System.out.println("(4) $100.000");
						System.out.println("(5) $200.000");
						System.out.println("(6) Otro monto");
						System.out.println("(7) Atrás");
						try {
							opc2 = leer.nextInt();
							leer.nextLine();  // Línea para proteger de un error propio de Scanner
						}
						catch (InputMismatchException e) {
							System.out.println("Error. Ingrese sólo dígitos");
							leer.nextLine();  // Línea para proteger de un error propio de Scanner
						}
						switch (opc2) {
						case 1:
							atm.entregarDinero(5000, cuenta);
							break;
						case 2:
							atm.entregarDinero(10000, cuenta);
							break;
						case 3:
							atm.entregarDinero(20000, cuenta);
							break;
						case 4:
							atm.entregarDinero(100000, cuenta);
							break;
						case 5:
							atm.entregarDinero(200000, cuenta);
							break;
						case 6:
							leer.nextLine();
							while (true) {
								System.out.println("Ingrese monto a girar:");
								montoGiro = leer.nextLine();
								if (montoGiro.matches("^[0-9]*$")) {
									if (Integer.parseInt(montoGiro)%5000 == 0) {
										atm.entregarDinero(Integer.parseInt(montoGiro), cuenta);
										break;
									}
									else {
										System.out.println("El cajero solo puede entregar montos múltiplos de $5.000");
									}
								}
								else {
									System.out.println("Solo debe ingresar dígitos.");
								}
							}
							break;
						case 7:
							//sin codigo
							break;
						default:
							System.out.println("Opción Inválida.");
						}
					}
					break;
				case 3:
					//Solicita que se ingrese la clave secreta
					cuenta.validarClave();
					if (cuenta.getTarjeta().isHabilitada()) {
						System.out.println("Ingrese nueva clave");
						nuevaClave = leer.next();
						cuenta.cambioClave(nuevaClave);
					}
					atm.guardarTransaccion("Cambio Clave",
							"24/03/2022",
							cuenta.getTipoCuenta(), cuenta.getTitular(), null);
				break;
				case 4:
					for (int i=0; i<atm.getHistorial().size(); i++) {
						atm.getHistorial().get(i).mostrarHistorial();
					}
				break;
				case 5:
					//
				break;
				default:
					System.out.println("Opción inválida.");
				}
			}
		}
		System.out.println("Gracias por su preferencia. Adios.");
		leer.close();
	}
}
