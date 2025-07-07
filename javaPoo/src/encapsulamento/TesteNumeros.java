package encapsulamento;

public class TesteNumeros {

	public static void main(String[] args) {
		Numeros c1 = new Numeros();
		c1.ajustarN1(10);
		int retorno = c1.mostrarN1();
		System.out.println(retorno);
	}
}