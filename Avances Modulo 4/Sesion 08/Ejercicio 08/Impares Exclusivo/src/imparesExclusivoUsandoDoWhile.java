import java.util.Scanner;

public class imparesExclusivoUsandoDoWhile {

	public static void main(String[] args) {
		int cont,num,val;
		cont=1;
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese impar número "+cont);
			num=leer.nextInt();
			val=num%2;
			if(val==1) {
				System.out.println("Número ingresado exitosamente");
				cont++;
			}
			else {
				System.out.println("Número par. Por favor ingrese un número impar");
			}
		}
		while (cont<=10);
		
		System.out.println("Ciclo terminado");
	}
}