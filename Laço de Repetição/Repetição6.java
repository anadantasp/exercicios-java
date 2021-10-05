package pacoteJava;

import java.util.Scanner;

public class Repetição6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero,somanumero=0,cont=0;
		float media;
		
		Scanner leia = new Scanner (System.in);
		
		do
		{
			System.out.println("\nEntre com um numero: ");
			numero = leia.nextInt();
			
			if(numero%3==0 && numero!=0)
			{
				somanumero += numero;
				cont++;
			}
			
		}while(numero!=0);
		
		media = somanumero / cont;
		System.out.printf("A média dos números múltiplos de 3 %.2f",media);
		
	}

}
