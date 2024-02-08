package Modulo1;

public class Clase10_TipoChar {
	public static void main(String[] args) {
		char miCaracter = 'w'; //Para utilizar el tipo de dato char, el caracter debe de estar entre comilla simple
		System.out.println(miCaracter);//El tipo char solo admite un solo caractér
		
		//Asi se escribe un caracter en Unicode
		char varChar = '\u0021';
		System.out.println(varChar);
		
		char varCharDecimal = 33;
		System.out.println(varCharDecimal);
		
		char varCharSimbolo = '!';
		System.out.println(varCharSimbolo);
		
		System.out.println("-----------------------------------------");
		
		var varChar1 = '\u0021';
		System.out.println(varChar1);
		
		var varCharDecimal2 = 33;
		System.out.println(varCharDecimal2);
		
		var varCharSimbolo3 = '!';
		System.out.println(varCharSimbolo3);
		
		//Así también es como se puede visualizar los caracteres unicode en java
		//En este caso el ! es el numero 33
		int variableEnteraSimbolo = '!';
		System.out.println(variableEnteraSimbolo);
		
		int variable = 'a';
		System.out.println(variable);
	}
}
