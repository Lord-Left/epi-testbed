public class BinaryTree<T> {

	public BinaryTreeNode root; // currently null

	class BinaryTreeNode<T>{
		public T data;
		public BinaryTreeNode left, right; // initalized to null

		public BinaryTreeNode() {

		}

		public BinaryTreeNode(T d) {
			data = d;
		}
	}

	BinaryTree(T d) {

		// initalize root
		root = new BinaryTreeNode<>(d);
	}

	// recursive addition function

	public boolean add(T d, BinaryTreeNode n) {

		boolean foundNull = false; 

		if (n == null) {
			n = new BinaryTreeNode(d);
			return true;
		} else if(n.left == null) {
			n.left = new BinaryTreeNode(d);
			return true;
		} else if (n.right == null) {
			n.right = new BinaryTreeNode(d);
			return true;
		} else {
			// n and child nodes are full. now we recurse
			foundNull = add(d, n.left);
			if (!foundNull) { add(d, n.right); };
		}

		return foundNull; 

	}

	public void inOrderPrint(BinaryTreeNode n) {
		
		if(n == null) {
			return;
		}

		inOrderPrint(n.left);
		System.out.println(n.data);
		inOrderPrint(n.right);
	}
}
