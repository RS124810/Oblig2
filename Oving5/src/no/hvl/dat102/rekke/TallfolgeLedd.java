package no.hvl.dat102.rekke;

public class TallfolgeLedd {

	public static void main(String[] args) {

		for (int i = 2; i < 12; i++)
			System.out.println(An(i));
	}

	public static int An(int n) {

		int An = 2;
		if (n == 0)
			return 2;
		else if (n == 1)
			return 5;
		else {
			An = 5 * An(n - 1) - 6 * An(n - 2) + 2;
			
			//er det skrivefeil i oppgaven (+2)?
			//an= 5an-1-6an-2 - 2 vil bli likt Tower of Hanoi
		}

		return An;
	}

}
