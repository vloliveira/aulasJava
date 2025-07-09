package exerciciosEncapsulamento;

public class AppDoBanco {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria(null,0);
		
		c1.depositar(20.00);
		c1.sacar(10.80);
		c1.sacar(50);
		System.out.println(c1.getSaldo());
		
	}

}
