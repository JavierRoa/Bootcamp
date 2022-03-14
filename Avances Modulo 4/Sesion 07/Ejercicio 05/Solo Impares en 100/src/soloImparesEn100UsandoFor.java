import java.util.Scanner;

public class soloImparesEn100UsandoFor {

	public static void main(String[] args) {
		int contIm,num,val;
		contIm=0;

		
		Scanner leer = new Scanner(System.in);
		for(int cont=1;cont<=100;cont++) {
			System.out.println("Ingrese número " + cont);
			num=leer.nextInt();
			val=num%2;
			if(val==1) {
				contIm++;
				System.out.println("Número Ingresado");
			}
		}
		System.out.println("Cantidad de números impares: " + contIm);
	}
}