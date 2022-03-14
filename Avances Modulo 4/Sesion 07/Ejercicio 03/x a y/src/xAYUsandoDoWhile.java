import java.util.Scanner;

public class xAYUsandoDoWhile {

	public static void main(String[] args) {
		int cont,num,num2,acum,res;
		cont=0;
		acum=0;
		res=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese número inicial");
		num=leer.nextInt();
		System.out.println("Ingrese número final");
		num2=leer.nextInt();
		cont=num;

		do {
			acum=acum+cont;
			res=acum;
			cont++;
		}
		while(cont<=num2);
		System.out.println(res);
	}
}