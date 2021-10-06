package pacoteJava;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*letra a*/
		int A[] = {1,0,5,-2,-5,7};
		int soma,x;
		
		/*letra b*/
		soma = A[0] + A[1] + A[5];
		System.out.println("\nSoma: "+soma);
		
		/*letra c*/
		A[4] = 100;
		
		/*letra d*/
		
		System.out.println("\n");
		for(x=0;x<6;x++)
		{
			System.out.println(A[x]);
		}
		
	}

}
