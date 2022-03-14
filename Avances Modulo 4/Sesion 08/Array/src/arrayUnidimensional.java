import java.util.Scanner;

public class arrayUnidimensional {
	
	public static void main(String[] args) {
		//primera forma para declarar el array (para ingresar valores posteriormente)
		Scanner leer = new Scanner(System.in);
		int n1,n2,n3,n4,n5;
		int cont,x;
		cont=0;
		int a[] = new int[5];
		a[0] = 5;
		a[1] = 90;
		a[2] = 30;
		a[3] = 80;
		a[4] = 100;
		System.out.println("Array 1");
		System.out.println("Elemento en la posición: " + a[3]);
		System.out.println("Largo del arreglo: " + a.length);
		System.out.println();
		//segunda forma para declarar el array (para valores previamente conocidos)
		
		int b[] = new int [] {5, 90, 30, 85, 100, 120};
		System.out.println("Array 2");
		System.out.println("Elemento en la posición: " + b[3]);
		System.out.println("Largo del arreglo: " + b.length);
		System.out.println();
		
		//forma 1 de llenar un array
		System.out.println("Array 3");
		int c[] = new int[5];
		System.out.println("Ingrese número para llenar el índice 0 de c[]");
		n1=leer.nextInt();
		c[0]=n1;
		
		System.out.println("Ingrese número para llenar el índice 1 de c[]");
		n2=leer.nextInt();
		c[1]=n2;
		
		System.out.println("Ingrese número para llenar el índice 2 de c[]");
		n3=leer.nextInt();
		c[2]=n3;
		
		System.out.println("Ingrese número para llenar el índice 3 de c[]");
		n4=leer.nextInt();
		c[3]=n4;
		
		System.out.println("Ingrese número para llenar el índice 4 de c[]");
		n5=leer.nextInt();
		c[4]=n5;
		
		System.out.println(c[3]);
		System.out.println();
		
		System.out.println("Array 4");
		int d[]= new int[5];
		
		//forma 2 para llenar el array
		for(int i=0; i<d.length; i++) {
			System.out.println("Ingrese elemento para el índice " + i);
			x=leer.nextInt();
			d[i]=x;
			System.out.println();
		}	
			
		//for para imprimir el array
		for(int j=0;j<d.length;j++) {
			System.out.println("d["+j+"] = "+d[j]);
		}
		System.out.println();
	}
}