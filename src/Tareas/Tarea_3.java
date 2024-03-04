package Tareas;
import java.util.Scanner;

public class Tarea_3 {
	public static void main(String[] args) {
		/*
		 En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos 
		 crear las siguientes variables:
		 -Alto (Int)
		 -Ancho (Int)
		 
		 El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el 
		 siguiente formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):
		 	Proporciona el alto:
			Proporciona el ancho:
			Area: <area>
			Perimetro: <perimetro>
		
		*/
		
		System.out.println("Bienvenido usuario, este es un programa para calcular el área y perímetro de un rectangulo a partir de que nos proporciones su largo y ancho");
		Scanner consola = new Scanner(System.in);
		System.out.println("Proporciona el ancho: ");
		int ancho = Integer.parseInt(consola.nextLine());
		System.out.println("Propociona el largo");
		int largo = Integer.parseInt(consola.nextLine());		
		int perimetro = ((largo * 2) + (ancho *2));
		int area = (largo * ancho);
		System.out.println("Perimetro = " + perimetro);
		System.out.println("Area = " + area);
	}
}
