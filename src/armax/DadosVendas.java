package armax;

import Model.Produto;
import Model.Venda;

public class DadosVendas implements CRUD {

	private static int n = 0;
	private static int tamanho = 10;
	private static Venda[] venda = new Venda[tamanho];

	@Override
	public void inserir(Object obj) {
		// TODO Auto-generated method stub
		boolean inserido = false;
		if (n == tamanho)
			venda = aumentaTamanhoVetor(venda);
		for (int i = 0; i < venda.length && !inserido; i++) {
			if (venda[i] == null) {
				venda[i] = (Venda) obj;
				inserido = true;
				n++;
			}

		}

	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub

		for (int i = 0; i < venda.length; i++) {
			if (venda[i] != null) {
				if (venda[i].equals(obj))
					return (Venda) venda[i];
			}

		}
		return null;
	}

	@Override
	public void atualizar(Object obj, Object novoObj) {
		// TODO Auto-generated method stub
		boolean atualizado = false;
		for (int i = 0; i < venda.length && !atualizado; i++) {
			if (venda[i] != null) {
				if (venda[i].equals(venda))
					venda[i] = (Venda) novoObj;
				atualizado = true;
			}

		}

	}

	@Override
	public void deletar(Object obj) {
		// TODO Auto-generated method stub
		boolean deletado = false;
		for (int i = 0; i < venda.length && !deletado; i++) {
			if (venda[i] != null) {
				if (venda[i].equals(obj)) {
					venda[i] = null;
					deletado = true;
					n--;
				}
			}
		}
	}

	public Venda[] aumentaTamanhoVetor(Venda[] v) {
		int tamanho = venda.length;
		Venda[] aux = new Venda[++tamanho];
		aux = venda.clone();
		return aux;
	}

	public void printaDados() {

		for (int i = 0; i < venda.length; i++) {
			if (venda[i] != null) {
				System.out.println("datat: " + venda[i].getData());
				System.out.println("forma de pagamento: " + venda[i].getFormaPagamento());
				System.out.println("a vista: " + venda[i].isaVista());
				System.out.println("produtos: " + venda[i].getSacola());
				System.out.println("preco: " + venda[i].getPreco());
				System.out.println("Vendedor: " + venda[i].getVendedor());
				System.out.println("Cliente: " + venda[i].getCliente());

			}

		}

	}

}
