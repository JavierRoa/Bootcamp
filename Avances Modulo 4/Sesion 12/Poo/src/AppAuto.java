
public class AppAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Mitsubishi", "G53OIK", "no sé", "FBCD12");

		auto1.setMarca("Chevrolet");
		auto1.setSerie("A53OG1");
		auto1.setModelo("sigo sin saber");
		auto1.setPlaca("FGRD54");
		
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Serie: " + auto1.getSerie());
		System.out.println("Modelo: " + auto1.getModelo());
		System.out.println("Placa: " + auto1.getPlaca());
		System.out.println("");
		
		Auto auto2 = new Auto("Mitsubishi", "G53OIK", "aún no sé", "FBCD12");

		auto2.setMarca("Audi");
		auto2.setSerie("BHQ617");
		auto2.setModelo("nunca sabré");
		auto2.setPlaca("OVUS87");
		
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Serie: " + auto2.getSerie());
		System.out.println("Modelo: " + auto2.getModelo());
		System.out.println("Placa: " + auto2.getPlaca());
	}
}