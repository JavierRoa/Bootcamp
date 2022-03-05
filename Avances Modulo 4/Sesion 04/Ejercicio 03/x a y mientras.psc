Proceso x_a_y_usando_mientras
	Definir acum,num_ini,num_fin Como Entero;
	acum <- 0;
	Escribir 'Ingrese número inicial';
	Leer num_ini;
	Escribir 'Ingrese número final';
	Leer num_fin;
	Mientras num_ini<=num_fin Hacer
		acum <- acum+num_ini;
		num_ini <- num_ini+1;
		Escribir acum;
	FinMientras
FinProceso
