Proceso solo_10_impares_usando_mientras
	Definir num,cont,acum Como Entero;
	cont <- 0;
	acum <- 0;
	Mientras cont<10 Hacer
		Escribir 'Ingrese número';
		Leer num;
		Si num MOD 2=1 Entonces
			cont <- cont+1;
			Escribir 'Número ', num, ' ingresado exitosamente';
		SiNo
			Mientras num MOD 2=0 Hacer
				Escribir 'Número par, ingrese un número impar';
				Leer num;
			FinMientras
			cont <- cont+1;
			Escribir 'Número ', num, ' ingresado exitosamente';
		FinSi
	FinMientras
FinProceso
