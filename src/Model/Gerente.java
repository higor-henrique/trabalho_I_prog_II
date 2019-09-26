package Model;

public class Gerente extends Funcionario implements ImpostoSobreSalario
{	
	public Gerente(String nome,String cpf,String endereco, String telefone,double salarioBase)
	{
		super(nome, cpf, endereco, telefone, salarioBase);
	}

	@Override
	public double imposto(double salarioBase) {
		// TODO Auto-generated method stub
		double imposto = bonificacao(salarioBase) *  0.18;
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
	//Adiciona a bonificacao ao salario do gerente e retorna o valor do salario bonificado
		double salarioBonificado;
		salarioBonificado = salarioBase*0.20 + salarioBase;
		return salarioBonificado;
		
	}
	
	




	

	
}