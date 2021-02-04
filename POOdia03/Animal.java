package AulaPOO;

public abstract class Animal {
	//atributos
	private String nome;
	private int idade;
	
	public Animal(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public abstract void som(String paraSom);
	public abstract void habilidade(String paraHab);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
	

}
