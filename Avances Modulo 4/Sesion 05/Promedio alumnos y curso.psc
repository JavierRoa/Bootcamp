Proceso sin_titulo
	Definir cont,cont2,notas,alumnos Como Entero;
	Definir nota,acum,prom_ind,acum2,prom_cur Como Real;
	Escribir 'Ingrese número de alumnos';
	Leer alumnos;
	Escribir 'Ingrese número de notas';
	Leer notas;
	cont <- 0;
	cont2 <- 1;
	acum <- 0;
	acum2 <- 0;
	Repetir
		Escribir 'Alumno ',cont2;
		Mientras cont<notas Hacer
			cont <- cont+1;
			Escribir 'Ingrese nota ',cont;
			Leer nota;
			acum <- acum+nota;
		FinMientras
		prom_ind <- acum/cont;
		cont <- 0;
		acum <- 0;
		acum2 <- prom_ind+acum2;
		cont2 <- cont2+1;
	Hasta Que cont2>alumnos
	prom_cur <- acum2/(cont2 - 1);
	Escribir 'El promedio de notas del curso es ',prom_cur;
FinProceso
