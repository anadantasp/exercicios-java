package pacoteJava;

import java.util.Scanner;

public class Repetição3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,cont1=0,cont2=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade<99)
		{
			
			if(idade<=21)
			{
				cont1++;
			}
			else if (idade>=50)
			{
				cont2++;
			}
			
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: " +cont1);
		System.out.println("\nTotal de pessoas com mais de 50 anos: " +cont2);
		
		

	}

}
