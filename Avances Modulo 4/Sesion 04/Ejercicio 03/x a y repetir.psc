Proceso x_a_y_usando_repetir
	Definir acum,num_ini,num_fin Como Entero;
	acum <- 0;
	Escribir 'Ingrese n�mero inicial';
	Leer num_ini;
	Escribir 'Ingrese n�mero final';
	Leer num_fin;
	Repetir
		acum <- acum+num_ini;
		num_ini <- num_ini+1;
		Escribir acum;
	Hasta Que num_ini>num_fin
FinProceso
