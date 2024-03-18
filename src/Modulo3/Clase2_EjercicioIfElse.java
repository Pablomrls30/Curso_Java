package Modulo3;

public class Clase2_EjercicioIfElse {
	public static void main(String[] args) {
		var numero = 4;
		var numeroTexto = "Numero desconocido";
		if(numero == 1) {
			numeroTexto = "Numero uno";
		}
		else if(numero == 2){            //Cuando ponemos else if, el programa evalua las condiciones y cuando encuentra una se detiene
			numeroTexto = "Numero dos";  //a diferencia de que si solo es el if, este evalua todas las condiciones independientemente de haber encontrado la condicion verdadera
		}                                //afectando asi el rendimiento del programa  
		else if(numero == 3) {
			numeroTexto = "Numero tres";
		}
		else if(numero == 4) {
			numeroTexto = "Numero cuatro";
		}
		else { 
			numeroTexto = "Numero no encontrado";
		}
		System.out.println(numeroTexto);
		
		
	}
}
