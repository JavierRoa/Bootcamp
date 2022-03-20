
public class AppGato {

	public static void main(String[] args) {
		Gato michi1 = new Gato("Balthazar", "Angora", 30, "Blanco");
		
		System.out.println("Nombre: "+michi1.getNombre());
		System.out.println("Raza: "+michi1.getRaza());
		System.out.println("Altura: "+michi1.getAltura());
		System.out.println("Color: "+michi1.getColor());
		System.out.println("");
		
		michi1.setNombre("Misifus");
		michi1.setRaza("Egipcio");
		michi1.setAltura(25);
		michi1.setColor("Gris");
		
		System.out.println("Nombre: "+michi1.getNombre());
		System.out.println("Raza: "+michi1.getRaza());
		System.out.println("Altura: "+michi1.getAltura());
		System.out.println("Color: "+michi1.getColor());
	}
}	