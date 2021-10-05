package pacoteJava;

import java.util.Scanner;

public class Repetição4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont=0,idade,sexo,temperamento,totalcalmas=0,mulheresNervosas=0,homensAgressivos=0,outrosCalmos=0,nervosos40=0,calmas18=0;
		
		Scanner leia = new Scanner (System.in);
		
		while(cont<=150)
		{
			System.out.println("\nInforme sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\nCom que gênero você se identifica:");
			System.out.println("\n 1-Feminino\t2-Masculino\t3-Outros");
			sexo = leia.nextInt();
			
			System.out.println("\nVocê se considera:");
			System.out.println("\n 1-Calma\t2-Nervosa\t3-Agressiva : ");
			temperamento = leia.nextInt();
			
			if(temperamento==1)
			{
				totalcalmas++;
			}
			if (sexo==1 && temperamento==2)
			{
				mulheresNervosas++;
			}
			if (sexo==2 && temperamento==3)
			{
				homensAgressivos++;
			}
			if (sexo==3 && temperamento==1)
			{
				outrosCalmos++;
			}
			if (idade>40 && temperamento==2)
			{
				nervosos40++;
			}
			if (idade<18 && temperamento==1)
			{
				calmas18++;
			}
			cont++;
			
		}
		System.out.println("\nO número de pessoas calmas: "+totalcalmas);
		System.out.println("\nO número de mulheres nervosas: "+mulheresNervosas);
		System.out.println("\nO número de homens agressivos: "+homensAgressivos);
		System.out.println("\nO número de outros calmos: "+outrosCalmos);
		System.out.println("\nO número de pessoas nervosas com mais de 40 anos: "+nervosos40);
		System.out.println("\nO número de pessoas calmas com menos de 18 anos: "+calmas18);
		
	}

}
