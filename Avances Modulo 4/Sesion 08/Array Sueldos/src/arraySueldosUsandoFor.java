import java.util.Scanner;

public class arraySueldosUsandoFor {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		float sl[]= new float[4];
		float sumSB,sumSL,promSL;
		int sb;
		sumSB=0;
		sumSL=0;
		promSL=0;
		for(int i=0; i<sl.length; i++) {
			System.out.println("Ingrese sueldo bruto " + (i+1));
			sb=leer.nextInt();
			sl[i]=sb*0.8f;
			sumSB=sumSB+sb;
			sumSL=sumSL+sl[i];
			promSL=sumSL/sl.length;
		}
		System.out.println("La suma de los sueldos base es: "+sumSB);
		System.out.println("El promedio de los sueldos líquidos es: "+promSL);
	}
}