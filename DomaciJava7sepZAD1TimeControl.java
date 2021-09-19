package VideoPlayer;

public class DomaciJava7sepZAD1TimeControl extends DomaciJava7sepZAD1Control {
	

	/*
	 * Kreirati klasu TimeControl koja nasledjuje klasu Control i konstruktore, ima
	 * atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean),
	 * implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s
	 * unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje
	 * van granica videa.
	 */
	private boolean pomeraVremeUNapred;
	
	public DomaciJava7sepZAD1TimeControl(boolean pomeraVremeUNapred) {
		super();
		this.pomeraVremeUNapred = pomeraVremeUNapred;
	}
	
	
	public boolean isPomeraVremeUNapred() {
		return pomeraVremeUNapred;
	}

	public void setPomeraVremeUNapred(boolean pomeraVremeUNapred) {
		this.pomeraVremeUNapred = pomeraVremeUNapred;
	}


	@Override
	public void izvrsiAkciju(DomaciJava7sepZAD1VideoPlayer vp) {
		if (pomeraVremeUNapred = true) {
			if (vp.getTrenutnoVremeVidea() < vp.getDuzinaVidea() - 15) {
				vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea() + 15);
			} else {
				vp.setTrenutnoVremeVidea(vp.getDuzinaVidea());
			}
		} else {
			if (vp.getTrenutnoVremeVidea() > 15) {
				vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea() - 15);
			} else {
				vp.setTrenutnoVremeVidea(0);
			}
		}
			}
		
		
	}

	
	

	
	
	
