package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*4. Faça um programa que receba de um
		usuário, um texto e exiba esse texto em letras
		maiúsculas.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = sc.nextLine();
		String resultado = texto.toUpperCase();
		System.out.println(resultado);
		
	}

}
