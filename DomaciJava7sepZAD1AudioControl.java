package VideoPlayer;

public class DomaciJava7sepZAD1AudioControl  extends DomaciJava7sepZAD1Control  {

	
/*
 * Kreirati klasu AudioControl koja nasledjuje klasu Control
		 * i getere, setere i konstruktore. Ima atribut koji kaze da li se smanjuje ili
		 * pojacava zvuk (tipa boolean). Implementirati metodu izvrsi akciju tako sto
		 * pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
 */
	
	private boolean promenaJacineZvuka;
	
	
	
	public DomaciJava7sepZAD1AudioControl(boolean promenaJacineZvuka) {
		super();
		this.promenaJacineZvuka = promenaJacineZvuka;
	}



	@Override
	public void izvrsiAkciju(DomaciJava7sepZAD1VideoPlayer player) {
		if (!this.promenaJacineZvuka) {
			if (player.getJacinaZvuka() > 0) {
				player.setJacinaZvuka(player.getJacinaZvuka() - 1);
			} else {
				System.out.println("Zvuk iskljucen");
			}
		} else {
			if (player.getJacinaZvuka() < 100) {
				player.setJacinaZvuka(player.getJacinaZvuka() + 1);
			} else {
				System.out.println("Zvuk je na maksimumu.");
			}
		}

	}
		
	}
	
	
	
	
