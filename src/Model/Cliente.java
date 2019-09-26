package Model;

public class Cliente extends Pessoa
{
	private double valorCompra;
	private boolean gold = false;
	private boolean platinum = false;
	private float precoCompra;
	private float limiteGold;
	private float limitePlatinum;
	
	public Cliente (String nome, String cpf, String endereco, String telefone, double valorCompra) {
		
		super(nome,cpf,endereco,telefone);
		this.valorCompra = valorCompra;
	}

	public boolean getClienteGold()
	{
		return gold;
	}

	public boolean getClientePlatinum()
	{
		return platinum;
	}

	public void setClienteGold(boolean gold)
	{
		this.gold = gold;
	}

	public void setClientePlatinum(boolean platinum)
	{
		this.platinum= platinum;
	}
	public void AdicionaValorCompra()
	{
		//Adiciona o valor em compras a uma variavel que sera utilizada para fazer a verificação do cartao de gold/platinum
		valorCompra = valorCompra + precoCompra;
	}
}