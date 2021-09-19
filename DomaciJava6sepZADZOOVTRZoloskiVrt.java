package ZoloskiVrt;

import java.util.ArrayList;

public class DomaciJava6sepZADZOOVTRZoloskiVrt {
	public static void main(String[] args) {

	/*
	 * Zooloski vrt U zoovrtu obitavaju razne zivotinje. Sve imaju svoju vrstu
	 * (kicmenjaci, beskicmenjaci), konkretan naziv i cime se hrane. Ribe su
	 * kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj
	 * peraja, vrsta peraja Sisari su kicmenjaci koje se razlikuju po boji dlake,
	 * nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na
	 * divlje i domace. Napraviti klasu Staniste u kom se nalazi lista zivotinja
	 * koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati
	 * ali ne i postavi. Ispisati bar jednog sisara i jednu ribu kao vrstu
	 * zivotinje. Ispisati bar jedno staniste. Jednom sisaru zameniti ulogu koju mu
	 * je covek dodelio.
	 * 
	 * 
	 * 
	 * 
	 */

		DomaciJava6sepZADZOOVTRRiba riba = new  DomaciJava6sepZADZOOVTRRiba("Stuka", "Babuske", "slatka voda", 3, "Lepa");
		DomaciJava6sepZADZOOVTRSisari sisar = new DomaciJava6sepZADZOOVTRSisari ( "koala", "Eukaliptusom", "Siva", "biljojed", false );
		ArrayList<DomaciJava6sepZADZOOVTRZivotinje> zivotinje = new ArrayList<DomaciJava6sepZADZOOVTRZivotinje>();
		zivotinje.add(riba);
		zivotinje.add(sisar);
		
		DomaciJava6sepZADZOOVTRStaniste staniste = new DomaciJava6sepZADZOOVTRStaniste(zivotinje, "Vrt dobre nade");
		
		staniste.stampaj();
		riba.stampaj();
		sisar.stampaj();
		
		sisar.setDomaca(true);
	}
}