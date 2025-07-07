package encapsulamento;

public class TesteAnimal {

	public static void main(String[] args) {
		AnimalEstimacao animal1 = new AnimalEstimacao();
		animal1.setNome("Oli");
		String nome1 = animal1.getNome();

		animal1.setIdade(11);
		int idade1 = animal1.getIdade();
		
		animal1.setTipo("Cachorro");
		String tipo1= animal1.getTipo();
		
		animal1.setRaca("Vira lata");
		String raca1= animal1.getRaca();
		
		System.out.printf("%s tem %d anos, é um %s e é da raça %s", nome1, idade1, tipo1, raca1);
		
		
	}

}
