import java.util.Scanner;

public class arrayChar {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		char letra;
		int length;
		System.out.println("Ingrese largo del nombre");
		length=leer.nextInt();
		char arr[] = new char[length];
		
			for(int i=0; i<arr.length; i++) {
			System.out.println("Ingrese letra: " + (i+1));
			letra = leer.next().charAt(0);
			arr[i] = letra;
			}
			
			System.out.println();
			
			for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			}
		
		System.out.println();
		
		for(int i=arr.length-1; i>=0; i--) {
		System.out.print(arr[i]);
		}
	}
}