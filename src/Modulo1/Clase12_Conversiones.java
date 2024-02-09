package Modulo1;
import java.util.Scanner;

public class Clase12_Conversiones {
	public static void main(String[] args) {
		//Convertir un tipo Stirng a un tipo int
		var edad = Integer.parseInt("21");
		//int edad = "21";
		//System.out.println((edad) + 1);
		
		var valorPI = Double.parseDouble("3.1416"); //Para pasar de un valor a otro se coloca el parse. y el tipo de dato al que lo queremos pasar
		System.out.println(valorPI);
		
		var consola = new Scanner(System.in);
		System.out.println("Proporciona tu edad");
		edad = Integer.parseInt(consola.nextLine());
		System.out.println("Edad: " + edad);
	}
}
