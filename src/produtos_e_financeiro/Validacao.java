package produtos_e_financeiro;

public class Validacao {
	private Estoque estoque;
	
	
	public boolean validaNomes(String nome)
	{
		estoque = new Estoque();
		
		return false;
		
	}
	
	public boolean validaPreco(float preco)
	{
		return false;
	}
	
	/*public boolean validaQuantidadeTipo(int quantidade)
	{
	
		String[] aux;
		String[] vetAux = new String[1500];		
		int[] contaProduto = new int[1500];
		 
		for(int i = 0; i < estoque.length; i++)
		{
			if(estoque[i] != null)
			{	
					
				for(int j = 0; j < estoque.length; j++)
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
					if(contaProduto[i] < 30)
					{
						return true;
					}
				}				
			}
			return false;
		}

		
	}*/
	
	
}
