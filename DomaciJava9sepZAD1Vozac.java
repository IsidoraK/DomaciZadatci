package Covek;

public class DomaciJava9sepZAD1Vozac extends DomaciJava9sepZAD1Covek {

	//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	
	private String zvanje;

	public DomaciJava9sepZAD1Vozac(String ime, String prezime) {
		super(ime, prezime);
		this.zvanje = "sofer";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + zvanje;
	}

	
	
}
