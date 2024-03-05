package Tareas;
import java.util.Scanner;

public class Tarea_4 {
	public static void main(String[] args) {
		
		/*
		Solicitar al usuario dos valores:
		-numero1 (int)
		-numero2 (int)
		Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):
		Proporciona el numero1:
        Proporciona el numero2:
        El numero mayor es:
		*/
		
		Scanner consola = new Scanner(System.in);
		System.out.println("Bienvenido usuario, este es un programa que determina cual de los 2 numero que proporciones es mayor");
		System.out.println("Dí un número: ");
		int numero1 = Integer.parseInt(consola.nextLine());
		System.out.println("Dí otro número: ");
		int numero2 = Integer.parseInt(consola.nextLine());
		if(numero1 > numero2) {
			System.out.println("El número " + numero1 + " es mayor");
		}
		else if (numero2 > numero1){
			System.out.println("El número " + numero2 + " es mayor");
		}
		else {
			System.out.println("Los números son iguales");
		}
	}
}
