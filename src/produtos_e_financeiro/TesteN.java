package produtos_e_financeiro;


import Model.*;
import armax.*;
import Controller.*;
import armax.*;

public class TesteN {
	
	
	
	public static void main(String [] args) {
		
		Model.Estoque et = new Model.Estoque();
		EstoqueController ec = new EstoqueController();
		Produto pt = new Produto();
		ProdutoController pc = new ProdutoController();
		
		Fornecedor f = new Fornecedor("ricardo eletro", "av.Brasil", "032654654");
		VendaController vc = new VendaController();
		
		pt.setNome("pao frances");
					
		pc.cadastraProduto("pao frances", 2, null,  30, true);
		
		
		Produto  p1 = new Produto("Bolo", 25, null, 10, true),
				 p2 = new Produto("Cueca Virada", 4, null, 20, true),
				 p3 = new Produto("Trufa", 10, null, 10, true),							
				 p4 = new Produto("Refri", 10, null, 0, false);
		pc.cadastraProduto(p1);
		
		pc.cadastraProduto(p2);
		
		pc.cadastraProduto(p3);
		
		pc.cadastraProduto(p4);
		//pc.printaNome();
		
		//et.inserir(p1, 2, f);
		//et.inserir(p2, 3, f);
		//et.inserir(p3,  2, f);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//ec.printaEstoque();
		System.out.println(et.buscar("bolo").getNome());
		
		///vc.escolheProduto("bolo", 1);
		//vc.escolheProduto("trufa", 1);
		//vc.escolheProduto("refri", 1);
		//vc.printaSacola();
		
		
		//vc.printaDadosVenda();
		
	}

}
