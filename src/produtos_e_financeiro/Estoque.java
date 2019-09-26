package produtos_e_financeiro;

import Model.Produto;

public class Estoque {
		
	private static String[] estoque;
 
    public Estoque()  
    { 
        
         estoque = new String[1500];
    }
    
    //pega  as infos do metodo addProduto() e guarda no vetor estoque.
    public void addnoEstoque(String[] infoProduto) 
    {
        boolean inseri = false;
        
   
        for(int i = 0; i < 1500 && !inseri; i++) 
        {
                 
                if(estoque[i] == null) 
                {                	
                	estoque[i] = infoProduto[i];
                	inseri = true;
                }                 
        }
    } 
    
    //busca um produto por nome no estoque e retorna suas infos;
    public static String buscaNoEstoque(String nome) 
    {   
    	
    	boolean achou = false;    	
	    	for(int i = 0; i < 15 && !achou ; i++) 
	    	{	    
	    		if(estoque[i] != null)
	    		{
	    			if(estoque[i].contains(nome)) 
	    			{
	    				achou = true;
	    				//print de teste
	    				//System.out.println(estoque[i]);
	    				return estoque[i];	    				
	    			}
	    		}
	    	}	    	    
    	return "Produto nao encontrado";
    } 
    
    public static String buscaNoEstoqueComIndice(String nome, int k) 
    {   
    	
    	
    	boolean achou = false;    	
	    	for(int i = 0; i < 15 && !achou ; i++) 
	    	{	    			
	    			if(estoque[i].contains(nome)) 
	    			{
	    				achou = true;
	    				//print de teste
	    				//System.out.println(estoque[i]);
	    				//if(estoque ta no limite vai dar erro)
	    				return estoque[i+k];	    				
	    			} 	    				    		
	    	}	    	    
    	return "Produto nao encontrado";
    }
    
    
    public void printaEstoque() 
    {
    	for(int i = 0; i < estoque.length ; i++) 
    	{
    		if(estoque[i] != null)
    		System.out.println(estoque[i]);
    	}
    	
    }
    
    public static void excluiDoEstoque(String nomeOuCod) 
    {
    	boolean retirou = false;
    	String aux = buscaNoEstoque(nomeOuCod);
    	for(int i = 0; i < estoque.length && !retirou; i++) 
    	{    		
    		if(estoque[i] != null)
    		{	    			    			
    			if(aux == estoque[i]) 
    			{
    				estoque[i] = null; 
    				retirou = true;    			
    			}
    		}
    	}
    }
    
    
	public static void emiteAlerta() {
	
		String[] aux;
		String[] vetAux = new String[1500];		
		int[] contaProduto = new int[1500];
		
		for(int i = 0; i < estoque.length; i++)
		{
			if(estoque[i] != null)
			{	
				
				
				for(int j = 0; j < estoque.length ; j++)
				{
					
					if(estoque[j] != null)
					{
						aux = estoque[j].split("/");
						if(estoque[i].toLowerCase().contains(aux[0].toLowerCase()))
						{							
							vetAux[i] = aux[0];						
							contaProduto[i] += 1;							
						}
					}
				}
			}				
		}
		
		for(int i = 0; i < vetAux.length; i++)
		{
			if(vetAux[i] != null)
			{
				if(contaProduto[i] < 2)
				{
					System.out.println(vetAux[i]+" ta acabando...");
				}
			}
		
		}
			
							
	}
	/*se for menor que 30 tem que retornar false*/

	public static String[] getEstoque() {
		return estoque;
	}

	
	
	
	
}