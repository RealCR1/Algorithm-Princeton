public class SLList {
	public class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	private IntNode sentinal;
	private IntNode last;
	private int size;

	public SLList(int x) {
		first = new IntNode(x, null);
	}

	public void addFirst(int x) {
		first = new IntNode(x, first);
	}

	public int getFirst() {
		return first.item;
	}

	public void addLast(int x) {
		//To reduce the complexity. 
		//Introduce the sentinal Node to make sure all list will not be empty.

		IntNode p = sentinal;
		while (p.next != null) {
			p = p.next;
		}

		p.next = new IntNode(x, null);
		size += 1;
	}

	public int size(IntNode p) {
		if (p.next == null) {
			return 1;
		}
		return 1 + size(p.next);
	}
}