import java.util.Scanner;

public class DomaciJava23avgZAD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);  
		int[] niz= new int[3];  
		
		System.out.println ("unesite tri broja");
		
		
		for (int i=0; i<3; i++) {
			niz[i]=sc.nextInt();
		}
		
		int proizvod=1;
		
		for (int i=0; i<3; i++) {
			proizvod=niz[i]*proizvod;
		}
		
		
		System.out.println("proizvod je " + proizvod);  
		  
    }
		

	}

