package anderson;

import java.util.Scanner;

public class Dia2701Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero,raiz=0,quadrado;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		numero = ler.nextDouble();
		
		if(numero%2==0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O número é par: %1.1f",numero);
			System.out.printf("\nE a raiz é: %2.2f",raiz);
			
		}
		else if(numero%2!=0)
		{
			quadrado = Math.pow(numero, 2);
			System.out.printf("O número é impar : %2.2f",numero);
			System.out.printf("\nE o quadrado é: %2.2f",quadrado);
			
		}
		
		
		

	}

}
