package Modulo3;

public class Clase4_Switch {
	public static void main(String[] args) {
		//La estructura switch es recomendable para realizar un menú
		var numero = 2;
		var numeroTexto = "Valor desconocido";
		
		switch(numero) {
		case 1:
			numeroTexto = "Numero 1";
			break;
		case 2:
			numeroTexto = "Numero 2";
			break;
		case 3:
			numeroTexto = "Numero 3";
			break;
		case 4:
			numeroTexto = "Numero 4";
			break;
		default:
			numeroTexto = "Caso no encontrado";
		}
		System.out.println("numeroTexto: " + numeroTexto);
	}
}
