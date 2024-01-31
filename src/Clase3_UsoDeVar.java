public class Clase3_UsoDeVar {
	public static void main(String[] args) {
		//var - inferencia de tipos en Java
		var miVariableEntera2 = 10; //Con la palabra var java infiere el tipo de dato a partir de la literal que se dé
		System.out.println(miVariableEntera2);
		
		var miVariableCadena2 = "Hola que tal";
		System.out.println("miVariableCdena2 = " + miVariableCadena2);
		
		//Formas de declarar variables:
		//var miVariable = 1;
		//var _miVariable = 2;
		//var $MiVariable = 3;
		//var áVariable = 2;      Esto es posible pero no es recomendable
	}
}
