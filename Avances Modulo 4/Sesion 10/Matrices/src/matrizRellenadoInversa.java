public class matrizRellenadoInversa {

	public static void main(String[] args) {
		int ma[][] = new int[6][6];
		System.out.println("Diagonal inversa");
		System.out.println("");
		for(int fila=0; fila<6; fila++) {
			for(int columna=0; columna<6; columna++) {
				if(fila==columna) {
					ma[fila][columna]=1;
				}
				System.out.print(ma[fila][columna]);
			}
			System.out.println();
		}
	}
}