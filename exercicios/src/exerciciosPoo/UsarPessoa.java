package exerciciosPoo;

import java.util.Scanner;

public class UsarPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, 0, 0);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome da pessoa: ");
		p1.setNome(sc.nextLine());
		
		System.out.printf("Digite a idade de %s", p1.nome);
		p1.setIdade(sc.nextInt());
		
		System.out.println("Digite a altura da pessoa: ");
		p1.setAltura(sc.nextDouble());
		
		System.out.printf("%s, sua idade é %d e tem %.2f de altura \n", p1.getNome(), p1.getIdade(), p1.getAltura());
		
		p1.fazerAniversario();
		
		System.out.printf("%s fez aniversário e agora tem %d anos.", p1.getNome(), p1.getIdade());
	}
}
