package oppgave2a;

// Ny, spesiell ordnetliste meddobbelkjeding
// obs! Hugs <T extends Comparable <T>> dersom en skal bruke compareTo

public class DobbelKjedetListeS<T extends Comparable<T>> {

	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;

	// konstruktor, oppretter en tom liste med kunstige start/slutt noder. anta
	// minVerdi = -1 og maksVerdi 100 000
	public DobbelKjedetListeS(T minVerdi, T maksVerdi) {

		// Foerste Node
		foerste = new DobbelNode<T>(minVerdi);

		// Siste Node
		siste = new DobbelNode<T>(maksVerdi);

		// kjeding
		foerste.setNeste(siste);
		siste.setForrige(foerste);

		antall = 0;
	}

	public boolean fins(T element) {

		boolean funnet = false;
		DobbelNode<T> p = foerste;

		// while ((!element.equals(p.getElement()))&&(!(p.getNeste()==null))) {
		while ((element.compareTo(p.getElement()) > 0) && (!(p.getNeste() == null))) {
			p = p.getNeste();
		}

		// Test på funnet
		if (element.equals(p.getElement())) {
			funnet = true;
		}

		return funnet;
	}

	public boolean erTom() {
		return (antall == 0);
	}

	public void leggTil(T ny) {

		DobbelNode<T> nyNode = new DobbelNode<T>(ny);
		DobbelNode<T> tmp = foerste.getNeste();
		if ((ny.compareTo(foerste.getElement()) <= 0) || (ny.compareTo(siste.getElement()) >= 0)) {
			System.out.println("Ugyldig verdi for " +ny+"\n");
			
		} else {

			while (ny.compareTo(tmp.getElement()) >= 0) {

				tmp = tmp.getNeste();
			}

			nyNode.setNeste(tmp);
			nyNode.setForrige(tmp.getForrige());
			tmp.getForrige().setNeste(nyNode);
			tmp.setForrige(nyNode);
			antall++;
		}
	}

	public T fjern(T x) {

		T resultat = null;
		DobbelNode<T> tmp = foerste.getNeste();

		if (!fins(x))
			System.out.println("Elementet " + x + " finnes ikke i listen\n");
		else {
			while (x.compareTo(tmp.getElement()) != 0) { 
				tmp = tmp.getNeste();
			}
			// test på funn (compareTo returnere 0 om verdien er lik)
			if (x.compareTo(tmp.getElement()) == 0) {
				antall--;
				resultat = tmp.getElement();
				// sletter
				
				tmp.getNeste().setForrige(tmp.getForrige());
				tmp.getForrige().setNeste(tmp.getNeste());;
			}
		}

		return resultat;
	}

	public void visListe() {
		DobbelNode<T> tmp = foerste.getNeste();
        System.out.println("Element i listen: "+antall);
		while (!tmp.equals(siste)) {
			System.out.println(tmp.getElement());
			tmp = tmp.getNeste();
		}
	}
}
