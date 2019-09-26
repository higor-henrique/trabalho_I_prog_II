/*package produtos_e_financeiro;

import Model.Venda;
import Model.Cliente;
import Model.Vendedor;

public class CadastroVendas {

	private Estoque estoque;
	private boolean compraFinalizada;
	private Cliente cliente;	
	private int k;
	private String[] registroVenda;

	public CadastroVendas() {

		compraFinalizada = false;
		k = 0;
		
	}

	// recebe o nome ou código de parametro e retorna o produto se estiver no
	// estoque
	public String escolheProduto(String nomeOuCodigo) {
		estoque.emiteAlerta();

		ensacola(estoque.buscaNoEstoque(nomeOuCodigo));
		return estoque.buscaNoEstoque(nomeOuCodigo);

	}

	// coloca os produtos escolhidos num vetor temporário que servirá pra apontar
	// quais produtos vao ser excluidos do estoque quando o metodo finalizaCompra()
	// for chamado
	public void ensacola(String infoProduto) {
		
		boolean foi = false;
		boolean foi2 = false;
		String sacola[][] = cliente.getSacola();
		String aux = "";
		String[] info = infoProduto.split("/");
		
		// verifica se tem espaço na sacola e insere, pega o parametro codigo, faz uma
		// busca no estoque e coloca o resultado na variavel aux
		for (int i = 0; i < sacola.length && !foi; i++) {

			if (sacola[i][0] != null) {
				if (infoProduto.contains(sacola[i][0])) {
					// se o codigo do produto ja esta na sacola ele vai pegar o proximo produto do
					// mesmo nome e tipo
					aux = estoque.buscaNoEstoqueComIndice(infoProduto, ++k);
					foi2 = true;
				}

			}
		}

		if (foi2 == true)
			info = aux.split("/");

		for (int i = 0; i < sacola.length && !foi; i++) {

			for (int j = 0; j < 3; j++) {
				if (sacola[i][j] == null) {
					if (j == 0) {
						sacola[i][j] = info[2];
					} else if (j == 1) {
						sacola[i][j] = info[1];
					} else if (j == 2) {
						sacola[i][j] = "- " + info[0];
						foi = true;
					}
				}

			}
		}
		
		cliente.setSacola(sacola);
		if (foi == false)
			System.out.println("sacola cheia");
	}

	public void printaSacola() {
		
		String sacola[][] = cliente.getSacola();
		
		for (int i = 0; i < sacola.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (sacola[i][j] != null)
					System.out.print(sacola[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void finalizaCompra(Vendedor vendedor, String data, String formaPagamento, boolean aVista) {
		Venda vd = new Venda(data, formaPagamento, aVista);
		
		int aux = 0;
		boolean foi = false;
		for (int i = 0; i < 20 && !foi; i++) {
			/*
			 * if(registroVenda[i] == null) { registroVenda[i] = vendedor.getNome()+ " - "+
			 * data +" - "+formaPagamento+" - "+ "a vista: "+aVista; aux = i; foi = true; }
			 */
/*
		}

		System.out.println(geraPrecoTotalCompra());

		String aux2;
		String sacola[][] = cliente.getSacola();
		for (int i = 0; i < sacola.length; i++) {
			if (sacola[i][0] != null) {
				aux2 = estoque.buscaNoEstoque(sacola[i][0]);
				if (aux2 != null) {
					estoque.excluiDoEstoque(sacola[i][0]);
				}
			}
		}

		for (int i = 0; i < sacola.length; i++) {
			for (int j = 0; j < sacola[0].length; j++) {
				if (sacola[i][j] != null)
					sacola[i][j] = null;
			}
		}
		cliente.setSacola(sacola);

	}

	public float geraPrecoTotalCompra() {

		String aux2;
		String[] preco;
		String sacola[][] = cliente.getSacola();
		float precoTotal = 0;
		for (int i = 0; i < sacola.length; i++) {
			if (sacola[i][0] != null) {
				aux2 = estoque.buscaNoEstoque(sacola[i][0]);
				preco = aux2.split(";");

				precoTotal += Float.parseFloat(preco[1]);

			}
		}
		cliente.setSacola(sacola);
		return precoTotal;
	}

}*/