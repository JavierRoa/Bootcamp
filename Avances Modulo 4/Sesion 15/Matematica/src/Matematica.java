/**Esta clase te permite hacer diferentes operaciones matem�ticas. <br>
 * @author Javier Roa
 */
public class Matematica {

	/** Este m�todo se usa para sumar 2 valores definidos 
	 * en el mismo m�todo (5 y 7 respectivamente). <br>
	 * No tiene retorno
	 */
	public void sumar() {
		int a;
		int b;
		int r;
		
		a=5;//
		b=7;//
		r=0;//
		
		r=a+b;//
		
		System.out.println("La suma de "+a+" m�s "+b+" es: "+r);
	}
	/**Este m�todo sirve para sumar 2 valores definidos
	 * por el usuario. <br>
	 * Proporciona retorno
	 * @param a es un valor entero, es el primer n�mero a sumar
	 * @param b es un valor entero, es el segundo numero a sumar
	 * @return es el retorno del valor de r
	 */
	public int sumar(int a, int b) {
		int r;//
		r=a+b;//
		return r;//
	}
	/**Este m�todo resta 2 valores enteros, proporcionando un
	 * long como resultado. <br>
	 * Proporciona retorno.
	 * @param a es un valor entero
	 * @param b
	 * @return
	 */
	public long restar(int a, int b) {
		long r;//
		r=a-b;//
		return r;//
	}
	/** Este m�todo sirve para multiplicar 2 valores
	 * previamente establecidos en el m�todo. <br>
	 * Proporciona retorno
	 * @return es el retorno que proporciona el valor de r.
	 */
	public float multiplicar() {
		float a;
		float b;
		float r;
		a=2;
		b=4;
		r=0;
		r=a*b;
		return r;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiplicar(int a, int b) {
		int r;
		r=0;
		r=a*b;
		return r;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public double dividir (int a, int b) {
		double r;
		r=0;
		r=a/b;
		return r;
	}
}
