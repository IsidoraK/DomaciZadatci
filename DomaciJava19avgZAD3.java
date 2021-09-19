package vezbanje;

import java.util.Scanner;

public class DomaciJava19avgZAD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik
		 * preko skenera. (Koristiti for petlju) Na primer N: 5
		 *
		 **
		 ***
		 ****
		 *****
		 */
		
		Scanner zadatak10 = new Scanner(System.in);
		
		String zvezdica = "*";
		
		System.out.println("Unesite broj redova N = ");
		int N = zadatak10.nextInt();
		
		for(int i = 0; i< N; i++) {
      	  
			
			System.out.print("*");					
			
			for(int j = 0; j < i; j++) {	
				
				zvezdica = i + zvezdica;
	
				System.out.print("*");		
			}
			System.out.println();				
		}
			
		   }
	}



