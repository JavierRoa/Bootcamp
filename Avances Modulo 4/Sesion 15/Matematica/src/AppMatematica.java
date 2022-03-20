
public class AppMatematica {
	
	public static void main (String[] args) {
		Matematica m = new Matematica();
		
		m.sumar();
		System.out.println(m.sumar(5, 3));
		System.out.println(m.restar(3, 5));
		System.out.println(m.multiplicar());
		System.out.println(m.multiplicar(4, 2));
		System.out.println(m.dividir(10, 2));
	}

}
