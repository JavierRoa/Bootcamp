Proceso sin_titulo
	Definir num,cont,acum Como Entero;
	cont <- 0;
	acum <- 1;
	Escribir 'Ingrese número';
	Leer num;
	Mientras cont<num Hacer
		cont <- cont+1;
		acum <- num*acum;
	FinMientras
	Escribir num,' elevado a ',num,' es ',acum;
FinProceso
