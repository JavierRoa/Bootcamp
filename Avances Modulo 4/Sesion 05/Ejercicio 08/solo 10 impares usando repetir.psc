Proceso solo_10_impares_usando_repetir
	Definir num,cont,acum Como Entero;
	cont <- 0;
	acum <- 0;
	Repetir
		Escribir 'Ingrese n�mero';
		Leer num;
		Si num MOD 2=1 Entonces
			cont <- cont+1;
			Escribir num;
		SiNo
			Repetir
				Escribir 'N�mero par, ingrese un n�mero impar';
				Leer num;
			Hasta Que num MOD 2=1
			cont <- cont+1;
			Escribir num;
		FinSi
	Hasta Que cont=10
FinProceso
