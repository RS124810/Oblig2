package no.hvl.dat102.rekke;

import javax.swing.JOptionPane;

public class SumRekker {
	
	//oppgave 1a)
	
	// Sn=Sn-1+n ,S1 =1
	
	//basis n==1

	public static int sum(int n) {
		if (n > 0) {							// kontroll dersom input er >=0
			return n == 1 ? 1 : n + sum(n - 1); // metoden sum kaller på seg selv, rekursjon. 
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {

		//int n = Integer.parseInt(JOptionPane.showInputDialog("Tast antall 'n' rekker som skal summeres?"));
		
		int n = 100;
		System.out.print(sum(n));

		// S100 = 5050
	}
}
