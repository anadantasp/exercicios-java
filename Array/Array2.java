package pacoteJava;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[6];
		int somapar=0,contimpar=0,x;
		
		
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nEntre com um n�mero");
			numeros[x] = leia.nextInt();
			
			if(numeros[x]%2 == 0)
			{
				somapar += numeros[x];
				
				
			}
			else
			{
				
				contimpar++;
			}
			
		}
		for(x=0;x<6;x++)
		{
			if(numeros[x]%2 == 0)
			{
				System.out.println(""+numeros[x]+" <-- estre � um n�mero PAR");
				
			}
		
		}
        System.out.println("Soma n�meros pares: "+somapar);
        
        for(x=0;x<6;x++)
		{
			if(numeros[x]%2 != 0)
			{
				System.out.println(""+numeros[x]+" <-- estre � um n�mero �MPAR");
				
			}
		
		}
        System.out.println("Quantidade de n�meros �mpares: "+contimpar);

  }
}

