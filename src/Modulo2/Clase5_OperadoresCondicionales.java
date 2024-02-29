package Modulo2;

public class Clase5_OperadoresCondicionales {
	public static void main(String[] args) {
		var a = 5;
		var valorMinimo = 0;
		var valorMaximo = 10;
		
		//Operador And (&&)
		var resultado = (a >= 0) && (a <= 10);
		if(resultado){
			System.out.println("Dentro de rango");
		}
		else {
			System.out.println("Fuera de rango");
		}
		
		//Operador Or (||)
		var vacaciones = true;
		var diaDescanso = false;
		if(vacaciones || diaDescanso) {
			System.out.println("El padre puede asistir al juego del hijo");
		}
		else {
			System.out.println("El padre esta ocupado");
		}
	}
}