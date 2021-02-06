package Projeto2;

public class Gato extends SuperPet implements Animal  {

	private String nomeAnimal;
	private String raca;
	private String idade;
	private double peso;
	private String cor;
	private String sexo;
	private double valor;
	
	
	public Gato() {
		super();
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void cadastro() {
		System.out.println("MARAVILHA!!! um cat xD ");
		System.out.println("Vamos para o seu cadastro!");
		System.out.println("-------------------------------");
		System.out.print("Qual o seu nome?");
		
		setNomeDono(ler.nextLine());
		System.out.print("Qual o seu endereço?");
		setEndereco(ler.nextLine());
		
		System.out.print("Qual o seu cpf?");
		setCpf(ler.nextLine());
		
		System.out.print("Qual o seu telefone?");
		setTelefone(ler.nextLine());
		
		
		System.out.println("Agora vamos cadastrar seu amiguinho.... xD");
		System.out.print("Qual o nome do cat?");
		setNomeAnimal(ler.nextLine());
	
		System.out.print("Qual a idade do "+getNomeAnimal()+"?");
		setIdade(ler.nextLine());
		
		System.out.print("Qual a raça do " +getNomeAnimal()+"?");
		setRaca(ler.nextLine());
		
		System.out.print("Qual a cor do "+getNomeAnimal()+"?");
		setCor(ler.nextLine());
		
		System.out.print("Qual o sexo do "+getNomeAnimal()+"?");
		setSexo(ler.nextLine());
		
	}
	
	@Override
	public void banhoETosa() {
		
		this.valor += 50;
		//System.out.println("O banho será no valor ");
	
	}
	@Override
	public void creche() {
		
		
		int	hora = 0;
		int acrescimo = 25;
		
			System.out.print("Digite por favor , quantas horas você deseja que AmiCat fique com o" +getNomeAnimal());
			hora = ler.nextInt();
			
			if(hora==1) {
				this.valor +=80;
			System.out.println("AmiCat ficará com o " +getNomeAnimal()+" " +hora+ " hora na sua residência");
			
			} else {
				
				
				System.out.println("AmiCat ficará com o " +getNomeAnimal()+" " +hora+ " horas na sua residência : ");
				this.valor +=80+ (acrescimo*(hora-1));
		}
	
	}
	@Override
	public void passeio() {
		int acrescimo = 30;
		int hora = 0;
		
		System.out.print("Digite por favor , quantas horas você deseja que AmiCat passeie com o(a) " +getNomeAnimal()+"?");
		hora = ler.nextInt();
		
		if(hora==1) {
			this.valor +=50;
			System.out.println("AmiCat passeará com o(a) " +getNomeAnimal()+" " +hora+ " hora ");
			
			} else {
				
				System.out.println("AmiCat passeará com o(a) " +getNomeAnimal()+" " +hora+ " horas");
				this.valor +=50+ (acrescimo*(hora-1));
		}
		

	}

	
	
	@Override
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	@Override
	public void setNomeAnimal(String Nome) {
		this.nomeAnimal = Nome;
		
	}
	@Override
	public String getIdade() {
		return idade;
	}
	@Override
	public void setIdade(String idade) {
		this.idade = idade;
	}
	@Override
	public double getPeso() {
		return peso;
	}
	@Override
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String getCor() {
		return cor;
	}
	@Override
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String getSexo() {
		return sexo;
	}
	@Override
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String getRaca() {
		return raca;
	}
	@Override
	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void valortotal() {
		{
			System.out.printf("O valor total dos seus serviços será de R$%.2f\n ",getValor());
		}
		
		
	}
		
}
