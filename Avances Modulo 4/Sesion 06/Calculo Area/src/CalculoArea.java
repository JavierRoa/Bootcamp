import java.util.Scanner;

public class CalculoArea {

	public static void main(String[] args) {
	float pi;
	float radio;
	float res;
	
	pi = 3.14f;
			
	Scanner area = new Scanner(System.in);
	
	System.out.println("Ingrese el radio del circulo: ");
	radio = area.nextFloat();
	
	res = pi*radio*radio;
	
	System.out.println("El área es: " + res);
	}
}