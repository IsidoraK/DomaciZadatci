import java.util.Scanner;

public class DomaciJava23avgZAD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);  
		int[] niz= new int[3];  
		
		System.out.println ("unesite tri broja");
		
		
		for (int i=0; i<3; i++) {
			niz[i]=sc.nextInt();
		}
		
		int min=niz[0];
		
		for (int i=0; i<3; i++) {
			if (niz[i]<min) {
				min=niz[i];
			}
		}
		
		
		System.out.println("minimum je " + min);  
	}

}
