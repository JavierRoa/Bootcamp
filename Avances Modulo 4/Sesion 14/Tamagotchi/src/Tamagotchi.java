
public class Tamagotchi {

	private String nombre;
	private boolean viviendo;
	private boolean durmiendo;
	private boolean comiendo;
	private boolean jugando;
	private boolean descansando;
	private boolean haciendoAmigos;
	private int energia;
	private int estomago;
	private int contAmigos;

	public Tamagotchi(String nombre) {

		this.nombre = nombre;
		this.viviendo = true;
		this.durmiendo = false;
		this.comiendo = false;
		this.jugando = false;
		this.descansando = false;
		this.haciendoAmigos = false;
		this.energia = 100;
		this.estomago = 30;
		this.contAmigos = 0;
	}
	public boolean isViviendo() {
		return viviendo;
	}
	public boolean isDurmiendo() {
		return durmiendo;
	}
	public boolean isComiendo() {
		return comiendo;
	}
	public boolean isJugando() {
		return jugando;
	}
	public boolean isDescansando() {
		return descansando;
	}
	public boolean isHaciendoAmigos() {
		return haciendoAmigos;
	}
	public int getEnergia() {
		return energia;
	}
	public int getEstomago() {
		return estomago;
	}

	public void dormir() {
		if(this.durmiendo==false) {
			if(this.energia<=50) {
				this.durmiendo=true;
				this.energia=this.energia+50;
				this.estomago=this.estomago-3;
				System.out.println(nombre+" está durmiendo");
			}
			else {
				System.out.println(nombre+" tiene mucha energía. No quiere dormir");
			}
		}
		else {
			System.out.println(nombre+" ya está durmiendo, debes despertarla");
		}
	}
	public void despertar() {
		if(this.durmiendo==true) {
			this.durmiendo=false;
			this.estomago=this.estomago-3;
			System.out.println(nombre+" ha despertado");
		}
		else {
			System.out.println(nombre+" ya está despierta");
		}
	}
	public void comer() {
		if(this.comiendo==false) {
			if(this.estomago<=30) {
				this.estomago=this.estomago+15;
				this.comiendo=true;
				System.out.println(nombre+" está comiendo, ñam ñam :3");
			}
			else {
				System.out.println(nombre+" está lleno, es mejor que juegue");
			}
		}
		else {
			System.out.println(nombre+" ya está comiendo");
		}
		
	}
	public void dejarDeComer() {
		if(this.comiendo==true) {
			this.comiendo=false;
			System.out.println(nombre+" ha dejado de comer");
		}
		else {
			System.out.println(nombre+" no está comiendo");
		}
	}
	public void jugar() {
		if(this.jugando==false) {
			this.jugando=true;
			this.energia=this.energia-5;
			this.estomago=this.estomago-3;
			System.out.println(nombre+" está jugando. YAY!");
		}
		else {
			System.out.println(nombre+" ya está jugando");
		}
		
	}
	public void dejarDeJugar() {
		if(this.jugando==true) {
			this.jugando=false;
			this.estomago=this.estomago-3;
			this.energia=this.energia-2;
			System.out.println(nombre+" ha dejado de jugar");
		}
		else {
			System.out.println(nombre+" no está jugando D:");
		}
	}
	public void descansar() {
		if(this.descansando==false) {
			if(this.energia<=70) {
				this.descansando=true;
				this.energia=this.energia+30;
				this.estomago=this.estomago-3;
				System.out.println(nombre+" está descansando");
			}
			else {
				System.out.println(nombre+" tiene mucha energía. No quiere descansar");
			}
		}
		else {
			System.out.println(nombre+" ya setá descansando");
		}
		
	}
	public void dejarDeDescansar() {
		if(descansando==true) {
			this.descansando=false;
			this.estomago=this.estomago-3;
			System.out.println(nombre+" ha dejado de descansar");
		}
		
	}
	public void hacerAmigos() {
		if(haciendoAmigos==false) {
			this.haciendoAmigos=true;
			this.energia=this.energia-2;
			this.estomago=this.estomago-3;
			this.contAmigos=this.contAmigos+1;
			System.out.println(nombre+" hizo un amigo");
		}
	}
	public void dejarDeHacerAmigos() {
		if(haciendoAmigos==true) {
			this.haciendoAmigos=false;
			this.estomago=this.estomago-3;
			System.out.println(nombre+" dejó de hacer amigos");
		}
	}
	public void morir() {
			this.viviendo=false;
			System.out.println("No cuidaste bien de tu mascota. "+nombre+" se ha ido T-T");
	}
}
