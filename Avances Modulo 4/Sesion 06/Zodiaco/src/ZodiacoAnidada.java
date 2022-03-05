import java.util.Scanner;
public class ZodiacoAnidada {

	public static void main(String args[]) {
		int anio;
		int dia;
		int mes;
		int validacion;
		int bisiesto;
		validacion = 0;
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese mes");
		mes = leer.nextInt();
		
		System.out.println("Ingrese dia");
		dia = leer.nextInt();
		
		System.out.println("Ingrese año");
		anio = leer.nextInt();
		bisiesto = anio%4;
		
		if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>0 && dia<=31)) {
			validacion = 1;
		} 
		else if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia>0 && dia<=30)) {
			validacion = 1;
		}
		else if ((mes==2) && (dia>0 && dia<=28)){
			validacion = 1;					
		} 
		else if (mes==2 && dia==29 && bisiesto==0){
			System.out.println("Piscis");					
		}
		else {
			System.out.println("Error");
			validacion = 0;
		}
		
		if (validacion==1) {
			if (mes==1) {
				if (dia<21) {
					System.out.println("Capricornio");
				} 
				else {
					System.out.println("Acuario");
				}
			}	
			else {
				if (mes==2) {
					if (dia<19) {
						System.out.println("Acuario");
					} 
					else {
						System.out.println("Piscis");
					}
				}
				else {
					if (mes==3) {
						if (dia<21) {
							System.out.println("Piscis");
						}
						else {
							System.out.println("Aries");
						}
					}
					else {
						if (mes==4) {
							if (dia<21) {
								System.out.println("Aries");
							}
							else {
								System.out.println("Tauro");
							}
						}
						else {
							if (mes==5) {
								if (dia<22) {
									System.out.println("Tauro");
								}
								else {
									System.out.println("Géminis");
								}
							}
							else {
								if (mes==6) {
									if (dia<22) {
										System.out.println("Géminis");
									}
									else {
										System.out.println("Cáncer");
									}
								}
								else {
									if (mes==7) {
										if (dia<23) {
											System.out.println("Cáncer");
										}
										else {
											System.out.println("Leo");
										}
									}
									else {
										if (mes==8) {
											if (dia<23) {
												System.out.println("Leo");
											}
											else {
												System.out.println("Virgo");
											}
										}
										else {
											if (mes==9) {
												if (dia<23) {
													System.out.println("Virgo");
												}
												else {
													System.out.println("Libra");
												}
											}
											else {
												if (mes==10) {
													if (dia<23) {
														System.out.println("Libra");
													}
													else {
														System.out.println("Escorpio");
													}
												}
												else {
													if (mes==11) {
														if (dia<23) {
															System.out.println("Escorpio");
														}
														else {
															System.out.println("Sagitario");
														}
													}
													else {
														if (mes==12) {
															if (dia<22) {
																System.out.println("Sagitario");
															}
															else {
																System.out.println("Capricornio");
															}
														}
														else {
															System.out.println("Capricornio");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}