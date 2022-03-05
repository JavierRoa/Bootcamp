Proceso areas_usando_mientras
	Definir lados Como Entero;
	Definir radio, res, med, ap Como Real;
	Escribir 'Ingrese número de lados. Ingrese 2 para salir';
	Leer lados;
	Mientras lados <> 2 Hacer
		Segun lados Hacer
			1:
				Escribir 'Ingrese radio (en cm)';
				Leer radio;
				res <- pi*radio*radio;
				Escribir res, ' cms cuadrados';
			2:
				Escribir 'Salir';
			3:
				Escribir 'Ingrese base (en cm)';
				Leer med;
				Escribir 'Ingrese altura (en cm)';
				Leer ap;
				res <- med*ap/2;
				Escribir res, ' cms cuadrados';
			4:
				Escribir 'Ingrese medida de los lados (en cm)';
				Leer med;
				res <- med*med;
				Escribir res, ' cms cuadrados';
			De Otro Modo:
				Escribir 'Ingrese medida de los lados (en cm)';
				Leer med;
				Escribir 'Ingrese apotema';
				Leer ap;
				res <- (lados*med*ap)/2;
				Escribir res, ' cms cuadrados';
		FinSegun
		Escribir 'Ingrese número de lados de la figura. Ingrese 2 para salir';
		Leer lados;
	FinMientras
FinProceso
