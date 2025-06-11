package aula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Digite F ou M: ");
		char letra = input.next().charAt(0);
		
		if(letra == 'F' || letra== 'f') {
			System.out.println("F - Feminino");
		}else if(letra == 'M' || letra== 'm') {
			System.out.println("M - Masculino");
		}else {
			System.out.println("Letra incorreta!");
		}
	}
}