import java.util.Scanner;

public class soloParesUsandoWhile {

	public static void main(String[] args) {
		int cont,num,num2,acum,res,val;
		cont=0;
		acum=0;
		res=0;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese n?mero inicial");
		num=leer.nextInt();
		System.out.println("Ingrese n?mero final");
		num2=leer.nextInt();
		cont=num;
		
		while (cont<=num2) {
			val=cont%2;
			if(val==0) {
				acum=acum+cont;
				res=acum;
			}
			cont++;
		}
		System.out.println(res);	
	}
}