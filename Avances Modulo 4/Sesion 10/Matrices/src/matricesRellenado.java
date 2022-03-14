import java.util.Scanner;

public class matricesRellenado {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int largoFila, largoColumna;
	
		System.out.println("Ingrese el largo de la fila: ");
		largoFila = leer.nextInt();
	
		System.out.println("Ingrese el largo de la columna: ");
		largoColumna = leer.nextInt();
	
		int ma[][] = new int[largoFila][largoColumna];
	
		for(int fila=0; fila<largoFila; fila++) {
			for(int columna=0; columna<largoColumna; columna++) {
				System.out.println("Ingrese valor para la coordenada ma["+fila+"]["+columna+"]");
				ma[fila][columna] = leer.nextInt();
			}
		}
			
		for(int fila=0; fila<largoFila; fila++) {
			for(int columna=0; columna<largoColumna; columna++) {
			System.out.print(ma[fila][columna]);
			}
		System.out.println();
		}
	}
}