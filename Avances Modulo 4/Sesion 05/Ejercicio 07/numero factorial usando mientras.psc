Proceso numero_factorial_usando_mientras
	Definir num,cont,acum Como Entero;
	cont <- 0;
	Escribir 'Ingrese número';
	Leer num;
	Si num=0 Entonces
		acum <- 0;
	SiNo
		acum <- 1;
	FinSi
	Mientras cont<num Hacer
		cont <- cont+1;
		acum <- cont*acum;
	FinMientras
	Escribir acum;
FinProceso
