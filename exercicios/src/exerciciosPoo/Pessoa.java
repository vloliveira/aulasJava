package exerciciosPoo;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		if (nome != null && !nome.isEmpty()  ) {
			this.nome = nome;
		}else {
			System.out.println("Nome inválido!");
			this.nome = "Nome inválido";
		}
	
	}
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if (idade >=0 && idade <120) {
			this.idade = idade;
		}else {
			System.out.println("Idade inválida!");
		}
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		if(altura >=0 && altura <3) {
			this.altura = altura;
		} else {
			System.out.println("Altura inválida!");
		}
	}
	
	
	public void fazerAniversario () {
		idade++;
	}

}
