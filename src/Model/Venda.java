package Model;

public class Venda {
	
	private String data;
	private String formaPagamento;
	private boolean aVista;
	private Sacola sacola;
	private double preco;
	private Vendedor vendedor;
	private Cliente cliente;
	
	
	
	public Venda(String data, String formaPagamento, boolean aVista)
	{
		setData(data);
		setFormaPagamento(formaPagamento);
		setaVista(aVista);
		sacola = new Sacola();
        
        
	}
	public Venda() {
		sacola = new Sacola();
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Sacola getSacola() {
		return sacola;
	}
	public void setSacola(Sacola sacola) {
		this.sacola = sacola;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public boolean isaVista() {
		return aVista;
	}

	public void setaVista(boolean aVista) {
		this.aVista = aVista;
	}
    
	public void addNaSacola(Object produto) {
		
		sacola.addProduto((Produto)produto);
	}
       
	public void printaSacola() {
		
		sacola.printaProdutos();
		
	}
	
	public double geraPreco() {
		
		Produto[] produto = sacola.getProduto();
		this.preco = 0;
		for(int i = 0; i < produto.length; i++) {
			if(produto[i] != null)
				this.preco = this.preco + produto[i].getPrecoFinal();
		}
		
		return preco;
				
	}
	
}
