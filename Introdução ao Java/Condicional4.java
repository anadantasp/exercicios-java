package pacoteJava;

import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,r,p;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com um número: ");
		a = leia.nextFloat();
		
		
		if (a%2 == 0)
		{
			r = Math.sqrt(a);
			System.out.println(a + " é par e sua raiz quadrada é " + r);
		}
		else
		{
			p = Math.pow(a,2);
			System.out.println(a + " é impar e elevado ao quadrado é " + p);
		}
		
		
	}

}
