
public class de1A100UsandoFor {

	public static void main(String[] args) {
		int acum,res;
		acum=0;
		res=0;
		
		for(int cont=1;cont<=100;cont++) {
			acum=acum+cont;
			res=acum;			
		}
		System.out.println(res);
	}
}