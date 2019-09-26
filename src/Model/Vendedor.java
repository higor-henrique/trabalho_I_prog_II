package Model;

public class Vendedor extends Funcionario implements ImpostoSobreSalario {
	
	public int metaDeVenda;
	public int qtdeVendas;

	public Vendedor(String nome, String cpf, String endereco, String telefone, double salarioBase, int metaDeVenda,int qtdeVendas) {

		super(nome, cpf, endereco, telefone, salarioBase);
		setMetaDeVenda(metaDeVenda);
		setQtDeVendas(qtdeVendas);
	}



	public void contaVendas() {
		// aumenta o numero de vendas realizadas pelo funcionario.
		++qtdeVendas;

	}

	@Override
	public double imposto(double salarioBase) {
		// TODO Auto-generated method stub
		double imposto = bonificacao(salarioBase) * 0.18;
		return imposto;
	}

	@Override
	public double salarioComImposto(double salarioBase) {
		// TODO Auto-generated method stub
		double salarioImposto = bonificacao(salarioBase) - imposto(salarioBase);
		return salarioImposto;
	}

	@Override
	public double bonificacao(double salarioBase) {
		// TODO Auto-generated method stub
		if (qtdeVendas <= metaDeVenda) // Verifica se o funcionario bateu a meta de vendas para receber a bonificacao e
		{								// realiza o calculo do salario bonificado e retorna o valor do salario
										// bonificado.
			double salarioBonificado;
			double bonificacao = 0.10;
			salarioBonificado = (salarioBase * bonificacao) + salarioBase;
			return salarioBonificado;
		} else {
			System.out.println("O vendedor não ultrapassou a meta, portanto o salario nao recebeu bonificacao");
			return salarioBase;
		}
	}


	public void setMetaDeVenda(int metaDeVenda) {
		this.metaDeVenda = metaDeVenda;
	}

	public void setQtDeVendas(int qtdeVendas) {
		this.qtdeVendas = qtdeVendas;
	}

	public int getMetaDeVenda() {
		return metaDeVenda;
	}

	public int getQtDeVendas() {
		return qtdeVendas;
	}
}