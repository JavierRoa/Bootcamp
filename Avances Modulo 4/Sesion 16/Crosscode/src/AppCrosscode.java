import personajes.Lea;
import personajes.Triblader;
import background.Arbol;
import background.Escenario;
public class AppCrosscode {

	public static void main (String[] args) {
		// Creación de objetos
		Escenario sc = new Escenario(100, 100, "Imagen con diseño");
		Arbol a1 = new Arbol(10, 10, 32, 44, "Verde", false);
		Lea lea = new Lea("Spheromancer", 4, 2, 50, 50, true, false, "Abajo", false, false);
		Triblader tri = new Triblader("Triblader", 4, 2, 24, 25, true, false, "Arriba");
		// Algunos métodos para mostrar.
		lea.cambioNinja();
		lea.saltarDerecha();
		lea.sentarLevantar(lea);
		lea.sentarLevantar(lea);
		tri.sentarLevantar(tri);
		tri.sentarLevantar(tri);
		a1.destruido();
	}
}
