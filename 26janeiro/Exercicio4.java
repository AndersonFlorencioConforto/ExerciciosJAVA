package anderson;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A,B,C,R,S,D;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero A");
		A = ler.nextInt();
		System.out.println("Entre com o n�mero B");
		B = ler.nextInt();
		System.out.println("Entre com o n�mero C");
		C = ler.nextInt();
		
		R = (A+B)*(A+B);
		S = (B+C)*(B+C);
		D = (R+S)/2;
		
		System.out.println("O resultado da express�o � "+D);
		
				

	}

}
