package interfaces;

import superclases.Avatar;

public interface movimiento {
	// Métodos en común para cada personaje.
	void moverArriba();;
	void moverAbajo();
	void moverIzquierda();
	void moverDerecha();
	void saltarArriba();
	void saltarAbajo();
	void saltarIzquierda();
	void saltarDerecha();
	void sentarLevantar(Avatar a);
}