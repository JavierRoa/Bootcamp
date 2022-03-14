import java.util.Scanner;

public class areasUsandoWhile {

	public static void main(String args[]) {
		Scanner leer = new Scanner(System.in);
		float ap,med,pi,radio,res;
		int lados;
		pi = 3.14f;
		lados = 0;
		
		while (lados!=2) {
			System.out.println("Ingrese número de lados de la figura. Ingrese 2 para salir");
			lados=leer.nextInt();
			switch (lados) {
			case 1:
				System.out.println("Ingrese radio (en cm)");
				radio = leer.nextFloat();
				res = pi*radio*radio;
				System.out.println(res+" cms cuadrados");
				break;
			case 2:
				System.out.println("Salir");
				break;
			case 3:
				System.out.println("Ingrese base (en cm)");
				med = leer.nextFloat();
				System.out.println("Ingrese altura (en cm)");
				ap = leer.nextFloat();
				res = med*ap/2;
				System.out.println(res+" cms cuadrados");
				break;
			case 4:
				System.out.println("Ingrese medida de los lados (en cm)");
				med = leer.nextFloat();
				res = med*med;
				System.out.println(res+" cms cuadrados");
				break;
			default:
				System.out.println("Ingrese medida de los lados (en cm)");
				med = leer.nextFloat();
				System.out.println("Ingrese apotema");
				ap = leer.nextFloat();
				res = (lados*med*ap)/2;
				System.out.println(res+" cms cuadrados");
			}
		}
	}
}