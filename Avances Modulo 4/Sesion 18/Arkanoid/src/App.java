import java.util.Scanner;

import background.Fondo;
import background.Tablero;
import objetos.Bloque;
import objetos.Borde;
import objetos.Jugador;
import objetos.Pelota;
import objetos.PowerUp;

public class App {

	public static void main (String[] args) {
		
		Scanner leer = new Scanner (System.in);
		Fondo f = new Fondo("Rayado", "Azul", 100, 100, 0, 0);
		Tablero t = new Tablero("Diseño 1", "Negro", 10, 100, 0, 0, 3, 0);
		Jugador pl = new Jugador("Paleta", "Gris", 2, 5, 50, 0, null);
		Pelota p = new Pelota("Pelota", "Amarillo", 2, 2, 50, 0, 3, 0);
		Borde bi = new Borde("Borde", "Gris", 100, 2, 1, 0);
		Borde bd = new Borde("Borde", "Gris", 100, 2, 100, 0);
		Borde ba = new Borde("Borde", "Gris", 2, 100, 0, 99);
		Bloque b1 = new Bloque("Bloque", "Azul", 2, 4, 45, 80, 2, false);
		Bloque b2 = new Bloque("Bloque", "Rojo", 2, 4, 50, 80, 1, true);
		Bloque b3 = new Bloque("Bloque", "Verde", 2, 4, 55, 80, 1, false);
		PowerUp pu = new PowerUp("Disparo", "Amarillo", 2, 5, 45, 30);
		String mover;
	
		while(p.getVidas()>0) {
			mover=leer.next();
			if(p.getVidas()>0) {
				switch(mover) {
				case "Izquierda":
					pl.moverIzquierda();
				break;
				case "Derecha":
					pl.moverDerecha();
				break;
				}	
			}
		}
	}
}