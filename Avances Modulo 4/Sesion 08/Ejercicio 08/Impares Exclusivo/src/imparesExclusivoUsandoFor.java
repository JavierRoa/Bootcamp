import java.util.Scanner;

public class imparesExclusivoUsandoFor {

	public static void main(String[] args) {
		int num,val;
		Scanner leer = new Scanner(System.in);
		
		for(int cont=1;cont<=10;cont++) {
			System.out.println("Ingrese impar n�mero "+cont);
			num=leer.nextInt();
			val=num%2;
			if(val==1) {
				System.out.println("N�mero ingresado exitosamente");
			}
			else {
				System.out.println("N�mero par. Por favor ingrese un n�mero impar");
				cont--;
			}
		}
		
		System.out.println("Ciclo terminado");
	}
}