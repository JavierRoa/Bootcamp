Proceso x_a_y_solo_pares_usando_repetir
	Definir cont, resto, acum,num_ini,num_fin Como Entero;
	acum <- 0;
	Escribir 'Ingrese n�mero inicial';
	Leer num_ini;
	cont <- num_ini;
	Escribir 'Ingrese n�mero final';
	Leer num_fin;
	Repetir
		resto = cont MOD 2;
		Si resto==0 Entonces
			acum <- acum+cont;
			Escribir acum;
		FinSi
		cont <- cont+1;
	Hasta Que cont>num_fin
FinProceso
