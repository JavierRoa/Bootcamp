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
 * Clase usada para el funcionamiento del men� y contener m�todos.
 * @author Javier Roa.
 */
public class MenuAuxiliar {

	Scanner leer = new Scanner(System.in);
	private HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();
	private HashMap<String, Auto> autos = new HashMap<String, Auto>();
	private ArrayList<Mantencion> mantenciones = new ArrayList<Mantencion>();
	/**
	 * M�todo que despliega el men� principal del sistema.
	 */
	public void menuPrincipal() {
		System.out.println("Bienvenido al servicio de MyCar. Por favor, selecciones una opci�n");
		int opc = 0;
		while(opc !=5) {
			try {
				System.out.println("1.- Registrar cliente, auto o mantenci�n");
				System.out.println("2.- Eliminar cliente");
				System.out.println("3.- Consultar listado de mantenciones");
				System.out.println("4.- Obtener reporte de recaudaci�n");
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
					System.out.println("Adi�s.");
				break;
				default:
					System.out.println("Opci�n inv�lida. Por favor reintente");
				}
			}
			catch (InputMismatchException e) {
				leer.nextLine();
				System.out.println("S�lo puede ingresar d�gitos.");
			}
		}	
	}
	/**
	 * M�todo que despliega el men� para el registro de los distintos objetos.
	 */
	private void menuRegistro() {
		System.out.println("Por favor, seleccione la opci�n que desea realizar");
		int opc = 0;
		while(opc !=4) {
			try {
				System.out.println("1.- Agregar cliente");
				System.out.println("2.- Agregar auto");
				System.out.println("3.- Agregar mantenci�n");
				System.out.println("4.- Volver atr�s");
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
					System.out.println("Volviendo al men� anterior");
				break;	
				default:
					System.out.println("Opci�n inv�lida. Por favor reintente");
				}
			}
			catch (InputMismatchException e) {
				leer.nextLine();
				System.out.println("S�lo puede ingresar d�gitos.");
			}
		}
	}
	/**
	 * M�todo que despliega el men� para la selecci�n de la mantenci�n.
	 */
	private void menuMantencion() {
		System.out.println("�Qu� tipo de servicio desea solicitar?");
		int opc = 0;
		while(opc !=5) {
			try {
				System.out.println("1.- Ajuste frenos");
				System.out.println("2.- Revisi�n y mantenci�n caja de cambios");
				System.out.println("3.- Afinamiento del motor");
				System.out.println("4.- Cambio de aceite");
				System.out.println("5.- Volver Atr�s");
				opc = leer.nextInt();			
				switch(opc) {
				case 1:
					this.agregarMantencion("Ajuste frenos", 20000);
				break;	
				case 2:
					this.agregarMantencion("Revisi�n y mantenci�n caja de cambios", 50000);
				break;	
				case 3:
					this.agregarMantencion("Afinamiento del motor", 150000);
				break;	
				case 4:
					this.agregarMantencion("Cambio de aceite", 30000);
				break;	
				case 5:
					System.out.println("Volviendo al men� anterior");
				break;	
				default:
					System.out.println("Opci�n inv�lida. Por favor reintente");
				}
			}
			catch (InputMismatchException e) {
				leer.nextLine();
				System.out.println("S�lo puede ingresar d�gitos.");
			}
		}
	}
	/**
	 * M�todo que permite el ingreso de un nuevo cliente.
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
						System.out.print("Tel�fono: ");
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
								System.out.println("No puede dejar espacios vac�os");
							}
						}
						else {
							System.out.println("N�mero de tel�fono inv�lido. Ingrese 9 d�gitos en total");
						}
					}
					else {
						System.out.println("E-mail inv�lido.");
					}
				}
				else {
					System.out.println("Nombres y apellidos deben empezar con may�scula y s�lo contener letras sin tilde u otros s�mbolos.");
				}
			}
			else {
				System.out.println("El cliente ya est� registrado.");
			}
		}
		else {
			System.out.println("El RUT que ha ingresado no es v�lido");
		}
	}
	/**
	 * M�todo que permite el ingreso de un nuevo auto.
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
							System.out.print("A�o de fabricaci�n: ");
							anio = leer.nextLine();
							if(anio.matches("(^(19[6-9]\\\\d)|(20\\\\d{2})$)")) {
								if (patente.isEmpty()==false && marca.isEmpty()==false && modelo.isEmpty()==false && anio.isEmpty()==false) {
									this.autos.put(patente, new Auto(patente, marca, modelo, anio, cl));
									System.out.println("Ingreso exitoso");
								}
								else {
									System.out.println("No puede dejar espacios vac�os.");
								}
							}
							else {
								System.out.println("A�o inv�lido. Ingrese a�o mayor a 1959 y menor a 2100");
							}
						}
						else {
							System.out.println("Ingrese el modelo con inicial may�scula y s�lo letras sin tilde.");
						}
					}
					else {
						System.out.println("Ingrese la marca con inicial may�scula y s�lo letras sin tilde.");
					}
				}
				else {
					System.out.println("La patente es inv�lida.");
				}
			}
			else {
				System.out.println("El RUT ingresado no pertenece a ning�n cliente registrado.");
			}
		}
		else {
			System.out.println("El RUT que ha ingresado no es v�lido.");
		}
	}
	/**
	 * M�todo que permite agregar una mantenci�n a un veh�culo espec�fico
	 * @param servicio - String: representa el tipo de mantenci�n realizada
	 * @param amount - int: representa el costo de la mantenci�n
	 */
	private void agregarMantencion(String servicio, int amount) {
		leer.nextLine(); // L�nea para evitar errores de Scanner
		System.out.println("Ingrese observaciones");
		String obs = leer.nextLine();
		System.out.println("Ingrese la fecha correspondiente");
		System.out.print("D�a: ");
		String dia = leer.nextLine();
		if(dia.matches("^(0[1-9]|[12][0-9]|[3][0-1])$")) {
			System.out.print("Mes: ");
			String mes = leer.nextLine();
			if(mes.matches("^(0[1-9]|[1][0-2])$")) {
				System.out.print("A�o: ");
				String anio = leer.nextLine();
				if(anio.matches("(^(19[6-9]\\d)|(20\\d{2})$)")) {
					int dia2 = Integer.parseInt(dia);
					int mes2 = Integer.parseInt(mes);
					int anio2 = Integer.parseInt(anio);
					Fecha fecha = new Fecha(dia2, mes2, anio2);
					System.out.println("Ingrese la patente del veh�culo");
					String patente = leer.nextLine();
					if(patente.matches("^([A-Z]{2}[0-9]{4}|[A-Z]{4}[0-9]{2})$")) {
						Auto p = autos.get(patente);
						if(autos.keySet().contains(patente)) {
							this.mantenciones.add(new Mantencion(servicio, obs, amount, fecha, p));
							System.out.println("Mantenci�n ingresada con �xito.");
						}
						else {
							System.out.println("No hay un veh�culo ingresado con la patente se�alada");
						}
					}
					else {
						System.out.println("La patente ingresada no es v�lida.");
					}
				}
				else {
					System.out.println("Formato de a�o no v�lido. Por favor reintente");
				}
			}
			else {
				System.out.println("Formato de mes no v�lido. Por favor reintente");
			}
		}
		else {
			System.out.println("Formato de d�a no v�lido. Por favor reintente");
		}
	}
	/**
	 * M�todo que permite la eliminaci�n de un cliente.
	 */
	private void eliminarCliente() {
		System.out.println("Ingrese el RUT del cliente a eliminar");
		String rut;
		leer.nextLine();
		rut = leer.nextLine();
		if(rut.matches("^\\d{7,8}[-]{1}[Kk\\d]{1}$")) {
			this.clientes.remove(rut);
			this.autos.remove(rut);
			System.out.println("Ha eliminado al cliente con �xito");
		}	
	}
	/**
	 * M�todo que permite extraer la informaci�n de todas 
	 * las mantenciones realizadas a un veh�culo.
	 */
	private void historialMantenciones() {
		System.out.println("Por favor, ingrese la patente del veh�culo.");
		leer.nextLine();
		String patente = leer.nextLine();
		if(patente.matches("^([A-Z]{2}[0-9]{4}|[A-Z]{4}[0-9]{2})$")) {
			if (this.autos.keySet().contains(patente)) { //Verifico si en la colecci�n existe la patente ingresada
	            Iterator<Mantencion>iterador=this.mantenciones.iterator(); //Creaci�n de un iterador para recorrer el ArrayList
	            while (iterador.hasNext()) { //Avanza en el ArrayList mientras este a�n tenga contenido por recorrer
	                Mantencion mant = iterador.next(); //Variable auxiliar que almacena cada mantenci�n
	                if(mant.getAuto().getPatente().equals(patente)) { //Consulta si la patente ingresada es igual a la patente en el ArrayList
	                    System.out.println(mant.toString()); //Imprime la lista de mantenciones
	                }
	            }
	        }
	        else {
	            System.out.println("El veh�culo no existe"); // Mensaje en caso de no encontrar la patente
	        }
		}
    }
	/**
	 * M�todo que imprime la suma del costo de todas las mantenciones realizadas en una fecha determinada.
	 */
	private void reporteRecaudacion() {
		System.out.println("Ingrese la fecha cuya recaudaci�n desea revisar.");
		leer.nextLine();
		int total=0;
		System.out.print("D�a: ");
		String dia = leer.nextLine();
		if(dia.matches("^(0[1-9]|[12][0-9]|[3][0-1])$")) {
			System.out.print("Mes: ");
			String mes = leer.nextLine();
			if(mes.matches("^(0[1-9]|[1][0-2])$")) {
				System.out.print("A�o: ");
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
					System.out.println("Formato de a�o no v�lido. Por favor reintente");
				}
			}
			else {
				System.out.println("Formato de mes no v�lido. Por favor reintente");
			}
		}
		else {
			System.out.println("Formato de d�a no v�lido. Por favor reintente");
		}
		System.out.println("Recaudaci�n total del d�a");
		System.out.println(total);
	}
}