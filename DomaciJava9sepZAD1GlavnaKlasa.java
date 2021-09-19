package Covek;

public class DomaciJava9sepZAD1GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * DOMACI :
		 * Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja
		 * objekta. Svi podaci mogu da se dohvate, ali ne i postave. Vozac je covek koji
		 * poseduje i zvanje (zanimanje -> sofer). Putnik je covek koji poseduje novac.
		 * Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom
		 * kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme. Autobus
		 * poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. Naziv i cena
		 * karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i
		 * vozaca.
		 */
		
		DomaciJava9sepZAD1Covek c1 = new DomaciJava9sepZAD1Covek("Milan ","Milanovic ");
		System.out.println(c1);
		DomaciJava9sepZAD1Putnik p1 = new DomaciJava9sepZAD1Putnik("milica ", "Nanic ", 150);
		System.out.println(p1);
		DomaciJava9sepZAD1Putnik p2 = new DomaciJava9sepZAD1Putnik("miki ", "riki ", 150);
		System.out.println(p2);
		DomaciJava9sepZAD1Vozac v1 = new DomaciJava9sepZAD1Vozac("Miljan ", "Mikic "); // ovde se pisu samo vrednosti koje nisu vec dodeljenje
		System.out.println(v1);
		DomaciJava9sepZAD1Autobus a1 = new DomaciJava9sepZAD1Autobus("Miki Maus ", 150);
		
		a1.dodajPutnika(p1);
		a1.dodajVozaca(v1);
		a1.dodajPutnika(p2);
		
		
	}

}
