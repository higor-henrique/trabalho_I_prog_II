package Model;

public class Padeiro extends Funcionario implements ImpostoSobreSalario
{
private int horaNoturno;

	public Padeiro(String nome, String cpf, String endereco, String telefone, double salarioBase,int horaNoturno)
	{
		super(nome, cpf, endereco, telefone, salarioBase);
		this.horaNoturno = horaNoturno;
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
		double salarioBonificado; 
		double aumentoPhora = 0;
		salarioBonificado = 0;
		while(horaNoturno !=0)
		{
			aumentoPhora = (salarioBase * 0.25) + aumentoPhora; //Adiciona a bonificacao ao salario do padeiro, baseado nas horas trabalhadas no horario alternativo e retorna o valor do salario bonificado
		    horaNoturno--;
		}
		    salarioBonificado = salarioBase + aumentoPhora;
			return salarioBonificado;
	}	
	
	
	
	
	public void setHoraNoturno(int horaNoturno)
	{
		this.horaNoturno = horaNoturno; //Define a quantidade de horas trabalhadas no horario alternativo
	}
	
	public int getHoraNoturno()
	{
		return horaNoturno; // Retorna a quantidade de horas trabalhadas no horario alternativo
	}
	
	


	
}