Proceso zodiaco
	Definir dia,mes,anio,bisiesto,validacion,again Como Entero;
	Escribir 'Ingrese 1 para calcular signo';
	Escribir 'Ingrese cualquier otro número para salir';
	Leer validacion;
	Repetir
		Si validacion==1 Entonces
			Escribir 'Ingrese mes';
			Leer mes;
			Escribir 'Ingrese dia';
			Leer dia;
			Escribir 'Ingrese año';
			Leer anio;
			bisiesto <- anio MOD 4;
			Si (mes=1 O mes=3 O mes=5 O mes=7 O mes=8 O mes=10 O mes=12) Y (dia>0 Y dia<=31) Entonces
				validacion <- 1;
			SiNo
				Si (mes=4 O mes=6 O mes=9 O mes=11) Y (dia>0 Y dia<=30) Entonces
					validacion <- 1;
				SiNo
					Si (mes=2) Y (dia>0 Y dia<=28) Entonces
						validacion <- 1;
					SiNo
						Si (mes=2) Y (dia=29) Y (bisiesto=0) Entonces
							validacion <- 1;
						SiNo
							Escribir 'Error';
							validacion <- 0;
						FinSi
					FinSi
				FinSi
			FinSi
			Si validacion=1 Entonces
				Segun mes  Hacer
					1:
						Si dia<21 Entonces
							Escribir 'Capricornio';
						SiNo
							Escribir 'Acuario';
						FinSi
					2:
						Si dia<19 Entonces
							Escribir 'Acuario';
						SiNo
							Escribir 'Piscis';
						FinSi
					3:
						Si dia<21 Entonces
							Escribir 'Piscis';
						SiNo
							Escribir 'Aries';
						FinSi
					4:
						Si dia<21 Entonces
							Escribir 'Aries';
						SiNo
							Escribir 'Tauro';
						FinSi
					5:
						Si dia<22 Entonces
							Escribir 'Tauro';
						SiNo
							Escribir 'Géminis';
						FinSi
					6:
						Si dia<22 Entonces
							Escribir 'Géminis';
						SiNo
							Escribir 'Cáncer';
						FinSi
					7:
						Si dia<23 Entonces
							Escribir 'Cáncer';
						SiNo
							Escribir 'Leo';
						FinSi
					8:
						Si dia<23 Entonces
							Escribir 'Leo';
						SiNo
							Escribir 'Virgo';
						FinSi
					9:
						Si dia<23 Entonces
							Escribir 'Virgo';
						SiNo
							Escribir 'Libra';
						FinSi
					10:
						Si dia<23 Entonces
							Escribir 'Libra';
						SiNo
							Escribir 'Escorpio';
						FinSi
					11:
						Si dia<23 Entonces
							Escribir 'Escorpio';
						SiNo
							Escribir 'Sagitario';
						FinSi
					De Otro Modo:
						Si dia<22 Entonces
							Escribir 'Sagitario';
						SiNo
							Escribir 'Capricornio';
						FinSi
				FinSegun
			FinSi
			Escribir 'Si desea calcular otro signo, presione 1. Cualquier otro para salir';
			Leer again;
			Si again==1 Entonces
				validacion <- 1;
			SiNo
				validacion <- 0;
			FinSi
		FinSi
	Hasta Que validacion<>1
	Escribir 'Programa terminado';
FinProceso
