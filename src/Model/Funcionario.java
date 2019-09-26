package Model;


public abstract class Funcionario extends Pessoa {


	protected double salarioBase;
	

	
	public Funcionario(String nome, String cpf, String endereco, String telefone, double salarioBase) {

		super(nome, cpf, endereco, telefone);
		this.salarioBase = salarioBase;
	}

	public abstract double bonificacao(double salarioBase);


	
}