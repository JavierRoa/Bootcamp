import java.util.Scanner;
public class Acumulador {

	public static void main(String[] args) {
		float nota,acum,promG;
		int cont;
		cont=0;
		acum=0;
		promG=0;
		Scanner leer = new Scanner(System.in);
		
		while(cont<3) {
			cont++;
			System.out.println("Ingrese nota para el alumno " + cont);
			nota = leer.nextFloat();
			acum = acum+nota;
		}
		promG=acum/3;
		System.out.println("El promedio general es: " + promG);
	}
}
