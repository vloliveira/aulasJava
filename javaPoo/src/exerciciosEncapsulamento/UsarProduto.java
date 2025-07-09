package exerciciosEncapsulamento;

public class UsarProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setNome("Biscoito");
		p1.setPreco(2);
		p1.adicionarEstoque(4);
		p1.removerEstoque(1);
		System.out.println(p1.getNome());
		System.out.println(p1.getPreco());
		System.out.println(p1.getQuantidadeEstoque());
		
		
		
	}

}
