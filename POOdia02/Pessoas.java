package AulaPOO;

public class Pessoas {
	public String nome;
	public String endereço;
	public int telefone;
	
	public Pessoas (String nome,String endereço,int telefone)
	{
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}

	public void imprimirinf2()
	{
		System.out.println("Nome: "+nome+"\nEndereço: "+endereço+"\nTelefone: "+telefone);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	

}
