package anderson;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = ler.nextInt();
		System.out.println("Entre com a segunda nota: ");
		n2 = ler.nextInt();
		System.out.println("Entre com a terceira nota: ");
		n3 = ler.nextInt();
		
		n1 = n1*2;
		n2 = n2*3;
		n3 = n3*5;
		
		media = (n1+n2+n3)/10;
		
		System.out.println("A média da sua nota é: "+media);
		
		

	}

}
