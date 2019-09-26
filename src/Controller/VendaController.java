package Controller;

import armax.DadosVendas;
import Model.Venda;
import Model.Estoque;
import Model.Vendedor;
import Model.Cliente;


public class VendaController {
	
	private Model.Estoque est = new Estoque(); 
	private Venda venda;
	private DadosVendas dv = new DadosVendas();
	public VendaController() {
		
		
		venda = new Venda();
	
	}
	
	public void escolheProduto(String nome, int quantidade) {
		
		for(int i = 0; i < quantidade; i++)
			if(est.buscar(nome) !=null) 
				ensacola(est.buscar(nome));	
		
	}
	
	public void ensacola(Object produto) {
		
		venda.addNaSacola(produto);	
	}
	
	
	
	public double finalizaCompra(Vendedor vendedor,Cliente cliente, String data, String formaPagamento, boolean aVista) {
	
		venda.setData(data);
		venda.setFormaPagamento(formaPagamento);
		venda.setaVista(aVista);
		venda.setVendedor(vendedor);
		venda.setCliente(cliente);
		double preco = venda.geraPreco();
		dv.inserir(venda);
		
		return preco;
	}
	
	
	
	public void printaSacola() {
		
		venda.printaSacola();
	}
	
	public void printaDadosVenda() {
		
		dv.printaDados();
	}
	

}
