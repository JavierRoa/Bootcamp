Proceso numero_factorial_usando_para
	Definir num,cont,acum Como Entero;
	cont <- 0;
	Escribir 'Ingrese número';
	Leer num;
	Si num=0 Entonces
		acum <- 0;
	SiNo
		acum <- 1;
	FinSi
	Repetir
		cont <- cont+1;
		acum <- cont*acum;
	Hasta Que cont>=num
	Escribir acum;
FinProceso
