import java.util.Scanner;

public class PalindromoOracion {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String frase, pal;
		boolean val = true;
		int x;
		
		System.out.println("Ingrese frase");
		frase=leer.nextLine();
		pal=frase.replace(" ","");
		char word[] = new char[pal.length()];
		for(int i=0;i<pal.length();i++) {
			word[i]=pal.charAt(i);
		}
		for(int i=0;i<word.length;i++) {
			x=pal.length()-1-i;
			if(word[i]!=word[x]) {
				val=false;
			break;	
			}
		}
		if(val) {
			System.out.println("Es palíndromo");
		}
		else {
			System.out.println("No es palíndromo");
		}
	}
}