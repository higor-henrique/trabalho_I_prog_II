package armax;

import Model.Estoque;
import Model.Produto;

public class DadosEstoque implements CRUD {
	
	private static Produto[] produto = new Produto[1500];
	private int n;
	
	
	public static Produto[] getProduto() {
		return produto;
	}

	public static void setProduto(Produto[] produto) {
		DadosEstoque.produto = produto;
	}

	@Override
	public void inserir(Object obj) {
		// TODO Auto-generated method stub
		produto[++n] = (Produto) obj;
	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub
		int j = 0;
		for(int i = 0; i < produto.length; i++)
		{
			if( produto[i] != null)
			{
				if(produto[i].equals(obj))
					j = i;
			}
			
				
		}
		return produto[j];
	}
	

	@Override
	public void atualizar(Object obj, Object novoObj) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < produto.length; i++)
		{
			if( produto[i] != null)
			{
				if(produto[i].equals( obj))
					produto[i] = (Produto) novoObj;
			}
			
		}
		
	}

	@Override
	public void deletar(Object obj) {
		// TODO Auto-generated method stub
		for(int i = 0; i < produto.length; i++)
		{
			if(produto[i] != null)
			{
				if(produto[i].equals(obj))
					produto[i] = null;
			}
			
				
		}
	}

	
}
	
	
	
	


