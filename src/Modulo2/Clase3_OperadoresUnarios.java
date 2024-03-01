package Modulo2;

public class Clase3_OperadoresUnarios {
	public static void main(String[] args) {
		var a = 3;
		var b = -a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//Operador de negación
		var c = true;
		var d = !c;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		//Operadores de postincremento y preincremento
		var e = 3; 
		var f = ++e; //Esto hara que primero se incremente la variable y despues se utilize su valor
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		var g = 5;
		var h = g++; //Primero se utiliza el valor de la variable y despues se incrementa
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
		//Operadores de pre decremento y post decremento
		var i = 2;
		var j = --i;
		System.out.println("i = " + i); //Ya esta decrementada
		System.out.println("j = " + j);
		
		var k = 4; ////Primero se utiliza el valor de la variable y despues se decrementa
		var l = k--;
		System.out.println("k = " + k);
		System.out.println("l = " + l);
	}
}