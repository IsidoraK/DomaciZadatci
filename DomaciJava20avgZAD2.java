
public class DomaciJava20avgZAD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London,
		// Helsinki, Prag i Madrid), a program stampa gradove sve dok ne dodje do
		// "Prag"-a.

		String[] niz = { "Lisabon", "London", "Helsinki", "Prag", "Madrid" };

		for (int i = 0; i < niz.length; i++) {

			if (niz[i].equals("Prag")) {
				break;

			}

			System.out.println(niz[i]);

		}

	}

}
