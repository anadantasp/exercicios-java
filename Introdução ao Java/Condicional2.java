package pacoteJava;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a,b,c,menor, meio, maior;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um número: ");
		a = leia.nextFloat();
		System.out.println("\nEntre com outro número: ");
		b = leia.nextFloat();
		System.out.println("\nEntre com outro número: ");
		c = leia.nextFloat();
		
		if(a<b && a<c && b<c)
		{
			menor = a;
			meio = b;
			maior=c;
			
			System.out.println(menor + " < " + meio + " < " + maior);
			
		}
		else if (a<b && a<c && b>c)
		{
			menor = a;
			meio = c;
			maior = b;
			
			System.out.println(menor + " < " + meio + " < " + maior);
			
		}
		if(b<a && b<c && a<c)
		{
			menor = b;
			meio = a;
			maior=c;
			
			System.out.println(menor + " < " + meio + " < " + maior);
			
			
		}
		else if (b<a && b<c && c<a)
		{
			menor = b;
			meio = c;
			maior = a;
			
			System.out.println(menor + " < " + meio + " < " + maior);
		}
		if(c<a && c<b && a<b)
		{
			menor = c;
			meio = a;
			maior= b;
			System.out.println(menor + " < " + meio + " < " + maior);
			
		}
		else if (c<a && c<b && b<a)
		{
			menor = c;
			meio = b;
			maior = a;
			System.out.println(menor + " < " + meio + " < " + maior);
		}
		
		
		
		
		
		
	}

}
