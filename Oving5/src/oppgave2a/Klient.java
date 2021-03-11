package oppgave2a;

import oppgave2a.DobbelKjedetListeS;

public class Klient {

	public static void main(String[] args) {
	
		Integer data [] = { 1000,50000, 99999,200,0, 500,200, 100000,-1}; //100000 er test på ugyldig verdi + uordnet liste
	//	String data [] = {"0",  "1"};//,"5", "9","2", "3"};
		Integer max = 100000;
		Integer min = -1;
		DobbelKjedetListeS<Integer> liste = new DobbelKjedetListeS ( min, max);
/*****************************************************************************************************************************/			
		//data inn i liste
		
	for (int i=0; i<data.length;i++) {
		liste.leggTil(data[i]);		}

/*****************************************************************************************************************************/			
		//utskirft
/*****************************************************************************************************************************/	
		
		liste.visListe();
/*****************************************************************************************************************************/		
		//tester om 1000 er i listen
		
		Integer element = 1000;
		Integer element1 = 100;
		
		if (liste.fins(element)) 
			System.out.println("\nElementet "+element+" finnes i listen");
		else
			System.out.println("\nFant ikke elementet "+element+" i listen\n");
		
		if (liste.fins(element1)) 
			System.out.println("\nElementet "+element1+" finnes i listen");
		else
			System.out.println("\nFant ikke elementet "+element1+" i listen\n");
		
/*****************************************************************************************************************************/			
		//Fjerner noen element og skriver ut på nytt
/*****************************************************************************************************************************/	

		System.out.println("Slettet elementet "+ liste.fjern(1000)+ " fra listen\n" );
		System.out.println("Slettet elementet "+ liste.fjern(200)+ " fra listen\n" );
		System.out.println("Data i listen etter sletting:\n");
		liste.visListe();
/*****************************************************************************************************************************/			
	}

}
