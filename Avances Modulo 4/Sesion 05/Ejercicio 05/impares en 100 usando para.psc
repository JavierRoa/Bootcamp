Proceso impares_en_100_usando_para
	Definir cont,cont_impar,acum,num Como Entero;
	cont <- 1;
	cont_impar <- 0;
	Para cont<-cont Hasta 100 Hacer
		Escribir 'Ingrese número ',cont;
		Leer num;
		Si num MOD 2=1 Entonces
			Escribir 'Impar';
			cont_impar <- cont_impar+1;
		SiNo
			Escribir 'Par';
		FinSi
	FinPara
	Escribir 'La cantidad de números impares es ',cont_impar;
FinProceso
