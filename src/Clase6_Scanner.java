import java.util.Scanner;

public class Clase6_Scanner {
	public static void main(String[] args) {
		System.out.println("Escribe tu nombre:");
		Scanner consola = new Scanner(System.in);
		var usuario = consola.nextLine();
		System.out.println("Escriba su titulo:");
		var titulo = consola.nextLine();
		System.out.println("Bienvenido " + titulo + " " + usuario);
		
	}
	
}
