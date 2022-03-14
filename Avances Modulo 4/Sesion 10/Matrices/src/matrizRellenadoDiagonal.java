public class matrizRellenadoDiagonal {

	public static void main(String[] args) {
		int ma[][] = new int[6][6];
		int val;
		System.out.println("Diagonal");
		System.out.println("");
		for(int fila=0; fila<6; fila++) {
			for(int columna=0; columna<6; columna++) {
				val=fila+columna;
				if(val==5) {
					ma[fila][columna]=1;
				}
				System.out.print(ma[fila][columna]);
			}
			System.out.println();
		}
	}
}	