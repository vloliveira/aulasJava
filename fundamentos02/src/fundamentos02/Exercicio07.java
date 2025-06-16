package fundamentos02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int qtd = 0;
		double nota = 0, media = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos tem na turma: ");
		qtd = sc.nextInt();
		
		for (int i = 1; i<= qtd; i++) {
			System.out.print("Digite a nota do aluno: ");
			nota += sc.nextDouble();	
		}
		media = nota/qtd; 
		System.out.printf(media>=7? "A média da turma é %.2f e foi aprovada!" : "A média da turma é %.2f e a turma foi reprovada!", media );
	}
}