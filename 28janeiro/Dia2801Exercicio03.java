package anderson;

import java.util.Scanner;

public class Dia2801Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade=0,menos21=0,mais50=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		idade = ler.nextInt();
		
		while(idade!=-99 && idade>0)
		{
			System.out.println("Digite sua idade");
			idade = ler.nextInt();
			if(idade<21)
			{
				menos21++;
			}
			else if(idade>50)
			{
				mais50++;
			}
			
		}
		System.out.println("O total de pessoas com menos de 21 anos é "+menos21+" E o total de pessoas com mais de 50 é "+mais50);

	}

}
