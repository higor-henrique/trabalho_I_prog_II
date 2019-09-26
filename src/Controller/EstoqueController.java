package Controller;

import Model.Estoque;
import Model.Produto;

public class EstoqueController {
	
	Estoque estoque = new Estoque();
	
	
	public void printaEstoque() { 
		
		Produto[] vetor = estoque.getProduto();
			
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] != null)
				System.out.println(vetor[i].getNome());
		}
	
	
	
	
	
		
	}
	

}
