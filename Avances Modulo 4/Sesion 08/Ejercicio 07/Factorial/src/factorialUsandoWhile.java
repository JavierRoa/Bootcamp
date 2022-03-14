import java.util.Scanner;

public class factorialUsandoWhile {

	public static void main(String[] args) {
		int cont,num,acum,res;
		cont=1;
		acum=1;
		res=0;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese número " + cont);
		num=leer.nextInt();
		

		while(cont<=num) {
			acum=acum*cont;
			res=acum;
			cont++;
		}
		System.out.println(res);
	}
}
