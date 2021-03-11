package towersofhanoi;

public class SolveTowers {

	public static void main(String[] args) {

		long start;
		long slutt;
		start = System.currentTimeMillis();

		TowersOfHanoi towers = new TowersOfHanoi(20);
		towers.solve();
		towers.trekk();

		slutt = System.currentTimeMillis();

		long tid = (slutt - start);

		if (tid < 1000) {
			System.out.print("\nTidsbruk i millisekunder " + tid);
		} else {
			tid = tid / 1000;
			System.out.print("\nTidsbruk i sekunder " + tid);

		}
		// Tester tid med minder tall pga tid de tar
		// velger n = 20 gir tid ca. 7-8 sek
		// velger n = 21 gir tid ca. 15-16 sek
		// velger n = 22 gir tid ca. 31-32 sek
		// tiden ca. dobbler seg når n øker med 1
	}
}
