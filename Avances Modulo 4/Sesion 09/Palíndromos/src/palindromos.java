import java.util.Scanner;

public class palindromos {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		char letra;
		int length,x;
		boolean val = true;
		x=0;
		System.out.println("Ingrese largo de la palabra");
		length=leer.nextInt();
		char arr[] = new char[length];

		for(int i=0; i<arr.length; i++) {
			System.out.println("Ingrese letra: "+(i+1));
			letra = leer.next().charAt(0);
			arr[i] = letra;
		}
		for(int i=0; i<arr.length; i++) {
			x=arr.length-1-i;
			if(arr[i]!=arr[x]) {
				val = false;
			}
			System.out.print(arr[i]);
		}

		System.out.println("");
		if(val) {
			System.out.println("La palabra es palíndroma");
		}
		else {
			System.out.println("La palabra NO es palíndroma");
		}
	}
}