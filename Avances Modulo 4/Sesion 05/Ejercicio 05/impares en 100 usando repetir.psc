Proceso impares_en_100_usando_mientras
	Definir cont,cont_impar,acum,num Como Entero;
	cont <- 1;
	cont_impar <- 0;
	Repetir
		Escribir 'Ingrese número ',cont;
		Leer num;
		Si num MOD 2=1 Entonces
			Escribir 'Impar';
			cont_impar <- cont_impar+1;
		SiNo
			Escribir 'Par';
		FinSi
		cont <- cont+1;
	Hasta Que cont>100
	Escribir 'La cantidad de números impares es ',cont_impar;
FinProceso
