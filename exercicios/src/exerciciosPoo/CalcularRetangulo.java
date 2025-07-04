package exerciciosPoo;

import java.util.Scanner;

public class CalcularRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo r = new Retangulo();
		
		System.out.println("Digite a largura: ");
		r.setLargura(sc.nextDouble());
		System.out.println("Digite a altura: ");
		r.setAltura(sc.nextDouble());
		
		System.out.printf("A área do retângulo é: %.2f \n"
				+ "O perímetro ddo retângulo é: %.2f", r.calcularArea(), r.calcularPerimetro());
	}

	
}
