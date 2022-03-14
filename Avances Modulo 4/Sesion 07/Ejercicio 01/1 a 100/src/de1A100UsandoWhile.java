
public class de1A100UsandoWhile {

	public static void main(String[] args) {
		int cont,acum,res;
		cont=1;
		acum=0;
		res=0;
		while(cont<=100) {
			acum=acum+cont;
			res=acum;	
			cont++;
		}
		System.out.println(res);
	}
}