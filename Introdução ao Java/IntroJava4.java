package pacoteJava;

import java.util.Scanner;

public class IntroJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		double a,b,c,D,R,S;
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		a = ler.nextFloat();
		System.out.println("\nEntre com o segundo n�mero: ");
		b = ler.nextFloat();
		System.out.println("\nEntre com o terceiro n�mero: ");
		c = ler.nextFloat();
		
		R = Math.pow(a+b,2);
		S = Math.pow(b+c,2);
		
		D = (R+S) / 2;
		
		System.out.println("\nO valor da express�o � " + D);
		
				
		
		
	}

}
