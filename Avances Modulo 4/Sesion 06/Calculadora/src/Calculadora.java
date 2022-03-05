import java.util.Scanner;
public class Calculadora {
	public static void main(String args[]) {
		float num1;
		char opcion;
		float num2;
		float res;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese primer n�mero");
		num1 = leer.nextFloat();
		
		System.out.println("Ingrese s�mbolo de operaci�n");
		opcion = leer.next().charAt(0);
		
		System.out.println("Ingrese segundo n�mero");
		num2 = leer.nextFloat();
		
			switch (opcion) {
				case '+':
					res = num1 + num2;
					System.out.println(num1 + " m�s " + num2 + " es igual a " + res);
				break;
				case '-':
					res = num1 - num2;
					System.out.println(num1 + " menos " + num2 + " es igual a " + res);
				break;
				case '*':
					res = num1 * num2;
					System.out.println(num1 + " multiplicado por " + num2 + " es igual a " + res);
				break;
				case '/':
					if (num1==0 || num2==0) {
						System.out.println("Error");
					} 
					else {
						res = num1 / num2;
						System.out.println(num1 + " dividido por " + num2 + " es igual a " + res);
					}
				break;
				default:
					System.out.println("Error de s�mbolo de operaci�n");
			}
		}
	}