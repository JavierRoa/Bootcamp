import java.util.Scanner;

public class multiplicacionUsandoFor {

	public static void main(String[] args) {
		int num,acum,res;
		acum=1;
		res=0;
		Scanner leer = new Scanner(System.in);
		
		for(int cont=1;cont<=10;cont++) {
			System.out.println("Ingrese número " + cont);
			num=leer.nextInt();
			acum=acum*num;
			res=acum;	
		}
		System.out.println(res);	
	}
}