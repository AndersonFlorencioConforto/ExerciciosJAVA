package AulaPOO;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
	Cachorro Billy = new Cachorro();
	Cavalo PédePano = new Cavalo();
	Preguiça Dorminhoca = new Preguiça();
	Animal Animal = null;
	
	for(int x=0;x<1;x++)
	{
		System.out.println("Entre com um número de 1 a 3");
		int n = ler.nextInt();
		if(n>0 && n<=3)
		{
			System.out.println("Bom(a) garoto(a)!!!!");
		}
		else {
			System.out.println("Número inválido,digite o número corretamente");
			x--;
		}
		switch(n) {
		case 1: Animal=Billy;break;
		case 2: Animal=PédePano;break;
		case 3: Animal=Dorminhoca;break;
		}
		if(Animal!=null)
		{
			System.out.println(Animal.getNome());
			System.out.println(Animal.getIdade()+" anos");
			Animal.som(null);
			Animal.habilidade(null);
		}
	}
	
	
	


	}

}
