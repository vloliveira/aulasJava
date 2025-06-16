package fundamentos02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		double soma = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite quantos alunos tem na sala: ");
		int quantidade = entrada.nextInt();
		
		while (x<=quantidade) {
			System.out.print("Digite a nota do aluno: ");
			soma += entrada.nextDouble();
			x++;
		}
		double media = soma/quantidade;
		
		System.out.printf(media>=7 ? "A média da turma é %.2f e a turma foi aprovada! " :
			"A média da turma é %.2f e a turma foi reprovada! ", media);
	}

}
