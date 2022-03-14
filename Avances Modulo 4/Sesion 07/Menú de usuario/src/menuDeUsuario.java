import java.util.Scanner;

public class menuDeUsuario {

	public static void main(String[] args) {
		int opcion;
		Scanner leer = new Scanner(System.in);
				
		do {
			System.out.println("1- Para Saludar");
			System.out.println("2- Para Despedir");
			System.out.println("3- Para Reir");
			System.out.println("4- Para Salir del Ciclo");
			opcion = leer.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Hola");
			break;
			case 2:
				System.out.println("Chao");
			break;	
			case 3:
				System.out.println("HAHAHAHAHAHAHA");
			break;
			case 4:
				System.out.println("Adiós");
			break;
			default:
				System.out.println("Opción inválida");
			}
		}
		while (opcion != 4);
	}
}