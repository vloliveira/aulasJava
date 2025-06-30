package polimorfismo;

public class Cachorro extends Animal {
	public Cachorro(String nome, int idade){
		super (nome, idade);
	}
	public void comer (String comida) {
		System.out.printf("Foi comer %s", comida);
	}
	public void comer (String nome, String comida) {
		System.out.printf("S% foi comer %s", nome, comida);
	}
	

}
