package AulaPOO;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
	Cachorro Billy = new Cachorro();
	Cavalo P�dePano = new Cavalo();
	Pregui�a Dorminhoca = new Pregui�a();
	Animal Animal = null;
	
	for(int x=0;x<1;x++)
	{
		System.out.println("Entre com um n�mero de 1 a 3");
		int n = ler.nextInt();
		if(n>0 && n<=3)
		{
			System.out.println("Bom(a) garoto(a)!!!!");
		}
		else {
			System.out.println("N�mero inv�lido,digite o n�mero corretamente");
			x--;
		}
		switch(n) {
		case 1: Animal=Billy;break;
		case 2: Animal=P�dePano;break;
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
