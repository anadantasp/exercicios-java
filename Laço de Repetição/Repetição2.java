package pacoteJava;

import java.util.Scanner;

public class Repetição2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero,contpar=0,contimpar=0,x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<=9;x++)
		{
			System.out.println("\nEntre com um numero: ");
			numero = leia.nextInt();
			
			if(numero%2==0)
			{
				contpar++;
			}
			else
			{
				contimpar++;
			}
		}
		System.out.println("\nQuantidade de número pares: "+contpar);
		System.out.println("\nQuantidade de número impares: "+contimpar);
		
		
		
	}

}
