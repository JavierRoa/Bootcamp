import java.util.Scanner;

public class multiplicacionUsandoWhile {

	public static void main(String[] args) {
		int cont,num,acum,res;
		cont=1;
		acum=1;
		res=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese número " + cont);
		num=leer.nextInt();

		while(cont<=10) {
			acum=acum*num;
			res=acum;
			cont++;
		};
		System.out.println(res);
	}
}