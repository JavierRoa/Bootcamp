Proceso x_a_y_usando_para
	Definir acum,num_ini,num_fin Como Entero;
	acum <- 0;
	Escribir 'Ingrese número inicial';
	Leer num_ini;
	Escribir 'Ingrese número final';
	Leer num_fin;
	Para num_ini<-num_ini Hasta num_fin Hacer
		acum <- acum+num_ini;
		Escribir acum;
	FinPara
FinProceso
