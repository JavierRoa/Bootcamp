/**
 * 
 * @author Javier Roa
 *
 */
public class AppPacman {

	public static void main(String[] args) {
		//Creacion de objetos
		Escenario sc1 = new Escenario(100, 100, "Negro");
		Contorno co1 = new Contorno(100, 100, 1);
		EntradaSalida es1 = new EntradaSalida(5, 5);
		EntradaSalida es2 = new EntradaSalida(5, 5);
		Pacman pac = new Pacman("Amarillo", 5, 5, 20, 20, "Derecha");
		Fantasma f1 = new Fantasma("Rojo", 5, 5, 20, 20, "Arriba");
		Fantasma f2 = new Fantasma("Amarillo", 5, 5, 30, 20, "Abajo");
		Fantasma f3 = new Fantasma("Celeste", 5, 5, 40, 20, "Izquierda");
		Fantasma f4 = new Fantasma("Rosado", 5, 5, 50, 20, "Derecha");
		Punto pc = new Punto(false, "Amarillo Pálido", 1, 1, 1, 2);
		Punto pg = new Punto(true, "Amarillo Pálido", 1, 1, 1, 1);
		BloqueL bl1 = new BloqueL(9, 6, 25, 25, "Izquierda", "izquierda");
		BloqueT bt1 = new BloqueT(9, 6, 40, 40, "Abajo");
		BloqueRectangular br1 = new BloqueRectangular(6, 9, 64, 48, false);
		PuertaFantasmas pf = new PuertaFantasmas(12, 6, 50, 50, true);
		// Algunas acciones para presentar:
		System.out.println("El color de Pacman es: "+pac.getColor());
		System.out.println("El color del fantasma 1 es: "+f1.getColor());
		System.out.println("El tamaño del punto es grande?: "+pg.isGrande());
		f1.cambiarForma();
		pac.morir();
	}
}