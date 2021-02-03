package AulaPOO;

import java.util.Scanner;

public class Fornecedor extends Pessoas {
	Scanner ler = new Scanner(System.in);
	private int valorcredito;
	private int valordivida;
	public Fornecedor(String nome, String endere�o, int telefone,int valorcredito,int valordivida) {
		super(nome, endere�o, telefone);
		this.valorcredito = valorcredito;
		this.valordivida = valordivida;
		
	}
	
	public void imprimirinfo()
	{
		System.out.println("Nome: "+nome+"\nEndere�o: "+endere�o+"\nTelefone: "+telefone+"\nCr�dito: "+valorcredito+"\nD�vida: "+valordivida);
	}
	
	public void perguntaridade(int idade)
	{
		System.out.println("Qual a sua idade?");
		idade = ler.nextInt();
	}
	
	public void obtersaldo()
	{
		valorcredito = valorcredito - valordivida;
		System.out.println("O novo valor do saldo �:" +valorcredito);
	}


	public int getValorcredito() {
		return valorcredito;
	}


	public void setValorcredito(int valorcredito) {
		this.valorcredito = valorcredito;
	}


	public int getValordivida() {
		return valordivida;
	}


	public void setValordivida(int valordivida) {
		this.valordivida = valordivida;
	}
	

}
