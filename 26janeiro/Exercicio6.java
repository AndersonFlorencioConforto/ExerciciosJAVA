package anderson;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x1,x2,y1,y2;
		double d;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o x1");
		x1 = ler.nextFloat();
		System.out.println("Entre com o y1");
		y1 = ler.nextFloat();
		System.out.println("Entre com o x2");
		x2 = ler.nextFloat();
		System.out.println("Entre com o y2");
		y2 = ler.nextFloat();
		
		d = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		System.out.println("A distância é de"+d);

	}

}
