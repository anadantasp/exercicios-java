package pacoteJava;

import java.util.Scanner;

public class Condicional4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,r,p;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com um n�mero: ");
		a = leia.nextFloat();
		
		
		if (a%2 == 0)
		{
			r = Math.sqrt(a);
			System.out.println(a + " � par e sua raiz quadrada � " + r);
		}
		else
		{
			p = Math.pow(a,2);
			System.out.println(a + " � impar e elevado ao quadrado � " + p);
		}
		
		
	}

}
