package reto;

import reto.Funciones;
import java.util.Scanner;

public class Funciones2 {
	public static void menugrados(Scanner sc) {
		double n1;
		int opcion = 0;
		do {
			System.out.println("\nElige la operación:");
			System.out.println("1. Celsius a Fahrenheit");
			System.out.println("2. Fahrenheit a Celsius");
			System.out.print("0. Salir");
			opcion = Funciones.dimeEntero("\nEscoge una opción: ", sc);
			switch (opcion) {
			case 1:
				n1 = Funciones.dimeDouble("Dime los grados celsius: ", sc);
				System.out.print(gradosacelsius(n1) + "ºF");
				break;
			case 2:
				n1 = Funciones.dimeDouble("Dime los grados Farenheit: ", sc);
				System.out.print(gradosafarenheit(n1) + "ºC");
				break;
			case 0:
				System.out.print("Saliendo...\n");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (!(opcion == 0));
	}

	private static double gradosafarenheit(double n1) {
		double num1;
		num1 = (n1 - 32) * 5/9;
		return num1;
	}

	private static double gradosacelsius(double n1) {
		double num1;
		num1 = (n1 * 9/5) + 32 ;
		return num1;
	}
	
	public static void menuvolumen(Scanner sc) {
		double n1;
		int opcion = 0;
		do {
			System.out.println("\nElige la operación:");
			System.out.println("1. Litros a Galones");
			System.out.println("2. Galones a Litos");
			System.out.print("0. Salir");
			opcion = Funciones.dimeEntero("\nEscoge una opción: ", sc);
			switch (opcion) {
			case 1:
				n1 = Funciones.dimeDouble("Dime los litros: ", sc);
				System.out.print(litrosagalones(n1) + " gal");
				break;
			case 2:
				n1 = Funciones.dimeDouble("Dime los galones: ", sc);
				System.out.print(galonesalitros(n1) + "L");
				break;
			case 0:
				System.out.print("Saliendo...\n");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (!(opcion == 0));
	}

	private static double litrosagalones(double n1) {
		double num1;
		num1 = n1 / 3.785;
		return num1;
	}

	private static double galonesalitros(double n1) {
		double num1;
		num1 = n1 * 3.785 ;
		return num1;
	}
}
