public class Clase4_Concatenacion {
	public static void main(String[] args) {
		var usuario = "Pablo";
		var titulo = "Licenciado";
		
		var union = titulo + " " + usuario;
		System.out.println("union: " + union);
		//Las palabras reservadas no se pueden utilizar como nombres de variables
		
		var i = 3;
		var j = 4;
		System.out.println(i + j);//Se realiza suma de numeros
		System.out.println(i + j + " " + usuario);//Si el compilador primero encuentra numeros hara la suma y lo unira a la cadena
		System.out.println(usuario + " " + i + j);//Por el contrario si encuentra una cadena de texto antes que numeros, a estos los concatenara no los sumara
		System.out.println(usuario + " " + (i + j));//Esto se corrige usando parentesis
		
	}
}
