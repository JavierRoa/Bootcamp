import java.util.Scanner;
public class xASig100UsandoFor {

	public static void main(String[] args) {
		int num,acum,res;
		acum=0;
		res=0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese número");
		num=leer.nextInt();
		
		for(int cont=num;cont<=99+num;cont++) {
			acum=acum+cont;
			res=acum;			
		}
		System.out.println(res);	
	}
}