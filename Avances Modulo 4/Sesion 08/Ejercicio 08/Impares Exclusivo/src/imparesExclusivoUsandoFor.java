import java.util.Scanner;

public class imparesExclusivoUsandoFor {

	public static void main(String[] args) {
		int num,val;
		Scanner leer = new Scanner(System.in);
		
		for(int cont=1;cont<=10;cont++) {
			System.out.println("Ingrese impar número "+cont);
			num=leer.nextInt();
			val=num%2;
			if(val==1) {
				System.out.println("Número ingresado exitosamente");
			}
			else {
				System.out.println("Número par. Por favor ingrese un número impar");
				cont--;
			}
		}
		
		System.out.println("Ciclo terminado");
	}
}