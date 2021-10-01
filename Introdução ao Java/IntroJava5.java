package pacoteJava;

import java.util.Scanner;

public class IntroJava5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		float n1,n2,n3,media;
		int p1,p2,p3;
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = ler.nextFloat();
		
		p1 = 2;
		p2 = 3;
		p3 = 5;
		
		media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		System.out.println("Sua média é: " + media);
		
				
		
		
		
	}

}
