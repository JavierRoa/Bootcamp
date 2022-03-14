import java.util.Scanner;

public class xA100UsandoWhile {

	public static void main(String[] args) {
		int cont,num,acum,res;
		cont=0;
		acum=0;
		res=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese número");
		num=leer.nextInt();
		cont=num;

		while(cont<=num+99) {
			acum=acum+cont;
			res=acum;
			cont++;
		};
		System.out.println(res);
	}
}