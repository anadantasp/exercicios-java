package pacoteJava;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[][] = new int[3][3];
		int linha,coluna,cont=0;
		
		Scanner leia = new Scanner (System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("Entre com um número: ");
				numeros[linha][coluna] = leia.nextInt();
			}
		}
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				if(numeros[linha][coluna]>10)
				{
					cont++;
				}
			}
		}
		System.out.println("\nQuantidade de valores maiores que 10: "+cont);
		
		
	}

}
