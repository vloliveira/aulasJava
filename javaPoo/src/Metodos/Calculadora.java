package Metodos;

public class Calculadora {

	public static void main(String[] args) {
		CalcularMetodos c1 = new CalcularMetodos(); 
		int result1 = c1.somar(2,3);
		int result2 = c1.somar(2,3,4);
		System.out.println(result1 + " e " + result2);
	}
}
