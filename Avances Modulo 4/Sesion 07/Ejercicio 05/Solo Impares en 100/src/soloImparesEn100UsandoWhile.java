import java.util.Scanner;

public class soloImparesEn100UsandoWhile {
	
	public static void main(String[] args) {
		int cont,contIm,num,val;
		cont=1;
		contIm=0;

		
		Scanner leer = new Scanner(System.in);
		while (cont<=4) {
			System.out.println("Ingrese número " + cont);
			num=leer.nextInt();
			val=num%2;
			if(val==1) {
				contIm++;
				System.out.println("Número Ingresado");
			}
			cont++;
		}
		System.out.println("Cantidad de números impares: " + contIm);
	}
}