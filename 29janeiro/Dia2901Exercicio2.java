package anderson;

import java.util.Scanner;

public class Dia2901Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num2=0,num=0,soma=0,cont=0,i,vet[] = new int[10];
		float media=0;
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<10;i++)
		{
			System.out.printf("Qual o valor do [%d�] lan�amento do dado ",(i+1));
			vet[i] = ler.nextInt();
			if(vet[i]<=6)	
			{
				cont++;	
			}
			else 
			{
				System.out.println("Valor inv�lido");
				i--;
			}
		}
		for(i=0;i<10;i++)
		{
			if(vet[i]<=6)
			{
				soma = soma + vet[i];
			}	
		}
		media = soma/cont++;
		System.out.println("A m�dia dos n�meros � "+media);
		int maior=vet[0];
		
		for(i=0;i<10;i++)
		{
			if(vet[i] == 6)
			{
				num++;
			}
			if(vet[i]>=maior)
			{
				maior=vet[i];	
				num2++;
			}
		}
		if(maior<6) 
			{
				System.out.println("O n�mero 6 n�o saiu mas o maior n�mero � "+maior+" e saiu " +num2+ " vez(es)");
			}
		else
		{
			System.out.println("O n�mero 6 saiu "+num+" vez(es)");
		}
		


	}

}
