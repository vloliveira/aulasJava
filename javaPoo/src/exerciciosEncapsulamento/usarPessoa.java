package exerciciosEncapsulamento;

import java.util.Scanner;

public class usarPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null,0);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		p1.setNome(sc.nextLine());
		System.out.println("Digite a idade: ");
		p1.setIdade(sc.nextInt());
		
		System.out.printf("%s tem %d anos de idade", p1.getNome(), p1.getIdade());
		
	}

}
