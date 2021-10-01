package pacoteJava;

import java.util.Scanner;

public class IntroJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		double a,b,c,D,R,S;
		
		System.out.println("\nEntre com o primeiro número: ");
		a = ler.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		b = ler.nextFloat();
		System.out.println("\nEntre com o terceiro número: ");
		c = ler.nextFloat();
		
		R = Math.pow(a+b,2);
		S = Math.pow(b+c,2);
		
		D = (R+S) / 2;
		
		System.out.println("\nO valor da expressão é " + D);
		
				
		
		
	}

}
