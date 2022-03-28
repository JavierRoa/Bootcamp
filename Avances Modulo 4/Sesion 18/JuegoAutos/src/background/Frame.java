package background;

import autos.AutoJugador;
import items.Carretera;
import items.Obstaculo;
import java.util.ArrayList;

/**
 * Frame que contiene todos los elementos gráficos del juego "Carrera Coches".
 * @author Javier Roa.
 *
 */
public class Frame {
	private AutoJugador a; //Composición: instancia clase Auto
	private Fondo f; //Composición: instancia clase Fondo
	private Carretera c; //Composición: instancia clase Calle
	private ArrayList<Obstaculo> obstaculos; //Agregación: instancias clase Obstaculo
	
	/**
	 * Constructor de la clase Frame.
	 * @param a - (Auto) : Auto del jugador.
	 * @param f - (Fondo) : Fondo del juego.
	 * @param c - (Calle) : Elemento gráfico calle.
	 */
	public Frame(AutoJugador a, Fondo f, Carretera c) {
		this.a = a;
		this.f = f;
		this.c = c;
		this.obstaculos = new ArrayList<Obstaculo>(); //Asignación memoria del ArrayList
	}
	
	/**
	 * Método para agregar elementos por composición, de tipo Obstaculo.
	 * @param obs - (Obstaculo): instancia de la clase obstaculo a agregar por agregación.
	 */
	public void agregarObstaculos(Obstaculo obs) {
		obstaculos.add(obs);
	}
	
	/**
	 * Método para obtener un elemento en específico.
	 * @return a
	 */
	public AutoJugador getA() {
		return a;
	}
	/**
	 * Método que establece un valor determinado.
	 * @param a
	 */
	public void setA(AutoJugador a) {
		this.a = a;
	}
	/**
	 * Método para obtener un elemento en específico.
	 * @return f
	 */
	public Fondo getF() {
		return f;
	}
	/**
	 * Método que establece un valor determinado.
	 * @param f
	 */
	public void setF(Fondo f) {
		this.f = f;
	}
	/**
	 * Método para obtener un elemento en específico.
	 * @return c
	 */
	public Carretera getC() {
		return c;
	}
	/**
	 * Método que establece un valor determinado.
	 * @param c
	 */
	public void setC(Carretera c) {
		this.c = c;
	}
	/**
	 * Método para obtener un elemento en específico del arraylist.
	 * @return obstaculos
	 */
	public ArrayList<Obstaculo> getObstaculos() {
		return obstaculos;
	}
	/**
	 * Método que establece un valor determinado en el arraylist.
	 * @param obstaculos
	 */
	public void setObstaculos(ArrayList<Obstaculo> obstaculos) {
		this.obstaculos = obstaculos;
	}
}