package pacoteJava;

import java.util.Scanner;

public class Condicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=18 && idade<=25)
		{
			System.out.println("\nCategoria adulto");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("\nCategoria juvenil");
			
		}
		else if (idade>=10 && idade<=14)
		{
			System.out.println("Categoria infantil");
		}
		else
		{
			System.out.println("Idade n?o v?lida");
		}
		
		
	}
	

}
