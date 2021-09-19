package Covek;

import java.util.ArrayList;

public class DomaciJava9sepZAD1Autobus {
	/*
	Autobus poseduje naziv,vozaca,
	cenu karte
	i putnika
	koji se
	njime voze.
	Naziv i
	cena karte
	i zadaju
	se prilikom
	kreiranja. Moguce je dodati/ukloniti putnika
	kao i vozaca.

	*/
	private String naziv;
	private DomaciJava9sepZAD1Vozac vozac;
	private int cenaKarte;
	private ArrayList<DomaciJava9sepZAD1Putnik> putnici;
	
	
	
	
	public DomaciJava9sepZAD1Autobus(String naziv, int cenaKarte) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.vozac = null;
		this.putnici = new ArrayList<DomaciJava9sepZAD1Putnik>(); 
	}
	public void UkloniPutnika(DomaciJava9sepZAD1Putnik putnik) {
		putnici.remove(putnik);
		
	}
	public void dodajPutnika(DomaciJava9sepZAD1Putnik putnik) { 
		putnici.add(putnik);
		
	}
	public void UkloniVozaca() {
		this.vozac = null;
	}
	public  void dodajVozaca(DomaciJava9sepZAD1Vozac vozac) {
		this.vozac=vozac;
	}
	
	
	
}
