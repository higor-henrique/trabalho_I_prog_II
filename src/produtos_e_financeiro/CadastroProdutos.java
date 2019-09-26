/*package produtos_e_financeiro;

import java.util.Random;
import Model.Produto;

import Model.Fornecedor;

public class CadastroProdutos {
	
	private String nome;
	private String codigo;
	private String[] catalogoProdutos;
	private Estoque estoque;
	private String[] tipo;
	private Produto produto;
	
	
	public CadastroProdutos () 
	{
		catalogoProdutos = new String[1500];
		estoque = new Estoque();
		tipo = new String[50];
	}
	
	/*  precisa registrar no sistema sempre quando chega produto na padaria. Este mÃ©todo(addProduto), adiciona 
	 * uma n quantidade de um mesmo produto e concatena suas infos para colocar na classe estoque.*/
	/*public void  addProduto(String nome, String tipo, int quantidade, float precoDeCusto, Fornecedor fornecedor) 
	{	
		if((verificaTipoIgualNome(nome, tipo) == false))
		{
			if(quantidade <=30)
			{
				
				Produto pd = new Produto(nome, tipo, precoDeCusto);
				
				
				addTipo(tipo);
				
				//for que eh rodado n vezes, sendo n a quantidade do mesmo produto que foi solicitado o cadastro
				for(int k = 0; k < quantidade; k++)
				{	
					Random rd = new Random();
					boolean existeNome = false;						
					int[] c = new int[6];
					
					for(int i = 0; i < catalogoProdutos.length && !existeNome; i++) 
					{
						
						if(catalogoProdutos[i] == null)
						{
							//gera parte do codigo do produto com a classe random
							for(int j = 0; j < 4; j++) 
								c[j] = rd.nextInt(9); 
									 
							codigo = retornaIdTipo(tipo)+"."+ c[0] +""+c[1]+""+c[2]+""+c[3]; 
							
							catalogoProdutos[i] = pd.getNome() + "/" + pd.getTipo()+ "/" + codigo +"/"+ fornecedor.getNome() +" - @"+ fornecedor.getCnpj() +"@"+"/#"+precoDeCusto+"#"+"/;"+definePrecoFinal(pd.getPrecoDeCusto());
							
							existeNome = true;
							
							estoque.addnoEstoque(catalogoProdutos); 
							
						}
					}
				}
			}
			else
				System.out.println("ERRO: quantidade de produtos de um mesmo tipo maior que 30, excede o estoque. Tente novamente.");
		}
		else
			System.out.println("ERRO: nome ou tipo repetido ou ja existente");
/*	}
//----------------------------------------------------Inicio infos Tipo------------------------------------------------------------------------------------------------	
	//verifica se um tipo de produto existe 
	public boolean existeTipo(String tipo) 
	{
		boolean existe = false;
   		for(int i = 0; i < this.tipo.length && !existe; i++) 
		{	
   			if(this.tipo[i] != null) 
   			{
			if(this.tipo[i].toLowerCase().contains(tipo.toLowerCase()))
				existe = true;
   			}
		}
   		return existe;
	}
   	//quando um tipo de produto nÃ£o existe ele adiciona ao vetor tipos com o nome do tipo e o id 
	public void addTipo(String tipo) 
   	{
   		
   		
		if(existeTipo(tipo) == false) {
			boolean adicionou = false;
			for(int i = 0; i < this.tipo.length && !adicionou; i++) 
			{
				
				if(this.tipo[i] == null) 
				{	
					this.tipo[i] = tipo + "/" + geraIdTipo();
					adicionou = true;
				}
			}
		}
		
   	}
	
	/*para saber que um produto Ã© de um tipo especÃ­fico Ã© sÃ³ olhar o vetor tipos e o id do produto
	 para isso Ã© preciso que toda vez que adicionmaros um tipo, um id desse seja gerado automaticamente.
	 o mÃ©todo geraIdTipo() serve para isso pois ele Ã© chamado dentro do mÃ©todo addTipo()
   	public String geraIdTipo() 
   	{
   	
   		
   		int contaTipo = 0;
   		//conta quantos tipo existem para gerar o id do adicionado
   		for(int i = 0; i < tipo.length; i++) 
   		{
   			if(tipo[i] != null)
   				contaTipo++;
   		}
   		if(contaTipo >= 49)
   		{
   			return "chegou ao limite de 50 tipos no estoque";
   		}
   		
   		if(contaTipo < 10) 
		{
			return "0"+contaTipo;
		}
   		
		return ""+contaTipo;
   	}
   	
   	//mÃ©todo que retorna o id do tipo pelo parametro nome do tÃ­tulo
   	public String retornaIdTipo(String tipo_a_ser_analisado) {
   		
   		boolean existe = false;
   		String[] vetSplit; 
   		for(int i = 0; i < tipo.length && !existe; i++) 
   		{
   			if(tipo[i].toLowerCase().contains(tipo_a_ser_analisado.toLowerCase())) {
   				vetSplit = tipo[i].split("/");
   				return vetSplit[1];
   			}
   		}
   		return"99";
   	}
   	
  //tipo eh igual a nome? true ou false?
  	public boolean verificaTipoIgualNome(String nome, String tipo) 
  	{
  		boolean isIgual = false;
  		String[] nomeOuTipoSplit;
  		String[] est =  estoque.getEstoque();
  		
  		
  		
  		
  		if(nome.toLowerCase().equals(tipo.toLowerCase()))
  			isIgual = true;
  		
  		
  		
  		for(int i = 0; i < est.length && isIgual == false; i++)
  		{
  			if(est[i] != null)
  			{	
  								
  				nomeOuTipoSplit = est[i].split("/");
  				
  				//nome, posicao 0 do vetor nomeOuTipo
  				if(nomeOuTipoSplit[0].toLowerCase().contains(tipo.toLowerCase())) {
  											
  					isIgual = true;						
  														
  				//Tipo, posicao 1 do vetor nomeOutipo
  				}else if(nomeOuTipoSplit[1].toLowerCase().contains(nome.toLowerCase())) {
  					isIgual = true;
  				}
  				
  				
  			}
  		}
  		return isIgual;
  		
  	}

   	
 //-----------------------------------------------------------------------------FIM infos Tipo-----------------------------------------------------	
   	
   	
   	@Override
	public boolean equals(Object obj) {
   		
   		
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public float definePrecoFinal(float precoDeCusto) {
   		 		
   		float precoFinal = 1 + precoDeCusto;
   		//precoFinal = precoDeCusto + impostos() + despesas() - desconto();  
   		
		return precoFinal;
	}
   	
   	
   	
   	// --------------------FALTA-----------------------------------------//
   	
   	
   	// perecivel e data de validade
   	//verificaÃ§Ã£o
   	
   	
   	
}*/