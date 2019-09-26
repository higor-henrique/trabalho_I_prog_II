/*
package produtos_e_financeiro;

import java.util.Scanner;
import Model.Fornecedor;
import Model.Vendedor;

public class Teste {
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		CadastroVendas cd = new CadastroVendas();
		CadastroProdutos pd = new CadastroProdutos();
		Estoque et = new Estoque();
		Fornecedor f = new Fornecedor("Ricardo Eletro", "Av.Calogeras", "90076988000165");
		Vendedor vd = new Vendedor("Oronio", "056.456.789-56", "av.guaicurus", "981185075", 201, 4, 1);
		/*pd.addTipo("massa");
		pd.addTipo("doce");
		pd.addTipo("assados");
		pd.addTipo("fritos");
		
		pd.addProduto("pao","massa", 1, 2, f);
		pd.addProduto("cuecav","massa", 3, 3, f);
		pd.addProduto("bolo","doce", 2, 10, f);
		pd.addProduto("alfajor","doce", 1, 14, f);
		pd.addProduto("esfirra","assados", 1, 5, f);
		pd.addProduto("coxinha","fritos", 1, 3, f);
		pd.addProduto("biscoito","doce", 4, 4, f);
		
		
		

		cd.escolheProduto("pao");
		cd.escolheProduto("cuecav");
		cd.escolheProduto("bolo");
		cd.escolheProduto("alfajor");
		cd.escolheProduto("esfirra");
		cd.escolheProduto("coxinha");
		cd.escolheProduto("biscoito");
		cd.escolheProduto("biscoito");
		cd.escolheProduto("biscoito");
		cd.escolheProduto("biscoito");
		
		System.out.println("pintaEstoque()");
		System.out.println();
		et.printaEstoque();
		

		
		
		System.out.println();
		System.out.println("printaSacola()");
		cd.printaSacola();
		
		System.out.println();
		cd.finalizaCompra(vd, "09/06/2001", "d", true);
		System.out.println();
		et.printaEstoque();
		*/
		/*
		int valor;

		do {
			System.out.println("teste funcionalides");
			System.out.println("0 sair");
			System.out.println("1 add Tipo");
			System.out.println("2 addProduto");
			System.out.println("3 escolheProduto");
			System.out.println("4 printaEstoque");
			System.out.println("5 printaSacola");
			System.out.println("6 finaliza compra");
			System.out.println("7 ");
			System.out.println("8 ");
			System.out.println("9 ");
			System.out.println("10");
			System.out.println("11");
			System.out.println("12");		
			System.out.println("13");		
			System.out.println("14");		
					
			valor = sc.nextInt();

			switch (valor) {
			case 1:				
				pd.addTipo(sc.next());
				
				break;

			case 2:
				System.out.println("nome:");
				String nome = sc.next();
				System.out.println("tipo:");
				String tipo = sc.next();
				System.out.println("quantidade:");
				int quantidade = sc.nextInt();
				System.out.println("preco:");
				float preco = sc.nextFloat();
				pd.addProduto(nome, tipo, quantidade, preco, f);
				break;
			case 3:
				cd.escolheProduto(sc.next());
				break;

			case 4:
				et.printaEstoque();				
				break;

			case 5:
				cd.printaSacola();
				break;

			case 6:
				cd.finalizaCompra(vd, "20/09/2019", "D", true);
				
				break;

			case 7:
				
				break;

			case 8:				
				break;

			case 9:
				
				break;

			case 10:
				
				break;

			case 11:
				
				break;

			default:
				break;

			}

		} while (valor != 0);

	}
}*/