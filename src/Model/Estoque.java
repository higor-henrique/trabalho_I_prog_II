package Model;

import armax.DadosProdutos;


public class Estoque {
	
	private static Produto[] produto = new Produto[1500];
	private DadosProdutos dp = new DadosProdutos();
	
	public static Produto[] getVetorProduto() {
		return produto;
	}

	public void inserir(Produto produto, int quantidade, Fornecedor fornecedor) {
		
		if(dp.buscar(produto) != null) {
			for(int i = 0; i < Estoque.produto.length && quantidade > 0; i++)
				if(Estoque.produto[i] == null ) {
					Estoque.produto[i] = new Produto();
					Estoque.produto[i].setNome(produto.getNome());
					Estoque.produto[i].setPrecoDeCusto(produto.getPrecoDeCusto());
					Estoque.produto[i].setApelido(produto.getApelido());
					Estoque.produto[i].setCodigo(Estoque.produto[i].geraCodigo(produto.getId()));
					--quantidade;
				}
		}
	}
	
	
	
	
	public Produto buscar(String nome) {
		
	
		for(int i = 0; i < produto.length; i++) {
			if(produto[i] != null) {
				if( produto[i].getNome().equalsIgnoreCase(nome))
					return produto[i];
			}
		}
		
		
		return null;
	}
	public int contaProdutos(Produto produto) {
		
		int cont = 0;
		for(int i = 0; i < Estoque.produto.length; i++) {		
			if(Estoque.produto[i] != null) {
			if(produto.getNome().equals(Estoque.produto[i].getNome()))
				cont++;
			}
		}
		return cont;
	
		
	}
	
	public void deletar(String nome) {
		
		
		boolean deletou = false;
		for(int i = 0; i < Estoque.produto.length && deletou == false; i++) {
			
			if(Estoque.produto[i] != null)
				if(Estoque.produto[i].getNome().equalsIgnoreCase(nome)) {
					Estoque.produto[i] = null;
					deletou = true;
				}
		}
	}
	
	public void deletar(Produto produto) {
		
		
		boolean deletou = false;
		for(int i = 0; i < Estoque.produto.length && deletou == false; i++) {
			
			if(Estoque.produto[i] != null)
				if(Estoque.produto[i].equals((Produto)produto)) {
					Estoque.produto[i] = null;
					deletou = true;
				}
		}
	}
	
	
	public String emiteAlerta(Produto produto) {
		
		int cont = contaProdutos(produto);
		if(cont < 2)
			return "produto em falta.";
			
		return "";
	}
	
	

	public static Produto[] getProduto() {
		return produto;
	}

	public void printaEstoque() {
	
		for(int i = 0; i < produto.length; i++)	
			if(produto[i] != null) {
				System.out.println(produto[i].getNome());
				System.out.println(produto[i].getCodigo());
			}
		
	}
	
	/*public String emiteAlerta() {
		for(int i = 0; i < produto.length; i++)
		for(int i = 0;  i < produto.length; i++) {
			if(produto[i] != null) {
				
			}
		}
		return "";
	}*/
	
	
	
}