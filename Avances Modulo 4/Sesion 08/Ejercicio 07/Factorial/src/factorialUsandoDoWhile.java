import java.util.Scanner;

public class factorialUsandoDoWhile {

	public static void main(String[] args) {
		int cont,num,acum,res;
		cont=1;
		acum=1;
		res=0;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese número " + cont);
		num=leer.nextInt();
		
		do {
			acum=acum*cont;
			res=acum;
			cont++;
		}
		while(cont<=num);
		System.out.println(res);
	}
}