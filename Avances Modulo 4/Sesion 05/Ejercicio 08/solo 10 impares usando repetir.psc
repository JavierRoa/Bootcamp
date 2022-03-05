Proceso solo_10_impares_usando_repetir
	Definir num,cont,acum Como Entero;
	cont <- 0;
	acum <- 0;
	Repetir
		Escribir 'Ingrese número';
		Leer num;
		Si num MOD 2=1 Entonces
			cont <- cont+1;
			Escribir num;
		SiNo
			Repetir
				Escribir 'Número par, ingrese un número impar';
				Leer num;
			Hasta Que num MOD 2=1
			cont <- cont+1;
			Escribir num;
		FinSi
	Hasta Que cont=10
FinProceso
