package pacoteJava;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com um número do tipo inteiro: ");
		a = leia.nextInt();
		System.out.println("Entre com outro número do tipo inteiro: ");
		b = leia.nextInt();
		System.out.println("Entre com outro número do tipo inteiro: ");
		c = leia.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("O maior número é " + a);
		}
		else if (b>a && b>c)
		{
			System.out.println("O maior número é " + b);
		}
		else
		{
			System.out.println("O maior número é " + c);
		}
	}

}
