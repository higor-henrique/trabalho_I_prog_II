package Model;

public class Sacola {
	
	public Produto[] produto = new Produto[20];
	private int n;
	
	public Sacola() {
		
		
		
	}
	
	public void addProduto(Produto produto) {
		
		boolean inserido = false;
		for(int i = 0; i < this.produto.length && !inserido && n < 50; i++)
		{
			if( this.produto[i] == null)
			{
				this.produto[i] = produto;
				inserido = true;
				
			}	
				
		}
	}
	
	public void removeProtudo(Produto produto) {
		
		for(int i = 0; i < this.produto.length; i++)
		{
			if(this.produto[i] != null)
			{
				if(this.produto[i].equals(produto))
					this.produto[i] = null;
			}
		}
	}
	
	
	public void zera() {
		
		for(int i = 0; i < produto.length; i++) {
			
			if(produto[i] != null)
				produto[i] = null;
		}
		
	}
	
	public void printaProdutos() {
		
		for(int i = 0; i < 20; i++)
			if(produto[i] != null)
			System.out.println(produto[i].getNome());
	}

	public Produto[] getProduto() {
		return produto;
	}


	

}
