package aula01;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = entrada.nextInt();
		System.out.println(num==0? "É zero": num>0? "É positivo": "É negativo" );
		
	}
}