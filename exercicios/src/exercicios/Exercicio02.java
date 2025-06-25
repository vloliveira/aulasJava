package exercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercicio02 {

	public static void main(String[] args) {
		/*2. Faça um programa que, a partir de um texto digitado pelo usuário, conte o número de
		palavras (palavra é definida por qualquer sequência de caracteres delimitada por 
		espaços em branco) e exiba o resultado.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = sc.nextLine();
		// StringTokenizer divide uma String em partes chamadas Tokens, são separadas por espaços, ponto, vírgula, 2 pontos
		StringTokenizer resultado = new StringTokenizer(texto);
		// countTokens vai fazer a contegem de resultado (divisão feita pelo StringTokenizer
		System.out.println(texto + " tem: " + resultado.countTokens() + " palavras." );
		
	}

}
