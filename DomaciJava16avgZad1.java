package Predavanje1608;

import java.util.Scanner;

public class DomaciJava16avgZad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

	/*
	 * While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 112.
	 */
		
		
		Scanner domaci1 = new Scanner(System.in);
		
		int x = 0;
		int zbir = 0;
		
		while (x >= 0) {
			System.out.println("unesite broj : ");
			x = domaci1.nextInt();
			
			if (x < 0) {
				break;
			}
			zbir = zbir + x;
			
		
		
		 
		 
	}
		System.out.println("Zbir je :" + zbir);
		
		System.out.println("uneli ste negativan broj");
		
		
		
	}
}
	
	
