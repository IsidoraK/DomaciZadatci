package DomaciJava24avgZAD1;

import java.util.ArrayList;

public class DomaciJava24avgZADGlumci2 {
	
	public String ime;
	public String prezime;
	public int godinaRodjenja ;
	public String pol;
	private boolean uBraku;
	private double zaradaPoFilmu;
	private int brojSnimljenihFilmova;
	private ArrayList<DomaciJava24avgZADGlumci> poslednjiFilmovi;
	
	
	public DomaciJava24avgZADGlumci2 (String ime, String prezime, int godinaRodjenja, String pol, boolean uBraku, double zaradaPoFilmu, int brojSnimljenihFilmova) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
		this.pol = pol;
		this.uBraku = uBraku;
		this.zaradaPoFilmu = zaradaPoFilmu;
		this.brojSnimljenihFilmova = brojSnimljenihFilmova;
		
	}
	
	public void stampaj () {
		if (pol.equalsIgnoreCase("zensko")) {
			System.out.print("mrs. ");
		}
		else {
			System.out.print("mr. ");
		
		}
		System.out.print(ime + " " + prezime);
		System.out.println();
		System.out.println("Godina rodjenja : " + godinaRodjenja);
		System.out.println("pol : " + pol);
		System.out.println("U Braku : " + uBraku);
		System.out.println("Zarada po filmu je : " + zaradaPoFilmu);
		System.out.println("Broj Snimljenih filmova je  : " + brojSnimljenihFilmova);
		System.out.println("Ukupna zarada : " + izracunajZaradu());
		System.out.println("godine starosti 2022 : " + izracunajStarost2022());
		
	
		
	}
	 private double izracunajZaradu() {
		 return zaradaPoFilmu * brojSnimljenihFilmova;
		 
	 }
	 public int izracunajStarost2022() {
		 return 2022 - godinaRodjenja;
	 }
	
	
	
	public void setPoslednjiFilmovi (ArrayList<DomaciJava24avgZADGlumci> poslednjiFilmovi) {
		this.poslednjiFilmovi = poslednjiFilmovi;
	
	} 
	
	public ArrayList<DomaciJava24avgZADGlumci> getPoslednjiFilmovi(){
		return poslednjiFilmovi;
		
		
	}
}
