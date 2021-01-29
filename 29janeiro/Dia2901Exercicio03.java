package anderson;

import java.util.Scanner;

public class Dia2901Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,N1 [][] = new int [2][2],N2 [][] = new int [2][2];
		int M1 [][] = new int [2][2],M2 [][] = new int [2][2];
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<2;i++)
		{
			System.out.printf("Informe os elementos da %da. linha: \n",(i+1));
			for(j=0;j<2;j++)
			{
				System.out.printf("Mat[%d] [%d] = ",i,j);
				N1[i][j] = ler.nextInt();
			}
		}
		
		for(i=0;i<2;i++)
		{
			System.out.printf("Informe os elementos da %da. linha: \n",(i+1));
			for(j=0;j<2;j++)
			{
				System.out.printf("Mat[%d] [%d] = ",i,j);
				N2[i][j] = ler.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				M2[i][j] = N1[i][j] + N2[i][j];
				System.out.printf("\nMat[M2] [%d] = %d [%d] = %d  ",(i+1),M2[i][j],(j+1),M2[i][j]);
			}
		}
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				M1[i][j] = N1[i][j] - N2[i][j];
				System.out.printf("\nMat[M1] [%d] = %d [%d] = %d  ",(i+1),M1[i][j],(j+1),M1[i][j]);
			}
		}
		
		
		
		
		

	}

}
