import java.util.Scanner;
public class calculadoraFunciones {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		char operacion;
		float num1, num2;
		System.out.println("Ingrese primer n�mero");
		num1=leer.nextFloat();
		System.out.println("Ingrese s�mbolo de operaci�n");
		operacion=leer.next().charAt(0);
		System.out.println("Ingrese primer n�mero");
		num2=leer.nextFloat();
		switch(operacion) {
			case '+':
				sumar(num1,num2);
			break;
			case '-':
				restar(num1,num2);
			break;
			case '*':
				multiplicar(num1,num2);
			break;
			case '/':
				dividir(num1,num2);
			break;
		}
	}
	public static void sumar(float x, float y) {
		float res;
		res=x+y;
		System.out.println(x+" + "+y+" = "+res);
	}
	public static void restar(float x, float y) {
		float res;
		res=x-y;
		System.out.println(x+" - "+y+" = "+res);
	}
	public static void multiplicar(float x, float y) {
		float res;
		res=x*y;
		System.out.println(x+" * "+y+" = "+res);
	}
	public static void dividir(float x, float y) {
		float res;
		if(x==0 || y==0) {
			System.out.println("Error");
		}
		else {
			res=x/y;
			System.out.println(x+" / "+y+" = "+res);
		}
	}
}