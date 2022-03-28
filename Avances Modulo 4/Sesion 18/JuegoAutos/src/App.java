import java.util.Scanner;

import autos.AutoJugador;
import background.Fondo;
import background.Frame;
import items.Carretera;
import items.Obstaculo;

public class App {
	
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String mover;
		
		Fondo fondo = new Fondo("Verde Oscuro", 100, 100, 0, 0);
		Carretera street = new Carretera("Carretera", 100, 20, 50, 0);
		AutoJugador aj = new AutoJugador("Auto Rojo", 5, 5, 50, 50, 1);
		Obstaculo bache = new Obstaculo("Bache", 5, 5, 50, 100);
		Obstaculo arbol = new Obstaculo("Arbol", 5, 5, 70, 100);
		Obstaculo autoE = new Obstaculo("AutoE", 5, 5, 55, 100);
		Frame fr = new Frame(aj, fondo, street);
		
		while(aj.getVidas()==1) {
			mover=leer.next();
			if(aj.getVidas()==1) {
				switch(mover) {
				case "Izquierda":
					aj.moverIzquierda();
				break;
				case "Derecha":
					aj.moverDerecha();
				break;
				case "Arriba":
					aj.moverArriba();
				break;
				case "Abajo":
					aj.moverAbajo();
				break;	
				}	
			}
		}
	}	
}
