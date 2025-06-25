package Metodos;

public class LojaDeCarro {
	public static void main (String[] args) {
		Carro c1 = new Carro();
		c1.cor="Cinza";
		System.out.println(c1.cor);
		c1.modelo="Fiat Uno com escada";
		System.out.println(c1.modelo);
		c1.preco=8500;
		System.out.println(c1.preco);
		Carro c2 = new Carro("Gol bala", 25000);
		System.out.println(c2.modelo);
		System.out.println(c2.preco);
	}
}
