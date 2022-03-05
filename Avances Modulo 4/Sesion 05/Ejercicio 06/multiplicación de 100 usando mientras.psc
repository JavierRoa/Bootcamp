Proceso multiplicacion_de_10_usando_para
	Definir cont,acum,num Como Entero;
	cont <- 1;
	acum <- 1;
	Mientras cont<=10 Hacer
		Escribir 'Ingrese número ',cont;
		Leer num;
		acum <- acum * num;
		cont <- cont + 1;
	FinMientras
	Escribir 'El resultado es ', acum;
FinProceso
