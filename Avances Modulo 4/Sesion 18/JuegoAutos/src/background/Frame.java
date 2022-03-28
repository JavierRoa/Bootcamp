package background;

import autos.AutoJugador;
import items.Carretera;
import items.Obstaculo;
import java.util.ArrayList;

/**
 * Frame que contiene todos los elementos gr�ficos del juego "Carrera Coches".
 * @author Javier Roa.
 *
 */
public class Frame {
	private AutoJugador a; //Composici�n: instancia clase Auto
	private Fondo f; //Composici�n: instancia clase Fondo
	private Carretera c; //Composici�n: instancia clase Calle
	private ArrayList<Obstaculo> obstaculos; //Agregaci�n: instancias clase Obstaculo
	
	/**
	 * Constructor de la clase Frame.
	 * @param a - (Auto) : Auto del jugador.
	 * @param f - (Fondo) : Fondo del juego.
	 * @param c - (Calle) : Elemento gr�fico calle.
	 */
	public Frame(AutoJugador a, Fondo f, Carretera c) {
		this.a = a;
		this.f = f;
		this.c = c;
		this.obstaculos = new ArrayList<Obstaculo>(); //Asignaci�n memoria del ArrayList
	}
	
	/**
	 * M�todo para agregar elementos por composici�n, de tipo Obstaculo.
	 * @param obs - (Obstaculo): instancia de la clase obstaculo a agregar por agregaci�n.
	 */
	public void agregarObstaculos(Obstaculo obs) {
		obstaculos.add(obs);
	}
	
	/**
	 * M�todo para obtener un elemento en espec�fico.
	 * @return a
	 */
	public AutoJugador getA() {
		return a;
	}
	/**
	 * M�todo que establece un valor determinado.
	 * @param a
	 */
	public void setA(AutoJugador a) {
		this.a = a;
	}
	/**
	 * M�todo para obtener un elemento en espec�fico.
	 * @return f
	 */
	public Fondo getF() {
		return f;
	}
	/**
	 * M�todo que establece un valor determinado.
	 * @param f
	 */
	public void setF(Fondo f) {
		this.f = f;
	}
	/**
	 * M�todo para obtener un elemento en espec�fico.
	 * @return c
	 */
	public Carretera getC() {
		return c;
	}
	/**
	 * M�todo que establece un valor determinado.
	 * @param c
	 */
	public void setC(Carretera c) {
		this.c = c;
	}
	/**
	 * M�todo para obtener un elemento en espec�fico del arraylist.
	 * @return obstaculos
	 */
	public ArrayList<Obstaculo> getObstaculos() {
		return obstaculos;
	}
	/**
	 * M�todo que establece un valor determinado en el arraylist.
	 * @param obstaculos
	 */
	public void setObstaculos(ArrayList<Obstaculo> obstaculos) {
		this.obstaculos = obstaculos;
	}
}