package Tareas;
import java.util.Scanner;

public class Tarea_2 {
	public static void main(String[] args) {
		/*
		  Se solicita capturar la siguiente información de una tienda de libros:
          -nombre (String)
          -id (int)
          -precio (double)
          -envioGratuito (boolean)
		*/

		var consola = new Scanner(System.in);
		System.out.println("Bienvenido usuario, favor de registrar los siguientes datos para el envío de su libro: ");
		System.out.println("Proporciona el nombre: ");
		String nombre = (consola.nextLine());
		System.out.println("Proporciona el ID: ");
		int id = Integer.parseInt(consola.nextLine());
		System.out.println("Proporciona el precio del libro");
		double precio = Double.parseDouble(consola.nextLine());
		System.out.println("¿El envío es gratis? Escribir True/False");
		boolean envio = Boolean.parseBoolean(consola.nextLine());
		
		System.out.println(nombre + " #" + id);
		System.out.println("$" + precio);
		System.out.println("Envío gratuito: " + envio);
	}
}
