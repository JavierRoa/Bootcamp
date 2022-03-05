Proceso sueldos_usando_mientras
	Definir cont,cont_men,cont_may,num,sueldo_bruto Como Entero;
	Definir acum,acum_may,sueldo_liq Como Real;
	cont <- 0;
	cont_men <- 0;
	cont_may <- 0;
	acum <- 0;
	acum_may <- 0;
	num = 1;
	Mientras num == 1 Hacer
		Escribir 'Ingrese 1 para calcular el siguiente sueldo';
		Escribir 'Ingrese cualquier otro número para salir';
		Leer num;
		Si num=1 Entonces
			Escribir 'Ingrese sueldo bruto';
			Leer sueldo_bruto;
			sueldo_liq <- sueldo_bruto-(sueldo_bruto*0.2);
			Escribir 'Sueldo líquido: ',sueldo_liq;
			Si sueldo_liq>=450000 Entonces
				acum_may <- acum_may+sueldo_liq;
				cont_may <- cont_may+1;
			SiNo
				cont_men <- cont_men+1;
			FinSi
			acum <- acum+sueldo_liq;
			cont <- cont+1;
		SiNo
			Escribir 'Sueldos calculados!';
		FinSi
	FinMientras
	Escribir 'Suma total sueldos líquidos: ',acum;
	Escribir 'Cantidad sueldos líquidos ingresados: ',cont;
	Escribir 'Cantidad sueldos menores a $450.000: ',cont_men;
	Escribir 'Suma sueldos mayores o iguales a $450.000: ',acum_may;
	Escribir 'Salir';
FinProceso
