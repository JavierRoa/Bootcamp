Proceso x_a_y_solo_pares_usando_para
	Definir acum,num_ini,num_fin Como Entero;
	acum <- 0;
	Escribir 'Ingrese número inicial';
	Leer num_ini;
	Escribir 'Ingrese número final';
	Leer num_fin;
	Para num_ini<-num_ini Hasta num_fin Con Paso 2 Hacer
		Si num_ini MOD 2=0 Entonces
			num_ini <- num_ini+0;
		SiNo
			num_ini <- num_ini+1;
		FinSi
		acum <- acum+num_ini;
		Escribir acum;
	FinPara
FinProceso
