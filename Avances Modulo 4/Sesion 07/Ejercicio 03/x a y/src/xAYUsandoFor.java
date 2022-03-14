import java.util.Scanner;

public class xAYUsandoFor {

	public static void main(String[] args) {
		int num,num2,acum,res;
		acum=0;
		res=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese número inicial");
		num=leer.nextInt();
		System.out.println("Ingrese número final");
		num2=leer.nextInt();
		
		for(int cont=num;cont<=num2;cont++) {
			acum=acum+cont;
			res=acum;			
		}
		System.out.println(res);	
	}
}