
public class matrizDiagonales {

	public static void main (String[] args) {
		int ma[][] = {{0,0,1},{0,1,0},{1,0,0}};

		System.out.println("Diagonal");	
		System.out.println("");
		
		System.out.print(ma[0][0]);
		System.out.print(ma[0][1]);
		System.out.println(ma[0][2]);
		System.out.print(ma[1][0]);
		System.out.print(ma[1][1]);
		System.out.println(ma[1][2]);
		System.out.print(ma[2][0]);
		System.out.print(ma[2][1]);
		System.out.println(ma[2][2]);
		
		System.out.println("");
		
		int ma2[][] = new int[3][3];
		ma2[0][0]=1;
		ma2[0][1]=0;
		ma2[0][2]=0;
		ma2[1][0]=0;
		ma2[1][1]=1;
		ma2[1][2]=0;
		ma2[2][0]=0;
		ma2[2][1]=0;
		ma2[2][2]=1;
		
		
		System.out.println("Diagonal inversa");
		System.out.println("");
		
		System.out.print(ma2[0][0]);
		System.out.print(ma2[0][1]);
		System.out.println(ma2[0][2]);
		System.out.print(ma2[1][0]);
		System.out.print(ma2[1][1]);
		System.out.println(ma2[1][2]);
		System.out.print(ma2[2][0]);
		System.out.print(ma2[2][1]);
		System.out.println(ma2[2][2]);
		
	}
}