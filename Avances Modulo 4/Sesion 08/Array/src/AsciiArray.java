public class AsciiArray {

	public static void main(String[] args) {
	char a[] = new char[127];
	
		System.out.println("::: Llenado de char :::");
		for(int i=32; i<a.length; i++) {
		a[i] = (char)i;
		}
		
		System.out.println("::: Tabla ASCII :::");
		for(int i=32; i<a.length; i++) {
		System.out.println(a[i]);
		}
	}
}