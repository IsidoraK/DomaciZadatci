package ZoloskiVrt;

import java.util.ArrayList;

public class DomaciJava6sepZADZOOVTRStaniste {
	
	
	/*
	 *  Napraviti klasu Staniste u kom se nalazi lista zivotinja
	 * koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati
	 * ali ne i postavi. 
	 */
	
	private ArrayList<DomaciJava6sepZADZOOVTRZivotinje> zivotinje;
	private String naziv;
	public ArrayList<DomaciJava6sepZADZOOVTRZivotinje> getZivotinje() {
		return zivotinje;
	}
	public void setZivotinje(ArrayList<DomaciJava6sepZADZOOVTRZivotinje> zivotinje) {
		this.zivotinje = zivotinje;
	}
	public String getNaziv() {
		return naziv;
	}
	
	public DomaciJava6sepZADZOOVTRStaniste(ArrayList<DomaciJava6sepZADZOOVTRZivotinje> zivotinje, String naziv) {
		this.zivotinje = zivotinje;
		this.naziv = naziv;
	}
	public void stampaj() {
		for ( DomaciJava6sepZADZOOVTRZivotinje zivotinja : zivotinje ) {
			System.out.println(zivotinja.getNaziv());
			
			
		} System.out.println(naziv);
	}
}