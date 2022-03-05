Proceso multiplicacion_de_10_usando_para
	Definir cont,acum,num Como Entero;
	cont <- 1;
	acum <- 1;
	Repetir
		Escribir 'Ingrese número ',cont;
		Leer num;
		acum <- acum*num;
		cont <- cont+1;
	Hasta Que cont>10
	Escribir 'El resultado es ',acum;
FinProceso
