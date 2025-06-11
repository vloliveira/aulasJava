package Exercicio01;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = entrada.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = entrada.nextInt();
		
		/*if(num1>num2 && num1>num3) {
			System.out.println(num1 + " é maior");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2 + " é maior");
		}else {
			System.out.println(num3 + " é maior");
		}*/
		
		//------------------------------------------------------
		
		// Opção de operador ternário sem printf:
		//System.out.println(num1>num2 && num1>num3? "O número maior é "+num1: num2>num1 && num2>num3? "O maior número é "+num2: "O maior número é o "+num3);
		
		// Opção de operador ternário com printf
		/*int resultado = num1>num2 && num1>num3? num1: num2>num1 && num2>num3? num2: num3;
		System.out.printf("O maior número é %d", resultado); */
		
		int resultado = Math.max(num1, Math.max(num2, num3));
		System.out.printf("O maior número é %d", resultado);
		
		
	}
}
