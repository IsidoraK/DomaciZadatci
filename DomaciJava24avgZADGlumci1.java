package DomaciJava24avgZAD1;

import java.util.ArrayList;

public class DomaciJava24avgZADGlumci1 {
	public static void main(String[] args) {

	// Napraviti klasu
	// Glumci koja
	// ce imati public atribute:
	// Ime i prezime,
    //godina rodjenja, pol.
	// Private atributi su:
    //da li
	// su ozenjeni

	// ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova.
	// Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u
	// svim filmovima, koliko godina pune u 2022. godini, ako su muskog pola preko
	// atributa treba pre imena da se doda "Mr." ili "Mrs." ako su zenskog pola.
	// Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5

	// snimljenih filmova (pored naslova napisati ocenu sa imdb-a) i odstampati od
	// najbolje ocenjenog do najgore ocenjenog filma od

	// tih pet (preko getera i setera).

		DomaciJava24avgZADGlumci2 zensko = new DomaciJava24avgZADGlumci2("Anica", "Dobra", 1963, "zensko", true, 10000, 25);
		zensko.stampaj();
		DomaciJava24avgZADGlumci2 musko = new DomaciJava24avgZADGlumci2 ("Nikola", "Djuricko", 1974, "musko", false, 9000, 28);
		musko.stampaj();
		
		ArrayList<DomaciJava24avgZADGlumci> filmovi = new ArrayList<DomaciJava24avgZADGlumci>();
		filmovi.add(new DomaciJava24avgZADGlumci (8.5, "nebeska udica" ));
		filmovi.add(new DomaciJava24avgZADGlumci (8.4, "nebeska udica2" ));
		filmovi.add(new DomaciJava24avgZADGlumci (8.3, "nebeska udica3" ));
		filmovi.add(new DomaciJava24avgZADGlumci (8.2, "nebeska udica4" ));
		filmovi.add(new DomaciJava24avgZADGlumci (8.1, "nebeska udica5" ));
		
		musko.setPoslednjiFilmovi(filmovi);
		
		for (DomaciJava24avgZADGlumci film : musko.getPoslednjiFilmovi() ) {
			System.out.println(film.naslov + " " + film.ocenaImdb);
		}
		System.out.println();
}
}