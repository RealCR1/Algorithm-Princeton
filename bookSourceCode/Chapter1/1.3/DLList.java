public class DLList {
	public class IntNode {
		public int item;
		public IntNode pre;
		public IntNode next;

		public IntNode(int i, IntNode p, IntNode n) {
			this.item = i;
			this.pre = p;
			this.next = n;
		}
	}	

	public int size;
	public IntNode sentinal;
	public IntNode last;

	//Create an empty double linked list.
	public DLList() {
		sentinal = new IntNode(null, null, null);
		this.sentinal.pre = sentinal;
		this.sentinal.next = sentinal;
	}

	//Add an item to the beginning of the DLList.
	public void addFirst(Item i) {
		this.sentinal.next = new IntNode(i, this.sentinal, this.sentinal.next);
		this.sentinal.next.pre = new IntNode(i, this.sentinal, this.sentinal.next);
		size += 1;
	}

	public void addLast(Item i) {
		size += 1;
		IntNode Node = new IntNode(i, this.sentinal, this.sentinal.pre);
		this.sentinal.pre = Node;
		this.sentinal.pre.next = Node;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public Item removeFirst() {
		
	}
}


