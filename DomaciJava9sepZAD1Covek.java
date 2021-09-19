package Covek;

public class DomaciJava9sepZAD1Covek {
	// Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja
	 // objekta. Svi podaci mogu da se dohvate, ali ne i postave.

	private String ime;
	private String prezime;

	public DomaciJava9sepZAD1Covek(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ime + prezime;
	}

}
