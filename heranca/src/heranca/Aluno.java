package heranca;

public class Aluno extends Pessoa {
	// Abaixo é o método construtor que herda da classe super Pessoa
	public Aluno(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
	}
	public String matricula;
}