package anderson;

import java.util.Scanner;

public class Dia2701Exercicio01 {
	
	public static void main(String[] args) {
		
		int n1,n2,n3;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		n1 = ler.nextInt();
		System.out.println("Entre com um n�mero");
		n2 = ler.nextInt();
		System.out.println("Entre com um n�mero");
		n3 = ler.nextInt();
		
		if(n1>=n2 && n1>=n3)
		{
			System.out.println("O maior n�mero digitado foi "+n1);
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println("O maior n�mero digitado foi "+n2);
		}
		else if(n3>=n2 && n3>=n1)
		{
			System.out.println("O maior n�mero digitado foi "+n3);
		}
		
	}

}
