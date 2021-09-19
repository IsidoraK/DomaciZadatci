import java.util.Scanner;

public class DomaciJava23avgZAD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);  
		int[] niz= new int[3];  
		
		System.out.println ("unesite tri broja");
		
		
		for (int  i = 0; i < 3; i++) {
			niz[i]=sc.nextInt();
		}
		
		int suma = 0;
		
		for (int i = 0; i < 3; i++) {
			suma=niz[i]+suma;
		}
		
		int max = niz[0];
		
		for (int i = 0; i < 3; i++) {
			if (niz[i]>max) {
				max=niz[i];
			}
		}
		
		System.out.println("suma je " + suma);  
		System.out.println("maximum niza je " + max);  
		
		
		
		
		
		
		
		
		
		
	}

}
