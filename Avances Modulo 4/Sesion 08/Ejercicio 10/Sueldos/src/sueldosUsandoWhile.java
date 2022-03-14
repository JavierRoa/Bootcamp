import java.util.Scanner;

public class sueldosUsandoWhile {

	public static void main(String args[]) {
		Scanner leer = new Scanner(System.in);
		float acum,acumMay,sueldoLiq;
		int cont,cont2,contMen,num,sueldoBruto;
		cont = 0;
		cont2 = 0;
		contMen = 0;
		acum = 0;
		acumMay = 0;
		
		while(cont2<1) {
			System.out.println("Ingrese 1 para calcular el siguiente sueldo");
			System.out.println("Ingrese cualquier otro número para salir");
			num = leer.nextInt();
			cont2 = 1;
			if (num==1) {
				System.out.println("Ingrese sueldo bruto");
				sueldoBruto = leer.nextInt();
				sueldoLiq = sueldoBruto*0.8f;
				System.out.println("Sueldo líquido: "+sueldoLiq);
				if (sueldoLiq>=450000) {
					acumMay = acumMay+sueldoLiq;
					cont2 = cont2-1;
				} else {
					contMen = contMen+1;
					cont2 = cont2-1;
				}
				acum = acum+sueldoLiq;
				cont = cont+1;
			} else {
				System.out.println("Sueldos calculados!");
			}
		}
		System.out.println("Suma total sueldos líquidos: "+acum);
		System.out.println("Cantidad sueldos líquidos ingresados: "+cont);
		System.out.println("Cantidad sueldos menores a $450.000: "+contMen);
		System.out.println("Suma sueldos mayores o iguales a $450.000: "+acumMay);
		System.out.println("Salir");
	}
}