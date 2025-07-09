package exerciciosEncapsulamento;

public class ContaBancaria {
	private String numeroConta;
	private double saldo;
	
	public ContaBancaria(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if(valor>0 ) {
			this.saldo += valor;
		} 
		else {
			System.out.println("Digite um valor maior que zero!");
		}
	}
	
		
	public void sacar(double valor) {
		if (saldo>0 && saldo>=valor) {
			this.saldo -= valor;
		} 
		else {
			System.out.println("O saldo está zerado!");
		}
	
	
	}
}