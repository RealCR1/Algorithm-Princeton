public class DLList {
	public class IntNode {
		public int item;
		public IntNode pre;
		public IntNode next;

		public IntNode(int i, IntNode p, IntNode n) {
			item = i;
			pre = p;
			next = n;

		}
	}	

	public int size;
	public IntNode sentinal;
}