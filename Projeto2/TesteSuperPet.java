package Projeto2;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteSuperPet {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		ArrayList <String> cachorroInfo = new ArrayList();
		ArrayList <String> donoInfo = new ArrayList();
		Scanner ler = new Scanner (System.in);	
		
		System.out.println("Digite [1] --> Cachorro \nDigite [2] --> Gato");
		int op = ler.nextInt();
		
		switch(op) {
		case 1 : 
		
			//System.out.println("quantos cachorros você tem");
			//int z = ler.nextInt();
			//for(int x=0;x<z;x++) {
			
		System.out.println("MARAVILHA!!! um doguinho xD ");
		System.out.println("Vamos para o seu cadastro!");
		System.out.println("Qual o seu nome?\t");
		ler.nextLine();
		cachorro.setNomeDono(ler.nextLine());
		System.out.println("Qual o seu endereço?");
		cachorro.setEndereco(ler.nextLine());
		
		System.out.println("Qual o seu cpf?");
		cachorro.setCpf(ler.nextInt());
		
		System.out.println("Qual o seu telefone?");
		cachorro.setTelefone(ler.nextInt());
		
		
		System.out.println("Agora vamos cadastrar seu amiguinho.... xD");
		System.out.println("Qual o nome do dog?");
		cachorro.setNomeAnimal(ler.nextLine());
		ler.nextLine();
		System.out.println("E qual a idade do dog?");
		cachorro.setIdade(ler.nextInt());
		ler.nextLine();
		System.out.println("Qual a raça do dog?");
		cachorro.setRaca(ler.nextLine());
		
		System.out.println("Qual a cor do dog?");
		cachorro.setCor(ler.nextLine());
		
		System.out.println("Qual o sexo do dog");
		cachorro.setSexo(ler.nextLine());
		
			char continua;
			do {
			
			
		
		System.out.println("Venha conhecer as nossas oções pro seu amiguinho!!!");
		System.out.println("[1] --> Banho e tosa   [2] --> Creche  [3] --> Passeio");
		int op2 = ler.nextInt();
		
		switch(op2)
		{
		
		case 1: 
			System.out.println("Qual o peso do dog");
			cachorro.setPeso(ler.nextDouble());
			cachorro.banhoETosa();break;
		
		case 2:
			
			cachorro.creche();
			
		}
		System.out.println("Deseja adicionar mais algum serviço ?");
		continua  = ler.next().charAt(0);
		}while(continua == 'S' || continua == 's');
		
		
	
		
		
		}
	
	
		
		
	}
		
		
		
}

