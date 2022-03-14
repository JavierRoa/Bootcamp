import java.util.Scanner;

public class multiplicacionUsandoDoWhile {

	public class multiplicacionUsandoWhile {

		public static void main(String[] args) {
			int cont,num,acum,res;
			cont=1;
			acum=1;
			res=0;
			Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese número " + cont);
			num=leer.nextInt();
			do {
				acum=acum*num;
				res=acum;
				cont++;
			}
			while(cont<=10);
			System.out.println(res);
		}
	}
}