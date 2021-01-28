package anderson;

import java.util.Scanner;

public class Dia2801Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,qtimpar=0,qtpar=0,num;
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<10;x++)
		{
			System.out.println("Digite um número");
			num = ler.nextInt();
			
			if(num%2==0)
			{
				qtpar++;
			}
			else
			{
				qtimpar++;
			}
		}
		System.out.println("A quantidade de par é "+qtpar+" E a quantidade de impar é "+qtimpar);
		

	}

}
