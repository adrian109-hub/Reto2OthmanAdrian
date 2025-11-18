package reto;

import java.util.Locale;
import java.util.Scanner;

public class Funciones1 {

	public static void menuLongitud(Scanner sc) {
		double n1;
		int opcion = 0;
		do {
			  System.out.println("\nMenú:");
	            System.out.println("1 – Millas a kilometros");
	            System.out.println("2 – Kilometros a millas");
	            System.out.println("0 – Salir");
	            opcion=Funciones.dimeEntero("\nEscoge una opción", sc);
	            switch (opcion) {
				case 1:
					n1=Funciones.dimeDouble("dame el valor en millas", sc);
					System.out.println(longitudMillas(n1)+" Km");
					
					break;

				case 2:
					n1=Funciones.dimeDouble("dame el valor en kilometros", sc);
					System.out.println(longitudKilometros(n1)+" Mi");
					break;
				case 0:
					System.out.println("saliendo");
					break;
				default:
					System.out.println("opcion no valida");
					break;
				}
	            
		} while (opcion!=0);
	}

	private static double longitudKilometros(double n1) {
		double num1;
		num1=n1*0.6213;
		return num1;
	}

	private static double longitudMillas(double n1) {
		double num1;
		num1=n1*1.609;
		return num1;

	}
	public static void menuPeso(Scanner sc) {
		double n1;
		int opcion = 0;
		do {
			  System.out.println("\nMenú:");
	            System.out.println("1 – Kilogramos a Libras");
	            System.out.println("2 – Libras a Kilogramos");
	            System.out.println("0 – Salir");
	            opcion=Funciones.dimeEntero("\nEscoge una opción", sc);
	            switch (opcion) {
				case 1:
					n1=Funciones.dimeDouble("dame el valor en kilogramos", sc);
					System.out.println(PesoKilogramos(n1)+" lbs");
					
					break;

				case 2:
					n1=Funciones.dimeDouble("dame el valor en Libras", sc);
					System.out.println(PesoLibras(n1)+" Kg");
					break;
				case 0:
					System.out.println("saliendo");
					break;
				default:
					System.out.println("opcion no valida");
					break;
				}
	            
		} while (opcion!=0);
	}

	private static double PesoKilogramos(double n1) {
		double num1;
		num1=n1*2.20462;
		return num1;
	}

	private static double PesoLibras(double n1) {
		double num1;
		num1=n1*0.45359;
		return num1;

	}
}
