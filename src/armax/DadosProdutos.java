package armax;

import Model.Produto;

public class DadosProdutos implements CRUD {
	
	private static Produto[] produto = new Produto[50];
	private static int n = 0;
	
	
	@Override
	public void inserir(Object obj) {
		
		boolean inserido = false;
		for(int i = 0; i < produto.length && !inserido && n < 50; i++)
		{
			if( produto[i] == null)
			{
				produto[i] = (Produto) obj;
				inserido = true;
				produto[i].setId(n);
				n++;
				
			}	
				
		}
	}
	
	
	public void inserir(String nome, double precoDeCusto, String apelido, int  duracao, boolean isPerecivel) {
		
		boolean inserido = false;
		for(int i = 0; i < produto.length && !inserido; i++)
		{
			if( produto[i] == null)
			{
				produto[i] = new Produto(nome, precoDeCusto, apelido);
				inserido = true;
				n++;
			}	
				
		}
	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub
		
		
		for(int i = 0; i < produto.length; i++)
		{
			if( produto[i] != null)
			{
				if(produto[i].equals(obj))
					return  (Produto)produto[i];	
			}
			 
				
				
		}
		return null;
	}
	
	public Object buscar(String nome) {
		
		
		
		for(int i = 0; i < produto.length; i++) {
			if(produto[i] != null) {
				if( produto[i].getNome().equalsIgnoreCase(nome))
					return (Produto)produto[i];
			}
		}
		
		return null;
		
	}

	@Override
	public void atualizar(Object obj, Object novoObj) {
		// TODO Auto-generated method stub
		boolean atualizado = false;
		for(int i = 0; i < produto.length && !atualizado; i++)
		{
			if( produto[i] != null)
			{
				if(produto[i].equals(obj) )
					produto[i] = (Produto) novoObj;
					atualizado = true;
			}
			
		}
	
	}

	@Override
	public void deletar(Object obj) {
		// TODO Auto-generated method stub
		boolean deletado = false;
		for(int i = 0; i < produto.length && !deletado; i++)
		{
			if(produto[i] != null)
			{
				if(produto[i].equals(obj))
					produto[i] = null;
					deletado = true;
					n--;
			}
			
				
		}
		
	}
	




	public void printDados() { 
		
		for(int i = 0; i < produto.length; i++) {
			if(produto[i] != null) {
				System.out.println(produto[i].getNome());
				System.out.println(produto[i].getCodigo());
				System.out.println("apelido: "+produto[i].getApelido());
				System.out.println("precode Custo: "+produto[i].getPrecoDeCusto());
			}
			
		}
	}
	
	public Produto[] getVetorProduto() {
		return produto;
	}
	
	
}
