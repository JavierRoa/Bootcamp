Proceso x_a_sig_100_usando_para
	Definir acum,num_ini,sig_100 Como Entero;
	acum <- 0;
	Escribir 'Ingrese número inicial';
	Leer num_ini;
	sig_100 <- num_ini+99;
	Para cont<-num_ini Hasta sig_100 Hacer
		acum <- acum+num_ini;
		num_ini <- num_ini+1;
		Escribir acum;
	FinPara
FinProceso
