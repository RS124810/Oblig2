package oppgave2a;

public class DobbelNode<T> {
	private T element;
	private DobbelNode<T> neste;
	private DobbelNode<T> forrige;
	
	//Oppretter en tom node node
	public DobbelNode() {
		neste = null;
		element = null;
		forrige = null;
	}
	
	public DobbelNode(T elem) {
		neste = null;
		forrige = null;
		element = elem;
	}
	
	public DobbelNode<T> getNeste() {
		return neste;
	}
	
	public DobbelNode<T> getForrige() {
		return forrige;
	}
	
	public void setNeste(DobbelNode<T> node) {
		neste = node;
	}
	public void setForrige(DobbelNode<T> node) {
		forrige = node;
	}
	
	public T getElement() {
		return element;
	}
	
	public void setElement(T elem) {
		element = elem;
	}

	
}
