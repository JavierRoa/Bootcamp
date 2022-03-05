Proceso solo_10_impares_usando_para
	Definir num,cont,cont2,continuar Como Entero;
	Para cont<-1 Hasta 10 Hacer
		Escribir 'Ingrese número';
		Leer num;
		Si num MOD 2=1 Entonces
			Escribir 'Número ', num, ' ingresado exitosamente';
		SiNo
			Para cont2<-0 Hasta 1 Hacer
				Escribir 'Número par, ingrese un número impar';
				Leer num;
				Si num MOD 2=1 Entonces
					cont2 <- 1;
					Escribir 'Número ', num, ' ingresado exitosamente';
				SiNo
					cont2 <- 0;
				FinSi
			FinPara
		FinSi
	FinPara
FinProceso
