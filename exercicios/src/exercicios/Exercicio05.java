package exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5. dado o Array a seguir, {"a", "vida", "é", "bela"}
		faça um programa que crie um string com o
		texto retirado do Array e imprima. no seguinte
		formato.
		A VIDA É BELA */
		
		String palavras[] = {"a", "vida", "é", "bela"};
		
		String texto = String.join(" ", palavras).toUpperCase();
		System.out.println(texto);
		
		
	}
}
