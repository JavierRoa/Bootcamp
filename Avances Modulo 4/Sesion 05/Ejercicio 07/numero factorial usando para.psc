Proceso numero_factorial_usando_para
	Definir num,cont,acum Como Entero;
	cont <- 1;
	Escribir 'Ingrese número';
	Leer num;
	Si num=0 Entonces
		acum <- 0;
	SiNo
		acum <- 1;
	FinSi
	Para cont<-cont Hasta num Hacer
		acum <- acum*cont;
	FinPara
	Escribir acum;
FinProceso
