package anderson;

import java.util.Scanner;

public class Dia2801Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,soma=0;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("Entre com um número");
			x = ler.nextInt();
			soma = soma + x;
			
					
		}while(x!=0);
		
		System.out.println("A soma dos números digitados é "+soma);

	}

}
