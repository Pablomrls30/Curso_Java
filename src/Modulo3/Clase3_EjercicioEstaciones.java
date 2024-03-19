package Modulo3;
import java.util.Scanner;

public class Clase3_EjercicioEstaciones {
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Bienvenido usuario, este programa te proporcionara la estacion del año");
		System.out.println("a partir del numero de mes que ingreses");
		System.out.println("Proporciona el número del mes: ");
		int mes = Integer.parseInt(consola.nextLine());
		var estacion = "Estacion desconocida";
		if(mes == 12 || mes == 1 || mes == 2) {
			estacion = "Invierno";
		}
		else if(mes == 3 || mes == 4 || mes == 5) {
			estacion = "Primavera";
		}
		else if(mes == 6 || mes == 7 || mes == 8) {
			estacion = "Verano";
		}
		else if(mes == 9 || mes == 10 || mes == 11) {
			estacion = "Otoño";
		}
		
		System.out.println(estacion);
	}
}
