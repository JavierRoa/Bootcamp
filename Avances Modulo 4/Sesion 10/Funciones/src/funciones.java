import java.util.Scanner;
public class funciones {

	public static void main(String[] args) {
		String x, y;
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese nombre");
		x=leer.next();
		System.out.println("Ingrese apellido");
		y=leer.next();
		saludarP2(x, y);
	}
	/*Funcion sin parámetros
	public static void saludar() {
		System.out.println("Hola :3");
	}*/
	/*Funcion con 1 parámetro
	public static void saludarP(String nombre) {
		System.out.println("Hola "+nombre);
	}*/
	public static void saludarP2(String nombre, String apellido) {
		System.out.println("Hola "+nombre+" "+apellido);
	}
}
