public class SLListGenerics<Type> {
	public class TypeNode {
		public Type item;
		public TypeNode next;

		public TypeNode(Type i, TypeNode n) {
			item = i;
			next = n;
		}
	}

	private TypeNode first;


}