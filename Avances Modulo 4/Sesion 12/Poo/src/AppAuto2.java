
public class AppAuto2 {
	
	public static void main(String[] args) {
		
		Auto2 auto1 = new Auto2("FBCD12","Kia","no sé","rojo",2005);
		
		auto1.apagar();
		auto1.encender();
		auto1.encender();
		auto1.apagar();

		System.out.println("Color: "+auto1.getColor());
	}
}
