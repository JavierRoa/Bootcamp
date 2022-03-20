import java.util.Scanner;
public class AppTamagotchi {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int opcion;
		boolean encendido = true;
		String nombre;
		System.out.println("Dale un nombre a tu tamagotchi");
		nombre=leer.next();
		Tamagotchi tam1 = new Tamagotchi (nombre);
		System.out.println(nombre+" ha nacido. Felicidades!");

		
		while(encendido==true && tam1.isViviendo()==true) {
			if(tam1.getEnergia()<=0 || tam1.getEstomago()<=0) {
				tam1.morir();
			break;	
			}
			if (tam1.getEnergia()<=30) {
				System.out.println(nombre+" está agotado, déjalo descansar o dormir. Piensa en su salud!");
			}
			if (tam1.getEnergia()<=50 && tam1.getEnergia()>30) {
				System.out.println(nombre+" está bostezando. Quizá le vendría bien dormir");
			}
			if (tam1.getEstomago()<=10) {
				System.out.println(nombre+" está MUY hambriento, aliméntalo o quién sabe que pasará! D:");
			}
			if (tam1.getEstomago()<=15 && tam1.getEstomago()>10) {
				System.out.println("A "+nombre+" le está rugiendo el estómago. Quizá quiera comer algo");
			}
			System.out.println("¿Qué deseas hacer ahora?");
			System.out.println("1.- Para Jugar");
			System.out.println("11.- Para dejar de jugar");
			System.out.println("2.- Para Comer");
			System.out.println("22.- Para dejar de comer");
			System.out.println("3.- Para Descansar");
			System.out.println("33.- Para dejar de descansar");
			System.out.println("4.- Para Dormir/Dormir");
			System.out.println("44.- Para despertar");
			System.out.println("5.- Para Hacer Amigos");
			System.out.println("55.- Para dejar de hacer amigos");
			System.out.println("0.- Para Apagar");
			opcion=leer.nextInt();
			
			switch(opcion) {
				case 1:
					if(tam1.isJugando()==false) {
						tam1.jugar();
					}
					else {
						System.out.println(nombre+" ya está jugando");
					}
				break;
				case 11:
					if(tam1.isJugando()==true) {
						tam1.dejarDeJugar();
					}
					else {
						System.out.println(nombre+" no está jugando");
					}
				break;	
				case 2:
					if(tam1.isComiendo()==false) {
						tam1.comer();
					}
					else {
						System.out.println(nombre+" ya está comiendo");
					}
				break;
				case 22:
					if(tam1.isComiendo()==true) {
						tam1.dejarDeComer();
					}
					else {
						System.out.println(nombre+" no está comiendo");
					}
				break;	
				case 3:
					if(tam1.isDescansando()==false) {
						tam1.descansar();
					}
					else {
						System.out.println(nombre+" ya está descansando");
					}
				break;
				case 33:
					if(tam1.isDescansando()==true) {
						tam1.dejarDeDescansar();
					}
					else {
						System.out.println(nombre+" no está descansando");
					}
				break;	
				case 4:
					if(tam1.isDurmiendo()==false) {
						tam1.dormir();
					}
					else {
						System.out.println(nombre+" ya está durmiendo");
					}
				break;
				case 44:
					if(tam1.isDurmiendo()==true) {
						tam1.despertar();
					}
					else {
						System.out.println(nombre+" ya está despierto");
					}
				break;	
				case 5:
					if(tam1.isHaciendoAmigos()==false) {
						tam1.hacerAmigos();
					}
					else {
						System.out.println(nombre+" ya está haciendo amigos");
					}
				break;
				case 55:
					if(tam1.isHaciendoAmigos()==true) {
						tam1.dejarDeHacerAmigos();
					}
					else {
						System.out.println(nombre+" no está haciendo amigos");
					}
				break;	
				case 0:
					System.out.println("Apagando tu tamagotchi");
					encendido=false;
				break;	
				default:
					System.out.println("Opción incorrecta, elige otra opción");
 			}
		}
	}
}