package polimorfismo;

public class Animal {
	String nome;
	int idade;
	
	public Animal(String nome, int idade){
		this.nome=nome;
		this.idade=idade;
	}
	public void comer() {
		System.out.println("Foi comer");
	}
	
}