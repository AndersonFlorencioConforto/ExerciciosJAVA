package AulaPOO;

public class Pessoas {
	public String nome;
	public String endere�o;
	public int telefone;
	
	public Pessoas (String nome,String endere�o,int telefone)
	{
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}

	public void imprimirinf2()
	{
		System.out.println("Nome: "+nome+"\nEndere�o: "+endere�o+"\nTelefone: "+telefone);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	

}
