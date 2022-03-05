Proceso multiplicacion_de_10_usando_para
	Definir cont,acum,num Como Entero;
	cont <- 0;
	acum <- 1;
	Para cont<-1 Hasta 10 Hacer
		Escribir 'Ingrese número ',cont;
		Leer num;
		acum <- acum * num;
	FinPara
	Escribir 'El resultado es ', acum;
FinProceso
