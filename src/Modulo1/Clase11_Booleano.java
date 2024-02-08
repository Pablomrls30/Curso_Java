package Modulo1;

public class Clase11_Booleano {
	public static void main(String[] args) {
		//El tipo bool solo almacena falso o verdadero
		boolean varBoolean = true;
		System.out.println(varBoolean);
		
		if(varBoolean) {
			System.out.println("La bandera es verdadera");
		}
		
		else {
			System.out.println("La bandera es falsa");
		}
		
		var edad = 18;
		//var esMayorDeEdad = edad >= 18;
		if(edad >=18){
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
		
	}
}
