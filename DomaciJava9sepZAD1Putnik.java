package Covek;

public class DomaciJava9sepZAD1Putnik extends DomaciJava9sepZAD1Covek {

	// Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu
	// novca koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu
	// se doda i/ili oduzme.
			
	private int novac;

	public DomaciJava9sepZAD1Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		this.novac = novac;
		// TODO Auto-generated constructor stub
	}

	public void IzmeniNovac(int svota) {
		this.novac = novac + svota; // 5 + (- 2) = 5 - 2
			
}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + novac;
	}
	
}
