package Model;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String endereco;
	protected String telefone;

	public Pessoa(String nome, String cpf, String endereco, String telefone) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setTelefone(telefone);
	}	

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public boolean validaNome(String nome) {
		boolean valido = true;

		for (int i = 0; i < nome.length(); i++) {
			for (int j = 0; j < 10; j++) {

				if (nome.substring(i, i+1).equals(String.valueOf(j))) {
					valido = false;
				}
			}

		}

		return valido;
	}

	public void setNome(String nome) {
		if (validaNome(nome) == false) {
			this.nome = null;
			System.out.println("nome invalido");
		} else {
			this.nome = nome;
		}
		

	}

	public boolean validaCpf(String cpf) {
		
		boolean valido = true;
		int contador = 0;
		cpf = cpf.replace(".", "");
		cpf = cpf.replace("-","");

		
		for(int i = 0; i < cpf.length(); i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if(cpf.substring(i, i+1).equals(String.valueOf(j)))
				{
					contador++;
				}
			}
		}
		if(contador != 11)
		{
			valido = false;
			System.out.println("O CPF possue 11 caracteres sendo eles numeros.");
		}
			
	
		return valido;

	}

	public void setCpf(String cpf) {
		if (validaCpf(cpf) == false)
		{
			System.out.println("CPF invalido!");
			this.cpf = null;
		}
		else
		this.cpf = cpf;
		
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
		// falta código para verificar o endereço
	}

	public boolean validaTelefone(String telefone) {
		boolean valido = true;

		telefone = telefone.replace("-", "");
		telefone = telefone.replace("(", "");
		telefone = telefone.replace(")", "");

		if (!telefone.matches("[0-9]*")) {
			System.out.println("apenas numeros");
			valido = false;
		}
		if (telefone.length() != 9 && telefone.length() != 8 && telefone.length() != 10 && telefone.length() != 11) {
			System.out.println("nao se encaixa no padrao de telefone residencial de 8 digitos ou 10 (com DDD)");
			System.out.println("nao se encaixa no padrao de 9 digitos ou 11 (com DDD)");
			valido = false;
		}

		if (telefone.length() == 9) {
			if (!telefone.substring(0, 1).equals("9")) {
				System.out.println("no caso de um numero de 9 digitos, o primeiro deveria ser 9");
				valido = false;
			}

		}
		if (telefone.length() == 11) {
			if (!telefone.substring(2, 3).equals("9")) {
				System.out.println(telefone.substring(2, 3));
				System.out.println("no caso de um numero de 9 digitos, o primeiro deveria ser 9*");
				valido = false;
			}
		}
		return valido;

	}

	public void setTelefone(String telefone) {

		if (validaTelefone(telefone) == false) {
			System.out.println("telefone invalido");
			this.telefone = null;
		}
		else
		this.telefone = telefone;

	}

	public String getTelefone() {
		return telefone;
	}


}