package ZoloskiVrt;

public class DomaciJava6sepZADZOOVTRSisari extends DomaciJava6sepZADZOOVTRZivotinje {
	
	//Sisari su kicmenjaci koje se razlikuju po boji dlake,
	// * nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na
	// * divlje i domace.

	private String bojaDlake;
	private String nacinIshrane;
	private boolean domaca;
	
	
	
	
	
	public DomaciJava6sepZADZOOVTRSisari( String naziv, String cimeSeHrane, String bojaDlake, String nacinIshrane, boolean domaca ) {
		super("kicmenjak", naziv, cimeSeHrane);
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane;
		this.domaca = domaca;
	}
	public String getBojaDlake() {
		return bojaDlake;
	}
	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}
	public String getNacinIshrane() {
		return nacinIshrane;
	}
	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}
	public boolean isDomaca() {
		return domaca;
	}
	public void setDomaca(boolean domaca) {
		this.domaca = domaca;
	}
	public void stampaj() {
		System.out.println( "Naziv je : koala " +  " Boja dlake je : " + bojaDlake + " , Nacin Ishrane je :  " + nacinIshrane +  
				"  Podela : " + domaca + " Naziv : " + this.getNaziv() + " , vrsta : " + 
	this.getVrsta() + " , hrane se : " + this.getCimeSeHrane() );
	

		
	}
		
	}
	
	
	
	
	
	
	

