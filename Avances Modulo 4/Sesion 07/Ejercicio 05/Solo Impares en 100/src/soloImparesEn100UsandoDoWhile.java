import java.util.Scanner;

public class soloImparesEn100UsandoDoWhile {

	public static void main(String[] args) {
		int cont,contIm,num,val;
		cont=1;
		contIm=0;

		
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println("Ingrese número " + cont);
			num=leer.nextInt();
			val=num%2;
			if(val==1) {
				contIm++;
				System.out.println("Número Ingresado");
			}
			cont++;
		}
		while (cont<=100);
		System.out.println("Cantidad de números impares: " + contIm);
	}
}