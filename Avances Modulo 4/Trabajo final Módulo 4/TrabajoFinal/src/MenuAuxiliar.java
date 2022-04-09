import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.ArrayList;

import objetos.Auto;
import objetos.Cliente;
import objetos.Fecha;
import objetos.Mantencion;
/**
 * Clase usada para el funcionamiento del menú y contener métodos.
 * @author Javier Roa.
 */
public class MenuAuxiliar {

	Scanner leer = new Scanner(System.in);
	private HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();
	private HashMap<String, Auto> autos = new HashMap<String, Auto>();
	private ArrayList<Mantencion> mantenciones = new ArrayList<Mantencion>();
	/**
	 * Método que despliega el menú principal del sistema.
	 */
	public void menuPrincipal() {
		System.out.println("Bienvenido al servicio de MyCar. Por favor, selecciones una opción");
		int opc = 0;
		while(opc !=5) {
			try {
				System.out.println("1.- Registrar cliente, auto o mantención");
				System.out.println("2.- Eliminar cliente");
				System.out.println("3.- Consultar listado de mantenciones");
				System.out.println("4.- Obtener reporte de recaudación");
				System.out.println("5.- Salir");
				opc = leer.nextInt();
				switch(opc) {
				case 1: 
					this.menuRegistro();
				break;
				case 2:
					this.eliminarCliente();
				break;
				case 3:
					this.historialMantenciones();
				break;
				case 4:
					this.reporteRecaudacion();
				break;
				case 5:
					System.out.println("Adiós.");
				break;
				default:
					System.out.println("Opción inválida. Por favor reintente");
				}
			}
			catch (InputMismatchException e) {
				leer.nextLine();
				System.out.println("Sólo puede ingresar dígitos.");
			}
		}	
	}
	/**
	 * Método que despliega el menú para el registro de los distintos objetos.
	 */
	private void menuRegistro() {
		System.out.println("Por favor, seleccione la opción que desea realizar");
		int opc = 0;
		while(opc !=4) {
			try {
				System.out.println("1.- Agregar cliente");
				System.out.println("2.- Agregar auto");
				System.out.println("3.- Agregar mantención");
				System.out.println("4.- Volver atrás");
				opc =leer.nextInt();
				switch(opc) {
				case 1:
					this.agregarCliente();
				break;	
				case 2:
					this.agregarAuto();
				break;	
				case 3:
					this.menuMantencion();
				break;
				case 4:
					System.out.println("Volviendo al menú anterior");
				break;	
				default:
					System.out.println("Opción inválida. Por favor reintente");
				}
			}
			catch (InputMismatchException e) {
				leer.nextLine();
				System.out.println("Sólo puede ingresar dígitos.");
			}
		}
	}
	/**
	 * Método que despliega el menú para la selección de la mantención.
	 */
	private void menuMantencion() {
		System.out.println("¿Qué tipo de servicio desea solicitar?");
		int opc = 0;
		while(opc !=5) {
			try {
				System.out.println("1.- Ajuste frenos");
				System.out.println("2.- Revisión y mantención caja de cambios");
				System.out.println("3.- Afinamiento del motor");
				System.out.println("4.- Cambio de aceite");
				System.out.println("5.- Volver Atrás");
				opc = leer.nextInt();			
				switch(opc) {
				case 1:
					this.agregarMantencion("Ajuste frenos", 20000);
				break;	
				case 2:
					this.agregarMantencion("Revisión y mantención caja de cambios", 50000);
				break;	
				case 3:
					this.agregarMantencion("Afinamiento del motor", 150000);
				break;	
				case 4:
					this.agregarMantencion("Cambio de aceite", 30000);
				break;	
				case 5:
					System.out.println("Volviendo al menú anterior");
				break;	
				default:
					System.out.println("Opción inválida. Por favor reintente");
				}
			}
			catch (InputMismatchException e) {
				leer.nextLine();
				System.out.println("Sólo puede ingresar dígitos.");
			}
		}
	}
	/**
	 * Método que permite el ingreso de un nuevo cliente.
	 */
	private void agregarCliente() {
		System.out.println("Ingrese sus datos como sean solicitados.");
		System.out.println();
		String rut, pNom, sNom, pApe, sApe, email, fono;
		System.out.print("RUT: ");
		leer.nextLine();
		rut = leer.nextLine();
		if(rut.matches("^\\d{7,8}[-]{1}[Kk\\d]{1}$")) {
			if(!this.clientes.keySet().contains(rut)) {
				System.out.print("Primer nombre: ");
				pNom = leer.nextLine();
				System.out.print("Segundo nombre: ");
				sNom = leer.nextLine();
				System.out.print("Primer apellido: ");
				pApe = leer.nextLine();
				System.out.print("Segundo apellido: ");
				sApe = leer.nextLine();
				if(pNom.matches("^[A-Z][a-z]+$") && sNom.matches("^[A-Z][a-z]+$") && pApe.matches("^[A-Z][a-z]+$") && sApe.matches("^[A-Z][a-z]+$")) {
					System.out.print("E-mail: ");
					email = leer.nextLine();
					if(email.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")) {
						System.out.print("Teléfono: ");
						fono = leer.nextLine();
						if(fono.matches("^[0-9]{9}$")) {
							if(rut.isEmpty() == false && pNom.isEmpty() == false 
									&& sNom.isEmpty() == false 
									&& pApe.isEmpty() == false 
									&& sApe.isEmpty() == false 
									&& email.isEmpty() == false 
									&& fono.isEmpty() == false) { 
								this.clientes.put(rut, new Cliente(rut, pNom, sNom, pApe, sApe, email, fono));
								System.out.println("Ingreso exitoso");
							}
							else {
								System.out.println("No puede dejar espacios vacíos");
							}
						}
						else {
							System.out.println("Número de teléfono inválido. Ingrese 9 dígitos en total");
						}
					}
					else {
						System.out.println("E-mail inválido.");
					}
				}
				else {
					System.out.println("Nombres y apellidos deben empezar con mayúscula y sólo contener letras sin tilde u otros símbolos.");
				}
			}
			else {
				System.out.println("El cliente ya está registrado.");
			}
		}
		else {
			System.out.println("El RUT que ha ingresado no es válido");
		}
	}
	/**
	 * Método que permite el ingreso de un nuevo auto.
	 */
	private void agregarAuto() {
		System.out.println("Por favor, ingrese los siguientes datos de su auto");
		System.out.println();
		String patente, marca, modelo, anio, rut;
		System.out.println("Primero, ingrese su RUT");
		leer.nextLine();
		rut = leer.nextLine();
		if(rut.matches("^\\d{7,8}[-]{1}[Kk\\d]{1}$")) {
			Cliente cl = clientes.get(rut);	
			if(this.clientes.keySet().contains(rut))  {
				System.out.print("Patente: ");
				patente = leer.nextLine();
				if(patente.matches("^([A-Z]{2}[0-9]{4}|[A-Z]{4}[0-9]{2})$")) {
					System.out.print("Marca: ");
					marca = leer.nextLine();
					if(marca.matches("^[A-Z][a-z]+$")) {
						System.out.print("Modelo: ");
						modelo = leer.nextLine();
						if(modelo.matches("^[A-Z][a-z]+$")) {
							System.out.print("Año de fabricación: ");
							anio = leer.nextLine();
							if(anio.matches("(^(19[6-9]\\\\d)|(20\\\\d{2})$)")) {
								if (patente.isEmpty()==false && marca.isEmpty()==false && modelo.isEmpty()==false && anio.isEmpty()==false) {
									this.autos.put(patente, new Auto(patente, marca, modelo, anio, cl));
									System.out.println("Ingreso exitoso");
								}
								else {
									System.out.println("No puede dejar espacios vacíos.");
								}
							}
							else {
								System.out.println("Año inválido. Ingrese año mayor a 1959 y menor a 2100");
							}
						}
						else {
							System.out.println("Ingrese el modelo con inicial mayúscula y sólo letras sin tilde.");
						}
					}
					else {
						System.out.println("Ingrese la marca con inicial mayúscula y sólo letras sin tilde.");
					}
				}
				else {
					System.out.println("La patente es inválida.");
				}
			}
			else {
				System.out.println("El RUT ingresado no pertenece a ningún cliente registrado.");
			}
		}
		else {
			System.out.println("El RUT que ha ingresado no es válido.");
		}
	}
	/**
	 * Método que permite agregar una mantención a un vehículo específico
	 * @param servicio - String: representa el tipo de mantención realizada
	 * @param amount - int: representa el costo de la mantención
	 */
	private void agregarMantencion(String servicio, int amount) {
		leer.nextLine(); // Línea para evitar errores de Scanner
		System.out.println("Ingrese observaciones");
		String obs = leer.nextLine();
		System.out.println("Ingrese la fecha correspondiente");
		System.out.print("Día: ");
		String dia = leer.nextLine();
		if(dia.matches("^(0[1-9]|[12][0-9]|[3][0-1])$")) {
			System.out.print("Mes: ");
			String mes = leer.nextLine();
			if(mes.matches("^(0[1-9]|[1][0-2])$")) {
				System.out.print("Año: ");
				String anio = leer.nextLine();
				if(anio.matches("(^(19[6-9]\\d)|(20\\d{2})$)")) {
					int dia2 = Integer.parseInt(dia);
					int mes2 = Integer.parseInt(mes);
					int anio2 = Integer.parseInt(anio);
					Fecha fecha = new Fecha(dia2, mes2, anio2);
					System.out.println("Ingrese la patente del vehículo");
					String patente = leer.nextLine();
					if(patente.matches("^([A-Z]{2}[0-9]{4}|[A-Z]{4}[0-9]{2})$")) {
						Auto p = autos.get(patente);
						if(autos.keySet().contains(patente)) {
							this.mantenciones.add(new Mantencion(servicio, obs, amount, fecha, p));
							System.out.println("Mantención ingresada con éxito.");
						}
						else {
							System.out.println("No hay un vehículo ingresado con la patente señalada");
						}
					}
					else {
						System.out.println("La patente ingresada no es válida.");
					}
				}
				else {
					System.out.println("Formato de año no válido. Por favor reintente");
				}
			}
			else {
				System.out.println("Formato de mes no válido. Por favor reintente");
			}
		}
		else {
			System.out.println("Formato de día no válido. Por favor reintente");
		}
	}
	/**
	 * Método que permite la eliminación de un cliente.
	 */
	private void eliminarCliente() {
		System.out.println("Ingrese el RUT del cliente a eliminar");
		String rut;
		leer.nextLine();
		rut = leer.nextLine();
		if(rut.matches("^\\d{7,8}[-]{1}[Kk\\d]{1}$")) {
			this.clientes.remove(rut);
			this.autos.remove(rut);
			System.out.println("Ha eliminado al cliente con éxito");
		}	
	}
	/**
	 * Método que permite extraer la información de todas 
	 * las mantenciones realizadas a un vehículo.
	 */
	private void historialMantenciones() {
		System.out.println("Por favor, ingrese la patente del vehículo.");
		leer.nextLine();
		String patente = leer.nextLine();
		if(patente.matches("^([A-Z]{2}[0-9]{4}|[A-Z]{4}[0-9]{2})$")) {
			if (this.autos.keySet().contains(patente)) { //Verifico si en la colección existe la patente ingresada
	            Iterator<Mantencion>iterador=this.mantenciones.iterator(); //Creación de un iterador para recorrer el ArrayList
	            while (iterador.hasNext()) { //Avanza en el ArrayList mientras este aún tenga contenido por recorrer
	                Mantencion mant = iterador.next(); //Variable auxiliar que almacena cada mantención
	                if(mant.getAuto().getPatente().equals(patente)) { //Consulta si la patente ingresada es igual a la patente en el ArrayList
	                    System.out.println(mant.toString()); //Imprime la lista de mantenciones
	                }
	            }
	        }
	        else {
	            System.out.println("El vehículo no existe"); // Mensaje en caso de no encontrar la patente
	        }
		}
    }
	/**
	 * Método que imprime la suma del costo de todas las mantenciones realizadas en una fecha determinada.
	 */
	private void reporteRecaudacion() {
		System.out.println("Ingrese la fecha cuya recaudación desea revisar.");
		leer.nextLine();
		int total=0;
		System.out.print("Día: ");
		String dia = leer.nextLine();
		if(dia.matches("^(0[1-9]|[12][0-9]|[3][0-1])$")) {
			System.out.print("Mes: ");
			String mes = leer.nextLine();
			if(mes.matches("^(0[1-9]|[1][0-2])$")) {
				System.out.print("Año: ");
				String anio = leer.nextLine();
				if(anio.matches("(^(19[6-9]\\d)|(20\\d{2})$)")) {
					int dia2 = Integer.parseInt(dia);
					int mes2 = Integer.parseInt(mes);
					int anio2 = Integer.parseInt(anio);
					Iterator<Mantencion>iterador=this.mantenciones.iterator();
					while(iterador.hasNext()) {
						Mantencion m = iterador.next();
						if(m.getFecha().getDia()==dia2 && m.getFecha().getMes()==mes2 && m.getFecha().getAnio()==anio2) {
							total=total+m.getMonto();
						}
					}
				}
				else {
					System.out.println("Formato de año no válido. Por favor reintente");
				}
			}
			else {
				System.out.println("Formato de mes no válido. Por favor reintente");
			}
		}
		else {
			System.out.println("Formato de día no válido. Por favor reintente");
		}
		System.out.println("Recaudación total del día");
		System.out.println(total);
	}
}