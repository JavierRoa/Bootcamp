import java.util.Scanner;

public class imparesExclusivoUsandoDoWhile {

	public static void main(String[] args) {
		int cont,num,val;
		cont=1;
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese impar n�mero "+cont);
			num=leer.nextInt();
			val=num%2;
			if(val==1) {
				System.out.println("N�mero ingresado exitosamente");
				cont++;
			}
			else {
				System.out.println("N�mero par. Por favor ingrese un n�mero impar");
			}
		}
		while (cont<=10);
		
		System.out.println("Ciclo terminado");
	}
}