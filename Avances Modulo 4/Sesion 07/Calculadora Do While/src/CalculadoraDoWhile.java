import java.util.Scanner;
public class CalculadoraDoWhile {
	public static void main(String args[]) {
		float num1;
		int opcion;
		float num2;
		float res;
		opcion = 0;
		
		Scanner leer = new Scanner (System.in);
		
			do {
				System.out.println("1- Para Sumar");
				System.out.println("2- Para Restar");
				System.out.println("3- Para Dividir");
				System.out.println("4- Para Multiplicar");
				System.out.println("5- Para Salir");
				opcion = leer.nextInt();
				if(opcion>0 && opcion<=4) {
					System.out.println("Ingrese primer número");
					num1 = leer.nextFloat();
					System.out.println("Ingrese segundo número");
					num2 = leer.nextFloat();
					
					switch (opcion) {
						case 1:
							res = num1 + num2;
							System.out.println(num1 + " más " + num2 + " es igual a " + res);
						break;
						case 2:
							res = num1 - num2;
							System.out.println(num1 + " menos " + num2 + " es igual a " + res);
						break;
						case 3:
							if (num1==0 || num2==0) {
								System.out.println("Error");
							} 
							else {
								res = num1 / num2;
								System.out.println(num1 + " dividido por " + num2 + " es igual a " + res);
							}
						break;
						case 4:
							res = num1 * num2;
							System.out.println(num1 + " multiplicado por " + num2 + " es igual a " + res);
						break;
					}
				}
				else if (opcion==5) {
					System.out.println("Usted ha salido de la calculadora");
				}
				else {
					System.out.println("Opción inválida");
				}
			}
			while(opcion != 5);
		}
	}