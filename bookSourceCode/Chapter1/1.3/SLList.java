public class SLList {
	public class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	public IntNode first;

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
		if (first == null) {
			first = new IntNode(x, null);
			return;
		}
		
		IntNode p = first;
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