package pacoteJava;

import java.util.Scanner;

public class IntroJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int totaldias,anos,meses,dias;
		
		System.out.println("Entre com o total de dias vividos: ");
		totaldias = ler.nextInt();
		
		anos = totaldias / 365;
		meses = (totaldias % 365) / 30;
		dias = (totaldias % 365) % 30;
		
		System.out.println("\nEu tenho " + anos + " anos, " + meses + " meses e " + dias + " dias");
				
	}

}
