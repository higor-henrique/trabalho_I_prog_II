package produtos_e_financeiro;


import Model.*;
import armax.*;
import Controller.*;


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
		
		
		Produto  p1 = new Produto("Bolo", 25, null),
				 p2 = new Produto("Cueca Virada", 4, null),
				 p3 = new Produto("Trufa", 10, null),							
				 p4 = new Produto("Refri", 10, null);
		pc.cadastraProduto(p1);
		
		pc.cadastraProduto(p2);
		
		pc.cadastraProduto(p3);
		
		pc.cadastraProduto(p4);
		//pc.printaNome();
		
		et.inserir(p1, 2, f);
		et.inserir(p2, 3, f);
		et.inserir(p3,  2, f);
		et.inserir(p4, 2, f);
		
		et.printaEstoque();
		
		//ec.printaEstoque();
		//System.out.println(et.buscar("bolo").getNome());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		vc.escolheProduto("bolo", 1);
		vc.escolheProduto("trufa", 1);
		vc.escolheProduto("refri", 4);
		
		//vc.printaSacola();
		
		Vendedor v1 = new Vendedor("higor", "03268001157", "av.buabua", "6781185075",1800,250,2);
		Cliente c1 = new Cliente("bolaas","03268001157","av.ruaMano","67981185075", 2000);
		vc.finalizaCompra(v1, c1, "09/06/2019","C", true);
		
		DadosEstoque de = new DadosEstoque();
		
		DadosVendas dv = new DadosVendas();
	
		
		vc.escolheProduto("bolo", 1);
		vc.escolheProduto("trufa", 1);
		vc.escolheProduto("refri", 4);
		
		//vc.printaSacola();
		
		Vendedor v2 = new Vendedor("higor", "03268001157", "av.buabua", "6781185075",1800,250,2);
		Cliente c2 = new Cliente("bolaas","03268001157","av.ruaMano","67981185075", 2000);
		//vc.finalizaCompra(v1, c1, "09/06/2019","C", true);
		
		

		
		vc.escolheProduto("bolo", 1);
		vc.escolheProduto("trufa", 1);
		vc.escolheProduto("refri", 4);
		
		vc.printaSacola();
		et.printaEstoque();
		Cliente c3 = new Cliente("bolaas","03268001157","av.ruaMano","67981185075", 2000);
		vc.finalizaCompra(v2, c3, "09/06/2019","C", true);
	
		
		dv.printaDados();
		System.out.println("----------");
		vc.deletarVenda();
		dv.printaDados();
		
		System.out.println("----------");
		
		//vc.printaDadosVenda();
		et.deletar("cueca virada");
		et.printaEstoque();

		
	}

}
