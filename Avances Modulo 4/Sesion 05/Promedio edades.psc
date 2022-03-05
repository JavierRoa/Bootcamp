Proceso sin_titulo
	Definir cont Como Entero;
	Definir edad, acum, promedio Como Real;
	cont <- 0;
	acum <- 0;
	Mientras cont<3 Hacer
		cont = cont+1;
		Escribir "Ingrese edad ", cont;
		Leer edad;
		acum <- acum + edad;
	FinMientras
	promedio <- acum / cont;
	Escribir "El promedio de edad es ", promedio;
FinProceso
