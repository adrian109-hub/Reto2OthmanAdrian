package reto;

import reto.Funciones1;
import java.util.Locale;
import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
<<<<<<< HEAD
		

=======
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int opcion, a, b;
		do {
			System.out.println("Elige la operación:");
			System.out.println("1. Suma");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			System.out.print("\nEscoge una opción: ");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.print("Dame el primer número que quieras sumar: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Dame el segundo número que quieras sumar: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("La suma es " + Funciones1.sumar(a, b));
				break;
			case 2:
				System.out.print("Dame el primer número que quieras restar: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Dame el segundo número que quieras restar: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("La resta es " + Funciones1.restar(a, b));
				break;
			case 3:
				System.out.print("Dame el primer número que quieras multiplicar: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Dame el segundo número que quieras multiplicar: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("La multiplicacion es " + Funciones2.multiplicar(a, b));
				break;
			case 4:
				System.out.print("Dame el primer número que quieras dividir: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("Dame el segundo número que quieras dividir: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("La division es " + Funciones2.dividir(a, b));
				break;
			case 5:
				System.out.println("Dame un número: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Este número es par: --> " + Funciones1.esPar(a));
				break;
			case 6:
				System.out.println("Dame un número: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Este número es impar: --> " + Funciones1.esImpar(a));
				break;
			case 7:
				System.out.println("Dame un número: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Este número es positivo: --> " + Funciones2.esPositivo(a));
				break;
			case 8:
				System.out.println("Dame un número: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Este número es negativo: --> " + Funciones2.esNegativo(a));
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (!(opcion == 0));
>>>>>>> branch 'main' of https://github.com/adrian109-hub/Reto2OthmanAdrian.git
	}
}