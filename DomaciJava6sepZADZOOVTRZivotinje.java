package ZoloskiVrt;

public class DomaciJava6sepZADZOOVTRZivotinje {

	//Sve imaju svoju vrstu
	//  (kicmenjaci, beskicmenjaci), konkretan naziv i cime se hrane.
	
	private String vrsta;
	private String naziv;
	private String cimeSeHrane;
	public DomaciJava6sepZADZOOVTRZivotinje(String vrsta, String naziv, String cimeSeHrane) {
		super();
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.cimeSeHrane = cimeSeHrane;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getCimeSeHrane() {
		return cimeSeHrane;
	}
	public void setCimeSeHrane(String cimeSeHrane) {
		this.cimeSeHrane = cimeSeHrane;
	}
	
	
	
}
