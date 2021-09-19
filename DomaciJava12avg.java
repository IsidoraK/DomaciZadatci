package projekat1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class DomaciJava12avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Napisati program gde deklarisete vase ime,
		 *  prezime kao string, pol kao char i
		 *   odstampajte adekvatno sva tri unosa.
		 *    Nakon toga preko skenera treba da 
		 *    unesete ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama 
		 *    i ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama, 
		 *    na kraju treba odstampati procenat zlatnih medalja u odnosu na ukupan broj medalja.
		 */
		
		Scanner mojaKlasa4 = new Scanner(System.in);
		
		String ime = "Isidora";
		System.out.println("Ime : " + ime);

		String prezime = "Karajovic";
		System.out.println("Prezime : " + prezime);
		
		char pol = 'Z';
		System.out.println("Pol : " + pol);
		
		System.out.println("Uneti koliko mealja je osvojila Srbija na olimpijskim igrama :");
		double brojMedalja = mojaKlasa4.nextDouble() ;
		

		System.out.println("Uneti koliko je Srbija osvojila zlatnih medalja");
		double brojZlatnihMedalja = mojaKlasa4.nextDouble() ;
		
		double procenat = brojZlatnihMedalja / brojMedalja * 100;
		System.out.println("Procenat zlatnih medalja je : " + procenat + "%" );
		
		mojaKlasa4.close();

	}

}
