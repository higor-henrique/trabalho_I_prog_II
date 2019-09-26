package Controller;


import armax.DadosProdutos;


public class ProdutoController {

	private static DadosProdutos dp = new DadosProdutos();
	
	
	
	public void cadastraProduto(String nome, double precoDeCusto, String apelido, int  duracao, boolean isPerecivel ) {
		 
			if(dp.buscar(nome) == null) {
			dp.inserir(nome, precoDeCusto, apelido, duracao, isPerecivel);
			
			}
		
			
	}
	
	public void cadastraProduto(Object obj) {
		
		if(dp.buscar(obj) == null)
			dp.inserir(obj);
	}
	
	public void printaNome() {
		
		dp.printDados();
	}
	
	
	
	
	
}
