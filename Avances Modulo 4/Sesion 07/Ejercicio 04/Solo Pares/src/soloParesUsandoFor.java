import java.util.Scanner;

public class soloParesUsandoFor {

	public static void main(String[] args) {
		int num,num2,acum,res,val;
		acum=0;
		res=0;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese n�mero inicial");
		num=leer.nextInt();
		System.out.println("Ingrese n�mero final");
		num2=leer.nextInt();
		
		for(int cont=num;cont<=num2;cont++) {
			val=cont%2;
			if(val==0) {
				acum=acum+cont;
				res=acum;			
			}
		}
		System.out.println(res);	
	}
}