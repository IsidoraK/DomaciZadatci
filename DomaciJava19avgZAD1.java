package vezbanje;

import java.util.Scanner;

public class DomaciJava19avgZAD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program gde korisnik unosi pozitivne brojeve,
//kad unese negativan broj
		// prikaze mu se suma svih prethodno unetih brojeva i
		// na kraju zakomentarisati koje ste brojeve sve unosili po testu
		// na primer:
		// test 1 x, y, z
		// test 2 x, y, z
		// test 3 x, y, z
		// (Koristiti do while petlju)

		Scanner zadatak7 = new Scanner(System.in);

		int zbir = 0;

		do {
			System.out.println("Molimo Vas unesite broj koji zelite da saberete : ");
			int broj = zadatak7.nextInt();

			if (broj <= 0) {
				break;
			}
			zbir = zbir + broj;
		} while (true);
		{
			System.out.println(" Zbir brojeva je : " + zbir);

		}
		
		zadatak7.close();

	}

}
