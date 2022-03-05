Proceso x_a_sig_100_usando_repetir
	Definir cont,acum,num_ini,sig_100 Como Entero;
	acum <- 0;
	Escribir 'Ingrese número inicial';
	Leer num_ini;
	sig_100 <- num_ini+100;
	Repetir
		acum <- acum+num_ini;
		num_ini <- num_ini+1;
		Escribir acum;
	Hasta Que num_ini>(sig_100-1)
FinProceso
