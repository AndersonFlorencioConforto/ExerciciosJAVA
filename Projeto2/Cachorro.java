package Projeto2;

import java.util.Scanner;

public class Cachorro extends SuperPet implements Animal {
	Scanner ler = new Scanner (System.in);
	
	String nomeAnimal;
	private String raca;
	private int idade;
	private double peso;
	private String cor;
	private String sexo;
	
	public Cachorro() {
		super();
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
	public int getIdade() {
		return idade;
	}
	@Override
	public void setIdade(int idade) {
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
	public void banhoETosa() {
		double valor = 0;
		if(getPeso()<10) {
			System.out.println("O porte do cachorro � pequeno e o pre�o � "+(valor=40));
		}
		else if(getPeso()>=10 && getPeso()<=15) {
			System.out.println("O porte do cachorro � m�dio e o pre�o � "+(valor=55));
		}
		else
		{
			System.out.println("O porte do cachorro � grande e o pre�o � "+(valor=75));
		}
	}
	
	@Override
	public void creche() {
		double valor = 40; 
		int	hora = 0;
		int acrescimo = 20;
		
			System.out.print("Digite por favor , quantas horas voc� deseja que AmiC�o fique com seu cachorrinho: ");
			hora = ler.nextInt();
			
			if(hora==1) {
			System.out.println("AmiC�o ficar� " +hora+ " horas na sua resid�ncia no valor de: " + (valor=40));
			
			} else {
				
				System.out.println("AmiC�o ficar� " + hora + " horas na sua resid�ncia no valor de: " + (valor +(acrescimo*(hora-1))));
			
		}
		
	}	


	

	
	
		
	
	

}
