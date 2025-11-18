package reto;

import reto.Funciones;
import reto.Funciones1;
import java.util.Locale;
import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int opcion;
		do {
			System.out.println("Elige la operación:");
			System.out.println("1. Longuitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("\nEscoge una opción: ", sc);
			switch (opcion) {
			case 1:
				Funciones1.menuLongitud(sc);
				break;
			case 2:
				Funciones1.menuPeso(sc);
				break;
			case 3:
				Funciones2.menugrados(sc);
				break;
			case 4:
				Funciones2.menuvolumen(sc);
				break;
			case 0:
				System.out.print("FIN");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (!(opcion == 0));
	}
}