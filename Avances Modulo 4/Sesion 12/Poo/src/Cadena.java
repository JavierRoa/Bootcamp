
import java.util.ArrayList;

public class Cadena {

	public static void main(String[] args) {
		//String inicial
		String inicial = "30+9-8*31-98/2+15+80+60+14-9*2/14+80-10+9";
		//Dividiendo el string parte por parte
		String items[] = inicial.split("(?=[-+*/()])|(?<=[-+*/()])");
		//Definición de array de Strings de símbolos (auxiliar)
		String simbolos[] = {"*", "/", "+", "-"};
		//String auxiliar para almacenar Strings de un ArrayList
		String obj;
		//Float auxiliares
		float num1, num2, res;
		//Definición de un ArrayList para guardar los números y símbolos matemáticos (modificable)
		ArrayList<String> lista = new ArrayList<String>();

		//Llenado del ArrayList
		for (int i=0; i<items.length; i++) {
			lista.add(items[i]);
		}

		//Prioridad de Operaciones (MULT-DIV luego SUMA-RESTA)
		for (int i=0; i<4; i+=2) {
			//Recorrido del ArrayList con los números y símbolos.
			for (int j=0; j<lista.size(); j++) {
				obj = lista.get(j); //Elemento del ArrayList
				if (obj.equals(simbolos[i]) || obj.equals(simbolos[i+1])) {
					res = 0;
					num1 = Float.parseFloat(lista.get(j-1)); //Número a la izquierda del símbolo
					num2 = Float.parseFloat(lista.get(j+1)); //Número a la derecha del símbolo
					switch (obj) {
						//Operación
						case "+":
							res = num1 + num2;
							break;
						case "-":
							res = num1 - num2;							
							break;
						case "*":
							res = num1 * num2;							
							break;
						case "/":
							res = num1 / num2;							
							break;
					}
					lista.set(j, String.valueOf(res)); //El resultado reemplaza al símbolo
					lista.remove(j-1); //Borra valor a la izquierda
					lista.remove(j); //Borra valor a la derecha
					j--; //Corrección del contador por eleminar elementos anteriormente borrados.
				}
			}
		}
		//Resultado final
		System.out.println("El resultado final es: " + lista.get(0));
	}
}