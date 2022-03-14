import java.util.Scanner;

public class factorialUsandoFor {

	public static void main(String[] args) {
		int cont,num,acum,res;
		acum=1;
		res=0;
		
		Scanner leer = new Scanner(System.in);
		
		for(cont=1;cont<=10;cont++) {
			System.out.println("Ingrese número " + cont);
			num=leer.nextInt();
			acum=acum*num;
			res=acum;
		}
		System.out.println(res);
	}
}