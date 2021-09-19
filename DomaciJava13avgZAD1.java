package projekat2;

import java.util.Scanner;

public class DomaciJava13avgZAD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Napisati program 
		 * gde preko skenera unesete broj, 
		 * ako je broj manji od 10 onda ga pomnoziti sa 100,
		 *  ako je broj veci od 100 onda ga podeliti sa 10. 
		 *  Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.
		 */
		
		Scanner mojaKlasa5 = new Scanner(System.in);
		

		System.out.println("Unesite broj : ");
		double broj = mojaKlasa5.nextDouble();
		
		if  (broj < 10)  // proveravala sam brojeve -3, 10, 11, 9.9
 			{ 
		double broj1 = broj *100; 	
		System.out.println(" Broj koji ste uneli je manji od 10, rezultat je : " + broj1);
		}
		else if (broj > 100 ) // ovde sam proveravala brojeve 99.99, 100, 101 
			{ 
			double broj2 = broj / 10;
			System.out.println("Broj koji ste uneli je veci od 100, rezultat je : "  + broj2);
			
			
		} else { System.out.println("Broj koji ste uneli nije manji od 10 ili veci od 100");
			
		}
			
	}
}
