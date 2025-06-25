package exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		/*6. Refaça o exercício anterior, usando a
		maneira como o Mestre yoda falaria..
		BELA É VIDA A*/
		
		String palavras [] = {"a", "vida", "é", "bela"};
		String novasPalavras [] = new String [palavras.length];
		for (int i = palavras.length-1; i >= 0; i--) {
			novasPalavras[palavras.length-i-1] = palavras[i];	
		}
		String frase = String.join(" ", novasPalavras).toUpperCase();
		System.out.println(frase);
	}
}
