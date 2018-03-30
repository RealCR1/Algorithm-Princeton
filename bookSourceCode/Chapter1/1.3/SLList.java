public class SLList {
	public IntNode first;

	public SLList(int x) {
		first = new IntNode(x, null);
	}

	public void addFirst(Int x) {
		first = new IntNode(x, first);
	}

	public int getFirst() {
		return first.item;
	}
}