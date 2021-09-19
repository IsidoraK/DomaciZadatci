package VideoPlayer;

public class DomaciJava7sepZAD1QualityOptimizedControl extends Control {

	/* QualityOptimizerControl koja nasledjuje klasu Control i ima brzinu interneta
	 * u megabitima npr 10mb/s 20mb/s... Getere, setere i konstruktore. Implementira
	 * metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine
	 * interneta. Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde
	 * se uzima prvi veci kvalitet ako je brzina 20 * 10.1 = 204 - postavlja 240;
	 * ako je brzina 5*10.1 = 50.5 - postavlja 144; ako je brzina 20*10.1 = 505 -
	 * postavlja 720;
	*/
	private int brzinaInterneta;

	@Override
	public void izvrsiAkciju(DomaciJava7sepZAD1VideoPlayer vp) {
		// TODO Auto-generated method stub
		
	}
	
	
}
