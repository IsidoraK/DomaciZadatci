package primeri;

import java.util.Scanner;

public class DomaciJava17avgZAD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ZADATAK
Napisati program koji oponasa kviz za pogadjanje glavnog grada.
- Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z programa.
    1. Francuska
    2. Italija
    3. Srbija
    4. Izlaz
- Nakon odabira drzave, potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?'
- Ako korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan'
- Ako korisnik odgovori netacno, ispisuje se poruka 'Odgovor nije tacan'
- Nakon davanja odgovora (bilo da je tacan ili netacan), ponovo treba da se postave
sve pocetne opcije i ponudi korisniku da odabere neku od njih.
- Program se zavrsava kad korisni odabere 4. opciju 'Izlaz'
- Program uraditi koriscenjem dosad naucenog + do-while petlje
		 * 
		 */
		
		Scanner domaci = new Scanner(System.in);
		
		String f = "Francuska";
		String i = "Italija";
		String s = "Srbija";
		String z = "izlaz";
		
		String gf = "Pariz";
		String gi = "Rim";
		String gs = "Beograd";
		
		
				
				do {
					System.out.println("Molim Vas izaverite jednu od ponudjenih opcija : " );
					System.out.println( "1 : " + f);
					System.out.println(" 2 : " + i);
					System.out.println(" 3 : " + s);
					System.out.println(" 4 : " + z); 
				System.out.println("Molimo Vas unesite broj zeljene opcije.");
				int broj = domaci.nextInt();
				
				String ocekivano;
				
				if ( broj == 1 ) {
					ocekivano = gf; }
				
				else if (broj == 2) {
					ocekivano = gi;
				}
				
				else if (broj == 3) {
					ocekivano = gs;
				}
				else if (broj == 4) {
			break;
				} else {
					System.out.println("Uneli ste ne vazecu vrednost");
				
				continue;}
				
				System.out.println("Koji je glavni grad?");
				String grad = domaci.next();
				
				if (grad.equalsIgnoreCase(ocekivano)) {
					System.out.println("Odgovor je tacan");
				}
				else {
					System.out.println("Odgovor nije tacan");
				}						
						
				} 
				while (true);
					
				System.out.println("Program je gotov.");
				
	}
		
	}


