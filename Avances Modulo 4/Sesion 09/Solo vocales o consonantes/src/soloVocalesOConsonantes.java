import java.util.Scanner;

public class soloVocalesOConsonantes {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String palabra;

		
		System.out.println("Ingrese palabra");
		palabra=leer.next();
		char word[] = new char[palabra.length()];
		
		System.out.println("");
		System.out.println("Solo consonantes");
		for(int i=0;i<palabra.length();i++) {
			word[i]=palabra.charAt(i);
			if(word[i]!='a'&&word[i]!='e'&&word[i]!='i'&&word[i]!='o'&&word[i]!='u') {
				System.out.print(word[i]);
			}
		}
		System.out.println("");
		System.out.println("Solo vocales");
		for(int i=0;i<palabra.length();i++) {
			word[i]=palabra.charAt(i);
			if(word[i]=='a'||word[i]=='e'||word[i]=='i'||word[i]=='o'||word[i]=='u') {
				System.out.print(word[i]);
			}
		}
	}
}