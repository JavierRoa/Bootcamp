import java.util.Scanner;
public class xASig100UsandoDoWhile {

	public static void main(String[] args) {
		int cont,num,acum,res;
		cont=0;
		acum=0;
		res=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese número");
		num=leer.nextInt();
		cont=num;
		do {
			acum=acum+cont;
			res=acum;
			cont++;
		}
		while(cont<=num+99);
		System.out.println(res);
	}
}