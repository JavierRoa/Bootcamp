Proceso sin_titulo
	Definir dia Como Entero;
	Escribir "Ingrese dia:";
	Leer dia;
	Si dia == 1 Entonces
		Escribir "Feliz lunes";
	SiNo
		Si dia == 2 Entonces
			Escribir "Feliz martes";
		SiNo
			Si dia == 3 Entonces
				Escribir "Feliz miércoles";
			SiNo
				Si dia == 4 Entonces
					Escribir "Feliz jueves";
				SiNo
					Si dia == 5 Entonces
						Escribir "Feliz viernes";
					SiNo
						Si dia == 6 Entonces
							Escribir "Feliz sábado";
						SiNo
							Si dia == 7 Entonces
								Escribir "Feliz domingo";
							SiNo
								Escribir "Dia inválido";
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso
