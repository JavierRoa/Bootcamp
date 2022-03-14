
public class de1A100UsandoDoWhile {

	public static void main(String[] args) {
		int cont,acum,res;
		cont=1;
		acum=0;
		res=0;
		
		do {
			acum=acum+cont;
			res=acum;	
			cont++;
		}
		while(cont<=100);
		System.out.println(res);
	}
}