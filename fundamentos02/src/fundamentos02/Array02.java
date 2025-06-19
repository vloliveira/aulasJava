package fundamentos02;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		int i=0;
		double nota[]= new double[5], soma = 0, media=0;
		
		Scanner sc = new Scanner(System.in);
		for (i = 0; i <nota.length;i++) {
			System.out.printf("Digite a nota do aluno %d: ", i+1);
			nota [i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(nota));
		
		// O for each lê todo o array, não seleciona uma posição específica.
		// Precisa criar uma variável do mesmo tipo do array : o nome do array
		for (double x : nota) {
			soma += x;
		}
		media=soma/nota.length;
		System.out.println(media);
	}

}
