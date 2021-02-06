package Projeto2;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteSuperPet {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		ArrayList <String> cachorroInfo = new ArrayList();
		ArrayList <String> donoInfo = new ArrayList();
		Scanner ler = new Scanner (System.in);	
		
		
		System.out.println("Digite [1] --> Cachorro \nDigite [2] --> Gato");
		int op = ler.nextInt();
		
		switch(op) {
		case 1 : cachorro.cadastro();
			char continua;
			do {
			
		System.out.println("Venha conhecer as nossas oções pro seu amiguinho!!!");
		System.out.println("[1] --> Banho e tosa   [2] --> Creche  [3] --> Passeio");
		int op2 = ler.nextInt();
		
		switch(op2)
		{
		
		case 1: 
			System.out.print("Qual o peso do "+cachorro.getNomeAnimal()+"?");
			cachorro.setPeso(ler.nextDouble());
			cachorro.banhoETosa();break;
		
		case 2:
			
			cachorro.creche();break;
			
		case 3:
			
			cachorro.passeio();break;
			
		}
		cachorro.valortotal();
		System.out.print("Deseja adicionar mais algum serviço ?");
		continua  = ler.next().charAt(0);
		}while(continua == 'S' || continua == 's');break;
		
		case 2:
			gato.cadastro();
			
			char continua2;
			do {
			
		System.out.println("Venha conhecer as nossas oções pro seu amiguinho!!!");
		System.out.println("[1] --> Banho e tosa   [2] --> Creche  [3] --> Passeio");
		int op3 = ler.nextInt();
		
		switch(op3)
		{
		
		case 1: 
			gato.banhoETosa();break;
		
		case 2:
			gato.creche();break;
			
		case 3:
			gato.passeio();break;
			
		}
		gato.valortotal();
		System.out.print("Deseja adicionar mais algum serviço [SIM] ou [NÃO] ?");
		continua2  = ler.next().charAt(0);
		}while(continua2 == 'S' || continua2 == 's');break;
		
		
		
			
			
			
		
		
		
	
		
		
		}
	
	
		
		
	}
		
		
		
}

