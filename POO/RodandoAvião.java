package Orienta��oOBJ;

import java.util.Scanner;

public class RodandoAvi�o {

public static void main (String args []) {
		
		String modelo = null, companhia = null;
		int anofabri = 0, capacidade = 0;
		Scanner leia = new Scanner (System.in);
				
		System.out.println("Quantos avi�es voc� gostaria de cadastrar?");
		int N = leia.nextInt();
				
		Avi�o[] objAviao = new Avi�o [N];
		
		for (int x=0;x<N;x++) {
			
			System.out.println("Qual companhia?");
			companhia = leia.next();
			System.out.println("Qual modelo?");
			modelo = leia.next();
			System.out.println("Qual � o ano de fabrica��o?");
			anofabri = leia.nextInt();
			System.out.println("Qual capacidade do avi�o?");
			capacidade = leia.nextInt();
			
			objAviao[x] = new Avi�o (companhia,modelo,anofabri,capacidade);
								
		}				
		
		for (int x=0;x<=N-1;x++) {
			
			objAviao[x].infoaviao();
			
		}
		
		
	}

}
