package Projeto2;

import java.util.Scanner;

abstract class SuperPet {
	Scanner ler = new Scanner (System.in);
	private String nomeDono;
	private String endereco;
	private int cpf;
	private int telefone;
	private double preco;
			
	public SuperPet(String nomeDono,String endereco,int cpf,int telefone,double preco)
	{
		this.nomeDono = nomeDono;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.preco = preco;
	}
	
	
		
	public SuperPet() {
		
	}
	
	public void imprimirInfo()
	{
		System.out.println(getNomeDono()+getEndereco());
	}

	public String getNomeDono() {
		return nomeDono;
	}

	
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}



		
	}





