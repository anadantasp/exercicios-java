package pacoteJava;

import java.util.Scanner;

public class Repeti��o5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		int numero,somanumero=0;
		
		do
		{
			
			System.out.println("Entre com um n�mero: ");
			numero = leia.nextInt();
			
			somanumero += numero;
			
		}while(numero!=0);
		
		System.out.println("\nSoma dos n�meros digitados: "+somanumero);
		
	}

}
