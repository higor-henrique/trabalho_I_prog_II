package Model;

public class Fornecedor {
	
	private String cnpj;
	private String nome;
	private String endereco;
	private boolean isRecorrente;
	private int desconto = 0;
	
	public Fornecedor(String nome, String endereco, String cnpj) 
	{

		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		
	}
	public Fornecedor() {
		
	}

	public boolean getIsRecorrente() {
		return isRecorrente;
	}
	public void setRecorrente(boolean isRecorrente) {
		this.isRecorrente = isRecorrente;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void setPorcentDesconto(boolean param, int porcent) {
		if(param == true)
			desconto = porcent;
	}

	public int getPorcentDesconto() {
		return desconto/100;
	}

}
