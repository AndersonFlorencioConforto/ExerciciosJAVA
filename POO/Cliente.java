package OrientaçãoOBJ;

public class Cliente {
	private String Nome;
	private int Ntelefone;
	private String Email;
	
	public Cliente (String Nome,int Ntelefone,String Email)
	{
		this.Nome = Nome;
		this.Ntelefone = Ntelefone;
		this.Email = Email;			
	}
	
	public void imprimirInfo ()
	{
		System.out.println(Nome+" Com número de telefone " +Ntelefone+ " Com email "+Email);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getNtelefone() {
		return Ntelefone;
	}

	public void setNtelefone(int ntelefone) {
		Ntelefone = ntelefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	

}
