package anderson;

import java.util.Scanner;

public class Dia2701Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com sua idade");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Sua categoria � infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Sua categoria � juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Sua categoria � adulto");
		}
		else
		{
			System.out.println("Voc� n�o se encontra em nenhuma das categorias");
		}

	}

}
