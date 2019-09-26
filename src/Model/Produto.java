package Model;

import java.util.Random;


public class Produto {
	private String nome;	
	private String codigo;
	private double precoDeCusto;
	private double precoFinal;
	private String apelido;
	private String dataDeValidade;
	private int duracao;
	private boolean isPerecivel;
	private Fornecedor fornecedor = new Fornecedor();

	public Produto(String nome, double precoDecusto, String apelido, int duracao, boolean isPerecivel) {
		
		setNome(nome);
		setPrecoDeCusto(precoDeCusto);
		setApelido(apelido);
		setDuracao(duracao);
		setIsPerecivel(isPerecivel);
	}
	

	public Produto() {
		
	}
	
	public Produto(String nome, double precoDeCusto) {
		
		setNome(nome);
		setPrecoDeCusto(precoDeCusto);
	}
	
	
	
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	
	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public boolean getIsPerecivel() {
		return isPerecivel;
	}

	public void setIsPerecivel(boolean isPerecivel) {
		this.isPerecivel = isPerecivel;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	
	public double getPrecoDeCusto() {
		return precoDeCusto;
	}

	public void setPrecoDeCusto(double precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//retorna o preco final de um produto.
	public double getPrecoFinal() {
		
		int desconto = fornecedor.getPorcentDesconto();
		precoFinal = precoDeCusto - desconto*precoDeCusto;
		 return precoFinal;
			
	}
	
	public String getCodigo() {
		
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		codigo = codigo.replace("-", "");
		if(codigo.length() == 6 || codigo.matches(".*[0,9]")) 
		this.codigo = codigo;
	}
	
	//gera o codigo aleatoriamente, pois cada produto tem seu codigo unico
	public String geraCodigo(String id) {

		int[] c = new int[6];
		Random rd = new Random();
		
		
			for(int i = 0; i < 6; i++) 
				c[i] = rd.nextInt(9); 
				 
		return id+"-"+ c[0] +""+c[1]+""+c[2]+""+c[3]; 
		
	}
	
	

}