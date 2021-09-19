package ZoloskiVrt;

public class DomaciJava6sepZADZOOVTRRiba extends DomaciJava6sepZADZOOVTRZivotinje {
//	Ribe su
//	 * kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj
//	 * peraja, vrsta peraja

	private String prebivaliste;
	private int brojPeraja;
	private String vrstaPeraja;
	public DomaciJava6sepZADZOOVTRRiba(String naziv, String cimeSeHrane, String prebivaliste, int brojPeraja, String vrstaPeraja) {
		super("kicmenjak", naziv, cimeSeHrane);
		this.prebivaliste = prebivaliste;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
		// TODO Auto-generated constructor stub
	}
	public String getPrebivaliste() {
		return prebivaliste;
	}
	public void setPrebivaliste(String prebivaliste) {
		this.prebivaliste = prebivaliste;
	}
	public int getBrojPeraja() {
		return brojPeraja;
	}
	public void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}
	public String getVrstaPeraja() {
		return vrstaPeraja;
	}
	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	public void stampaj() {
		System.out.println( "Naziv je : stuka, " + " Prebivaliste je : " + prebivaliste + ", broj peraja je : " + brojPeraja + " , hrane se : " + 
	this.getCimeSeHrane() +
				" , naziv je :  " + this.getNaziv() + " , vrsta je : " +  this.getVrsta() + ", Vrsta peraja je :  " + vrstaPeraja );
		
	}
	
	
}
