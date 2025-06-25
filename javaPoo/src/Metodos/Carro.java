package Metodos;

public class Carro {
	public String cor;
	public double preco;
	public String modelo;
	
	// Este é o método construtor padrão, que tem o mesmo nome da classe:
	public Carro() {
		
	}
	public Carro(String modelo, double preco) {
		this.cor="Preto";
		this.modelo=modelo;
		this.preco=preco;
	}
	public Carro(String cor, String modelo, double preco) {
		this.cor=cor;
		this.modelo=modelo;
		this.preco=preco;
	}
}