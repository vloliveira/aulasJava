package exerciciosAbstracao;

public abstract class Animal {
	String nome;

	public abstract void emitirSom ();
	
	public void dormir() {
		System.out.println("O animal está dornmindo.");
	}
	
	
}