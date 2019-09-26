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
			for(int i = 0; i < quantidade; i++)
				if(Estoque.produto[i] == null ) {
					Estoque.produto[i] = new Produto();
					Estoque.produto[i].setNome(produto.getNome());
					Estoque.produto[i].setPrecoDeCusto(produto.getPrecoDeCusto());
					Estoque.produto[i].setApelido(produto.getApelido());
					Estoque.produto[i].setDuracao(produto.getDuracao());
					Estoque.produto[i].setIsPerecivel(produto.getIsPerecivel());
					Estoque.produto[i].setCodigo(Estoque.produto[i].geraCodigo(geraId()));
					
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
	
	public void deletar(Produto produto) {
		
		boolean deletou = false;
		for(int i = 0; i < Estoque.produto.length && deletou == false; i++) {
			
			if(Estoque.produto[i] != null)
				if(Estoque.produto[i].equals(produto)) {
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
	
	
	
	public String geraId() {
		
		int id = dp.getN();
			
		if(id  < 10) {
			 return "0"+id;
		}
		else {
			return ""+id;
		}
		
		
	}

	public static Produto[] getProduto() {
		return produto;
	}

	
	
	
	
}