Proceso sin_titulo
	Definir num,cont,acum Como Entero;
	cont <- 0;
	acum <- 1;
	Escribir 'Ingrese n�mero';
	Leer num;
	Mientras cont<num Hacer
		cont <- cont+1;
		acum <- cont*acum;
	FinMientras
	Escribir acum;
FinProceso
