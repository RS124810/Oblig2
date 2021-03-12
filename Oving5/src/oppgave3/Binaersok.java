package oppgave3;

public class Binaersok<T extends Comparable<T>> {

	public static void main(String[] args) {

		Integer data[] = { 2, 4, 5, 7, 8, 10, 12, 15, 18, 21, 23, 27, 29, 30, 31 };
		
		System.out.print(binaersok(data,0,data.length,16));
	}
	static int teller;
	public static <T extends Comparable<T>> boolean binaersok(T[] data, int min, int max, T sok) {
        teller ++;
        System.out.print(teller);	
		boolean funnet = false;
		int midten = (min + max) / 2;

		if (data[midten].compareTo(sok) == 0)
			funnet = true;
		else if (data[midten].compareTo(sok) > 0) {
			if (min <= midten - 1)
				funnet = binaersok(data, min, midten - 1, sok);
		}
		else if (midten+1 <=max)
			funnet =binaersok(data,midten+1,max,sok);
		return funnet;
	}
	
}  


//krever at Arrayen er ordnet. Er veldig rask for store N  O(log2 n)