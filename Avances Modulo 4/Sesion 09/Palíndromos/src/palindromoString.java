import java.util.Scanner;

public class palindromoString {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String palabra;
		boolean val = true;
		int x;
		
		System.out.println("Ingrese palabra");
		palabra=leer.next();
		char word[] = new char[palabra.length()];

		for(int i=0;i<palabra.length();i++) {
			word[i]=palabra.charAt(i);
		}
		for(int i=0;i<word.length;) {
			x=palabra.length()-1-i;
			if(word[i]!=word[x]) {
				val=false;
			}
			break;
		}
		if(val) {
			System.out.println("Es palíndromo");
		}
		else {
			System.out.println("No es palíndromo");
		}
	}
}