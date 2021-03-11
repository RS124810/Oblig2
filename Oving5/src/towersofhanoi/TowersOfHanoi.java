package towersofhanoi;

public class TowersOfHanoi {

	private int totalDisks;

	public TowersOfHanoi(int disks) {
		totalDisks = disks;

	}

	public void solve() {
		moveTower(totalDisks, 1, 3, 2);
	}

	private void moveTower(int numDisks, int start, int end, int temp) {

		if (numDisks == 1)
			moveOneDisk(start, end);
		else {

			moveTower(numDisks - 1, start, temp, end);
			moveOneDisk(start, end);
			moveTower(numDisks - 1, temp, end, start);
		}

	}

	int teller = 0;

	private void moveOneDisk(int start, int end) {

		teller++;
		System.out.println("Trekk nr: " + teller + " , flytter en ring fra " + start + " til " + end);
	}

	public void trekk() {
		System.out.print("\nTotalt antall trekk: " + teller);
	}

}
