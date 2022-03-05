		import java.util.Scanner;
		public class ZodiacoSegun {

			public static void main(String args[]) {
				int anio;
				int dia;
				int mes;
				int validacion;
				int bisiesto;
				validacion = 0;
				Scanner leer = new Scanner (System.in);
				
				System.out.println("Ingrese mes");
				mes = leer.nextInt();
				
				System.out.println("Ingrese dia");
				dia = leer.nextInt();
				
				System.out.println("Ingrese año");
				anio = leer.nextInt();
				bisiesto = anio%4;
				
				if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>0 && dia<=31)) {
					validacion = 1;
				} 
				else if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia>0 && dia<=30)) {
					validacion = 1;
				}
				else if ((mes==2) && (dia>0 && dia<=28)){
					validacion = 1;					
				} 
				else if (mes==2 && dia==29 && bisiesto==0){
					System.out.println("Piscis");					
				}
				else {
					System.out.println("Error");
					validacion = 0;
				}
				
				if (validacion==1) {
					switch (mes) {
						case 1:
							if (dia<21) {
								System.out.println("Capricornio");
							} 
							else {
								System.out.println("Acuario");
							}
						break;
						case 2:
							if (dia<19) {
								System.out.println("Acuario");
							} 
							else {
								System.out.println("Piscis");
							}
						break;
						case 3:
							if (dia<21) {
								System.out.println("Piscis");
							} 
							else {
								System.out.println("Aries");
							}
						break;
						case 4:
							if (dia<21) {
								System.out.println("Aries");
							} 
							else {
								System.out.println("Tauro");
							}
						break;
						case 5:
							if (dia<22) {
								System.out.println("Tauro");
							} 
							else {
								System.out.println("Géminis");
							}
						break;
						case 6:
							if (dia<22) {
								System.out.println("Géminis");
							} 
							else {
								System.out.println("Cáncer");
							}
						break;
						case 7:
							if (dia<23) {
								System.out.println("Cáncer");
							} 
							else {
								System.out.println("Leo");
							}
						break;
						case 8:
							if (dia<23) {
								System.out.println("Leo");
							} 
							else {
								System.out.println("Virgo");
							}
						break;
						case 9:
							if (dia<23) {
								System.out.println("Virgo");
							} 
							else {
								System.out.println("Libra");
							}
						break;
						case 10:
							if (dia<23) {
								System.out.println("Libra");
							} 
							else {
								System.out.println("Escorpio");
							}
						break;
						case 11:
							if (dia<23) {
								System.out.println("Escorpio");
							} 
							else {
								System.out.println("Sagitario");
							}
						break;
						default:
							if (dia<22) {
								System.out.println("Sagitario");
							} 
							else {
								System.out.println("Capricornio");
							}
					}
				}
			}
		}