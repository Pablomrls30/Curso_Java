package Tareas;

import java.util.Scanner;

public class Tarea_1 {
	public static void main(String[] args) {
		//Crea un programa en el que se le solicite al usuario un libro y su respectivo autor e imprimirlo en la consola
		System.out.println("Bienvenido, ¿cual es tu libro favorito?");
		Scanner consola = new Scanner(System.in);
		var libro = consola.nextLine();
		System.out.println("¿Quién lo escribio?");
		var autor = consola.nextLine();
		System.out.println("El libro " + libro + " fue escrito por " + autor);	
	}
}
