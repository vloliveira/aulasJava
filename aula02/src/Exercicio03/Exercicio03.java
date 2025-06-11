package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = input.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		System.out.printf("A média do aluno é: %.2f" , media);
	}
}
